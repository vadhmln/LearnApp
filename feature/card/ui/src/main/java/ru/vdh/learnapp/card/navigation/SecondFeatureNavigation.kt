package ru.vdh.learnapp.card.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import ru.vdh.cleanarch.navigation.Screen
import ru.vdh.learnapp.card.ui.view.SecondFeatureScreen

const val secondFeatureRoute = "second_feature_route"

fun NavGraphBuilder.secondFeatureScreen(navController: NavController) {
    composable(route = Screen.SecondFeatureScreen.route) {
        SecondFeatureScreen(navController)
    }
}