package main.java.oop.class_problems;

public class TopThree {

    static int[] findTopThreeScores(int[] scores) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] > first) {
                third = second;
                second = first;
                first = scores[i];
            } 
            else if (scores[i] > second) {
                third = second;
                second = scores[i];
            } 
            else if (scores[i] > third) {
                third = scores[i];
            }
        }

        return new int[]{first, second, third};
    }

    public static void main(String[] args) {

        int[] scores = {75, 92, 68, 88, 95, 80};

        int[] result = findTopThreeScores(scores);

        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }
}