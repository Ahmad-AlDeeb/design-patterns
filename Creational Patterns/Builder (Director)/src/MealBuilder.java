import java.util.ArrayList;

public interface MealBuilder {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}
class VegMealBuilder implements MealBuilder {
    private Meal vegMeal = new Meal();
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



