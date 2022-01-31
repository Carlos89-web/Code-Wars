import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PangramChecker {

	// https://www.codewars.com/kata/545cedaa9943f7fe7b000048/discuss#label-issue

	public boolean check(String sentence) {

		for (char c = 'a'; c <= 'z'; ++c) {
			if (!sentence.toLowerCase().contains("" + c))
				return false;
		}

		return true;

	}

}
