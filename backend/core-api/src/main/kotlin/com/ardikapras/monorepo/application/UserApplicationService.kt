package com.ardikapras.monorepo.application

import com.ardikapras.monorepo.domain.model.User
import com.ardikapras.monorepo.domain.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserApplicationService(private val userRepository: UserRepository) {
    fun getAllUsers(): List<User> = userRepository.findAll()

    fun getUserById(id: Long): User? = userRepository.findById(id)

    fun createUser(user: User): User = userRepository.save(user)

    fun updateUser(user: User): User = userRepository.update(user)

    fun deleteUser(id: Long) = userRepository.delete(id)
}
