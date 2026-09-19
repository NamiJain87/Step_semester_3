package main.java.oop.practice_problem;

public class QuizScorecard {

    private boolean[] answers;
    private int count;
    private int score;

    public QuizScorecard(int numberOfQuestions) {
        answers = new boolean[numberOfQuestions];
        count = 0;
        score = 0;
    }

    public void recordAnswer(boolean correct) {
        if (count < answers.length) {
            answers[count] = correct;

            if (correct) {
                score++;
            }

            count++;
        } else {
            System.out.println("No more answers can be recorded.");
        }
    }

    public int getScore() {
        return score;
    }

    public static void main(String[] args) {

        QuizScorecard quiz = new QuizScorecard(3);

        quiz.recordAnswer(true);
        quiz.recordAnswer(false);
        quiz.recordAnswer(true);

        System.out.println("Score: " + quiz.getScore());

        // Extra answer
        quiz.recordAnswer(true);
    }
}