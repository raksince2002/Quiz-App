package eu.rakesh.myquizapp

object Constants {
    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"
    fun getQuestions():ArrayList<Question>{
        val questionsList= ArrayList<Question>()

        val q1= Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India",
            "Australia",
            "Austria",
            "Portugal",
            1
        )
        questionsList.add(q1)

        val q2= Question(
            2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "South Africa",
            "New Zealand",
            1
        )
        questionsList.add(q2)

        val q3= Question(
            3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "West Indies",
            "Australia",
            "Iran",
            "kenya",
            2
        )
        questionsList.add(q3)

        val q4= Question(
            4,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium",
            "Germany",
            "India",
            "France",
            1
        )
        questionsList.add(q4)

        val q5= Question(
            5,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Indonesia",
            "Brazil",
            "Malaysia",
            "Singapore",
            2
        )
        questionsList.add(q5)

        val q6= Question(
            6,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany",
            "Belgium",
            "USA",
            "France",
            1
        )
        questionsList.add(q6)

        return questionsList
    }

}