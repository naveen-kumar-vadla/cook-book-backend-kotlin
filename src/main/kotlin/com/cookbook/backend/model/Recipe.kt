package com.cookbook.backend.model

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*


@Entity
@Table(name = "recipes")

class Recipe(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    val name: String? = null,
    val recipeImageUrl: String? = null,
    val category: String? = null,
    val serves: String? = null,
    val prepTime: String = "0",
    val cookTime: String = "0",
    val totalTime: String = "0",
    val ingredients: Array<String> = arrayOf(),
    val instructions: Array<String> = arrayOf(),

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonManagedReference
    val user: User? = null
)