package ru.vdh.learnapp.card.presentation.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ru.vdh.learnapp.card.presentation.mapper.CardPresentationToDomainMapper
import ru.vdh.learnapp.card.presentation.model.CardPresentationModel
import ru.vdh.learnapp.secondfeature.domain.usecase.AddCardUseCase
import javax.inject.Inject

@HiltViewModel
class CardScreenViewModel @Inject constructor(
    private val addCardUseCase: AddCardUseCase,
    private val cardPresentationToDomainMapper: CardPresentationToDomainMapper,
) : ViewModel() {
    val id = mutableStateOf(0L)
    val frontText = mutableStateOf("")
    val backText = mutableStateOf("")

    fun addCard() {
        viewModelScope.launch {
            val card = CardPresentationModel(
                id = id.value,
                frontText = frontText.value,
                backText = backText.value,
            )
            addCardUseCase.invoke(cardPresentationToDomainMapper.toDomain(card))
        }
    }

    fun updateCardTexts(selectedCard: CardPresentationModel?) {
        if (selectedCard != null) {
            id.value = selectedCard.id
            frontText.value = selectedCard.frontText
            backText.value = selectedCard.backText
        } else {
            id.value = 0
            frontText.value = ""
            backText.value = ""
        }
    }
}

