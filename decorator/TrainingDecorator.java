package decorator;

import strategy.TrainingStrategy;

// Decorator Pattern: Enhancing workouts dynamically
public abstract class TrainingDecorator implements TrainingStrategy {
    protected TrainingStrategy decoratedTraining;

    public TrainingDecorator(TrainingStrategy decoratedTraining) {
        this.decoratedTraining = decoratedTraining;
    }

    public void train() {
        decoratedTraining.train();
    }
}