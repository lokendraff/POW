package week2.StepWordsFinder;
import java.util.*;
public class sol1 {

     private static int[] getCharCount(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }
        return count;
    }

    private static boolean isStepWord(int[] baseCount, String candidate) {
        int[] candCount = getCharCount(candidate);
        int extraLetters = 0;

        for (int i = 0; i < 26; i++) {
            if (candCount[i] < baseCount[i]) {
                return false;
            }
            extraLetters += candCount[i] - baseCount[i];
        }

        return extraLetters == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String baseWord = sc.nextLine().trim();
        int n = Integer.parseInt(sc.nextLine().trim());

        List<String> result = new ArrayList<>();
        int[] baseCount = getCharCount(baseWord);

        for (int i = 0; i < n; i++) {
            String candidate = sc.nextLine().trim();
            if (candidate.length() == baseWord.length() + 1) {
                if (isStepWord(baseCount, candidate)) {
                    result.add(candidate);
                }
            }
        }

        Collections.sort(result);
        for (String word : result) {
            System.out.println(word);
        }


    }
}
