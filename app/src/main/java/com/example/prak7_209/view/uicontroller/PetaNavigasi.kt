package com.example.prak7_209.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
//import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prak7_209.view.EntrySiswaBody
import com.example.prak7_209.view.EntrySiswaScreen
import com.example.prak7_209.view.HomeScreen
import com.example.prak7_209.view.route.DestinasiEntry
import com.example.prak7_209.view.route.DestinasiHome

@Composable
fun SiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
)
{
    HostNavigasi(
        navController = navController
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(navController=navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ){
        composable(route = DestinasiHome.route){
            HomeScreen(
                navigateToItemEntry = {navController.navigate(route = DestinasiEntry.route)}
            )
        }
        composable(route = DestinasiEntry.route){
            EntrySiswaScreen(
                navigateBack = {navController.popBackStack()}
            )
        }
    }
}