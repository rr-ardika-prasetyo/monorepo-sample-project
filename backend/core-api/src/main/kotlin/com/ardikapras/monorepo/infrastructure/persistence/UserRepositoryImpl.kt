package com.ardikapras.monorepo.infrastructure.persistence

import com.ardikapras.monorepo.domain.model.User
import com.ardikapras.monorepo.domain.repository.UserRepository
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl : UserRepository {
    private val users = mutableListOf<User>()
    private var userIdCounter: Long = 1

    override fun findAll(): List<User> = users

    override fun findById(id: Long): User? = users.find { it.id == id }

    override fun save(user: User): User {
        val newUser = user.copy(id = userIdCounter++)
        users.add(newUser)
        return newUser
    }

    override fun update(user: User): User {
        val existingUser = users.indexOfFirst { it.id == user.id }
        if (existingUser != -1) {
            users[existingUser] = user
        }
        return user
    }

    override fun delete(id: Long) {
        users.removeIf { it.id == id }
    }
}
