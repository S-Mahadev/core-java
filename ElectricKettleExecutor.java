class ElectricKettleExecutor {

    public static void main(String[] args) {

        boolean on = ElectricKettle.boilSwitch();
        System.out.println("The ElectricKettle is currently turned On : " + on);

        ElectricKettle.increaseTemperature();
        ElectricKettle.increaseTemperature();
        ElectricKettle.increaseTemperature();
        ElectricKettle.increaseTemperature();
        ElectricKettle.increaseTemperature();

        ElectricKettle.decreaseTemperature();
        ElectricKettle.decreaseTemperature();
        ElectricKettle.decreaseTemperature();
        ElectricKettle.decreaseTemperature();
        ElectricKettle.decreaseTemperature();

        boolean off = ElectricKettle.boilSwitch();
        System.out.println("The ElectricKettle is currently turned On : " + off);
    }
}
