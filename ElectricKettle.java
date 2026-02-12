class ElectricKettle {

    static boolean boilingProcess;

    static int currentTemperature;
    static int maxTemperature = 100;
    static int minTemperature = 0;

    static boolean boilSwitch() {

        if (boilingProcess == false) {
            boilingProcess = true;
            System.out.println("Water is boiling...");
        } else {
            boilingProcess = false;
            System.out.println("Kettle turned off...");
        }

        return boilingProcess;
    }

    static void increaseTemperature() {
        System.out.println("increaseTemperature is invoked...");
        System.out.println("number of args : " + 0);

        if (boilingProcess == true) {
            if (currentTemperature < maxTemperature) {
                currentTemperature = currentTemperature + 10;
                System.out.println("Current temperature is : " + currentTemperature);
            } else {
                System.out.println("Maximum temperature reached");
            }
        } else {
            System.out.println("First turn on the ElectricKettle");
        }
    }

    static void decreaseTemperature() {
        System.out.println("decreaseTemperature is invoked...");
        System.out.println("number of args : " + 0);

        if (boilingProcess == true) {
            if (currentTemperature > minTemperature) {
                currentTemperature = currentTemperature - 10;
                System.out.println("Current temperature is : " + currentTemperature);
            } else {
                System.out.println("Minimum temperature reached");
            }
        } else {
            System.out.println("First turn on the ElectricKettle");
        }
    }
}
