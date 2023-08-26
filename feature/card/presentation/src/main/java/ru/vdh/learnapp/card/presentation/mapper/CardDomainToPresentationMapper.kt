package ru.vdh.learnapp.card.presentation.mapper

import ru.vdh.learnapp.card.presentation.model.CardPresentationModel
import ru.vdh.learnapp.secondfeature.domain.model.CardDomainModel

class CardDomainToPresentationMapper {

    fun toPresentation(input: CardDomainModel) =
        CardPresentationModel(
            id = input.id,
            frontText = input.frontText,
            backText = input.backText,
        )
}