package main;

import adapter.OldFitnessTracker;
import adapter.TrainingAdapter;
import command.AddTrainingCommand;
import command.StartTrainingCommand;
import command.TrainingCommand;
import command.TrainingInvoker;
import composite.Exercise;
import composite.Workout;
import core.TrainingProgram;
import decorator.CoolDownDecorator;
import decorator.WarmUpDecorator;
import facade.WorkoutFacade;
import iterator.Iterator;
import observer.Observer;
import observer.User;
import singleton.TrainingManager;
import factory.TrainingFactory;
import strategy.TrainingStrategy;
import TemplateMethod.WorkoutSession;
import TemplateMethod.CardioWorkoutSession;
import TemplateMethod.StrengthWorkoutSession;

public class WorkoutPlanner {
    private static TrainingInvoker invoker = new TrainingInvoker();
    private static TrainingProgram commandProgram = new TrainingProgram("Command-Based Program");

    public static void main(String[] args) {
        System.out.println("=== 🏋️‍♀️ Workout Planner Started ===\n");

        // ✅ Command Pattern
        TrainingCommand addPushups = new AddTrainingCommand(commandProgram, new Exercise("Push-Ups"));
        invoker.setCommand(addPushups);
        invoker.executeCommand();

        TrainingCommand startWorkout = new StartTrainingCommand(commandProgram);
        invoker.setCommand(startWorkout);
        invoker.executeCommand();

        // ✅ Strategy + Factory Pattern
        TrainingStrategy cardio = TrainingFactory.createTraining("cardio");
        TrainingStrategy strength = TrainingFactory.createTraining("strength");
        TrainingStrategy hybrid = TrainingFactory.createTraining("hybrid");

        System.out.println("\n🎯 Using different training strategies:");
        cardio.train();
        strength.train();
        hybrid.train();

        // ✅ Observer Pattern
        TrainingProgram observerProgram = new TrainingProgram("Summer Fitness Challenge");
        Observer user1 = new User("Rami");
        Observer user2 = new User("Akzhan");

        observerProgram.addObserver(user1);
        observerProgram.addObserver(user2);

        System.out.println("\n👀 Notifying users about the new training program:");
        observerProgram.addTraining(new Exercise("Interval Training"));

        // ✅ Decorator Pattern
        TrainingStrategy decoratedWorkout = new WarmUpDecorator(new CoolDownDecorator(TrainingFactory.createTraining("strength")));
        System.out.println("\n✨ Performing a decorated workout:");
        decoratedWorkout.train();

        // ✅ Singleton Pattern
        TrainingManager manager = TrainingManager.getInstance();
        manager.manageTraining();

        // ✅ Facade Pattern
        System.out.println("\n🏗️ Using Workout Facade:");
        WorkoutFacade facade = new WorkoutFacade();
        facade.startWorkout();
        facade.endWorkout();

        // ✅ Adapter Pattern
        System.out.println("\n🔌 Using Legacy System via Adapter:");
        OldFitnessTracker legacy = new OldFitnessTracker();
        TrainingProgram adapter = new TrainingAdapter(legacy);
        adapter.startTraining();
        adapter.addTraining(new Exercise("Legacy Strength Training"));
        adapter.stopTraining();

        // ✅ Template Method Pattern
        System.out.println("\n📋 Template Method Pattern:");
        WorkoutSession cardioSession = new CardioWorkoutSession();
        cardioSession.performWorkout();
        WorkoutSession strengthSession = new StrengthWorkoutSession();
        strengthSession.performWorkout();

        // ✅ Iterator Pattern
        System.out.println("\n🔄 Using Iterator Pattern:");
        Iterator<String> iterator = commandProgram.createIterator();
        while (iterator.hasNext()) {
            System.out.println("Training: " + iterator.next());
        }

        // ✅ Composite Pattern
        System.out.println("\n🌳 Using Composite Pattern:");
        Workout legDay = new Workout("Leg Day");
        legDay.add(new Exercise("Squats"));
        legDay.add(new Exercise("Lunges"));
        Workout upperBody = new Workout("Upper Body");
        upperBody.add(new Exercise("Push-Ups"));
        upperBody.add(new Exercise("Pull-Ups"));
        commandProgram.addTraining(legDay);
        commandProgram.addTraining(upperBody);
        commandProgram.showTrainings();

        // ✅ State Pattern
        System.out.println("\n🔄 Using State Pattern:");
        commandProgram.startTraining();
        commandProgram.pauseTraining();
        commandProgram.resumeTraining();
        commandProgram.stopTraining();

        System.out.println("\n=== ✅ Workout Planner Finished ===");
    }
}