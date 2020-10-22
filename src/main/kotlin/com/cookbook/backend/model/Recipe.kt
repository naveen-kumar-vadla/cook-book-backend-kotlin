package com.cookbook.backend.model

import javax.persistence.*


@Entity
@Table(name = "recipes")

class Recipe(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id", nullable = false, insertable = false, updatable = false)
    var recipeId: Long? = null,
    val userId: Long? = null,
    val name: String? = null,
    val recipeImageUrl: String? = null,
    val category: String? = null,
    val serves: String? = null,
    val prepTime: String = "0",
    val cookTime: String = "0",
    val totalTime: String = "0",
    val ingredients: Array<String> = arrayOf(),
    val instructions: Array<String> = arrayOf()
) {
    override fun toString(): String {
        return "Recipe(recipeId=$recipeId, userId=$userId, name=$name, recipeImageUrl=$recipeImageUrl, category=$category, serves=$serves, prepTime='$prepTime', cookTime='$cookTime', totalTime='$totalTime', ingredients=${ingredients.contentToString()}, instructions=${instructions.contentToString()})"
    }
}