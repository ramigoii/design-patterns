package facade;
import composite.Exercise;
import core.TrainingProgram;

public class WorkoutFacade {
    private TrainingProgram program;

    public WorkoutFacade() {
        this.program = new TrainingProgram("Full Body Workout");

        // Setup training routine with TrainingComponent objects
        program.addTraining(new Exercise("Warm-Up"));
        program.addTraining(new Exercise("Cardio Session"));
        program.addTraining(new Exercise("Strength Training"));
        program.addTraining(new Exercise("Cool Down"));
    }

    public void startWorkout() {
        System.out.println("💪 Запуск тренировки через фасад:");
        program.showTrainings();
        program.startTraining();
    }

    public void endWorkout() {
        program.stopTraining();
        System.out.println("🏁 Завершение тренировки через фасад.");
    }

    public TrainingProgram getProgram() {
        return program;
    }
}