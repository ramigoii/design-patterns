// Package: state
package state;

import core.TrainingProgram;

public class PausedState implements TrainingState {
    @Override
    public void startTraining(TrainingProgram context) {
        System.out.println("Training is paused. Resume first.");
    }

    @Override
    public void pauseTraining(TrainingProgram context) {
        System.out.println("Training is already paused.");
    }

    @Override
    public void resumeTraining(TrainingProgram context) {
        System.out.println("Resuming training...");
        context.setState(new ActiveState());
    }

    @Override
    public void stopTraining(TrainingProgram context) {
        System.out.println("Stopping training from paused state...");
        context.setState(new IdleState());
        context.stopTraining();
    }
}