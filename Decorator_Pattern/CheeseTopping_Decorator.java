class CheeseTopping_Decorator extends Topping_Decorator  {

    public CheeseTopping_Decorator(Base_Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese Topping";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10.0; // Assuming cheese topping costs $1.5
    }
}