package singleton;

//Singleton
public class TrainingManager {
    private static TrainingManager instance;

    private TrainingManager() {}

    public static TrainingManager getInstance() {
        if (instance == null) {
            instance = new TrainingManager();
        }
        return instance;
    }

    public void manageTraining() {
        System.out.println("Managing training sessions...");
    }
}
