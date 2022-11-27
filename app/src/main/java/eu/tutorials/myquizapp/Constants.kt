package eu.tutorials.myquizapp

object Constants {

      fun getQuestions():ArrayList<Question>{
          val questionList = ArrayList<Question>()


          val que1  = Question(
              1,
              "What country does this flag belong to?",
              image = R.drawable.flag_germany,
              "Germany","Austrialia",
              "Armenia","Austria",
              1
          )
          questionList.add(que1)

          val que2  = Question(
              2,
              "What country does this flag belong to?",
              image = R.drawable.flag_saudia_250,
              "Armania","Jordan",
              "Saudia","Austria",
              3
          )
          questionList.add(que2)

          val que3  = Question(
              2,
              "What country does this flag belong to?",
              image = R.drawable.spain_flag_icon_7,
              "Armania","Jordan",
              "Saudia", "Spain",
              4
          )
          questionList.add(que3)

          return questionList
      }
}