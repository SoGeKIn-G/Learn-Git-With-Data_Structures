public class BinaryTreeLL_Main {
    public static void main(String[] args) {
        BinaryTreeLL binaryTreeLL=new BinaryTreeLL();
        binaryTreeLL.insert("G");
        binaryTreeLL.insert("A");
        binaryTreeLL.insert("U");
        binaryTreeLL.insert("R");
        binaryTreeLL.insert("A");
        binaryTreeLL.insert("V");
        binaryTreeLL.preOrder(binaryTreeLL.root);
        System.out.println();
        binaryTreeLL.inOrder(binaryTreeLL.root);
        System.out.println();
        binaryTreeLL.postOrder(binaryTreeLL.root);
        System.out.println();
        binaryTreeLL.deleteNode("G");
        binaryTreeLL.preOrder(binaryTreeLL.root);
        System.out.println();
        binaryTreeLL.deleteBT();
        System.out.println();
        binaryTreeLL.postOrder(binaryTreeLL.root);
    }
}
