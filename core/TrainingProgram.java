package core;
import composite.TrainingComponent;
import iterator.Iterator;
import iterator.TrainingIterator;
import observer.Observer;
import state.TrainingState;
import state.IdleState;
import java.util.ArrayList;
import java.util.List;

public class TrainingProgram {
    private List<TrainingComponent> trainings = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    private String programName;
    private TrainingState state;

    public TrainingProgram() {
        this.state = new IdleState();
    }

    public TrainingProgram(String name) {
        this.programName = name;
        this.state = new IdleState();
    }

    public void setState(TrainingState state) {
        this.state = state;
    }

    public Iterator<String> createIterator() {
        List<String> trainingNames = new ArrayList<>();
        for (TrainingComponent component : trainings) {
            trainingNames.add(component.getName());
        }
        return new TrainingIterator(trainingNames);
    }

    public void addTraining(TrainingComponent training) {
        trainings.add(training);
        System.out.println("Добавлена тренировка: " + training.getName());
        notifyObservers();
    }

    public void removeTraining(TrainingComponent training) {
        trainings.remove(training);
        System.out.println("Удалена тренировка: " + training.getName());
    }

    public void showTrainings() {
        System.out.println("Список тренировок:");
        for (TrainingComponent training : trainings) {
            training.display();
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("New training program available: " + programName);
        }
    }

    public void startTraining() {
        state.startTraining(this);
    }

    public void pauseTraining() {
        state.pauseTraining(this);
    }

    public void resumeTraining() {
        state.resumeTraining(this);
    }

    public void stopTraining() {
        state.stopTraining(this);
    }
}