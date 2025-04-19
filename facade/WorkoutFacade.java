package facade;
import core.TrainingProgram;
public class WorkoutFacade {
    private TrainingProgram program;

    public WorkoutFacade() {
        this.program = new TrainingProgram("Full Body Workout");

        // Setup training routine
        program.addTraining("Warm-Up");
        program.addTraining("Cardio Session");
        program.addTraining("Strength Training");
        program.addTraining("Cool Down");
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

    // Optional getter if you want access to the program object
    public TrainingProgram getProgram() {
        return program;
    }
}
