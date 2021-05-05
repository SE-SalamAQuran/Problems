package Solutions;
import java.util.*;

//https://www.hackerrank.com/challenges/flatland-space-stations?h_r=next-challenge&h_v=zen
public class LisaWorkBook {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(12);
        list.add(13);

        System.out.println(workbook(5,7,list));
}


    public static int workbook(int n, int k, List<Integer> arr) {

        int count = 0, i = 0;
        int j = 1, m = 1;
        while(i < n){
            if(m <= j && j <= Math.min(m + k - 1, arr.get(i))){
                count++;
            }
            j++;
            m+=k;
            if(m > arr.get(i)){
                i+=1;
                m = 1;
            }
        }
        return count;
    }
}
