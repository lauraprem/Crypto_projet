package Main;

import Encryption.Alice;
import Encryption.Bob;

import java.math.BigInteger;

/**
 * Created by Laura on 04/01/2016.
 */
public class Main {

    public static void main(String [] args) {
        try {
            Alice alice = new Alice();
            Bob bob = new Bob();

            //Bob donne l'encryption du num�ro de question choisi
            BigInteger I = bob.getI();

            //Alice g�n�re un masque pour chaque question et masque la question ad�quate
            // Alice."genere masque et masque valeurs";


            //Alice donne la liste des r�ponses masqu�es et encrypt�es
           // bob.setReponsesEncryptees(Alice."generer reponses Masquees et Encryptees()");

            //Bob decrypte les reponses
            bob.setReponsesDecryptees();

        }
        catch (Exception e){

        }
    }

}
