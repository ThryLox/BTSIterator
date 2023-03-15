import java.util.Iterator;
import java.util.Stack;

public class BTSIterator implements Iterator<Integer> {

    
    Tree tree;
    Stack<Node> stack;

    // using stack to get all the nodes in the tree
    
	BTSIterator(Tree tree) {
		stack = new Stack<>();
        this.tree = tree;
        Node node = tree.root; 		
		update(node);  // updating stack
	}
    // implementing interface
    @Override
    public boolean hasNext() {        
        return !stack.isEmpty();   
    }

    
    @Override
    public Integer next() {

        Node remove = stack.pop();
        update(remove.right);  // before return node, first update stack further        
		return remove.value;
 
        
    }

    public void update(Node node){

        while(node != null){
			stack.add(node);
			node = node.left;
		}
    }
// making a concrete Interator
    public Iterator<Integer> getIterator() {
        return new BTSIterator(tree);
     }
    
}
