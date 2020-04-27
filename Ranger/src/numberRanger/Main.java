package numberRanger;

import java.util.Collection;

/*Assumptions:Empty Collections should result is regarded as Invalid input.
 *            Input of n,n+1 should result in a range of "n-n+1"
 *            Input contains no repeats. 
 *            Any other characters(Can not be parsed to an Integer) will be regarded as Invalid input
 * */
public class Main
{
	public static void main(String[] args)
	{
		NumbersConveter numObject = new NumbersConveter();	
		Collection<Integer> collectionExample = numObject.collect("3,5,8,-2,6,7,1,10");
		System.out.println(numObject.summarizeCollection(collectionExample));
		
	}
}
