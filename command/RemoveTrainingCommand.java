package command;
import composite.TrainingComponent;
import core.TrainingProgram;

public class RemoveTrainingCommand implements TrainingCommand {
    private TrainingProgram program;
    private TrainingComponent training;

    public RemoveTrainingCommand(TrainingProgram program, TrainingComponent training) {
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