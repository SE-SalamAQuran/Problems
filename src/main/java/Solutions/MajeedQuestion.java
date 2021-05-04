package Solutions;
import java.util.*;

public class MajeedQuestion {
    public static void main(String[] args){
        System.out.println(Curly("{vsd{sadjas7y}321}{]0--97875t}}{"));
    }
//Worst case time complexity is O(n)
    public static boolean Curly(String exp){
        int rCount = 0, lCount = 0;
        Stack<Character> mystack = new Stack();
        for(int i=0; i < exp.length() ;i++){
            switch (exp.charAt(i)){
                case '{': mystack.push(exp.charAt(i));
                rCount++;
                break;
                case '}':
                    if(!mystack.isEmpty()){
                        mystack.pop();
                        lCount++;
                    }else{return false;}
                break;
                default: continue;
            }
        }

        if(rCount == lCount){
            return true;
        }
        return false;
    }
}
