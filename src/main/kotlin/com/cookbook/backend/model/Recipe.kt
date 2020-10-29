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

    val category: String? = null,

    val serves: String? = null,

    @Column(name = "rating")
    val rating: Int = 0,

    @Column(name = "recipe_image_url")
    val recipeImageUrl: String? = null,

    @Column(name = "prep_time")
    val prepTime: String = "0",

    @Column(name = "cook_time")
    val cookTime: String = "0",

    @Column(name = "total_time")
    val totalTime: String = "0",

    @ElementCollection(targetClass = String::class)
    @OrderColumn
    val ingredients: Array<String> = arrayOf(),

    @ElementCollection(targetClass = String::class)
    @OrderColumn
    val instructions: Array<String> = arrayOf(),

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonManagedReference
    val user: User? = null
)