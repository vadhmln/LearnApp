package ru.vdh.learnapp.card.data.mapper

import ru.vdh.learnapp.card.data.model.CardDataModel
import ru.vdh.learnapp.secondfeature.domain.model.CardDomainModel

class CardDomainToDataMapper {

    fun toData(input: CardDomainModel) =
        CardDataModel(
            id = input.id,
            frontText = input.frontText,
            backText = input.backText,
        )
}