class TelegramSignUp {
    public static void main(String[] args) {
        signup("Mahadev Salutagi", 7899695872L, 9978);
    }

    static void signup(String fullName, long mobile, int otp) {
        System.out.println("Telegram Signup");
        System.out.println("The full name entered is " + fullName + ".");
        System.out.println("The mobile number used for registration is " + mobile + ".");
        System.out.println("The OTP sent for verification is " + otp + ".");
    }
}
