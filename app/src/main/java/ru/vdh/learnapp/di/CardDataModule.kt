package ru.vdh.learnapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.vdh.learnapp.card.data.datasource.CardDataSource
import ru.vdh.learnapp.card.data.mapper.CardDataToDomainMapper
import ru.vdh.learnapp.card.data.mapper.CardDomainToDataMapper
import ru.vdh.learnapp.card.data.repository.CardRepositoryImpl
import ru.vdh.learnapp.card.presentation.mapper.CardDomainToPresentationMapper
import ru.vdh.learnapp.card.presentation.mapper.CardPresentationToDomainMapper
import ru.vdh.learnapp.secondfeature.domain.repository.CardRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CardDataModule {

    @Provides
    fun provideCardDataToDomainMapper() = CardDataToDomainMapper()

    @Provides
    fun provideCardDomainToDataMapper() = CardDomainToDataMapper()

    @Provides
    fun provideCardDomainToPresentationMapper() = CardDomainToPresentationMapper()

    @Provides
    fun provideCardPresentationToDomainMapper() = CardPresentationToDomainMapper()

    @Provides
    @Singleton
    fun provideCardRepository(
        cardDataSource: CardDataSource,
        cardDomainToDataMapper: CardDomainToDataMapper,
        cardDataToDomainMapper: CardDataToDomainMapper,
    ): CardRepository = CardRepositoryImpl(
        cardDataSource = cardDataSource,
        cardDomainToDataMapper = cardDomainToDataMapper,
        cardDataToDomainMapper = cardDataToDomainMapper,
    )
}