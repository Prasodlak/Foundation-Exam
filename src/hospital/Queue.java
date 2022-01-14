package hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Queue {
    protected List<Patient> patientList;

    public Queue() {
        patientList = new ArrayList<>();
    }

    public void queuePatientUp(Patient patient) {
        patientList.add(patient);
    }

    public abstract Patient getNextPatient();

}
