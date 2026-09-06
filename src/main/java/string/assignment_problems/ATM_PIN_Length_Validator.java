public class ATM_PIN_Length_Validator {

    void checkPinLength(String pin) {

        if (pin.length() == 4) {
            System.out.println("PIN length OK.");
        }
        else {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        }
    }

    public static void main(String[] args) {

        String pin = "4820";

        ATM_PIN_Length_Validator obj = new ATM_PIN_Length_Validator();

        obj.checkPinLength(pin);
    }
}