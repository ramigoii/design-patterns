package decorator;

import strategy.TrainingStrategy;

//second decorator
public class CoolDownDecorator extends TrainingDecorator {
    public CoolDownDecorator(TrainingStrategy decoratedTraining) {
        super(decoratedTraining);
    }

    public void train() {
        super.train();
        System.out.println("Ending with a cool-down session.");
    }
}
