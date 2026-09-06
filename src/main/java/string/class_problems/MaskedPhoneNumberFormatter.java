package main.java.string.class_problems;

public class MaskedPhoneNumberFormatter {

    String maskPhoneNumber(String phone) {

        if (phone.length() != 10) {
            return "Invalid phone number";
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }

        String lastFourDigits = phone.substring(6);

        StringBuilder result = new StringBuilder("XXXXXX");
        result.insert(6, "-");
        result.append(lastFourDigits);

        return result.toString();
    }

    public static void main(String[] args) {

        String phone = "9876543210";

        MaskedPhoneNumberFormatter obj = new MaskedPhoneNumberFormatter();

        String result = obj.maskPhoneNumber(phone);

        System.out.println(result);
    }
}