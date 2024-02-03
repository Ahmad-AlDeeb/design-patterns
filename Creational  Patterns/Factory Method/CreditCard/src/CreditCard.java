public interface CreditCard {
    void showCardDetails();
}

class Silver implements CreditCard {
    public void showCardDetails() {
        System.out.println("This is the Silver Visa ...");
    }
}

class Golden implements CreditCard {
    public void showCardDetails() {
        System.out.println("This is the Golden Visa ...");
    }
}

class VIP implements CreditCard {
    public void showCardDetails() {
        System.out.println("This is the VIP Visa ...");
    }
}
