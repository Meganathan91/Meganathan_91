package utility;

import java.util.ArrayList;
import java.util.Collections;

public class HMSUtility {
    static public Long getId(ArrayList<Long> lstId) {
        Long id = null;
        Collections.sort(lstId, Collections.reverseOrder());
        if (lstId.size() > 0) {
            id = (lstId.get(0) + 1);
        }
        return id;
    }
}

