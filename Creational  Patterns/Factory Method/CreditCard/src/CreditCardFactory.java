public abstract class CreditCardFactory {
    protected abstract CreditCard factoryMethod();
    public CreditCard getCardType() { return factoryMethod(); }
}

class SilverFactory extends CreditCardFactory {
    protected CreditCard factoryMethod() { return new Silver();}

}

class GoldenFactory extends CreditCardFactory {
    protected CreditCard factoryMethod() { return new Golden();}
}

class VIPFactory extends CreditCardFactory {
    protected CreditCard factoryMethod() { return new VIP();}
}
