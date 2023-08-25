package ru.vdh.learnapp.newfeature.presentation.mapper

import ru.vdh.learnapp.newfeature.domain.model.NewFeatureDomainModel
import ru.vdh.learnapp.newfeature.presentation.model.NewFeaturePresentationModel

class NewFeatureDomainToPresentationMapper {

    fun toPresentation(user: NewFeatureDomainModel) =
        NewFeaturePresentationModel(
            firstName = user.firstName,
            lastName = user.lastName
        )
}