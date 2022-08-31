package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class FindDuplicates {
    /**
     * You will be given a set of data along with word that we are looking for duplicates of.
     * You are tasked now to see if any data in duplicateData match duplicateWord.
     * Requirements:
     *  - If there is only one word in duplicateData that match duplicateWord then there are no duplicates.
     *  - If there are more than one word that in duplicateData that match duplicate word then there are duplicates.
     *  - I want you to print out if they have duplicates. If they do, print out how many otherwise let them know we have none.
     *
     * Hint(s):
     *  - A good way to start off a problem is to see what kind of data you're dealing with.
     *    This will give you an understanding of is happening when getting the non-static list
     *    of data.
     *  - Understand what are your final results in this method? What is your end gaol?
     */
    public static void runFindDuplicates(Map<Integer, String> rawData){
        Random random = new Random();
        List<String> duplicateData = new ArrayList(rawData.values());
        String duplicateWord = rawData.get(random.nextInt(rawData.size()));

    }
}
