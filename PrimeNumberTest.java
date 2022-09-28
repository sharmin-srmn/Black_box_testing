import static org.junit.Assert.assertEquals;
import org.junit.Test;
// arrange 
// act
// assert
// Testing Prime Number within 1 to 1000 both BVC AND ROBUST
// Here Minimum = 1 and Maximum = 1000
public class PrimeNumberTest {
    //Testing ( minimum - 1 ) = 0  value
    @Test
    public void TestMinimumMinusOneCase()
    {
        //arrange
        PrimeNumberCheck basecase = new PrimeNumberCheck();
        //act
        boolean result = basecase.Check(0);
        //assert
        assertEquals(true, result );
    }
    //Testing minimum = 1  value
    @Test
    public void TestMinimumCase()
    {
        //arrange
        PrimeNumberCheck basecase = new PrimeNumberCheck();
        //act
        boolean result = basecase.Check(1);
        //assert
        assertEquals(true ,result ) ;
    }
    //Testing ( minimum + 1 ) = 2 value
    @Test
    public void TestMimimumPlusOneCase()
    {
        //arrange
        PrimeNumberCheck basecase = new PrimeNumberCheck();
        //act
        boolean result = basecase.Check(2);
        //assert
        assertEquals(false, result );
    }
    //Testing nominal = 500 value
    @Test
    public void TestNominal()
    {
        //arrange
        PrimeNumberCheck basecase = new PrimeNumberCheck();
        //act
        boolean result = basecase.Check(500);
        //assert
        assertEquals( true, result);
    }
    //Testing ( maximum - 1 ) = 999 value
    @Test
    public void TestMaximumMinusOneCase()
    {
        //arrange
        PrimeNumberCheck basecase = new PrimeNumberCheck();
        //act
        boolean result = basecase.Check(999);
        //assert
        assertEquals( true, result);
    }
    //Testing maximum = 1000  value
    @Test
    public void TestMaximumCase()
    {
        //arrange
        PrimeNumberCheck basecase = new PrimeNumberCheck();
        //act
        boolean result = basecase.Check(1000);
        //assert
        assertEquals( true, result );
    }
    //Testing  ( maximum + 1 ) = 1001 value
    @Test
    public void TestMaximumPlusOneCase()
    {
        //arrange
        PrimeNumberCheck basecase = new PrimeNumberCheck();
        //act
        boolean result = basecase.Check(1001);
        //assert
        assertEquals( true, result);
    }
}
