package com.cookbook.backend.controller

import com.cookbook.backend.model.Recipe
import com.cookbook.backend.repositories.RecipeRepository
import com.cookbook.backend.repositories.RecipeWithUser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/recipes")
class RecipeController {

    @Autowired
    private val recipeRepository: RecipeRepository? = null

    @GetMapping("/")
    fun serveRecipes(): MutableIterable<Recipe>? {
        return recipeRepository?.findAll()
    }

    @GetMapping("/recipe/{id}")
    fun serveRecipe(@PathVariable id: Long): RecipeWithUser? {
        return recipeRepository?.findByIdWithUserInfo(id)
    }
}