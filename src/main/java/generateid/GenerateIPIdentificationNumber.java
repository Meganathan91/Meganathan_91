package generateid;

import java.util.ArrayList;
import java.util.Collections;

public class GenerateIPIdentificationNumber {

    static public Long getIpIdentificationNumber( ArrayList<Long> id) {

        Collections.sort(id);
        Long ipId = (new Long(id.size()));
        ipId++;

        return ipId++;
    }
}
