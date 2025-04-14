package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _386_lexicalOrder {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(Method(n));
    }
    public static List<Integer> Method(int n){
        List<Integer> list = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < n; i++) {
            list.add(num);
            if(num*10 < 10){
                num*=10;
            } else  {
                while((num%10 == 9 || num+1 > n)){
                    num/=10;
                }
                    num++;
            }
        }
        return list;
    }
}
