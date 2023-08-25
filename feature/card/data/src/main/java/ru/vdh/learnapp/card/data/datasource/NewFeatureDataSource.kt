package ru.vdh.learnapp.card.data.datasource

import ru.vdh.learnapp.card.data.model.NewFeatureDataModel

interface NewFeatureDataSource {
    fun save(newFeatureDataModel: NewFeatureDataModel): Boolean

    fun get(): NewFeatureDataModel
}