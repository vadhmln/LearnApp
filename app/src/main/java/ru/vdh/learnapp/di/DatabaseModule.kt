package ru.vdh.learnapp.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ru.vdh.learnapp.Constants.DATABASE_NAME
import ru.vdh.learnapp.card.data.datasource.CardDataSource
import ru.vdhsoft.core.database.CardDatabase
import ru.vdhsoft.core.database.dao.CardDao
import ru.vdhsoft.core.database.datasource.CardDataSourceImpl
import ru.vdhsoft.core.database.mapper.CardDataSourceToDataMapper
import ru.vdhsoft.core.database.mapper.CardDataToDataSourceMapper
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context,
        CardDatabase::class.java,
        DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideDao(cardDatabase: CardDatabase) = cardDatabase.cardDao()

    @Singleton
    @Provides
    fun provideLocalCardDataSource(
        cardDao: CardDao,
        cardDataToDataSourceMapper: CardDataToDataSourceMapper,
        cardDataSourceToDataMapper: CardDataSourceToDataMapper,
    ): CardDataSource =
        CardDataSourceImpl(
            cardDao = cardDao,
            cardDataToDataSourceMapper = cardDataToDataSourceMapper,
            cardDataSourceToDataMapper = cardDataSourceToDataMapper,
        )

    @Provides
    fun cardDataSourceToDataMapper() = CardDataSourceToDataMapper()

    @Provides
    fun cardDataToDataSourceMapper() = CardDataToDataSourceMapper()
}