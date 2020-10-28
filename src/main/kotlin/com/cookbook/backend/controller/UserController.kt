package com.cookbook.backend.controller

import com.cookbook.backend.model.Recipe
import com.cookbook.backend.model.User
import com.cookbook.backend.repositories.CollectionRepository
import com.cookbook.backend.repositories.RecipeRepository
import com.cookbook.backend.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

class UserProfile(val user: Optional<User>?, val recipes: List<Recipe>?)

@RestController
@RequestMapping("/api/user")
class UserController {

    @Autowired
    private val userRepository: UserRepository? = null

    @Autowired
    private val recipeRepository: RecipeRepository? = null

    @Autowired
    private val collectionRepository: CollectionRepository? = null

    @GetMapping("/")
    fun serveLoggedUser(): Optional<User>? {
        return userRepository?.findById(5)
    }

    @GetMapping("/collection/{userId}")
    fun serveUserCollection(@PathVariable userId: Long): List<Recipe?> {
        val collection = collectionRepository?.findAllByUserId(userId)
        return collection!!.map { it -> it.recipe }
    }

    @GetMapping("/profile/{userId}")
    fun serveProfile(@PathVariable userId: Long): UserProfile? {
        val user = userRepository?.findById(userId)
        val recipes: List<Recipe>? = recipeRepository?.findAllByUserId(userId)
        return UserProfile(user = user, recipes = recipes)
    }
}