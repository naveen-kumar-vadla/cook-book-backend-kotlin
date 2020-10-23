package com.cookbook.backend.repositories

import com.cookbook.backend.model.Recipe
import com.cookbook.backend.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

class RecipeWithUser(
    val recipe: Recipe,
    val user: User
)

class UserProfile(
    val user: User,
    val recipes: List<RecipeWithUser>
)

@Repository
interface RecipeRepository : CrudRepository<Recipe, Long> {}

@Repository
interface UserRepository : CrudRepository<User, Long> {
    fun findByUsername(username: String): User?
}

