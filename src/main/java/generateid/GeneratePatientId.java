package generateid;

import java.util.ArrayList;
import java.util.Collections;

public class GeneratePatientId {

    static public Long getPatientId(ArrayList<Long> visitId) {

        Collections.sort(visitId);
        Long l = (new Long(visitId.size()));
        l++;
        return l++;
    }

}
