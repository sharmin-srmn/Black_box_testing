import static org.junit.Assert.assertEquals;
import org.junit.Test;
// arrange 
// act
// assert
// Testing LEAP YEAR within 1500 to 4000 both BVC AND ROBUST
// Here Minimum = 1500 and maximum = 4000
public class LeapYearTest {
    //Testing ( minimum - 1 ) = 1499 value
    @Test
    public void TestMinimumMinusCase()
    {
        //arrange
        LeapYearCheck basecase = new LeapYearCheck();
        //act
        boolean result = basecase.check(1499);
        //assert
        assertEquals(false, result );
    }
    //Testing ( minimum ) = 1500 value
    @Test
    public void TestMinimumCase()
    {
        //arrange
        LeapYearCheck basecase = new LeapYearCheck();
        //act
        boolean result = basecase.check(1500);
        //assert
        assertEquals( false, result);
    }
    //Testing ( minimum + 1 ) = 1501 value
    @Test
    public void TestMinimumPlusCase()
    {
        //arrange
        LeapYearCheck basecase = new LeapYearCheck();
        //act
        boolean result = basecase.check(1501);
        //assert
        assertEquals(false, result );
    }
    //Testing ( nominal ) = 2750 value
    @Test
    public void TestNominalCase()
    {
        //arrange
        LeapYearCheck basecase = new LeapYearCheck();
        //act
        boolean result = basecase.check(2750);
        //assert
        assertEquals( false, result);
    }
    //Testing ( maximum - 1 ) = 3999 value
    @Test
    public void TestMaximumMinusCase()
    {
        //arrange
        LeapYearCheck basecase = new LeapYearCheck();
        //act
        boolean result = basecase.check(3999);
        //assert
        assertEquals(false, result);
    }
    //Testing ( maximum ) = 4000 value
    @Test
    public void TestMaximumCase()
    {
        //arrange
        LeapYearCheck basecase = new LeapYearCheck();
        //act
        boolean result = basecase.check(4000);
        //assert
        assertEquals( true, result);
    }
    //Testing ( maximum + 1 ) = 4001 value
    @Test
    public void TestMaximumPlusCase()
    {
        //arrange
        LeapYearCheck basecase = new LeapYearCheck();
        //act
        boolean result = basecase.check(4001);
        //assert
        assertEquals( false, result);
    }
}
