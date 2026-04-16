package Classes.Droid;

import java.util.concurrent.atomic.AtomicReferenceArray;

public class Droid {
    String name;
    int batteryLevel;

    Droid(String droidName) {
        this.name = droidName;
        this.batteryLevel = 100;
    }

    public String toString() {
        return "Hello, I'm the droid " + name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    public void energyReport() {
        System.out.println(name + " is at: " + batteryLevel);
    }

    public void energyTransfer(Droid otherDroid) {
        int energyNeeded = 100 - otherDroid.batteryLevel;

        int transferAmount = Math.min(energyNeeded, this.batteryLevel);

        this.batteryLevel -= transferAmount;
        otherDroid.batteryLevel += transferAmount;

        System.out.println(name + " transferred " + transferAmount + " energy to " + otherDroid.name);
    }

    public static void main(String[] args) {
        Droid droidCodey = new Droid("Codey");
        System.out.println(droidCodey);
        droidCodey.performTask("rob a bank");
        droidCodey.performTask("steal from jewelry store");
        droidCodey.energyReport();

        Droid droidSigneh = new Droid("Signeh");
        System.out.println(droidSigneh);

        droidSigneh.energyTransfer(droidCodey);

        droidCodey.energyReport();
        droidSigneh.energyReport();

    }
}
