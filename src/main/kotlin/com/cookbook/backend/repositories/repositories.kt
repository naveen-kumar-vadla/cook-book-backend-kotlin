package com.cookbook.backend.repositories

import com.cookbook.backend.model.Recipe
import com.cookbook.backend.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RecipeRepository : CrudRepository<Recipe, Long> {
    fun findAllByUserId(id: Long): List<Recipe>
}

@Repository
interface UserRepository : CrudRepository<User, Long> {
    fun findByUsername(username: String): User?
}

