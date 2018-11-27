public class Solution5 {
    public String longestPalindrome(String s) {
        int reshead = 0, reslast = 0, head, last;
        for (head = 0; head < s.length(); head++) {
            for (last=s.length(); last > head; last--) {
                if(reshead<=head && reslast>=last)
                    break;
                if (isPalindrome(s.substring(head, last)) && (last - head > reslast - reshead)) {
                    reshead = head;
                    reslast = last;
                }
            }
        }
        return s.substring(reshead, reslast);
    }

    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abacab";
        Solution5 solution5 = new Solution5();
        System.out.print(solution5.longestPalindrome(str));
    }
}
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
