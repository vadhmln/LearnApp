package ru.vdh.learnapp.secondfeature.datasource.mapper

import ru.vdh.learnapp.secondfeature.data.model.NewFeatureDataModel
import ru.vdh.learnapp.secondfeature.datasource.model.NewFeatureDataSourceModel

class NewFeatureDataToDataSourceMapper {

    fun toData(userName: NewFeatureDataSourceModel) =
        NewFeatureDataModel(firstName = userName.firstName, lastName = "")
}