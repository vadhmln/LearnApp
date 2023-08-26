package ru.vdh.learnapp.card.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import ru.vdh.learnapp.card.data.datasource.CardDataSource
import ru.vdh.learnapp.card.data.mapper.CardDataToDomainMapper
import ru.vdh.learnapp.card.data.mapper.CardDomainToDataMapper
import ru.vdh.learnapp.secondfeature.domain.model.CardDomainModel
import ru.vdh.learnapp.secondfeature.domain.repository.CardRepository

class CardRepositoryImpl(
    private val cardDataSource: CardDataSource,
    private val cardDomainToDataMapper: CardDomainToDataMapper,
    private val cardDataToDomainMapper: CardDataToDomainMapper,
) : CardRepository {

    override suspend fun insertCard(card: CardDomainModel) =
        cardDataSource.insertCard(cardDomainToDataMapper.toData(card))

    override suspend fun updateCard(card: CardDomainModel) =
        cardDataSource.updateCard(cardDomainToDataMapper.toData(card))

    override suspend fun deleteCard(card: CardDomainModel) =
        cardDataSource.deleteCard(cardDomainToDataMapper.toData(card))

    override suspend fun deleteAllCards() =
        cardDataSource.deleteAllCards()

    override fun getCardById(id: Long): Flow<CardDomainModel> =
        cardDataSource.getCardById(id).map(cardDataToDomainMapper::toDomain)

    override fun getAllCards(): Flow<List<CardDomainModel>> =
        cardDataSource.getAllCards().map { list ->
            list.map(cardDataToDomainMapper::toDomain)
        }
}