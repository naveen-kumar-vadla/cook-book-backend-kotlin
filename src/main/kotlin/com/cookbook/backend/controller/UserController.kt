package com.cookbook.backend.controller

import com.cookbook.backend.model.Recipe
import com.cookbook.backend.model.User
import com.cookbook.backend.repositories.RecipeRepository
import com.cookbook.backend.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

class UserProfile(val user: User, val recipes: List<Recipe>?)

@RestController
@RequestMapping("/api/user")
class UserController {

    @Autowired
    private val userRepository: UserRepository? = null

    @Autowired
    private val recipeRepository: RecipeRepository? = null

    @GetMapping("/profile/{username}")
    fun serveProfile(@PathVariable username: String): UserProfile? {
        val user = userRepository?.findByUsername(username)
        val recipes: List<Recipe>? = user?.id?.let { recipeRepository?.findAllByUserId(it) }
        return user?.let { UserProfile(user = it, recipes = recipes) }
    }
}