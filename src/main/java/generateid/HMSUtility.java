package generateid;

import java.util.ArrayList;
import java.util.Collections;

public class HMSUtility {
    static public Long getId(ArrayList<Long> id) {
        Collections.sort(id);
        Long l = (new Long(id.size()));
        l++;
        return l++;
    }
}
