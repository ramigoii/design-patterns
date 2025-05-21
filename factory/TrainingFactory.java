package factory;

import strategy.CardioTraining;
import strategy.HybridTraining;
import strategy.StrengthTraining;
import strategy.TrainingStrategy;

public class TrainingFactory {
    public static TrainingStrategy createTraining(String type) {
        switch (type.toLowerCase()) {
            case "cardio": return new CardioTraining();
            case "strength": return new StrengthTraining();
            case "hybrid": return new HybridTraining();
            default: throw new IllegalArgumentException("Unknown training type: " + type);
        }
    }
}