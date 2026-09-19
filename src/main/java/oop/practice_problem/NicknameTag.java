package main.java.oop.practice_problem;

public class NicknameTag {

    private final String firstName;
    private final String lastName;

    public NicknameTag(String fullName) {

        String[] parts = fullName.split(" ");

        firstName = parts[0];
        lastName = parts[parts.length - 1];
    }

    public String getNickname() {
        return firstName + " " + lastName.charAt(0) + ".";
    }

    public static void main(String[] args) {

        NicknameTag person = new NicknameTag("Maria Garcia");

        System.out.println("Nickname: " + person.getNickname());
    }
}