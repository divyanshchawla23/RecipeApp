package `in`.divu.recipeapp

sealed class Screen(val route : String ) {

    data object RecipeScreen : Screen("recipescreen")
    data object DetailScreen : Screen("detailscreen")
}