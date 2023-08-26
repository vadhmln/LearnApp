package ru.vdh.learnapp.card.data.datasource

import kotlinx.coroutines.flow.Flow
import ru.vdh.learnapp.card.data.model.CardDataModel

interface CardDataSource {

    suspend fun insertCard(card: CardDataModel)

    suspend fun updateCard(card: CardDataModel)

    suspend fun deleteCard(card: CardDataModel)

    suspend fun deleteAllCards()

    fun getCardById(id: Long): Flow<CardDataModel>

    fun getAllCards(): Flow<List<CardDataModel>>
}