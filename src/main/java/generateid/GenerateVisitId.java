package generateid;

import java.util.*;

public class GenerateVisitId {

    static public Long getVisitId(ArrayList<Long> visitId) {

        Collections.sort(visitId);
        Long l = (new Long(visitId.size()));
        l++;
        return l++;
    }

}
