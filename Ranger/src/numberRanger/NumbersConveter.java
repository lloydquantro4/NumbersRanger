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

	//Collect and sort input
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
	//Iterate through the Collection while checking for consecutive numbers
	public String summarizeCollection(Collection<Integer> input) {

		Iterator<Integer> iteratedCollection = input.iterator();

		boolean isConsecutive = false;
		boolean isFirstElement = true;
		int runningVal = 0, counter = 0, currentValue = 0;

		while (iteratedCollection.hasNext()) {

			currentValue = iteratedCollection.next();

			if (isFirstElement) {
				counter = currentValue;
				sb.append(currentValue);
				counter++;
				isFirstElement = false;
				continue;
			}

			if ((currentValue == counter) && (isConsecutive)) {
				if (iteratedCollection.hasNext()) {
					
					runningVal = currentValue;
					counter++;
					continue;
				} else {
					sb.append(currentValue);
				}

			} else if ((currentValue == counter)) {
				if (iteratedCollection.hasNext()) {
					sb.append("-");
					counter++;
					runningVal = currentValue;
					isConsecutive = true;
					continue;
				}
			}

			else if (currentValue != counter) {
				if (isConsecutive) {
					sb.append(runningVal);
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
