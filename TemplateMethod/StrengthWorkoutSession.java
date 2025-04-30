package TemplateMethod;

public class StrengthWorkoutSession extends WorkoutSession {
    @Override
    protected void doMainTraining() {
        System.out.println("🏋️‍♂️ Выполнение силовой тренировки: приседания, жим, становая.");
    }
}