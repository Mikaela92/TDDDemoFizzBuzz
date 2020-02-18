package Main;

import org.junit.Test;

public class FizzBuzz
{

    public int GetInteger()
    {
        return 0;
    }

    public String GetFizz(int value)
    {
        if (value % 3 == 0)
        {
            return "Fizz";
        }
        return null;
    }

    public String GetBuzz(int value)
    {
        if (value % 5 == 0)
        {
            return "Buzz";
        }
        return null;
    }

    public String GetFizzBuzz(int value)
    {
        if (value % 15 == 0)
        {
            return "FizzBuzz";
        }
        return null;
    }

    public String GetFizzBuzzTest(int value)
    {
        if (value % 3 == 0)
        {
            if (value % 5 == 0)
            {
                return "FizzBuzz";
            }
            return "Fizz";
        }
        else if (value % 5 == 0)
        {
            return "Buzz";
        }
        return String.valueOf(value);
    }
}