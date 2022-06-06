
class Solution {
    public int myAtoi(String s) {
        // 1. Empty String
        if (s.length() == 0) return 0;
        
        int idx = 0;
        // 2. Leading Spaces
        while (idx < s.length() && s.charAt(idx) == ' ') {
            idx++;
        }
        
        // 3. Negative Sign
        boolean plusSign = true;
        if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            plusSign = s.charAt(idx) == '-' ? false : true;
            idx++;
        }
        int result = 0;
        while (idx < s.length() && Character.isDigit(s.charAt(idx))) {
            // Since it's string, it's all positive sign
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && s.charAt(idx) - '0' > Integer.MAX_VALUE % 10)) {
                return plusSign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (s.charAt(idx) - '0');
            idx++;
        }
        
        return plusSign ? result : -result;
    }
}