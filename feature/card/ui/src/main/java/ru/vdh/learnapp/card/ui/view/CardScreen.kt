package ru.vdh.learnapp.card.ui.view

import androidx.compose.runtime.Composable
import ru.vdh.learnapp.card.presentation.viewmodel.CardScreenViewModel

@Composable
fun CardView(
    cardScreenViewModel: CardScreenViewModel,
) {
    val frontText = cardScreenViewModel.frontText
    val backText = cardScreenViewModel.backText
    fun onFrontTextChanged() = cardScreenViewModel.frontText.value
    fun onBackTextChanged() = cardScreenViewModel.backText.value

    CardContent(
        frontText = frontText.value,
        onFrontTextChanged = {
            cardScreenViewModel.frontText.value = it
        },
        backText = backText.value,
        onBackTextChanged = {
            cardScreenViewModel.backText.value = it
        },
    )
}