package ru.vdh.learnapp.card.presentation.mapper

import ru.vdh.learnapp.card.presentation.model.CardPresentationModel
import ru.vdh.learnapp.secondfeature.domain.model.CardDomainModel

class CardPresentationToDomainMapper {

    fun toDomain(input: CardPresentationModel) =
        CardDomainModel(
            id = input.id,
            frontText = input.frontText,
            backText = input.backText,
        )
}