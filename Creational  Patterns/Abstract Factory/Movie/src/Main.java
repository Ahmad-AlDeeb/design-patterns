public class Main {
    public static void main(String[] args) {
        AbstractFactory hollywoodFactory = FactoryProducer.getFactory("Hollywood");
        hollywoodFactory.getHollywoodMovie("Action").getMovieName();
        hollywoodFactory.getHollywoodMovie("Comedy").getMovieName();;

        AbstractFactory bollywoodFactory = FactoryProducer.getFactory("bollywood");
        bollywoodFactory.getBollywoodMovie("Action").getMovieName();;
        bollywoodFactory.getBollywoodMovie("Comedy").getMovieName();;
    }
}

