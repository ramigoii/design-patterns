package TemplateMethod;

public class CardioWorkoutSession extends WorkoutSession {
    @Override
    protected void doMainTraining() {
        System.out.println("🏃‍♂️ Выполнение кардио: бег, скакалка, эллипс.");
    }
}
