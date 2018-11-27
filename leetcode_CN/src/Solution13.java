import java.util.HashMap;
import java.util.Map;

public class Solution13 {
    public int romanToInt(String s) {
        int res = 0;
        Map map = new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        if(s.length() == 1){
            return (Integer)map.get(s.charAt(0));
        }
        for(int i = 0;i<s.length();i++) {
            if (i < s.length() - 1) {
                if ((Integer) map.get(s.charAt(i)) < (Integer) map.get(s.charAt(i + 1))) {
                    res += ((Integer) map.get(s.charAt(i + 1)) - (Integer) map.get(s.charAt(i)));
                    i++;
                } else {
                    res += (Integer) map.get(s.charAt(i));
                }
            }else{
                if((Integer) map.get(s.charAt(i)) > (Integer) map.get(s.charAt(i - 1))){
                    return res;
                }else {
                    res +=(Integer)map.get(s.charAt(i));
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        Solution13 solution13 = new Solution13();
        System.out.println(solution13.romanToInt("CDXIII"));
    }
}
