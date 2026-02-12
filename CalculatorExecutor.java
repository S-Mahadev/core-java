class CalculatorExecutor {

    public static void main(String[] args) {

        boolean on = Calculator.powerControl();
        System.out.println("The Calculator is currently turned On : " + on);

        Calculator.increaseValue();
        Calculator.increaseValue();
        Calculator.increaseValue();
        Calculator.increaseValue();
        Calculator.increaseValue();

        Calculator.decreaseValue();
        Calculator.decreaseValue();
        Calculator.decreaseValue();
        Calculator.decreaseValue();
        Calculator.decreaseValue();

        boolean off = Calculator.powerControl();
        System.out.println("The Calculator is currently turned On : " + off);
    }
}
