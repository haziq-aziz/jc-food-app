package com.example.foodpack

import androidx.annotation.DrawableRes
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlin.collections.shuffled

data class FoodItem(
    val id: Int = 0,
    val name: String,
    val tagline: String,
    val description: String,
    val rating: Float,
    val spicyLevel: Float,
    val price: Double,
    @DrawableRes val imageRes: Int
) {
    var isLiked by mutableStateOf(false)
}

val dummyFoodItem = listOf(
    FoodItem (
        id = 0,
        name = "Cheese Burger",
        tagline = "Wendy's Burger",
        rating = 4.9f,
        imageRes = R.drawable.image_1,
        description = "The Cheeseburger Wendy's Burger is a classic fast food burger that packs a punch of flavor in every bite. Made with a juicy beef patty cooked to perfection, it's topped with melted American cheese, crispy lettuce, ripe tomato, and crunchy pickles.",
        spicyLevel = .7f,
        price = 9.9
    ),
    FoodItem(
        id = 0,
        name = "Cheese Burger",
        tagline = "Said's Burger",
        rating = 4.9f,
        imageRes = R.drawable.image_1,
        description = "The Cheeseburger Said's Burger is a classic fast food burger that packs a punch of flavor in every bite. Made with a juicy beef patty cooked to perfection, it's topped with melted American cheese, crispy lettuce, ripe tomato, and crunchy pickles.",
        spicyLevel = .9f,
        price = 6.9
    ),
    FoodItem(
        id = 0,
        name = "Shawarma",
        tagline = "Hoods Shawarma",
        rating = 4.8f,
        imageRes = R.drawable.image_1,
        description = "The Shawarma is a classic fast food Shawarma that packs a punch of flavor in every bite. Made with a juicy beef patty cooked to perfection, it's topped with melted American cheese, crispy lettuce, ripe tomato, and crunchy pickles.",
        spicyLevel = .5f,
        price = 5.9
    ),
    FoodItem(
        id = 0,
        name = "Chicken Burger",
        tagline = "Chicken Burger",
        rating = 4.9f,
        imageRes = R.drawable.image_2,
        description = "Our chicken burger is a delicious and healthier alternative to traditional beef burgers, perfect for those looking for a lighter meal option. Try it today and experience the mouth-watering flavors of our Hamburger Chicken Burger!",
        spicyLevel = .9f,
        price = 7.9
    ),
    FoodItem(
        id = 0,
        name = "Hamburger",
        tagline = "Veggie Burger",
        rating = 4.9f,
        imageRes = R.drawable.image_3,
        description = "Enjoy our delicious Hamburger Veggie Burger, made with a savory blend of fresh vegetables and herbs, topped with crisp lettuce, juicy tomatoes, and tangy pickles, all served on a soft, toasted bun. ",
        spicyLevel = .4f,
        price = 8.9
    ),
    FoodItem(
        id = 0,
        name = "Hamburger",
        tagline = "Fried Chicken Burger",
        rating = 4.9f,
        imageRes = R.drawable.image_4,
        description = "Indulge in our crispy and savory Fried Chicken Burger, made with a juicy chicken patty, hand-breaded and deep-fried to perfection, served on a warm bun with lettuce, tomato, and a creamy sauce.",
        spicyLevel = .9f,
        price = 5.9
    ),
    FoodItem(
        id = 0,
        name = "Cheese Burger",
        tagline = "Wendy's Burger",
        rating = 4.9f,
        imageRes = R.drawable.image_1,
        description = "The Cheeseburger Wendy's Burger is a classic fast food burger that packs a punch of flavor in every bite. Made with a juicy beef patty cooked to perfection, it's topped with melted American cheese, crispy lettuce, ripe tomato, and crunchy pickles.",
        spicyLevel = .7f,
        price = 9.9
    ),
    FoodItem(
        id = 0,
        name = "Cheese Burger",
        tagline = "Said's Burger",
        rating = 4.9f,
        imageRes = R.drawable.image_1,
        description = "The Cheeseburger Said's Burger is a classic fast food burger that packs a punch of flavor in every bite. Made with a juicy beef patty cooked to perfection, it's topped with melted American cheese, crispy lettuce, ripe tomato, and crunchy pickles.",
        spicyLevel = .9f,
        price = 6.9
    ),
    FoodItem(
        id = 0,
        name = "Shawarma",
        tagline = "Hoods Shawarma",
        rating = 4.8f,
        imageRes = R.drawable.image_1,
        description = "The Shawarma is a classic fast food Shawarma that packs a punch of flavor in every bite. Made with a juicy beef patty cooked to perfection, it's topped with melted American cheese, crispy lettuce, ripe tomato, and crunchy pickles.",
        spicyLevel = .5f,
        price = 5.9
    ),
    FoodItem(
        id = 0,
        name = "Chicken Burger",
        tagline = "Chicken Burger",
        rating = 4.9f,
        imageRes = R.drawable.image_2,
        description = "Our chicken burger is a delicious and healthier alternative to traditional beef burgers, perfect for those looking for a lighter meal option. Try it today and experience the mouth-watering flavors of our Hamburger Chicken Burger!",
        spicyLevel = .9f,
        price = 7.9
    ),
    FoodItem(
        id = 0,
        name = "Hamburger",
        tagline = "Veggie Burger",
        rating = 4.9f,
        imageRes = R.drawable.image_3,
        description = "Enjoy our delicious Hamburger Veggie Burger, made with a savory blend of fresh vegetables and herbs, topped with crisp lettuce, juicy tomatoes, and tangy pickles, all served on a soft, toasted bun. ",
        spicyLevel = .4f,
        price = 8.9
    ),
    FoodItem(
        id = 0,
        name = "Hamburger",
        tagline = "Fried Chicken Burger",
        rating = 4.9f,
        imageRes = R.drawable.image_4,
        description = "Indulge in our crispy and savory Fried Chicken Burger, made with a juicy chicken patty, hand-breaded and deep-fried to perfection, served on a warm bun with lettuce, tomato, and a creamy sauce.",
        spicyLevel = .9f,
        price = 5.9
    ),
).shuffled()