package ru.vdh.learnapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.vdh.learnapp.secondfeature.domain.repository.CardRepository
import ru.vdh.learnapp.secondfeature.domain.usecase.AddCardUseCase

@Module
@InstallIn(ViewModelComponent::class)
class CardDomainModule {

    @Provides
    fun provideAddCardUseCase(cardRepository: CardRepository) =
        AddCardUseCase(cardRepository)
}