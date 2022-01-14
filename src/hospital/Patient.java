package hospital;

import java.util.Random;

public class Patient {
    private int severity;

    public Patient() {
        int randomMax = 10;
        int randomMin = 1;
        Random random = new Random();

        this.severity = random.nextInt(randomMax - randomMin) + randomMin;
    }

    public int getSeverity() {
        return severity;
    }

    public int treat() throws Exception {
        if (severity < 0) {
            throw new Exception("Severity cannot go below 0!");
        }

        return severity--;
    }

}
