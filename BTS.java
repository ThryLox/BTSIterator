import java.util.Iterator;

public class BTS {

    public static void main(String[] args) {
        
        Tree tree = new Tree();

        //adding value to bianry search tree

        tree.add(6);
        tree.add(3);
        tree.add(2);
        tree.add(1);
        tree.add(8);
        tree.add(25);
        tree.add(7);
        tree.add(4);
        tree.add(5);
        BTSIterator bts = new BTSIterator(tree); 

        System.out.println("Traversing the Binary Search Tree : ");

        for(Iterator<Integer> itr = bts.getIterator(); itr.hasNext(); ){

            Integer val = itr.next();

            System.out.println(val);


        }
        
        
    }
    
}
