package ru.vdh.learnapp.newfeature.datasource.mapper

import ru.vdh.learnapp.newfeature.data.model.NewFeatureDataModel
import ru.vdh.learnapp.newfeature.datasource.model.NewFeatureDataSourceModel

class NewFeatureDataToDataSourceMapper {

    fun toData(userName: NewFeatureDataSourceModel) =
        NewFeatureDataModel(firstName = userName.firstName, lastName = "")
}