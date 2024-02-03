public interface AbstractFactory {
    HollywoodMovie getHollywoodMovie(String type);
    BollywoodMovie getBollywoodMovie(String type);
}

class HollywoodMovieFactory implements AbstractFactory {
    public HollywoodMovie getHollywoodMovie(String type) {
        if(type.equalsIgnoreCase("Action")) return new HollywoodActionMovie();
        else if(type.equalsIgnoreCase("Comedy")) return new HollywoodComedyMovie();
        else return null;
    }
    public BollywoodMovie getBollywoodMovie(String type) { return null; }
}


class BollywoodMovieFactory implements AbstractFactory {
    public HollywoodMovie getHollywoodMovie(String type) { return null; }
    public BollywoodMovie getBollywoodMovie(String type) {
        if(type.equalsIgnoreCase("Action")) return new BollywoodActionMovie();
        else if(type.equalsIgnoreCase("Comedy")) return new BollywoodComedyMovie();
        else return null;
    }
}
