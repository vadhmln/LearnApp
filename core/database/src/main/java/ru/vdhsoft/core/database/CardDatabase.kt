package ru.vdhsoft.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.vdhsoft.core.database.dao.CardDao
import ru.vdhsoft.core.database.entity.CardEntity

@Database(
    entities = [CardEntity::class],
    version = 1,
    exportSchema = false
)
abstract class CardDatabase: RoomDatabase() {

    abstract fun cardDao(): CardDao
}