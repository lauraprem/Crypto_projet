package Encryption;

import CryptoSysteme.Paillier;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by Laura on 04/01/2016.
 */
public class Bob {

    /**
     * instance de Paillier
     */
    private Paillier cryptoSys;

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


    public Bob() throws Exception {
        question = BigInteger.ONE;
        nbQuestion = BigInteger.TEN;
        T = new ArrayList<BigInteger>();
        t = new ArrayList<BigInteger>();
        cryptoSys = new Paillier(10);
        cryptoSys.generateKeys();
        I = cryptoSys.encrypt(question);
    }

    /**
     * permet d'obtenir le num�ro de question choisie par Bob
     *
     * @return question
     */
    public BigInteger getQuestion() {
        return question;
    }

    /**
     * permet de changer le choix de la question
     *
     * @param i num�ro de la question
     */
    public void setQuestion(BigInteger i) throws Exception{
        //Si le num�ro de la question est compris entre 1 et le nombre de question
        if (i.compareTo(BigInteger.ZERO) > 0 && i.compareTo(nbQuestion) < 1) {
            this.question = question;
            I = cryptoSys.encrypt(this.question);
        }
    }

    /**
     *
     * Obtention de la clef publique de Paillier sous forme de vecteur < n, g >
     *
     * @return Vector
     */
    public Vector publicKey() {
        return cryptoSys.publicKey();
    }

    /**
     * Encrytion grace � Paillier
     * @param m valeur � encrypter
     * @return valeur encryt�e
     * @throws Exception
     */
    public BigInteger encrypt(BigInteger m) throws Exception {
        return cryptoSys.encrypt(m);
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
    public void setReponsesDecryptees()throws Exception{
        for (int i = 0; i < T.size(); i++){
            t.add(cryptoSys.decrypt(T.get(i)));
        }
    }
}
