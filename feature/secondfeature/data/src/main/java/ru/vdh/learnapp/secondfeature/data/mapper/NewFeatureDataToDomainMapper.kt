package ru.vdh.learnapp.secondfeature.data.mapper

import ru.vdh.learnapp.secondfeature.data.model.NewFeatureDataModel
import ru.vdh.learnapp.secondfeature.domain.model.NewFeatureDomainModel

class NewFeatureDataToDomainMapper {

    fun toDomain(newFeatureDataModel: NewFeatureDataModel) =
        NewFeatureDomainModel(
            firstName = newFeatureDataModel.firstName,
            lastName = newFeatureDataModel.lastName
        )
}