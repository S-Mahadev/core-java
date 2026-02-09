class WhatsAppSignUpPage {
    public static void main(String[] args) {
        signup(7899695872L, "Mahadev S", 9988);
    }

    static void signup(long mobileNumber, String profileName, int otp) {
        System.out.println("WhatsApp Signup");
        System.out.println("The mobile number entered is " + mobileNumber + ".");
        System.out.println("The profile name chosen by the user is " + profileName + ".");
        System.out.println("The OTP generated for verification is " + otp + ".");
    }
}
