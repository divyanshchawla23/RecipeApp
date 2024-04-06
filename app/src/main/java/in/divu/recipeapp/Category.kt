package `in`.divu.recipeapp

data class Category(val idCategory:String,
                    val strCategory:String,
                    val strCategoryThumb:String,
                    val idCategoryDescription:String)



data class CategoriesResponse(val categories:List<Category>)

