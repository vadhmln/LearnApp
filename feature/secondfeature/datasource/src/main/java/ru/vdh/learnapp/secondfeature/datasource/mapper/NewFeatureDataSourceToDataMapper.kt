package ru.vdh.learnapp.secondfeature.datasource.mapper

import ru.vdh.learnapp.secondfeature.data.model.NewFeatureDataModel

class NewFeatureDataSourceToDataMapper {

    fun toDataSource(input: NewFeatureDataModel) =
        NewFeatureDataModel(firstName = input.firstName, lastName = "")
}