package Hashtable;

// using hash table
public class FindCommonCharacteres1002 {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        if (words.length == 0) {return result;}

        int[] hash = new int[26];

        // use the first array to initialize hash
        for (int i = 0; i < words[0].length(); i++) {
            hash[words[0].charAt(i) - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] tmphash = new int[26];

            for (int j = 0; j < words[i].length(); j++) {
                tmphash[words[i].charAt(j) - 'a']++;
            }

            // update hash to determine if the character shows in
            // both hash

            for (int k = 0; k < 26; k++) {
                hash[k] = Math.min(hash[k], tmphash[k]);
            }

        }

        // Now needs to convert hash to the output result
        for (int i = 0; i < 26; i++) {
            // using while because we could have multiple
            // characters
            while (hash[i] != 0) {
                char c = (char) (i + 'a');
                result.add(String.valueOf(c));
                hash[i]--;
            }
        }
        return result;
    }
}
