package ru.vdh.learnapp.secondfeature.domain.repository

import kotlinx.coroutines.flow.Flow
import ru.vdh.learnapp.secondfeature.domain.model.CardDomainModel

interface CardRepository {

    suspend fun insertCard(card: CardDomainModel)

    suspend fun updateCard(card: CardDomainModel)

    suspend fun deleteCard(card: CardDomainModel)

    suspend fun deleteAllCards()

    fun getCardById(id: Long): Flow<CardDomainModel>

    fun getAllCards(): Flow<List<CardDomainModel>>
}