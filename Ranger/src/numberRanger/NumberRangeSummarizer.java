package numberRanger;
import java.util.Collection;

public interface NumberRangeSummarizer {
	  //collect the input
    Collection<Integer> collect(String input);

    //SummarizeCollection
    String summarizeCollection(Collection<Integer> input);
}
