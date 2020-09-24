package java12_collection_framework.pricise.set_binary_search_tree;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
        tree.insert(9);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);
        tree.insert(4);
        tree.insert(5);
        tree.insert(15);
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
