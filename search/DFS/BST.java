import java.util.LinkedList;
import java.util.ArrayList;
public class BST{
    Node root;

    BST(){
        root = null;
    }

    class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }

    // insert
    public void insert(int value){
        if(root == null){
            Node n = new Node(value);
            root = n;
        }
        else{
            Node tmp = root;
            while(true){
                if(value >= tmp.value){
                    if(tmp.right == null){
                        tmp.right = new Node(value);
                        break;
                    }
                    else{
                        tmp = tmp.right;
                    }
                }
                else{
                    if(tmp.left == null){
                        tmp.left = new Node(value);
                        break;
                    }
                    else{
                        tmp = tmp.left;
                    }
                }
            }
            tmp = null;
        }
    }

    // find/lookup
    public boolean contains(int value){
        if(root == null){
            return false;
        }
        else{
            Node tmp = root;
            while(tmp != null){
                if(tmp.value == value){
                    return true;
                }
                if(value >= tmp.value){
                    tmp = tmp.right;
                }
                else{
                    tmp = tmp.left;
                }
            }
            return false;
        }
    }

    //BFS
    public ArrayList<Integer> breadthFirstSearch(){
        ArrayList<Integer> output = new ArrayList<Integer>();
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.addLast(this.root);
        while(queue.size() > 0){
            Node current = queue.removeFirst();
            output.add(current.value);
            if(current.left != null) queue.addLast(current.left);
            if(current.right != null) queue.addLast(current.right);
        }
        return output;
    }

    //DFS: writing this because we don't want users to pass parameters
    public ArrayList<Integer> DFSInOrder(){
        ArrayList<Integer> output = new ArrayList<Integer>();
        return traverseInOrder(this.root, output);
    }

    public ArrayList<Integer> DFSPostOrder(){
        ArrayList<Integer> output = new ArrayList<Integer>();
        return traversePostOrder(this.root, output);
    }

    public ArrayList<Integer> DFSPreOrder(){
            ArrayList<Integer> output = new ArrayList<Integer>();
            return traversePreOrder(this.root, output);
    }

    public ArrayList<Integer> traverseInOrder(Node current, ArrayList<Integer> output){
        if(current.left != null) traverseInOrder(current.left, output);
        output.add(current.value);
        if(current.right != null) traverseInOrder(current.right, output);
        return output;
    }

    public ArrayList<Integer> traversePostOrder(Node current, ArrayList<Integer> output){
        if(current.left != null) traversePostOrder(current.left, output);
        if(current.right != null) traversePostOrder(current.right, output);
        output.add(current.value);
        return output;
    }

    public ArrayList<Integer> traversePreOrder(Node current, ArrayList<Integer> output){
        output.add(current.value);
        if(current.left != null) traversePreOrder(current.left, output);
        if(current.right != null) traversePreOrder(current.right, output);
        return output;
    }
}