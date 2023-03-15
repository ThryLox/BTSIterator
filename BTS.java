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
        tree.add(9);
        tree.add(7);

        BTSIterator bts = new BTSIterator(tree);

        for(Iterator<Integer> itr = bts.getIterator(); itr.hasNext(); ){

            Integer val = itr.next();

            System.out.println(val);


        }
        
        
    }
    
}
