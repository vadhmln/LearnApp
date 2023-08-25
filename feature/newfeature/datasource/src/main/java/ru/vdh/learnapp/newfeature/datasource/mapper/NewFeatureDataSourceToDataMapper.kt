package ru.vdh.learnapp.newfeature.datasource.mapper

import ru.vdh.learnapp.newfeature.data.model.NewFeatureDataModel

class NewFeatureDataSourceToDataMapper {

    fun toDataSource(input: NewFeatureDataModel) =
        NewFeatureDataModel(firstName = input.firstName, lastName = "")
}