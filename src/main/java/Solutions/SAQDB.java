package Solutions;
import java.util.*;

//To create a new DB technology we need DS.
//I will use Hashmap to store values/entries in key-value pairs.
//And I will store all of those hashmaps in a tree since it has little time complexity compared to other DS.
//Other options can include B-trees, Splay trees and KD trees, but I wanted to use something I'm familiar with.

public class SAQDB {

    /*Now each node in our tree stores a hashmap instance and can be searched by the key of the HM as val*/
    /*Each table is represented as a tree and each node in that tree contains a row.
    *The row is a hashmap which contains string keys and Object List values.
    *Now let's initialize a DB instance
    * */

    public static void main(String[] args){

        TreeSet<HashMap<String, List<Object>>> myDB = new TreeSet<>();
        //This way we can make CRUD operations in little time.

    }


}
