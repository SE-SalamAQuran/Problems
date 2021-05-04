package Solutions;
import java.util.*;

//To create a new DB technology we need DS.
//I will use Hashmap to store values/entries in key-value pairs.
//And I will store all of those hashmaps in an AVL tree since it has little time complexity compared to other DS.
//Other options can include B-trees, Splay trees and KD trees, but I wanted to use something I'm familiar with.

public class SAQDB {
    HashMap<String, List<String>> entry = new HashMap<String, List<String>>();
    AVLTree data = new AVLTree();
    /*Now each node in our avl tree stores a hashmap instance and can be searched by the key of the HM as val*/

}
