package ru.vdh.learnapp.secondfeature.domain.usecase

import ru.vdh.learnapp.secondfeature.domain.model.NewFeatureDomainModel
import ru.vdh.learnapp.secondfeature.domain.repository.NewFeatureRepository

class GetSecondFeatureUseCase(
    private val newFeatureRepository: NewFeatureRepository,
)  {

    operator fun invoke(request: NewFeatureDomainModel) =
        newFeatureRepository.get()
}