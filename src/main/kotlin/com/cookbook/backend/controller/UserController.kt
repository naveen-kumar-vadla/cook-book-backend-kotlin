package com.cookbook.backend.controller

import com.cookbook.backend.model.User
import com.cookbook.backend.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user")
class UserController {
    @Autowired
    private val userRepository: UserRepository? = null

    @GetMapping("/profile/{username}")
    fun serveProfile(@PathVariable username: String): User? {
        return userRepository?.findByUsername(username)
    }

}