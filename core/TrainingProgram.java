package core;
// Observable Subject
import observer.Observer;

import java.util.ArrayList;
import java.util.List;
public class TrainingProgram {
    public TrainingProgram(){}
    private List<String> trainings = new ArrayList<>();

    public void addTraining(String training) {
        trainings.add(training);
        System.out.println("Добавлена тренировка: " + training);
    }

    public void removeTraining(String training) {
        trainings.remove(training);
        System.out.println("Удалена тренировка: " + training);
    }

    public void showTrainings() {
        System.out.println("Список тренировок:");
        for (String t : trainings) {
            System.out.println("- " + t);
        }
    }
    private List<Observer> observers = new ArrayList<>();
    private String programName;

    public TrainingProgram(String name) {
        this.programName = name;
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
        System.out.println("▶️ Начало тренировки: " + programName);
    }

    public void stopTraining() {
        System.out.println("⏹️ Завершение тренировки: " + programName);
    }
}
