class LinkedInSignUpPage {
    public static void main(String[] args) {
        signup("mahadev@gmail.com", "LinkedIn@123", "Mahadev", "S");
    }

    static void signup(String email, String password, String firstName, String lastName) {
        System.out.println("LinkedIn Signup");
        System.out.println("The email address used for registration is " + email + ".");
        System.out.println("The password entered is " + password + ".");
        System.out.println("The user's first name is " + firstName + ".");
        System.out.println("The user's last name is " + lastName + ".");
    }
}
