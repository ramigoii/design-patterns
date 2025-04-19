package command;
import core.TrainingProgram;

public class StartTrainingCommand implements TrainingCommand {
    private TrainingProgram program;

    public StartTrainingCommand(TrainingProgram program) {
        this.program = program;
    }

    @Override
    public void execute() {
        System.out.println("Запуск тренировки...");
        program.showTrainings();
    }

    @Override
    public void undo() {
        System.out.println("Отмена запуска тренировки.");
    }
}
