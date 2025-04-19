package strategy;

// first strategy
public class CardioTraining implements TrainingStrategy {
    public void train() {
        System.out.println("Performing a cardio workout: Running, cycling, swimming.");
    }
}