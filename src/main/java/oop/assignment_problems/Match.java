package main.java.oop.assignment_problems;

import java.util.Arrays;

public class Match {

    private String name;
    private double cgpa;
    private int codingScore;

    public Match(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    static boolean isEligible(double cgpa) {
        return cgpa >= 8.0;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 7.0 && codingScore >= 70;
    }

    int compareTo(Match other) {
        double score1 = cgpa * 10 + codingScore;
        double score2 = other.cgpa * 10 + other.codingScore;

        return Double.compare(score2, score1);
    }

    static String shortlistAndRank(Match[] candidates) {

        Match[] shortlisted = new Match[candidates.length];
        int count = 0;

        for (int i = 0; i < candidates.length; i++) {

            if (isEligible(candidates[i].cgpa) ||
                isEligible(candidates[i].cgpa, candidates[i].codingScore)) {

                shortlisted[count] = candidates[i];
                count++;
            }
        }

        Match[] result = Arrays.copyOf(shortlisted, count);

        Arrays.sort(result, (a, b) -> a.compareTo(b));

        String output = "";

        for (int i = 0; i < result.length; i++) {
            output = output + (i + 1) + ". " + result[i].name;

            if (i < result.length - 1) {
                output = output + " | ";
            }
        }

        return output;
    }

    public static void main(String[] args) {

        Match[] candidates = {
            new Match("Arun", 8.5, 75),
            new Match("Rahul", 7.5, 90),
            new Match("Karan", 6.8, 85)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}