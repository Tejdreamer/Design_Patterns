public abstract class Topping_Decorator implements Base_Pizza{
     protected Base_Pizza pizza; // here protected is used so that only child classes can access it

    public Topping_Decorator(Base_Pizza newPizza){
        this.pizza = newPizza;
    }

    public String getDescription(){
        return pizza.getDescription();
    }

    public double getCost(){
        return pizza.getCost();
    }
}