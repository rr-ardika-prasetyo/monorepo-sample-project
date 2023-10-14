package com.ardikapras.monorepo.domain.repository

import com.ardikapras.monorepo.domain.model.User

interface UserRepository {
    fun findAll(): List<User>
    fun findById(id: Long): User?
    fun save(user: User): User
    fun update(user: User): User
    fun delete(id: Long)
}
