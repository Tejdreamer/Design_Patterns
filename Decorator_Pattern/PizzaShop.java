// client code that simulates a pizza shop

class PizzaShop {
    public static void main(String[] args) {
        Base_Pizza pizza = new Plain_Pizza();
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        pizza = new CheeseTopping_Decorator(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        pizza = new MushroomTopping_Decorator(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        pizza = new PaneerTopping_Decorator(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        Base_Pizza pizza2 = new MushroomTopping_Decorator(new CheeseTopping_Decorator(new Plain_Pizza()));
        System.out.println(pizza2.getDescription() + " Cost: $" + pizza2.getCost());
        
    }
}