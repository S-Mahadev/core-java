class SpotifySignUpPage {
    public static void main(String[] args) {
        signup("mahadev@gmail.com", "mahadev_music", "Spotify@123");
    }

    static void signup(String email, String username, String password) {
        System.out.println("Spotify Signup");
        System.out.println("The email address entered is " + email + ".");
        System.out.println("The username chosen by the user is " + username + ".");
        System.out.println("The password created for the account is " + password + ".");
    }
}
