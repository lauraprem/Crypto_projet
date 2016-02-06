package Encryption;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Laura on 04/01/2016.
 */
public class Alice {
    private ArrayList<BigInteger> responses;
    private ArrayList<BigInteger> encryptedResponse;

    public Alice() {
        //TODO
    }

    public void generateMasques(){
        //TODO
    }

    public void generateValeursMasquees(){
        //TODO
    }

    public ArrayList<BigInteger> getResponses() {
        return responses;
    }

    public void setResponses(ArrayList<BigInteger> responses) {
        this.responses = responses;
    }

    public ArrayList<BigInteger> getEncryptedResponse() {
        return encryptedResponse;
    }

    public void setEncryptedResponse(ArrayList<BigInteger> encryptedResponse) {
        this.encryptedResponse = encryptedResponse;
    }
}
