package com.example.jetpackcomposeui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.jetpackcomposeui.Model.Product
import com.example.jetpackcomposeui.Navigation.Navigationitem
import com.example.jetpackcomposeui.R
import com.example.jetpackcomposeui.components.ProductItem

@Composable
fun ProductScreen(
    navController: NavController
) {
    var products = remember {
        getProductList()
    }
    LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.padding(8.dp)){
        items(products) {
            ProductItem(product = it)
            navController.navigate("$Navigationitem.PRODUCT_DETAILS/${it.id}")
        }
    }

}

fun getProductList() : List<Product>{
    return listOf(
        Product(
            id = "1",
            color = Color.Red,
            price = 1200f,
            name = "Shoes RedWhite",
            discountPrice = 1000f,
            rating = 4.9f,
            imageRes = R.drawable.s_1,
            size = 8
        ),
        Product(
            id = "2",
            color = Color.Gray,
            price = 1350f,
            name = "Shoes Gray",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_2,
            size = 8
        ),
        Product(
            id = "3",
            color = Color.Blue,
            price = 1100f,
            name = "Shoes BlackRed",
            discountPrice = 800f,
            rating = 4.7f,
            imageRes = R.drawable.s_3,
            size = 10
        ),
        Product(
            id = "4",
            color = Color.LightGray,
            price = 1500f,
            name = "Shoes Skinny",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_4,
            size = 7
        ),
        Product(
            id = "5",
            color = Color.DarkGray,
            price = 1200f,
            name = "Shoes Black",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_5,
            size = 9
        ),
        Product(
            id = "6",
            color = Color.Blue,
            price = 1500f,
            name = "Shoes Gray",
            discountPrice = 1000f,
            rating = 4.9f,
            imageRes = R.drawable.s_6,
            size = 7
        ),
        Product(
            id = "7",
            color = Color.LightGray,
            price = 1400f,
            name = "Shoes DarkGray",
            discountPrice = 1000f,
            rating = 4.8f,
            imageRes = R.drawable.s_7,
            size = 8
        ),
        Product(
            id = "8",
            color = Color.LightGray,
            price = 1800f,
            name = "Shoes Beige",
            discountPrice = 1000f,
            rating = 4.9f,
            imageRes = R.drawable.s_8,
            size = 8
        ),
        Product(
            id = "9",
            color = Color.Red,
            price = 1400f,
            name = "Shoes Black",
            discountPrice = 1000f,
            rating = 4.8f,
            imageRes = R.drawable.s_1,
            size = 7
        ),
        Product(
            id = "10",
            color = Color.LightGray,
            price = 1200f,
            name = "Shoes RedWhite",
            discountPrice = 1000f,
            rating = 4.5f,
            imageRes = R.drawable.s_3,
            size = 8
        )
    )

}