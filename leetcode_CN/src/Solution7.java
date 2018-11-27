public class Solution7 {
    public int reverse(int x) {
        int res = 0;
        while(x!=0){
            int temp = x%10;
            x/=10;
            res = res*10+temp;
            if(((x<=9&&x>0)||(x<0&&x>=-9))&&(res<-2147483648/10 || res>2147483647/10)){
                return 0;
            }
        }
        return res;
    }

    public static void main(String[] args){
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.reverse(-2147483412));
    }
}
