package java12_collection_framework.exercise.browser_postorder_in_binary_search_tree;

public interface Tree<E> {

    public boolean insert(E e);

    public void inorder();

    public int getSize();

    public void postorder();

    public void preorder();
}
