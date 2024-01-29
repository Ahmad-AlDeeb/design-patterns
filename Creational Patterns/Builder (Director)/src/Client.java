import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        MealBuilder vegMealBuilder = new VegMealBuilder();
        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();

        System.out.println("=== Making Veg Meal ===");
        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();
        vegMeal.showItems();

        System.out.println("=== Making Non Veg Meal ===");
        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();
        nonVegMeal.showItems();
    }
}

