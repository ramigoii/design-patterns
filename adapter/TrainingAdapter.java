package adapter;

import composite.TrainingComponent;
import core.TrainingProgram;
import adapter.OldFitnessTracker;

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
    public void addTraining(TrainingComponent training) {
        oldTracker.track("Adding training: " + training.getName());
    }

    @Override
    public void showTrainings() {
        oldTracker.track("Showing training list (legacy)");
    }
}