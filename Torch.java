class Torch {

    static boolean activeStatus;

    static int currentBrightness;
    static int maxBrightness = 10;
    static int minBrightness = 0;

    static boolean switchTorch() {

        if (activeStatus == false) {
            activeStatus = true;
            System.out.println("Torch light is ON...");
        } else {
            activeStatus = false;
            System.out.println("Torch light is OFF...");
        }

        return activeStatus;
    }

    static void increaseBrightness() {
        System.out.println("increaseBrightness is invoked...");
        System.out.println("number of args : " + 0);

        if (activeStatus == true) {
            if (currentBrightness < maxBrightness) {
                currentBrightness = currentBrightness + 1;
                System.out.println("Current brightness is : " + currentBrightness);
            } else {
                System.out.println("Maximum brightness reached");
            }
        } else {
            System.out.println("First turn on the Torch");
        }
    }

    static void decreaseBrightness() {
        System.out.println("decreaseBrightness is invoked...");
        System.out.println("number of args : " + 0);

        if (activeStatus == true) {
            if (currentBrightness > minBrightness) {
                currentBrightness = currentBrightness - 1;
                System.out.println("Current brightness is : " + currentBrightness);
            } else {
                System.out.println("Minimum brightness reached");
            }
        } else {
            System.out.println("First turn on the Torch");
        }
    }
}
