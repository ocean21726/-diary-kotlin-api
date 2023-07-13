package com.example.demo.api.user.controller

import com.example.demo.api.user.domain.User
import com.example.demo.api.user.repository.UserRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController (
    val userRepository: UserRepository
) {
    @GetMapping()
    fun getUser(): ResponseEntity<*> {
        val user = userRepository.findAll()
        return ResponseEntity.ok(user)
    }

    @PostMapping()
    fun setUser(@RequestBody user: User): ResponseEntity<*> {
        val res = userRepository.save(user)
        return ResponseEntity.ok(res);
    }
}