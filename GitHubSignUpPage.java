class GitHubSignUpPage {
    public static void main(String[] args) {
        signup("mahadev-dev", "mahadev@gmail.com", "Git@123");
    }

    static void signup(String username, String email, String password) {
        System.out.println("GitHub Signup");
        System.out.println("The username selected by the user is " + username + ".");
        System.out.println("The registered email address is " + email + ".");
        System.out.println("The password created for the account is " + password + ".");
    }
}
