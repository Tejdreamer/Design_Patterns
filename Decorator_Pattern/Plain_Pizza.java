class Plain_Pizza implements Base_Pizza{
    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 150.0;
    }
}