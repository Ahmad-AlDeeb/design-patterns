package academy.learnprogramming;

interface Observer {
    // method to update the observer, used by subject
    public void update(String message);
}

class MyTopicSubscriber implements Observer {
    private String name;
    public MyTopicSubscriber(String name){
        this.name=name;
    }

    public void update(String message) {
        System.out.println(name+":: Consuming message::"+ message);
    }
}
