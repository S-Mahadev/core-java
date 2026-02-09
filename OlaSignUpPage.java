class OlaSignUpPage {
    public static void main(String[] args) {
        signup("Mahadev S", 7899695872L, 1122);
    }

    static void signup(String name, long mobileNumber, int otp) {
        System.out.println("Ola Signup");
        System.out.println("The name entered by the user is " + name + ".");
        System.out.println("The mobile number used for registration is " + mobileNumber + ".");
        System.out.println("The OTP generated for verification is " + otp + ".");
    }
}
