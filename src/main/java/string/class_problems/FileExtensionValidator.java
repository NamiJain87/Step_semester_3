package main.java.string.class_problems;

public class FileExtensionValidator {

    String validateFileExtension(String filename) {

        int dotPosition = filename.lastIndexOf('.');

        if (dotPosition == -1) {
            return "Rejected — invalid file type";
        }

        String extension = filename.substring(dotPosition + 1);

        if (extension.equalsIgnoreCase("pdf") ||
            extension.equalsIgnoreCase("docx") ||
            extension.equalsIgnoreCase("zip")) {

            return "Accepted";
        }
        else {
            return "Rejected — invalid file type";
        }
    }

    public static void main(String[] args) {

        String filename = "Assignment1.PDF";

        FileExtensionValidator obj = new FileExtensionValidator();

        String result = obj.validateFileExtension(filename);

        System.out.println(result);
    }
}