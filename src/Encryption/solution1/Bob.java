package Encryption.solution1;

import CryptoSysteme.Paillier;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Laura on 04/01/2016.
 */
public class Bob extends Paillier {


    /**
     * num�ro de la question choisie
     */
    private BigInteger question;

    /**
     * encryption du num�ro de la question
     */
    private BigInteger I;

    /**
     * nombre de question
     */
    private BigInteger nbQuestion;

    /**
     * r�ponses masqu�es et encrypt�es
     */
    private ArrayList<BigInteger> T;

    /**
     * r�ponses masqu�es(sauf la ieme) et d�crypt�e
     */
    private ArrayList<BigInteger> t;


    public Bob() {
        super(512);
        question = BigInteger.ONE;
        nbQuestion = BigInteger.TEN;
        T = new ArrayList<BigInteger>();
        t = new ArrayList<BigInteger>();

        I = chiffrer(question);
    }


    /**
     * permet de changer le choix de la question
     *
     * @param i num�ro de la question
     */
    public void setQuestion(BigInteger i) {
        //Si le num�ro de la question est compris entre 1 et le nombre de question
        if (i.compareTo(BigInteger.ZERO) > 0 && i.compareTo(nbQuestion) < 1) {
            this.question = i;
            I = chiffrer(this.question);
        }
    }

    public BigInteger getQuestion() {
        return question;
    }

    /**
     *
     * Obtention de la clef publique de Paillier sous forme de vecteur < n, g >
     *
     * @return Vector
     */
    public BigInteger publicKey() {
        return super.getKeys().pk;
    }


    /**
     * Donne le nombre de questions disponibles
     * @return nbQuestion
     */
    public BigInteger getNbQuestion() {
        return nbQuestion;
    }

    /**
     * Modification du nombre de question
     * @param nbQuestion
     */
    public void setNbQuestion(BigInteger nbQuestion) {
        this.nbQuestion = nbQuestion;
    }

    /**
     * Obtention de l'encryption du num�ro de question choisi
     * @return I
     */
    public BigInteger getI() {
        return I;
    }

    /**
     * Recuperation des reponses encryptees et masquee d'Alice
     * @param T Arraylist des r�ponses
     */
    public void setReponsesEncryptees(ArrayList<BigInteger> T){
        this.T = new ArrayList<BigInteger>(T);
    }

    /**
     * D�crytpion des r�ponses d'Alice
     * @throws Exception
     */
    public ArrayList<BigInteger> setReponsesDecryptees(){
        for (int i = 0; i < T.size(); i++){
            t.add(dechiffrer(T.get(i)));
        }
        return t;
    }

    public void test(){
        try {
            BigInteger rand = new BigInteger(128, new Random());
            BigInteger pkPk = getKeys().pk.multiply(getKeys().pk);
            BigInteger rep = chiffrer(BigInteger.ONE);
            BigInteger ei = chiffrer(BigInteger.ZERO.subtract(BigInteger.ONE));
            BigInteger e = rep.multiply(ei.multiply( chiffrer(BigInteger.ONE)).modPow(rand, pkPk)).mod(pkPk); // (I * E) ^ Rand
            System.out.println(dechiffrer(e));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Bob{" +
                "question=" + question +
                ", I=" + I +
                ", nbQuestion=" + nbQuestion +
                ", T=" + T +
                ", t=" + t +
                '}';
    }
}
