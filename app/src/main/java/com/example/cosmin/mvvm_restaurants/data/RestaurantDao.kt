package com.example.cosmin.mvvm_restaurants.data

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query

@Dao
interface RestaurantDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRestaurant(restaurant: Restaurant)

    @Query("SELECT * FROM restaurant")
    fun getAllRestaurants(): LiveData<List<Restaurant>>

    @Query("SELECT * FROM restaurant WHERE cuisine LIKE :cuisine")
    fun getRestaurantByCuisine(cuisine: Int): LiveData<Restaurant>
}