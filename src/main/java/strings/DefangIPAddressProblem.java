package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DefangIPAddressProblem {
    public String defangIPaddr(String address) {
        String result;
        String ipAddress = "(\\d+).(\\d+).(\\d+).(\\d+)";
        Pattern r = Pattern.compile(ipAddress);
        Matcher m = r.matcher(address);

        if (m.find( )) {
            result = m.group(1) + "[.]" + m.group(2) + "[.]" + m.group(3) + "[.]" + m.group(4);
        } else {
            result = "Invalid IP Address";
        }
        return result;
    }
}
