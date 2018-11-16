package com.example.cosmin.mvvm_restaurants.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [Restaurant::class], version = 1)
abstract class Database : RoomDatabase() {
    abstract fun restaurantDao(): RestaurantDao
}