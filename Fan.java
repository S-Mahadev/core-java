class Fan {

    static boolean isRunning;

    static int currentSpeed;
    static int maxSpeed = 8;
    static int minSpeed = 0;

    static boolean startOrStop() {

        if (isRunning == false) {
            isRunning = true;
            System.out.println("The Fan is turned on ..");
        } else {
            isRunning = false;
            System.out.println("The Fan is turned off ..");
        }

        return isRunning;
    }

    static void increaseSpeed() {
        System.out.println("increaseSpeed is invoked...");
        System.out.println("number of args : " + 0);

        if (isRunning == true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed = currentSpeed + 1;
                System.out.println("The current fan speed is : " + currentSpeed);
            } else {
                System.out.println("Maximum speed reached");
            }
        } else {
            System.out.println("First turn on the Fan");
        }
    }

    static void decreaseSpeed() {
        System.out.println("decreaseSpeed is invoked...");
        System.out.println("number of args : " + 0);

        if (isRunning == true) {
            if (currentSpeed > minSpeed) {
                currentSpeed = currentSpeed - 1;
                System.out.println("The current fan speed is : " + currentSpeed);
            } else {
                System.out.println("Minimum speed reached");
            }
        } else {
            System.out.println("First turn on the Fan");
        }
    }
}
