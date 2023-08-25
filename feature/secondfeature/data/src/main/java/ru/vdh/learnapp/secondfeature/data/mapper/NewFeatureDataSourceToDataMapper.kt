package ru.vdh.learnapp.secondfeature.data.mapper

import ru.vdh.learnapp.secondfeature.data.model.NewFeatureDataModel
import ru.vdh.learnapp.secondfeature.domain.model.NewFeatureDomainModel

class NewFeatureDataSourceToDataMapper {

    fun toDataSource(userName: NewFeatureDomainModel) =
        NewFeatureDataModel(firstName = userName.firstName, lastName = "")
}