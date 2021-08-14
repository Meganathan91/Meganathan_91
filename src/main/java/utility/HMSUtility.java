package utility;

import java.util.ArrayList;
import java.util.Collections;

public class HMSUtility {
    static public Long getId(ArrayList<Long> lstId) {
        Collections.sort(lstId);
        Long l = (new Long(lstId.size()));
        l++;
        System.out.println(l++);
        return l++;
        }
    }

