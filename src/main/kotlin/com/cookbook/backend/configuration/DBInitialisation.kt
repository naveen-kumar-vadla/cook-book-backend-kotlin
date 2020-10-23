package com.cookbook.backend.configuration

import com.cookbook.backend.repositories.RecipeRepository
import com.cookbook.backend.repositories.UserRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DBInitialisation {
    @Bean
    fun recipesInitializer(recipeRepository: RecipeRepository, userRepository: UserRepository) = ApplicationRunner {
        userRepository.save(user_1)
        userRepository.save(user_2)
        userRepository.save(user_3)
        userRepository.save(user_4)
        userRepository.save(user_5)
        recipeRepository.save(recipe_1)
        recipeRepository.save(recipe_2)
        recipeRepository.save(recipe_3)
        recipeRepository.save(recipe_4)
        recipeRepository.save(recipe_5)
        recipeRepository.save(recipe_6)
        recipeRepository.save(recipe_7)
        recipeRepository.save(recipe_8)
        recipeRepository.save(recipe_9)
        recipeRepository.save(recipe_10)
        recipeRepository.save(recipe_11)
        recipeRepository.save(recipe_12)
        recipeRepository.save(recipe_13)
        recipeRepository.save(recipe_14)
        recipeRepository.save(recipe_15)
    }
}