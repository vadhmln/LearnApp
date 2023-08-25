package ru.vdh.learnapp.newfeature.data.mapper

import ru.vdh.learnapp.newfeature.data.model.NewFeatureDataModel
import ru.vdh.learnapp.newfeature.domain.model.NewFeatureDomainModel

class NewFeatureDataToDataSourceMapper {

    fun toDataSource(userName: NewFeatureDomainModel) =
        NewFeatureDataModel(firstName = userName.firstName, lastName = "")
}