package hospital;

public class Hospital {
    private Queue queue;

    public Hospital(Queue queue) {
        this.queue = queue;
    }

    public void addPatient(Patient patient) {
        queue.patientList.add(patient);
    }

    public void treatNextPatient() throws Exception {
        Patient patientToTreat = queue.getNextPatient();
        patientToTreat.treat();
    }

}
