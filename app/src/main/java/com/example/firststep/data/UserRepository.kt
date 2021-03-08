package com.example.firststep.data

import androidx.lifecycle.LiveData

class UserRepository(private var userDao:UserDao) {

    val readAllData : LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user:User)
    {
        userDao.addUser(user)
    }
}