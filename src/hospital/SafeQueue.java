package hospital;

public class SafeQueue extends Queue{

    @Override
    public Patient getNextPatient() {
        if (patientList.isEmpty()) {
            return null;
        }

        int tempMaxSeverity = 0;
        int rememberWhichHasMaxSev = 0;

        for (int i = 0; i < patientList.size(); i++) {
            int tempSeverity = patientList.get(i).getSeverity();
            if (tempSeverity > tempMaxSeverity) {
                tempMaxSeverity = tempSeverity;
                rememberWhichHasMaxSev = i;
            }
        }

        return patientList.get(rememberWhichHasMaxSev);
    }
}
