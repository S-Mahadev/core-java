class ZomatoSignUpPage {
    public static void main(String[] args) {
        signup("Mahadev S", 7899695872L, "mahadev@gmail.com");
    }

    static void signup(String name, long mobileNumber, String email) {
        System.out.println("Zomato Signup");
        System.out.println("The name entered by the user is " + name + ".");
        System.out.println("The mobile number provided is " + mobileNumber + ".");
        System.out.println("The email address entered is " + email + ".");
    }
}
