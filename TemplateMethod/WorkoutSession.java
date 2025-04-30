package TemplateMethod;

public abstract class WorkoutSession {
    // Template method
    public final void performWorkout() {
        startSession();
        doMainTraining();
        endSession();
    }

    protected void startSession() {
        System.out.println("🔄 Начало тренировки...");
    }

    protected abstract void doMainTraining(); // To be implemented by subclass

    protected void endSession() {
        System.out.println("✅ Завершение тренировки.");
    }
}
