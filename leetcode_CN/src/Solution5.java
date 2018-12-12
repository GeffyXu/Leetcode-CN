//public class Solution5 {
//    public String longestPalindrome(String s) {
//        int reshead = 0, reslast = 0, head, last;
//        for (head = 0; head < s.length(); head++) {
//            for (last=s.length(); last > head; last--) {
//                if(reshead<=head && reslast>=last)
//                    break;
//                if (isPalindrome(s.substring(head, last)) && (last - head > reslast - reshead)) {
//                    reshead = head;
//                    reslast = last;
//                }
//            }
//        }
//        return s.substring(reshead, reslast);
//    }
//
//    public boolean isPalindrome(String s) {
//        for (int i = 0; i < s.length() / 2; i++) {
//            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
//                return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        String str = "abacab";
//        Solution5 solution5 = new Solution5();
//        System.out.print(solution5.longestPalindrome(str));
//    }
//}
//
//public class Solution5 {
//    public String longestPalindrome(String s) {
//        int  head = 0, last = s.length();
//        for (;head<last;){
//                if (isPalindrome(s.substring(head, last))) {
//                    break;
//                }else{
//                    if(isPalindrome(s.substring(++head, last))){
//                        break;
//                    }else{
//                       if(isPalindrome(s.substring(--head, --last)))
//                           break;
//                    }
//                }
//        }
//        return s.substring(head,last);
//    }
//
//    public boolean isPalindrome(String s) {
//        for (int i = 0; i < s.length() / 2; i++) {
//            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
//                return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        String str = "eabcb";
//        Solution5 solution5 = new Solution5();
//        System.out.print(solution5.longestPalindrome(str));
//    }
//}
class Solution5 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int head = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int l1 = isPalindrome(s, i, i);
            int l2 = isPalindrome(s, i, i + 1);
            int len = Math.max(l1, l2);
            if (end - head < len) {
                head = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(head,end+1);
    }

    public int isPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String str = "eabcb";
        Solution5 solution5 = new Solution5();
        System.out.print(solution5.longestPalindrome(str));
    }
}