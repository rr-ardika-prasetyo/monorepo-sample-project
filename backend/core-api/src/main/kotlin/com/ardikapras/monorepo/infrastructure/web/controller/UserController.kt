package com.ardikapras.monorepo.infrastructure.web.controller

import com.ardikapras.monorepo.application.UserApplicationService
import com.ardikapras.monorepo.domain.model.User
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userApplicationService: UserApplicationService) {

    @GetMapping
    fun getAllUsers(): List<User> = userApplicationService.getAllUsers()

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): User? = userApplicationService.getUserById(id)

    @PostMapping
    fun createUser(@RequestBody user: User): User = userApplicationService.createUser(user)

    @PutMapping("/{id}")
    fun updateUser(@PathVariable id: Long, @RequestBody user: User): User {
        require(id == user.id) { "ID in the path and body must match." }
        return userApplicationService.updateUser(user)
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: Long) = userApplicationService.deleteUser(id)
}
