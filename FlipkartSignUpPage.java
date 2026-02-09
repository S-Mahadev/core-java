class FlipkartSignUpPage {
    public static void main(String[] args) {
        signup(7899695872L, "mahadevsalutagi3@gmail.com", 9677);
    }

    static void signup(long mobileNumber, String email, int otp) {
        System.out.println("Flipkart Signup");
        System.out.println("The mobile number entered for registration is " + mobileNumber + ".");
        System.out.println("The email address provided by the user is " + email + ".");
        System.out.println("The OTP generated for verification is " + otp + ".");
    }
}
