package ru.vdh.learnapp.secondfeature.presentation.mapper

import ru.vdh.learnapp.secondfeature.domain.model.NewFeatureDomainModel
import ru.vdh.learnapp.secondfeature.presentation.model.NewFeaturePresentationModel

class NewFeatureDomainToPresentationMapper {

    fun toPresentation(user: NewFeatureDomainModel) =
        NewFeaturePresentationModel(
            firstName = user.firstName,
            lastName = user.lastName
        )
}