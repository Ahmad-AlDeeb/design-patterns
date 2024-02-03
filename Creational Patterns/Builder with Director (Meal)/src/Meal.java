import java.util.ArrayList;
public class Meal {
    private ArrayList<Food> items = new ArrayList<>();
    public void addItem(Food item) {
        items.add(item);
    }
    public void showItems() {
        for (Food item : items) {
            System.out.print("Item: " + item.getName());
            System.out.println(", Price: " + item.getPrice());
        }
        System.out.println();
    }
}
