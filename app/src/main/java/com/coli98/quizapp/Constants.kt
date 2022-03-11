package com.coli98.quizapp

object Constants {

    const val USER_NAME : String ="user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun GetQuestions():ArrayList<Question> {
    val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia",
            "Austria", "Armenia",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2, "What map in csgo is it?",
            R.drawable.ic_inferno_map,
            "de_dustII","de_mirage",
            "de_inferno", "de_nuke",
            3
        )
        questionList.add(que2)

        val que3 = Question(
            3, "What sport is it?",
            R.drawable.ic_ski,
            "iceskating", "snowboarding",
            "skydiving", "skiing",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            4, "What region in Austria is it?",
            R.drawable.ic_tyrol,
            "Salzburg", "Tyrol",
            "Lower Austria", "Upper Austria",
        2
        )

        questionList.add(que4)

        val que5 = Question(
            5, "What is the name of this car brand?",
            R.drawable.ic_koeningsegg,
            "Maseratti", "Lamborghini",
            "Bugatti", "Koeningsegg",
            4
        )

        questionList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )

        questionList.add(que6)


        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )

        questionList.add(que7)


        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        questionList.add(que8)


        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2
        )

        questionList.add(que9)


        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )
        questionList.add(que10)


        return questionList
    }

}