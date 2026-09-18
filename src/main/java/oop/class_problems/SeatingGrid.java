package main.java.oop.class_problems;

public class SeatingGrid {

    static double rowAverage(int[] row) {

        int sum = 0;

        for (int i = 0; i < row.length; i++) {
            sum = sum + row[i];
        }

        return (double) sum / row.length;
    }

    static String classifyRows(int[][] seatingScores, int threshold) {

        String result = "";

        for (int i = 0; i < seatingScores.length; i++) {

            double average = rowAverage(seatingScores[i]);

            if (average < threshold) {
                result = result + "Quiet Zone";
            } else {
                result = result + "Buzzing Zone";
            }

            if (i < seatingScores.length - 1) {
                result = result + " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] seatingScores = {
            {40, 50, 45},
            {80, 75, 85},
            {30, 35, 40}
        };

        int threshold = 60;

        System.out.println(classifyRows(seatingScores, threshold));
    }
}