import org.junit.Assert;
import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void checkDenominatorShouldThrowExeption(){
        MyMath.divide(1,1);

    }



}
