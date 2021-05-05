package Solutions;
import java.util.*;
//https://www.hackerrank.com/challenges/equality-in-a-array/problem
public class EqualizeArray {
    public static void main(String[] args){

        List<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(12);
        a.add(2);
        System.out.println(equalize(a));
    }

    public static int equalize(List<Integer> arr){

        int max = 1;
        Map<Integer, Integer> nums = new HashMap<>();
        for (int i : arr)
            if (!nums.containsKey(i))
                nums.put(i, 1);
            else {
                nums.put(i, nums.get(i) + 1);
                if (max < nums.get(i))
                    max = nums.get(i);
            }
        return arr.size() - max;
    }
}
