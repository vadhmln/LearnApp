package ru.vdh.learnapp.newfeature.presentation.mapper

import ru.vdh.learnapp.newfeature.domain.model.NewFeatureDomainModel
import ru.vdh.learnapp.newfeature.presentation.model.NewFeaturePresentationModel

class NewFeaturePresentationToDomainMapper {

    fun toDomain(newUser: NewFeaturePresentationModel) =
        NewFeatureDomainModel(
            firstName = newUser.firstName,
            lastName = newUser.lastName
        )
}
