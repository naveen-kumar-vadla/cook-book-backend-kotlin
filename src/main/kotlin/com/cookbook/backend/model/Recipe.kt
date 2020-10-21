package com.cookbook.backend.model

import javax.persistence.*


@Entity
@Table(name = "recipes")

class Recipe(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    val userId: Long? = null,
    val name: String? = null,
    val imageUrl: String? = null,
    val category: String? = null,
    val serves: String? = null,
    val prepTime: String = "0",
    val cookTime: String = "0",
    val totalTime: String = "0",
    val ingredients: Array<String> = arrayOf(),
    val instructions: Array<String> = arrayOf()
)