package CryptoSysteme;

import java.math.BigInteger;
import java.util.Random;

/**
 * Created by Laura on 08/02/2016.
 */
public class Paillier {
    public static int MAX_SIZE_R = 8;
    private Keys keys;

    public Paillier(int length){
        generateKeys(length);
    }

    public void generateKeys(int length) {
        Random rand = new Random();

        //Generation p & q
        BigInteger p = BigInteger.probablePrime(length, rand);
        BigInteger q;
        do {
            q = BigInteger.probablePrime(length, rand);
        } while (p.compareTo(q) == 0);

        //Keys
        keys = new Keys();
        keys.pk = p.multiply(q);
        keys.sk = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));

    }

    public BigInteger chiffrer(BigInteger m)  {
        if ( m == null)
        return null;
        if (m.compareTo(keys.pk) >= 0) //|| m.compareTo(zero) <= 0)
       return null;

        //generate random number R between 0
        BigInteger r;
        do {
            r = new BigInteger(MAX_SIZE_R, new Random());
        } while (r.compareTo(keys.pk) >= 0 && r.compareTo(BigInteger.ZERO) < 0);

        BigInteger pkPk = keys.pk.multiply(keys.pk);

        BigInteger c; //c = ((g^m) * r^n) mod n²
        BigInteger g = keys.pk.add(BigInteger.ONE);

        BigInteger part1 = g.modPow(m, pkPk);
        BigInteger part2 = r.modPow(keys.pk, pkPk);

        c = part1.multiply(part2);

        return c;
    }

    public BigInteger dechiffrer(BigInteger c) {
        if (c == null)
            return null;
        if (keys.pk == null || keys.sk == null)
            return null;

        BigInteger pkPk = keys.pk.multiply(keys.pk);

        BigInteger m; //L((c^sk) mod pk²) * mu mod pk where L(u) = (u-1) / pk and mu = sk^-1  mod pk

        //u = (c ^ sk) mod pk²
        BigInteger u = c.modPow(keys.sk, pkPk);
        BigInteger lu = u.subtract(BigInteger.ONE).divide(keys.pk);//L(u) = (u-1) / pk

        //mu = sk^-1  mod pk
        BigInteger mu = keys.sk.modPow(BigInteger.ONE.negate(), keys.pk);

        m = lu.multiply(mu).mod(keys.pk);

        return m;
    }

    protected Keys getKeys() {
        return keys;
    }

    public static BigInteger chiffrer(BigInteger m, BigInteger pk)  {
        if ( m == null || pk == null)
            return null;
        if (m.compareTo(pk) >= 0) //|| m.compareTo(zero) <= 0)
            return null;

        //generate random number R between 0
        BigInteger r;
        do {
            r = new BigInteger(MAX_SIZE_R, new Random());
        } while (r.compareTo(pk) >= 0 && r.compareTo(BigInteger.ZERO) < 0);

        BigInteger pkPk = pk.multiply(pk);

        BigInteger c; //c = ((g^m) * r^n) mod n²
        BigInteger g = pk.add(BigInteger.ONE);

        BigInteger part1 = g.modPow(m, pkPk);
        BigInteger part2 = r.modPow(pk, pkPk);

        c = part1.multiply(part2);

        return c;
    }
}
