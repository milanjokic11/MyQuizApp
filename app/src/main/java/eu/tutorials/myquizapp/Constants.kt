package eu.tutorials.myquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val question: String = "Identify the animal shown in the photograph..."
        val questionsList = ArrayList<Question>()
        // add question 1
        val que1 = Question(1, question, R.drawable.goldfish, "Puffer fish", "Gold fish", "Shark", "Clown fish", 2)
        questionsList.add(que1)
        // add question 2
        val que2 = Question(2, question, R.drawable.dove, "Eagle", "Pigeon", "Dove", "Chicken", 3)
        questionsList.add(que2)
        // add question 3
        val que3 = Question(3, question, R.drawable.jaguar, "Jaguar", "Cheetah", "Grizzly Bear", "Coyote", 1)
        questionsList.add(que3)
        // add question 4
        val que4 = Question(4, question, R.drawable.jellyfish, "Electric Eel", "Water Snake", "Jellyfish", "Dolphin", 3)
        questionsList.add(que4)
        // add question 5
        val que5 = Question(5, question, R.drawable.elephant, "Bison", "Giraffe", "Buffalo", "Elephant", 4)
        questionsList.add(que5)
        // add question 6
        val que6 = Question(6, question, R.drawable.hog, "Hog", "Wolverine", "Pig", "Horse", 1)
        questionsList.add(que6)
        // add question 7
        val que7 = Question(7, question, R.drawable.lion, "Cheetah", "Lion", "Gazelle", "Hyena", 2)
        questionsList.add(que7)
        // add question 8
        val que8 = Question(8, question, R.drawable.polarbear, "Black Bear", "Grizzly Bear", "Polar Bear", "Brown Bear", 3)
        questionsList.add(que8)
        // add question 9
        val que9 = Question(9, question, R.drawable.lemur, "Ferret", "Koala", "Opossum", "Lemur", 4)
        questionsList.add(que9)
        // add question 10
        val que10 = Question(10, question, R.drawable.tiger, "Tiger", "Lion", "Household Cat", "Panda Bear", 1)
        questionsList.add(que10)

        // return arraylist of questions
        return questionsList
    }
}