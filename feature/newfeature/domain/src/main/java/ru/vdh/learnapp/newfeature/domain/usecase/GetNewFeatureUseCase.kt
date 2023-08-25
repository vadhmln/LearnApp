package ru.vdh.learnapp.newfeature.domain.usecase

import ru.vdh.learnapp.newfeature.domain.repository.NewFeatureRepository

class GetNewFeatureUseCase(
    private val newFeatureRepository: NewFeatureRepository,
) {

    operator fun invoke() =
        newFeatureRepository.get()
}