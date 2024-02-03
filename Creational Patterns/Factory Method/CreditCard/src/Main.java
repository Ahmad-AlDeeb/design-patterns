public class Main {
    public static CreditCardFactory getCreditCardFactory(double salary) {
        if(salary >= 100000) {
            return new VIPFactory();
        }
        else if(salary >= 50000 && salary <= 99999) {
            return new GoldenFactory();
        }
        else
            return new SilverFactory();
    }

    public static void main(String[] args) {
        CreditCard card1 = getCreditCardFactory(100000).getCardType();
        card1.showCardDetails();

        CreditCard card2 = getCreditCardFactory(50000).getCardType();
        card2.showCardDetails();

        CreditCard card3 = getCreditCardFactory(100).getCardType();
        card3.showCardDetails();
    }
}

