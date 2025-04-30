// Package: iterator
package iterator;

import java.util.List;

public class TrainingIterator implements Iterator<String> {
    private List<String> trainings;
    private int position = 0;

    public TrainingIterator(List<String> trainings) {
        this.trainings = trainings;
    }

    @Override
    public boolean hasNext() {
        return position < trainings.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            return trainings.get(position++);
        }
        return null;
    }
}