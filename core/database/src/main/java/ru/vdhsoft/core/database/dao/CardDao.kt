package ru.vdhsoft.core.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import ru.vdhsoft.core.database.entity.CardEntity

@Dao
interface CardDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertCard(card: CardEntity)

    @Update
    suspend fun updateCard(card: CardEntity)

    @Delete
    suspend fun deleteCard(card: CardEntity)

    @Query("DELETE FROM card_table")
    suspend fun deleteAllCards()

    @Query("SELECT * FROM card_table WHERE id=:id")
    fun getCardById(id: Long): Flow<CardEntity>

    @Query("SELECT * FROM card_table ORDER BY id ASC")
    fun getAllCards(): Flow<List<CardEntity>>
}