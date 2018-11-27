public class Solution28 {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (needle.length() > haystack.length() || haystack.isEmpty()) return -1;
        int flag = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if(i + needle.length() < haystack.length())
                    return -1;
                int count = 1;
                for (int j = 1; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j))
                        break;
                    else
                        count++;
                }
                if (count == needle.length()) {
                    flag = i;
                    return flag;
                }
            }
        }
        return (flag == 0) ? -1 : flag;
    }

    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        solution28.strStr("mississippi" , "issipi");
    }
}
