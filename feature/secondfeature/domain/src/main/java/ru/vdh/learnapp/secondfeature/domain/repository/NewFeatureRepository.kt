package ru.vdh.learnapp.secondfeature.domain.repository

import ru.vdh.learnapp.secondfeature.domain.model.NewFeatureDomainModel

interface NewFeatureRepository {

    fun save(newFeature: NewFeatureDomainModel): Boolean

    fun get(): NewFeatureDomainModel
}