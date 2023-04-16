package com.example.duos.data.entities.dailyMatching

import androidx.room.*

@Dao
interface SearchHistoryRoomDao {

    @Query("SELECT * FROM searchhistory")
    fun getAll() : List<SearchHistory>

    @Insert
    fun insert(searchHistory: SearchHistory)

    @Query("DELETE FROM searchhistory WHERE keyword == :keyword")
    fun delete(keyword : String)

    @Query("DELETE FROM searchhistory") // 테이블에 들어있는 모든 값을 지워라
    fun clearAll()



}

/*
    @Query("DELETE FROM UserTable") // 테이블에 들어있는 모든 값을 지워라
    fun clearAll()
 */