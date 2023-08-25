package ru.vdh.learnapp.card.datasource.mapper

import ru.vdh.learnapp.card.data.model.NewFeatureDataModel
import ru.vdh.learnapp.card.datasource.model.NewFeatureDataSourceModel

class NewFeatureDataToDataSourceMapper {

    fun toData(userName: NewFeatureDataSourceModel) =
        NewFeatureDataModel(firstName = userName.firstName, lastName = "")
}