package ru.vdh.learnapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.vdh.learnapp.newfeature.domain.repository.NewFeatureRepository
import ru.vdh.learnapp.newfeature.domain.usecase.GetNewFeatureUseCase

@Module
@InstallIn(ViewModelComponent::class)
class NewFeatureDomainModule {

    @Provides
    fun provideGetNewFeatureUseCase(
        newFeatureRepository: NewFeatureRepository,
    ): GetNewFeatureUseCase =
        GetNewFeatureUseCase(
            newFeatureRepository = newFeatureRepository,
        )
}