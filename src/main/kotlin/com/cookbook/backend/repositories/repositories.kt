package com.cookbook.backend.repositories

import com.cookbook.backend.model.Recipe
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RecipeRepository : CrudRepository<Recipe, Long>
