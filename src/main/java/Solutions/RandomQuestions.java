package Solutions;
import java.math.BigInteger;
import java.util.*;


public class RandomQuestions {
public static void main(String[] args){
    int []arr = {2,6,8,10,10};

    LinkedList<String> names = new LinkedList<>();
    names.add("Salam");
    names.add("Adel");
    names.add("Ahmad");
    names.add("Quran");
    LinkedList<String> firstnames = new LinkedList<>();
    firstnames.add("Salam");
    firstnames.add("Fareed");
    firstnames.add("Majeed");
    LinkedList<String> lastnames = new LinkedList<>();
    lastnames.add("Quran");
    lastnames.add("Qaddoura");
    lastnames.add("AlIbrahim");
    Stack<String> stack = new Stack<>();
    List<Integer> nums = new LinkedList<>();
    nums.add(1);
    nums.add(2);
    nums.add(9);
    nums.add(10);
    nums.add(1000);
    nums.add(-1);
    System.out.println(countOccurrence('l', "Salam AdelL Quran"));
    System.out.println(firstNonRepeatingChar("ss"));
    reverseArray(arr);
    printFloydTriangle(9);
    printPascalTriangle(10);
    System.out.println(reverseStack(stack));
    System.out.println(getMiddle(names));
    System.out.println(Arrays.toString(removeDuplicates(arr)));
    System.out.println(mergeLists(firstnames, lastnames));
    System.out.println(list2Tree(nums));
}
    //We can try using Apache commons lang StringUtils class to save time but what's the point?
    //I didn't do it since I wanted to solve the problem on my own
    /*Counting the occurrence of a given character in a string*/
    public static int countOccurrence(char target, String str){
        int count = 0;
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == target){
                count++;
            }
            continue;
           }

        return count;

    }

    //Print the 1st non repeated character from the string

    public static char firstNonRepeatingChar(String word) {
        Set<Character> repeating = new HashSet<>();
        List<Character> nonRepeating = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (repeating.contains(letter)) { continue; }
            if (nonRepeating.contains(letter)) {
                nonRepeating.remove((Character) letter);
                repeating.add(letter);
            } else { nonRepeating.add(letter); }
        }
        if(nonRepeating.isEmpty()){return ' ';} //Handling the case where all letters/chars are repeating
        return nonRepeating.get(0);
    }


    //Reverse an array "also works for a Arraylist and/or Single LinkedList if we overload this method"
    public static void reverseArray(int[] arr){
        for(int i = arr.length-1; i > 0; i--){
            System.out.println(arr[i]);
        }
    }

    //Remove duplicates from the array "No libraries"
    public static int[] removeDuplicates(int[] numbersWithDuplicates) {

        // Sorting array to bring duplicates together
        Arrays.sort(numbersWithDuplicates);

        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;
    }

    //Find middle element in SLL "single linked-list", let's try it with a Linked-list of integers
    public static String getMiddle(LinkedList<String> target){
/*
Here the iterator class won't work since we need two pointers and it's not allowed to use
two iterators at the same time on the same linked list.
*/
        int i,j=0;
        for(i=1; i< target.size(); i+=2){
            j++;
        }
    return target.get(j);
    }

    //Reverse a Stack
    public static Stack<String> reverseStack(Stack<String> st){
        Stack <String> temp = new Stack<>();
        while(!st.isEmpty()){
            String element = st.pop();
            temp.push(element);
        }
        return temp;
    }

    //Converting a list to a tree
    public static TreeSet<Integer> list2Tree(List<Integer> list){
        Collections.sort(list); //Sorting the list
        TreeSet<Integer> tree = new TreeSet<>();
        tree.addAll(list);
        return tree;
    }

    //Merging two Linked Lists containing string values
    public static List<String> mergeLists(LinkedList<String> l1, LinkedList<String> l2){
        //first we initialize the two temp lists, their sizes must equal l1 and l2 respectively

        List<String> temp1 = new LinkedList<>();
        List<String> temp2 = new LinkedList<>();
        List<String> result = new LinkedList<>();
//Copy data to temp lists
        for(int i=0; i < l1.size(); i++){
            temp1.add(l1.get(i));
        }
        for(int j=0; j < l2.size(); j++){
            temp2.add(l2.get(j));
        }
        int i = 0, j = 0, k = 0;
        while (i < temp1.size() && j < temp2.size()){
            if(temp2.get(j).compareTo(temp1.get(i)) == 1 || temp2.get(j).compareTo(temp1.get(i)) == 0){
                //If the element in the second list is greater than or equal the one in the first
                result.add(temp1.get(i));
                i++;
            }else{
                //The opposite
                result.add(temp2.get(j));
                j++;
            }
            k++;
        }

        //Now let's copy the remaining elements in each sublist if any remaining
        while(i < temp1.size()){
            result.add(temp1.get(i));
            i++;
            k++;
        }
        while(j < temp2.size()){
            result.add(temp2.get(j));
            j++;
            k++;
        }
        Collections.sort(result); //Sorting the resulting List
        return result;
    }
    //Print Floyd's Triangle
    public static void printFloydTriangle(int n){
        int i, j, val = 1;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();

        }
    }

    //Print pascal's triangle
    static int binomialCoeff(int n, int k)
    {
        int res = 1;

        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static void printPascalTriangle(int n){
        for (int line = 0; line < n; line++)
        {
            // Every line has number of
            // integers equal to line number
            for (int i = 0; i <= line; i++)
                System.out.print(binomialCoeff(line, i)+" ");

            System.out.println();
        }
    }
    /*Calculate very long factorial, won't work with recursion since the normal int data type
    can't store values longer than
https://www.hackerrank.com/challenges/extra-long-factorials/problem
    */

    public static void extraLongFactorials(int n) {

        BigInteger x = BigInteger.valueOf(n);
        n = n - 1;
        while(n > 0){
            x = x.multiply(BigInteger.valueOf(n));
            n = n-1;
        }
        System.out.println(x.toString());
    }
    //Palindrome index
    //https://www.hackerrank.com/challenges/palindrome-index/problem
    public static int palindromeIndex(String s)
    {
        int l = s.length();
        int i,j,a,b;
        for (i=0, j=l-1; i<l; i++,j--){
            if (s.charAt(i)!=s.charAt(j))
                break;
        }
        if (i>j) return -1;

        for (a = i+1, b = j;a < j && b>i+1; a++,b--){
            if (s.charAt(a)!=s.charAt(b))
                return j;
        }
        return i;
    }

}