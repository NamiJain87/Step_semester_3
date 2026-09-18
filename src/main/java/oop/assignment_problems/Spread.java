package main.java.oop.assignment_problems;

import java.util.Arrays;

public class Spread {

    static void curveScores(int[] scores, int bonus) {

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scores[i] + bonus;
        }
    }

    public static void main(String[] args) {

        int[] scores = {70, 80, 65, 90};
        int bonus = 5;

        curveScores(scores, bonus);

        System.out.println(Arrays.toString(scores));
    }
}