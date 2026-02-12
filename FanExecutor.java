class FanExecutor {

    public static void main(String[] args) {

        boolean on = Fan.startOrStop();
        System.out.println("The Fan is currently turned On : " + on);

        Fan.increaseSpeed();
        Fan.increaseSpeed();
        Fan.increaseSpeed();
        Fan.increaseSpeed();
        Fan.increaseSpeed();

        Fan.decreaseSpeed();
        Fan.decreaseSpeed();
        Fan.decreaseSpeed();
        Fan.decreaseSpeed();
        Fan.decreaseSpeed();

        boolean off = Fan.startOrStop();
        System.out.println("The Fan is currently turned On : " + off);
    }
}
