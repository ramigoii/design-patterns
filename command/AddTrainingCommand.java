package command;
import composite.TrainingComponent;
import core.TrainingProgram;

public class AddTrainingCommand implements TrainingCommand {
    private TrainingProgram program;
    private TrainingComponent training;

    public AddTrainingCommand(TrainingProgram program, TrainingComponent training) {
        this.program = program;
        this.training = training;
    }

    @Override
    public void execute() {
        program.addTraining(training);
    }

    @Override
    public void undo() {
        program.removeTraining(training);
    }
}