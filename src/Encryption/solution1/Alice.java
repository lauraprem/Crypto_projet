package Encryption.solution1;

import CryptoSysteme.Paillier;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Laura on 04/01/2016.
 */
public class Alice {
    private ArrayList<BigInteger> responses;
    private ArrayList<BigInteger> encryptedResponse;
    private ArrayList<BigInteger> encryptedMasquedResponses;
    private BigInteger pk;
    private BigInteger question;

    public Alice(ArrayList<BigInteger> responses,BigInteger publicKey) {
        this.pk = publicKey;
        this.responses = responses;
        encryptedResponse = new ArrayList<BigInteger>();
        try {
            for (BigInteger r : this.responses) {
                encryptedResponse.add(Paillier.chiffrer(r, pk));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        encryptedMasquedResponses = new ArrayList<BigInteger>();
    }



    public ArrayList<BigInteger> generateValeursMasquees() {
        BigInteger i = BigInteger.ONE;
        for( BigInteger rep : encryptedResponse) {
            BigInteger rand = new BigInteger(128, new Random());
            BigInteger pkPk = pk.multiply(pk);
            BigInteger ei = Paillier.chiffrer(i.negate(),pk);
            BigInteger a = ei.multiply(question).modPow(rand, pkPk);
            System.out.println(a);
            System.out.println(rep);
            BigInteger b = rep.multiply(a).mod(pkPk);
            encryptedMasquedResponses.add(b); // (I * E) ^ Rand
           i= i.add(BigInteger.ONE);
        }
        return encryptedMasquedResponses;
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

    public ArrayList<BigInteger> getEncryptedMasquedResponses() {
        return encryptedMasquedResponses;
    }

    public void setEncryptedMasquedResponses(ArrayList<BigInteger> encryptedMasquedResponses) {
        this.encryptedMasquedResponses = encryptedMasquedResponses;
    }

    public BigInteger getPublicKey() {
        return pk;
    }

    public void setPublicKey(BigInteger publicKey) {
        this.pk = publicKey;
    }

    public BigInteger getQuestion() {
        return question;
    }

    public void setQuestion(BigInteger question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Alice{" +
                "responses=" + responses +
                ", encryptedResponse=" + encryptedResponse +
                ", encryptedMasquedResponses=" + encryptedMasquedResponses +
                ", pk=" + pk +
                ", question=" + question +
                '}';
    }
}
