package ru.vdh.learnapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.vdh.learnapp.secondfeature.data.datasource.NewFeatureDataSource
import ru.vdh.learnapp.secondfeature.data.mapper.NewFeatureDataToDataSourceMapper
import ru.vdh.learnapp.secondfeature.data.mapper.NewFeatureDataToDomainMapper
import ru.vdh.learnapp.secondfeature.data.repository.NewFeatureRepositoryImpl
import ru.vdh.learnapp.secondfeature.domain.repository.NewFeatureRepository
import ru.vdh.learnapp.secondfeature.presentation.mapper.NewFeatureDomainToPresentationMapper
import ru.vdh.learnapp.secondfeature.presentation.mapper.NewFeaturePresentationToDomainMapper
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SecondFeatureDataModule {

    @Provides
    fun providesNewFeatureDataToDomainMapper() = NewFeatureDataToDomainMapper()

    @Provides
    fun providesNewFeatureDataModelToDataSourceMapper() = NewFeatureDataToDataSourceMapper()

    @Provides
    fun providesNewFeaturePresentationToDomainMapper() = NewFeaturePresentationToDomainMapper()

    @Provides
    fun providesNewFeatureDomainToPresentationMapper() = NewFeatureDomainToPresentationMapper()

    @Provides
    @Singleton
    fun provideNewFeatureRepository(
        newFeatureDataSource: NewFeatureDataSource,
        newFeatureDataToDomainMapper: NewFeatureDataToDomainMapper,
        newFeatureDataToDataSourceMapper: NewFeatureDataToDataSourceMapper
    ): NewFeatureRepository = NewFeatureRepositoryImpl(
        newFeatureDataSource = newFeatureDataSource,
        newFeatureDataToDomainMapper,
        newFeatureDataToDataSourceMapper
    )
}