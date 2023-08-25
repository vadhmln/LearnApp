package ru.vdh.learnapp.secondfeature.domain.usecase

import ru.vdh.learnapp.secondfeature.domain.model.NewFeatureDomainModel
import ru.vdh.learnapp.secondfeature.domain.repository.NewFeatureRepository

class SaveSecondFeatureUseCase(
    private val newFeatureRepository: NewFeatureRepository,
)  {

   operator fun invoke(request: NewFeatureDomainModel): Boolean {
        //данная проверка проводится в презентейшн слое, здесь для демонстрации
        val oldUserName = newFeatureRepository.get()
        if (oldUserName.firstName == request.firstName) {
            return true
        }
        return newFeatureRepository.save(newFeature = request)
    }
}



