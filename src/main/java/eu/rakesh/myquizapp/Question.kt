package eu.rakesh.myquizapp

data class Question(
    val id:Int,
    val question: String,
    val image: Int,
    val Option1:String,
    val Option2:String,
    val Option3:String,
    val Option4:String,
    val correctans:Int
)
