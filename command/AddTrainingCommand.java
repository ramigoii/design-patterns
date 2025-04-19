package command;
import core.TrainingProgram;


public class AddTrainingCommand implements TrainingCommand {
    private TrainingProgram program;
    private String training;

    public AddTrainingCommand(TrainingProgram program, String training) {
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
