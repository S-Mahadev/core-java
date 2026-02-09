class InstagramSignUpPage {
    public static void main(String[] args) {
        signup("Mahadev Salutagi", "Dev7899", "Mahadev@123",
               "mahadev@gmail.com", 7899695872L, "12-05-2002", 9677);
    }

    static void signup(String fullName, String userName, String password,
                       String email, long mobileNumber, String dob, int otp) {

        System.out.println("Instagram Signup");
        System.out.println("The full name entered by the user is " + fullName + ".");
        System.out.println("The username chosen is " + userName + ".");
        System.out.println("The password created is " + password + ".");
        System.out.println("The email address provided is " + email + ".");
        System.out.println("The mobile number entered is " + mobileNumber + ".");
        System.out.println("The date of birth entered is " + dob + ".");
        System.out.println("The OTP generated for verification is " + otp + ".");
    }
}
