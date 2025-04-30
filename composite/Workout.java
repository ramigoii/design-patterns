// Package: composite
package composite;

import java.util.ArrayList;
import java.util.List;

public class Workout implements TrainingComponent {
    private String name;
    private List<TrainingComponent> components = new ArrayList<>();

    public Workout(String name) {
        this.name = name;
    }

    public void add(TrainingComponent component) {
        components.add(component);
    }

    public void remove(TrainingComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Workout: " + name);
        for (TrainingComponent component : components) {
            component.display();
        }
    }

    @Override
    public String getName() {
        return name;
    }
}