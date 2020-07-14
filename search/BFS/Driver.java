public class Driver{
    public static void main(String[] args){
        BST sTree = new BST();
        sTree.insert(14);
        sTree.insert(4);
        sTree.insert(12);
        sTree.insert(17);
        sTree.insert(61);
        sTree.insert(72);
        System.out.println(sTree.breadthFirstSearch());
    }
}