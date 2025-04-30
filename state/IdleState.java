// Package: state
package state;

import core.TrainingProgram;

public class IdleState implements TrainingState {
    @Override
    public void startTraining(TrainingProgram context) {
        System.out.println("Starting training from idle...");
        context.setState(new ActiveState());
        context.startTraining();
    }

    @Override
    public void pauseTraining(TrainingProgram context) {
        System.out.println("Cannot pause: Training is not started.");
    }

    @Override
    public void resumeTraining(TrainingProgram context) {
        System.out.println("Cannot resume: Training is not paused.");
    }

    @Override
    public void stopTraining(TrainingProgram context) {
        System.out.println("Cannot stop: Training is not started.");
    }
}