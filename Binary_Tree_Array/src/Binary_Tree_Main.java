public class Binary_Tree_Main {
    public static void main(String[] args) {

        BinaryTree_Array binary_tree_main=new BinaryTree_Array(10);
        binary_tree_main.insert("G");
        binary_tree_main.insert("A");
        binary_tree_main.insert("U");
        binary_tree_main.insert("R");
        binary_tree_main.insert("A");
        binary_tree_main.insert("V");
        binary_tree_main.insert("x");

//        don,t use index 0 while performing any operation in binary tree using array
        binary_tree_main.delete("x");
        binary_tree_main.preOrder(1);
        System.out.println();
        binary_tree_main.inOrder(1);
        System.out.println();
        binary_tree_main.postOrder(1);
        System.out.println();
        binary_tree_main.levelOrder();


    }
}