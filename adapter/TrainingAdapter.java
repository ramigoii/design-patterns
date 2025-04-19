package adapter;

import adapter.OldFitnessTracker;
import core.TrainingProgram;

public class TrainingAdapter extends TrainingProgram {
    private final OldFitnessTracker oldTracker;

    public TrainingAdapter(OldFitnessTracker tracker) {
        super("Legacy Adapter Program");
        this.oldTracker = tracker;
    }

    @Override
    public void startTraining() {
        oldTracker.track("Start legacy training session");
    }

    @Override
    public void stopTraining() {
        oldTracker.track("Stop legacy training session");
    }

    @Override
    public void addTraining(String training) {
        oldTracker.track("Adding training: " + training);
    }

    @Override
    public void showTrainings() {
        oldTracker.track("Showing training list (legacy)");
    }
}
