package command;

import command.TrainingCommand;

public class TrainingInvoker {
    private TrainingCommand command;

    public void setCommand(TrainingCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        if (command != null) command.execute();
    }

    public void undoCommand() {
        if (command != null) command.undo();
    }
}
