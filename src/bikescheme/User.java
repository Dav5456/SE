package bikescheme;

import java.util.ArrayList;

public class User {
    
    //name is a personal detail
    private String name;
    private int charge;
    private String cardNumber;
    private String keyID;
    private ArrayList <Journey> journeys;
    
    public User(String name, String cardNumber, String keyID){
        this.name = name;
        this.cardNumber = cardNumber;
        this.keyID = keyID;
        this.charge = 0;
    }
    
    public int getCharge() {
        return charge;
    }
    public void addCharge(int charge) {
        this.charge += charge;
    }
    public void resetCharge(){
        this.charge = 0;
    }
    
}
