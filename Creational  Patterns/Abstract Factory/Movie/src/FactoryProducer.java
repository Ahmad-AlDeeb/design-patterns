public class FactoryProducer {
    public static AbstractFactory getFactory(String name) {
        if(name.equalsIgnoreCase("Hollywood")) return new HollywoodMovieFactory();
        else if(name.equalsIgnoreCase("Bollywood")) return new BollywoodMovieFactory();
        else return null;
    }
}