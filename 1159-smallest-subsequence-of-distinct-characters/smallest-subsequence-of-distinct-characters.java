class Solution {
    public String smallestSubsequence(String s) {
        // Track the last seen index of each character
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        // Track whether a character is already included in our result stack
        boolean[] seen = new boolean[26];
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            int idx = curr - 'a';
            
            // If we already used this character in our current optimal subsequence, skip it
            if (seen[idx]) continue;
            
            // Pop characters from the stack if they are lexicographically greater 
            // than the current character AND they appear again later in the string
            while (!stack.isEmpty() && stack.peek() > curr && lastIndex[stack.peek() - 'a'] > i) {
                seen[stack.pop() - 'a'] = false;
            }
            
            stack.push(curr);
            seen[idx] = true;
        }
        
        // Build the final string from the stack
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}