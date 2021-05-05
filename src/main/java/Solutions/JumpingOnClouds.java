package Solutions;
import java.util.*;
//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
public class JumpingOnClouds {
    public static void main(String[] args){
        List<Integer> integers = new LinkedList<>();
        integers.add(0);
        integers.add(1);
        integers.add(1);
        integers.add(0);
        System.out.println(jumpingOnClouds(integers));
    }

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int result = 0, el = c.size() - 1;
        for (int i = 0; i < el; i += 2, result++)
        {
            if (c.get(i) == 1) i--;
        }
        return result;

    }
}

