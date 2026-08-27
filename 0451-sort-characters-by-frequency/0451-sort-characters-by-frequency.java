class Solution {
    public String frequencySort(String s) {

    HashMap<Character, Integer> map = new HashMap<>();

    // Count frequency
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    // Sort by frequency
    StringBuilder ans = new StringBuilder();

    while (!map.isEmpty()) {

        char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        // Add character according to its frequency
        for (int i = 0; i < maxCount; i++) {
            ans.append(maxChar);
        }

        // Remove it so we don't process it again
        map.remove(maxChar);
    }

    return ans.toString();
    }
}