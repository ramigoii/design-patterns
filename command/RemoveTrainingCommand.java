package command;
import core.TrainingProgram;

public class RemoveTrainingCommand implements TrainingCommand {
    private TrainingProgram program;
    private String training;

    public RemoveTrainingCommand(TrainingProgram program, String training) {
        this.program = program;
        this.training = training;
    }

    @Override
    public void execute() {
        program.removeTraining(training);
    }

    @Override
    public void undo() {
        program.addTraining(training);
    }
}
