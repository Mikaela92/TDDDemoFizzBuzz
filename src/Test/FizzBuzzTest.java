package Test;
import Main.FizzBuzz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest
{
    private FizzBuzz _fizzBuzz;

    @Before
   public void Create_ReturnInstantiationOFClass()
    {
        FizzBuzz _fizzBuzz = new FizzBuzz();

        Assert.assertNotNull(_fizzBuzz);
    }

    @Test
    public void GetInteger_ReturnInteger()
    {
        _fizzBuzz = new FizzBuzz();
        int actual = _fizzBuzz.GetInteger();

        Assert.assertNotNull(actual);
    }

    @Test
    public void GetValue_ReturnFizzIfIntegerIsThree()
    {
        _fizzBuzz = new FizzBuzz();
        String expected = "Fizz";
        String actual = _fizzBuzz.GetFizz(3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetBuzz_ReturnBuzzIfIntegerIsFive()
    {
        _fizzBuzz = new FizzBuzz();
        String expected = "Buzz";
        String actual = _fizzBuzz.GetBuzz(5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetFizzBuzz_ReturnFizzBuzz()
    {
        _fizzBuzz = new FizzBuzz();
        String expected = "FizzBuzz";
        String actual = _fizzBuzz.GetFizzBuzz(15);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetFizzBuzz_ReturnFizzBuzzIfModulo15IsZero()
    {
        _fizzBuzz = new FizzBuzz();
        String expected = "FizzBuzz";
        String actual = _fizzBuzz.GetFizzBuzz(15);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetFizzBuzz_ReturnFizzBuzzIfModulo15IsNotZero()
    {
        _fizzBuzz = new FizzBuzz();
        String expected = "FizzBuzz";
        String actual = _fizzBuzz.GetFizzBuzz(16);

        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void GetFizzBuzz_ReturnFizzBuzzIfModuloThreeFiveFifteenIsZero()
    {
        _fizzBuzz = new FizzBuzz();
        String expected = "FizzBuzz";
        String actual = _fizzBuzz.GetFizzBuzzTest(60);

        Assert.assertEquals(expected, actual);

    }
}
