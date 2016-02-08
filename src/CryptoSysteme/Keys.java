package CryptoSysteme;

import java.math.BigInteger;

/**
 * Created by Laura on 08/02/2016.
 */
public class Keys {
    public BigInteger pk;
    public BigInteger sk;

    public Keys() {
    }

    public Keys(BigInteger pk, BigInteger sk) {
        this.pk = pk;
        this.sk = sk;
    }

    @Override
    public String toString() {
        return "Keys{" +
                "pk=" + pk +
                ", sk=" + sk +
                '}';
    }
}
