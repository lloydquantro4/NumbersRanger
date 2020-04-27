package numberRanger;

import java.util.Collection;

import java.util.*;

public class NumbersConveter implements NumberRangeSummarizer {

	private List<Integer> inputNumbers;
	private StringBuilder sb;

	public NumbersConveter() {
		this.inputNumbers = new ArrayList<Integer>();
		this.sb = new StringBuilder();
	}

	//Collect and sort Input in ascending order
	public Collection<Integer> collect(String input) {

		try {

			List<String> inputString = new ArrayList<String>(Arrays.asList(input.split("\\s*,\\s*")));
			for (int i = 0; i < inputString.size(); i++) {
				inputNumbers.add(Integer.parseInt(inputString.get(i)));
			}

			Collections.sort(inputNumbers);

		} catch (Exception e) {

			System.out.println("Invalid input");
			System.exit(0);

		}
		return inputNumbers;

	}
	
	public String summarizeCollection(Collection<Integer> input) {

		Iterator<Integer> iteratedCollection = input.iterator();

		boolean isConsecutive = false;
		boolean isFirstElement = true;
		int previousValue = 0, counter = 0, currentValue = 0;

		while (iteratedCollection.hasNext()) {

			currentValue = iteratedCollection.next();
			if (isFirstElement)
			{
				counter = currentValue;
				sb.append(currentValue);
				counter++;
				isFirstElement = false;
				continue;
			}
			//Value in the collection is consecutive and is part of a running range
			if ((currentValue == counter) && (isConsecutive))
			{
				if (iteratedCollection.hasNext())
				{
					previousValue = currentValue;
					counter++;
					continue;
				} else
				{
					sb.append(currentValue);
				}
			} 
			//Value in the collection is the first value of a sequence
			else if ((currentValue == counter)) 
			{
				if (iteratedCollection.hasNext()) 
				{
					sb.append("-");
					counter++;
					previousValue = currentValue;
					isConsecutive = true;
					continue;
				}
			}
			//Value in the collection is not in a sequence
			else 
			{
				if (isConsecutive)
				{
					sb.append(previousValue);
				}	
				sb.append("," + currentValue);
				isConsecutive = false;
				counter = currentValue;
				counter++;
			}
		}
		return sb.toString();
	}
}
