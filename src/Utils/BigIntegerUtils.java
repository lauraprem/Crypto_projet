package Utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Laura on 25/11/2015.
 */
public class BigIntegerUtils {


    private final static Random rand = new Random();



    public static ArrayList<BigInteger> carreModulo(BigInteger n) {
        ArrayList<BigInteger> res = new ArrayList<BigInteger>();
        for (BigInteger x = BigInteger.ZERO; x.compareTo(n) == -1; x = x.add(BigInteger.ONE)) {
            for (BigInteger y = BigInteger.ZERO; y.compareTo(n) == -1; y = y.add(BigInteger.ONE)) {
                if (y.modPow(BigInteger.valueOf(2), n).equals(x.mod(n))) {
                    if (!x.equals(BigInteger.ZERO) && !x.equals(n))
                        res.add(x);
                    break;
                }
            }
        }
        return res;
    }

    public static int nbInversible(BigInteger n) {
        int res = 0;
        for (BigInteger x = BigInteger.ZERO; x.compareTo(n) == -1; x = x.add(BigInteger.ONE)) {
            for (BigInteger y = BigInteger.ZERO; y.compareTo(n) == -1; y = y.add(BigInteger.ONE)) {
                if (x.multiply(y).mod(n).equals(BigInteger.ONE)) {
                    res++;
                    break;
                }
            }
        }

        return res;
    }

    public static BigInteger getInverse(BigInteger modulo, BigInteger toInverse){
        return toInverse.modInverse(modulo);
    }

    public static BigInteger generatePrimalnbBit(int nbBit) {
        BigInteger res;
        while(true){
            res = BigInteger.probablePrime(nbBit,rand);
            if(checkPrime(res,20)){
                return res;
            }
        }
    }

    public static boolean checkPrime(BigInteger n, int maxIterations) {
        if (n.equals(BigInteger.ONE))
            return false;

        for (int i = 0; i < maxIterations; i++) {
            BigInteger a = getRandomFermatBase(n);
            a = a.modPow(n.subtract(BigInteger.ONE), n);

            if (!a.equals(BigInteger.ONE))
                return false;
        }

        return true;
    }

    private static BigInteger getRandomFermatBase(BigInteger n) {
        // Rejection method: ask for a random integer but reject it if it isn't
        // in the acceptable set.

        while (true) {
            final BigInteger a = new BigInteger(n.bitLength(), rand);
            // must have 1 <= a < n
            if (BigInteger.ONE.compareTo(a) <= 0 && a.compareTo(n) < 0) {
                return a;
            }
        }
    }

    public static BigInteger StringToBigInteger(String text) {
        BigInteger bingInteger = new BigInteger(text);

        return bingInteger;
    }

    public static String parseToString(BigInteger bingInteger) {
        //BigInteger bi = new BigInteger(msg.getBytes());
        //System.out.println(new String(bi.toByteArray()));

        return bingInteger.toString();
    }



}
