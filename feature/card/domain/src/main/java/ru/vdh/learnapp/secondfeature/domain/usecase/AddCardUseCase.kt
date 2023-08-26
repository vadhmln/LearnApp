package ru.vdh.learnapp.secondfeature.domain.usecase

import ru.vdh.learnapp.secondfeature.domain.model.CardDomainModel
import ru.vdh.learnapp.secondfeature.domain.repository.CardRepository

class AddCardUseCase(
    private val cardRepository: CardRepository,
) {

    suspend operator fun invoke(card: CardDomainModel) =
        cardRepository.insertCard(card)
}