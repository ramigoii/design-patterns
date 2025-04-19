package decorator;

import strategy.TrainingStrategy;

// first decorator
public class WarmUpDecorator extends TrainingDecorator {
    public WarmUpDecorator(TrainingStrategy decoratedTraining) {
        super(decoratedTraining);
    }

    public void train() {
        System.out.println("Starting with a warm-up session.");
        super.train();
    }
}