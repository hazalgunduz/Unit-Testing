import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class CalculatorTest {
    private int firstNum;
    private int secondNum;
    private int expectedResult1;
    private int expectedResult2;
    private int expectedResult3;
    private Calculator calc;


    public CalculatorTest(int firstNum, int secondNum, int expectedResult1, int expectedResult2, int expectedResult3){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.expectedResult1 = expectedResult1;
        this.expectedResult2 = expectedResult2;
        this.expectedResult3 = expectedResult3;
    }

    @Before
    public void initialize(){
       calc = new Calculator();
    }

    @Parameterized.Parameters
    public static Collection input(){
                Object [][]  data;

    data = new Object[][]{
                {
                        1, 2, 3, -1, 2
                },
                {
                        7, 3, 10, 4, 21
                },
                {
                        15, 2, 17, 13, 30
                }
        };
        return Arrays.asList(data);
    }

    @Test
    public void sumTest(){
        Assert.assertEquals("Summation method failed!",expectedResult1,calc.sum(firstNum,secondNum));
    }



    @Test
    public void subTest(){
        Assert.assertEquals("Subtraction method failed!",expectedResult2,calc.subtract(firstNum,secondNum));
    }

    @Test
    public void multTest(){
        Assert.assertEquals("Multiplication method failed!",expectedResult3,calc.multiply(firstNum,secondNum));
    }



}
