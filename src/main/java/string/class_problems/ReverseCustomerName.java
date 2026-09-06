package main.java.string.class_problems;

public class ReverseCustomerName {

    public static String reverseCustomerName(String customerName) {

        char[] name = customerName.toCharArray();

        int start = 0;
        int end = name.length - 1;

        while (start < end) {

            char temp = name[start];
            name[start] = name[end];
            name[end] = temp;

            start++;
            end--;
        }

        return new String(name);
    }

    public static void main(String[] args) {

        String customerName = "Sunil";

        String reversedName = reverseCustomerName(customerName);

        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reversedName);
    }
}