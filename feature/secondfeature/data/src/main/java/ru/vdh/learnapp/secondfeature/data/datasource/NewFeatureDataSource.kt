package ru.vdh.learnapp.secondfeature.data.datasource

import ru.vdh.learnapp.secondfeature.data.model.NewFeatureDataModel

interface NewFeatureDataSource {
    fun save(newFeatureDataModel: NewFeatureDataModel): Boolean

    fun get(): NewFeatureDataModel
}