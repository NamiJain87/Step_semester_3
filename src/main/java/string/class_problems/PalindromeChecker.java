package main.java.string.class_problems;

public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindromeRecursive(String text) {

        if (text.length() <= 1) {
            return true;
        }

        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }

        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {

        char[] arr = text.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        String reverse = new String(arr);

        return text.equals(reverse);
    }

    public static void main(String[] args) {

        String text = "madam";

        System.out.println("Iterative: "
                + (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Recursive: "
                + (isPalindromeRecursive(text) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Array Reversal: "
                + (isPalindromeArrayReversal(text) ? "Palindrome" : "Not Palindrome"));
    }
}