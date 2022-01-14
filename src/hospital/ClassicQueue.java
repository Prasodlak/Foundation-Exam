package hospital;

public class ClassicQueue extends Queue {

    @Override
    public Patient getNextPatient() {
        Patient patientNameBeforeRemove;

        if (patientList.isEmpty()) {
            return null;
        }

        else {
            patientNameBeforeRemove = patientList.get(0); // I hope its working as I want, so it saves name of Patient before removing, so I can return patient later.
            patientList.remove(0);
        }

        return patientNameBeforeRemove;
    }
}
