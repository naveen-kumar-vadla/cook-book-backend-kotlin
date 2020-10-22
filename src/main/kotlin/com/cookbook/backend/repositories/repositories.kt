package com.cookbook.backend.repositories

import com.cookbook.backend.model.Recipe
import com.cookbook.backend.model.User
import org.springframework.data.jpa.repository.Query
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
interface RecipeRepository : CrudRepository<Recipe, Long> {
    @Query("SELECT new com.cookbook.backend.repositories.RecipeWithUser(a,b) from Recipe a LEFT JOIN User b ON a.userId=b.userId")
    fun findAllWithUserInfo(): List<RecipeWithUser>
}

@Repository
interface UserRepository : CrudRepository<User, Long> {
    fun findByUsername(username: String): User

    @Query("SELECT new com.cookbook.backend.repositories.RecipeWithUser(b,a) from User a LEFT JOIN Recipe b ON a.userId=b.userId WHERE a.userId=(?1)")
    fun findRecipesByUserId(id: Long): List<RecipeWithUser>
}

