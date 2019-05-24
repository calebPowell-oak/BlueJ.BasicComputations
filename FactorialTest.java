import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

public class FactorialTest {

    private Factorial factorial;

    @Before
    public void setUp(){
        factorial = new Factorial();
    }

    @Test
    public void factorialOfTest(){
        //:Given
        BigInteger expected = new BigInteger("3628800");

        //:When
        BigInteger actual = factorial.factorialOf(10);

        //:Then
        Assert.assertEquals("Values should be equal", expected, actual);
    }
}
