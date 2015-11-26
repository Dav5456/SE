package bikescheme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankServer extends AbstractOutputDevice {
    public BankServer(String instanceName) {
        super(instanceName);
    }
    
    public void chargeUser(User user) {
        //charges user and resets charge
        int charge = user.getCharge();
        user.resetCharge();
    }
    
}
