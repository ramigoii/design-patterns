// Package: composite
package composite;

public class Exercise implements TrainingComponent {
    private String name;

    public Exercise(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("  - Exercise: " + name);
    }

    @Override
    public String getName() {
        return name;
    }
}