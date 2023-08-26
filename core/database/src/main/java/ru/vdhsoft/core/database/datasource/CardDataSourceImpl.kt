package ru.vdhsoft.core.database.datasource

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import ru.vdh.learnapp.card.data.datasource.CardDataSource
import ru.vdh.learnapp.card.data.model.CardDataModel
import ru.vdhsoft.core.database.dao.CardDao
import ru.vdhsoft.core.database.mapper.CardDataSourceToDataMapper
import ru.vdhsoft.core.database.mapper.CardDataToDataSourceMapper

class CardDataSourceImpl(
    private val cardDao: CardDao,
    private val cardDataToDataSourceMapper: CardDataToDataSourceMapper,
    private val cardDataSourceToDataMapper: CardDataSourceToDataMapper,
) : CardDataSource {

    override suspend fun insertCard(card: CardDataModel) =
        cardDao.insertCard(cardDataToDataSourceMapper.toDataSource(card))

    override suspend fun updateCard(card: CardDataModel) =
        cardDao.updateCard(cardDataToDataSourceMapper.toDataSource(card))

    override suspend fun deleteCard(card: CardDataModel) =
        cardDao.deleteCard(cardDataToDataSourceMapper.toDataSource(card))

    override suspend fun deleteAllCards() =
        cardDao.deleteAllCards()

    override fun getCardById(id: Long): Flow<CardDataModel> =
        cardDao.getCardById(id).map(cardDataSourceToDataMapper::toData)

    override fun getAllCards(): Flow<List<CardDataModel>> =
        cardDao.getAllCards().map { list ->
            list.map(cardDataSourceToDataMapper::toData)
        }
}