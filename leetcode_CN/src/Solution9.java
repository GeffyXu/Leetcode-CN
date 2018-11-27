public class Solution9 {
    public boolean isPalindrome(int x) {
        int res=0;
        int y = x;
        if(x==0)return true;
        if(x<0){
            return false;
        }else{
            while(x!=0){
                int temp = x%10;
                x/=10;
                res = res*10+temp;
            }
            return(res == y);
        }
    }

    public static void main(String[] args){
        Solution9 solution9 = new Solution9();
        System.out.print(solution9.isPalindrome(121));
    }
}
