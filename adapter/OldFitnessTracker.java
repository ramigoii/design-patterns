package adapter;

// adapter.OldFitnessTracker.java (existing system with incompatible interface)
public class OldFitnessTracker {
    public void track(String data) {
        System.out.println("Tracking (legacy): " + data);
    }
}
