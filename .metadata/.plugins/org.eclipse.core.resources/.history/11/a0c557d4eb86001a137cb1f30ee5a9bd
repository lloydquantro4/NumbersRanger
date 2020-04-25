package numberRanger;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class NumbersConveterTest {

	@Test
	void Collectiontest() {
		
		NumbersConveter test1 = new NumbersConveter();
		assertEquals(new ArrayList<Integer>(Arrays.asList(3,4,5,6,7)),test1.collect("7,3,4,5,6"), "incorrect collect");
		assertEquals(new ArrayList<Integer>(Arrays.asList(1,2,3,4,7)),new NumbersConveter().collect("1,2,3,4,7"));
		
		//negatives
		assertEquals(new ArrayList<Integer>(Arrays.asList(-5,2,3,5,7)),new NumbersConveter().collect("-5,2,3,5,7"),"Incorrect collect for negative values");
		
		//single Value
		assertEquals(new ArrayList<Integer>(Arrays.asList(1)),new NumbersConveter().collect("1"),"Incorrect collect for single value");
		
		//unsorted
		assertEquals(new ArrayList<Integer>(Arrays.asList(0,3,5,7,9)),new NumbersConveter().collect("0,9,7,5,3"),"Incorrect collect for unsorted values");

		
	}
	@Test
	void SummarizeCollectiontest() {
		
		//single value
		assertEquals("1",new NumbersConveter().summarizeCollection(new ArrayList<Integer>(Arrays.asList(1))),"incorrect summary in single value");
		
		//negative values
		assertEquals("-5--3,4",new NumbersConveter().summarizeCollection(new ArrayList<Integer>(Arrays.asList(-5,-4,-3,4))),"incorrect summary in Negative values");

		//All numbers in range
		assertEquals("1-10",new NumbersConveter().summarizeCollection(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10))),"incorrect summary All in range");

		//None in range
		assertEquals("1,3,5,7,9",new NumbersConveter().summarizeCollection(new ArrayList<Integer>(Arrays.asList(1,3,5,7,9))),"incorrect summary in None in range");
		
		//Sampled data
		NumbersConveter test1 = new NumbersConveter();
		assertEquals("1,3,6-8,12-15,21-24,31",test1.summarizeCollection(new ArrayList<Integer>(Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31))),"incorrect summary");
		
}
	}
