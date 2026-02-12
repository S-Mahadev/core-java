class Calculator {

    static boolean powerMode;

    static int currentValue;
    static int maxValue = 10;
    static int minValue = 0;

    static boolean powerControl() {

        if (powerMode == false) {
            powerMode = true;
            System.out.println("Calculator powered ON...");
        } else {
            powerMode = false;
            System.out.println("Calculator powered OFF...");
        }

        return powerMode;
    }

    static void increaseValue() {
        System.out.println("increaseValue is invoked...");
        System.out.println("number of args : " + 0);

        if (powerMode == true) {
            if (currentValue < maxValue) {
                currentValue = currentValue + 1;
                System.out.println("Current value is : " + currentValue);
            } else {
                System.out.println("Maximum value reached");
            }
        } else {
            System.out.println("First turn on the Calculator");
        }
    }

    static void decreaseValue() {
        System.out.println("decreaseValue is invoked...");
        System.out.println("number of args : " + 0);

        if (powerMode == true) {
            if (currentValue > minValue) {
                currentValue = currentValue - 1;
                System.out.println("Current value is : " + currentValue);
            } else {
                System.out.println("Minimum value reached");
            }
        } else {
            System.out.println("First turn on the Calculator");
        }
    }
}
