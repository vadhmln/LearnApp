package ru.vdh.learnapp.newfeature.data.datasource

import ru.vdh.learnapp.newfeature.data.model.NewFeatureDataModel

interface NewFeatureDataSource {
    fun save(newFeatureDataModel: NewFeatureDataModel): Boolean

    fun get(): NewFeatureDataModel
}