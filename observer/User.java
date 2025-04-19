package observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}