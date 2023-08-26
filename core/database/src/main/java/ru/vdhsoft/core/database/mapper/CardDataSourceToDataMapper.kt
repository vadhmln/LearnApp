package ru.vdhsoft.core.database.mapper

import ru.vdh.learnapp.card.data.model.CardDataModel
import ru.vdhsoft.core.database.entity.CardEntity

class CardDataSourceToDataMapper {

    fun toData(input: CardEntity) =
        CardDataModel(
            id = input.id,
            frontText = input.frontText,
            backText = input.backText
        )
}