package ru.vdh.learnapp.newfeature.data.mapper

import ru.vdh.learnapp.newfeature.data.model.NewFeatureDataModel
import ru.vdh.learnapp.newfeature.domain.model.NewFeatureDomainModel

class NewFeatureDataToDomainMapper {

    fun toDomain(newFeatureDataModel: NewFeatureDataModel) =
        NewFeatureDomainModel(
            firstName = newFeatureDataModel.firstName,
            lastName = newFeatureDataModel.lastName
        )
}