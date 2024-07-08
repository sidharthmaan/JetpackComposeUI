package com.example.jetpackcomposeui.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetpackcomposeui.screens.ProductDetailsScreen
import com.example.jetpackcomposeui.screens.ProductScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,

    startDestination: String = Navigationitem.PRODUCT
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {


        composable(Navigationitem.PRODUCT) {
            ProductScreen(navController)
        }
        composable(
            "${Navigationitem.PRODUCT_DETAILS}/{id}",
            arguments = listOf(navArgument("id") { type = NavType.StringType })
        ) {
            val id = it.arguments?.getString("id")
            if (id!= null)
                ProductDetailsScreen(id, navController)
        }
    }

}