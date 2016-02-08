package Main;


import Encryption.Alice;
import Encryption.Bob;
import Utils.BigIntegerUtils;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Laura on 04/01/2016.
 */
public class Main {

    public static void main(String [] args) {

      /*  BobWindows mainWindow = new BobWindows("CryptoSysteme");

        mainWindow.setVisible(true);*/


       // try {
           /* Alice alice = new Alice();
            Bob bob = new Bob();*/

            //Bob donne l'encryption du numéro de question choisi
           /* BigInteger I = bob.getI();*/

            //Alice génère un masque pour chaque question et masque la question adéquate
            // Alice."genere masque et masque valeurs";


            //Alice donne la liste des réponses masquées et encryptées
           // bob.setReponsesEncryptees(Alice."generer reponses Masquees et Encryptees()");

            //Bob decrypte les reponses
           /* bob.setReponsesDecryptees();*/

       // }
      //  catch (Exception e){

       // }
        ArrayList<BigInteger> response = new ArrayList<BigInteger>();
        System.out.println("pouet");
        for(int i = 0; i<10;i++){
            response.add(BigIntegerUtils.generatePrimalnbBit(10));
        }
        System.out.println(response);
        Bob bob = new Bob();
        Alice alice = new Alice(response,bob.publicKey());

        //Bob donne l'encryption du numéro de question choisi
        alice.setQuestion(bob.getI());
        //Alice donne la liste des réponses masquées et encryptées
        bob.setReponsesEncryptees(alice.generateValeursMasquees());
        //Bob decrypte les reponses
        System.out.println(bob.setReponsesDecryptees());

    }

}
