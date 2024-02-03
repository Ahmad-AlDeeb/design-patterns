public interface MealBuilder {
    void buildBurger();
    void buildDrink();
    Meal getMeal(); // Removed from Guru and added only to concrete builders
}
class VegMealBuilder implements MealBuilder {
    private Meal vegMeal = new Meal(); // Guru put all attributes of product here
    public void buildBurger() {
        vegMeal.addItem(new VegBurger());
    }
    public void buildDrink() {
        vegMeal.addItem(new Pepsi());
    }
    public Meal getMeal() {
        return vegMeal;
    }
}
class NonVegMealBuilder implements MealBuilder {
    private Meal nonVegMeal = new Meal();
    public void buildBurger() {
        nonVegMeal.addItem(new ChickenBurger());
    }
    public void buildDrink() {
        nonVegMeal.addItem(new Coke());
    }
    public Meal getMeal() {
        return nonVegMeal;
    }
}



