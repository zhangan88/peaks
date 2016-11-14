// The "Peak" class.
import java.awt.*;
import hsa.Console;
import java.util.Random;

public class Peak
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	Random name = new Random();
	int[] numbers;
	numbers = new int [10];

	for (int i=0; i<10; i++)
	{
	numbers[i] = name.nextInt(45);
	c.println("the number at index" + i + " is:" + numbers[i]);
	}
	for (int i=0; i<10; i++)
	{
	    if (i==0)
	    {
		if (numbers[i] > numbers[i+1])
		{
		c.println (numbers[i]);
		}
	    }
	    else if (i==9)
	    {
		if (numbers[i] > numbers[i-1])
		{
		c.println(numbers[i]);
		}
	    }
	    else if (numbers[i] > numbers[i-1] && numbers[i] > numbers[i+1])
	    {
	    c.println(numbers[i]);
	    }
	    
	}

	
	// Place your program here.  'c' is the output console
    } // main method
}// Peak class
