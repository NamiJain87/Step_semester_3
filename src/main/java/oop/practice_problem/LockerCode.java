package main.java.oop.practice_problem;

public class LockerCode {

    private String code;
    private final int lockerNumber;

    public LockerCode(int lockerNumber, String code) {
        this.lockerNumber = lockerNumber;
        this.code = code;
    }

    public boolean changeCode(String currentCode, String newCode) {
        if (code.equals(currentCode)) {
            code = newCode;
            return true;
        }

        return false;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public static void main(String[] args) {

        LockerCode locker = new LockerCode(101, "1234");

        System.out.println("Locker Number: " + locker.getLockerNumber());

        boolean result1 = locker.changeCode("1234", "5678");
        System.out.println("Code changed: " + result1);

        boolean result2 = locker.changeCode("1111", "9999");
        System.out.println("Code changed: " + result2);
    }
}