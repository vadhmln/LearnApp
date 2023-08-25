package ru.vdh.learnapp.card.data.mapper

import ru.vdh.learnapp.card.data.model.NewFeatureDataModel
import ru.vdh.learnapp.secondfeature.domain.model.NewFeatureDomainModel

class NewFeatureDataToDataSourceMapper {

    fun toDataSource(userName: NewFeatureDomainModel) =
        NewFeatureDataModel(firstName = userName.firstName, lastName = "")
}