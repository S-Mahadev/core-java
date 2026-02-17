class ZomatoExecutor {

    public static void main(String[] args) {

        String FoodName = "Butter Chicken";

        double ref = Zomato.getFoodPrice(FoodName);

        System.out.println("The Price of the Food " + FoodName + " is : " + ref);
    }
}
