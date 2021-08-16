package utility;

import entity.Patient;

import java.util.ArrayList;
import java.util.Collections;

public class HMSUtility {
    static public Long getId(ArrayList<Long> lstId) {
        long latestId = 1;
        Collections.sort(lstId, Collections.reverseOrder());
        if (lstId.size() > 0) {
            latestId = (lstId.get(0) + 1);
        }
        return latestId;
    }
}

