package main.java.string.class_problems;

public class BankTransactionReferenceValidator {

    String normalizeReference(String raw) {

        raw = raw.trim();

        String bankCode = raw.substring(0, 3).toUpperCase();
        String remaining = raw.substring(3);

        return bankCode + remaining;
    }

    String validateAndFormat(String reference) {

        if (reference.length() != 14) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        for (int i = 3; i < reference.length(); i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: body must contain digits";
            }
        }

        String bankCode = reference.substring(0, 3);
        String date = reference.substring(3, 9);
        String sequence = reference.substring(9);

        String formattedDate = date.substring(0, 2) + "/"
                + date.substring(2, 4) + "/"
                + date.substring(4, 6);

        StringBuilder result = new StringBuilder();

        result.append("[")
              .append(bankCode)
              .append("] DATE: ")
              .append(formattedDate)
              .append(" | SEQ: ")
              .append(sequence);

        return result.toString();
    }

    public static void main(String[] args) {

        String rawReference = " hdf03022600042 ";

        BankTransactionReferenceValidator obj =
                new BankTransactionReferenceValidator();

        String reference = obj.normalizeReference(rawReference);

        String result = obj.validateAndFormat(reference);

        System.out.println(result);
    }
}