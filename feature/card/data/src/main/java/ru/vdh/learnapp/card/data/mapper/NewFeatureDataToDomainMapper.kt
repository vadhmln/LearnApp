package ru.vdh.learnapp.card.data.mapper

import ru.vdh.learnapp.card.data.model.NewFeatureDataModel
import ru.vdh.learnapp.secondfeature.domain.model.NewFeatureDomainModel

class NewFeatureDataToDomainMapper {

    fun toDomain(newFeatureDataModel: NewFeatureDataModel) =
        NewFeatureDomainModel(
            firstName = newFeatureDataModel.firstName,
            lastName = newFeatureDataModel.lastName
        )
}