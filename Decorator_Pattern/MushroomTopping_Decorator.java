class MushroomTopping_Decorator extends Topping_Decorator {
   

    public MushroomTopping_Decorator(Base_Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushroom Topping";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.5; // Assuming mushroom topping costs $1.5
    }
}