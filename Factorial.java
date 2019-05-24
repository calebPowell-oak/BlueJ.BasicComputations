import java.math.BigInteger;

public class Factorial {
    BigInteger result = BigInteger.ZERO;
    public BigInteger factorialOf(Integer value){
        if (value <= 0) {
            return BigInteger.ZERO;
        } else {
            result = BigInteger.ONE;
            for(int i = 1; i <= value; i++){
                System.out.println("yo: " + i);
                result = result.multiply(BigInteger.valueOf(i));
            }
        }
        return result;
    }
}