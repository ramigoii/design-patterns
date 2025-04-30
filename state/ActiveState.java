// Package: state
package state;

import core.TrainingProgram;

public class ActiveState implements TrainingState {
    @Override
    public void startTraining(TrainingProgram context) {
        System.out.println("Training is already active.");
    }

    @Override
    public void pauseTraining(TrainingProgram context) {
        System.out.println("Pausing training...");
        context.setState(new PausedState());
    }

    @Override
    public void resumeTraining(TrainingProgram context) {
        System.out.println("Training is already active.");
    }

    @Override
    public void stopTraining(TrainingProgram context) {
        System.out.println("Stopping training...");
        context.setState(new IdleState());
        context.stopTraining();
    }
}