package com.example.profilesamplecompose.nav

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.profilesamplecompose.screens.ProfileScreen
import com.example.profilesamplecompose.constants.Screens

@Composable
fun SetUpNavGraph(navController: NavHostController) {

    Box(modifier = Modifier.fillMaxSize()) {
        NavHost(
            navController = navController,
            startDestination = Screens.Profile.name,
            modifier = Modifier.fillMaxSize()
        ) {
            composable(Screens.Profile.name) {
                ProfileScreen(navController = navController)
            }

        }
    }
}
