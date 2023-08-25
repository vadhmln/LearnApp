package ru.vdh.learnapp.secondfeature.presentation.mapper

import ru.vdh.learnapp.secondfeature.domain.model.NewFeatureDomainModel
import ru.vdh.learnapp.secondfeature.presentation.model.NewFeaturePresentationModel

class NewFeaturePresentationToDomainMapper {

    fun toDomain(newUser: NewFeaturePresentationModel) =
        NewFeatureDomainModel(
            firstName = newUser.firstName,
            lastName = newUser.lastName
        )
}
