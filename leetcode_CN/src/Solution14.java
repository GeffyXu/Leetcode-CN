public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String res = "";
        int flag = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i + 1 > strs[j].length()) {
                    return res;
                }
                if (strs[j].charAt(i) == strs[0].charAt(i)) {
                    flag += 1;
                }
            }
            if (flag == strs.length - 1) {
                res += strs[0].charAt(i);
                flag = 0;
            }else{
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] str = {};
        Solution14 solution14 = new Solution14();
        System.out.print(solution14.longestCommonPrefix(str));
    }
}

