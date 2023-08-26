package ru.vdhsoft.core.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.vdh.learnapp.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class CardEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val frontText: String,
    val backText: String,
)

