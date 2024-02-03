public interface Food {
    String getName();
    int getPrice();
}
class VegBurger implements Food {
    public String getName() {
        return "Vegetarian Burger";
    }
    public int getPrice() {
        return 5;
    }
}
class ChickenBurger implements Food {
    public String getName() {
        return "Chicken Burger";
    }
    public int getPrice() {
        return 10;
    }
}
class Coke implements Food {
    public String getName() {
        return "Coke";
    }
    public int getPrice() {
        return 10;
    }
}
class Pepsi implements Food {
    public String getName() {
        return "Pepsi";
    }
    public int getPrice() {
        return 20;
    }
}

