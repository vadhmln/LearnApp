package ru.vdh.learnapp.newfeature.domain.repository

import ru.vdh.learnapp.newfeature.domain.model.NewFeatureDomainModel

interface NewFeatureRepository {

    fun save(newFeature: NewFeatureDomainModel): Boolean

    fun get(): NewFeatureDomainModel
}