// Package: state
package state;

import core.TrainingProgram;

public interface TrainingState {
    void startTraining(TrainingProgram context);
    void pauseTraining(TrainingProgram context);
    void resumeTraining(TrainingProgram context);
    void stopTraining(TrainingProgram context);
}