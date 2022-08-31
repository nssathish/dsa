package Trees;

public class Main {
    public static void main(String[] args) {
        var bsTree = new BinarySearchTree ( 10 );
        bsTree.insert ( 8 );
        bsTree.insert ( 7 );
        bsTree.insert ( 9 );
        bsTree.insert ( 11 );
        bsTree.insert ( 12 );

        System.out.println ( bsTree.find ( 12 ) );

        // Depth first traversal
        System.out.println ( bsTree.preOrderTraverse () );
        System.out.println ( bsTree.postOrderTraverse () );
        System.out.println ( bsTree.inOrderTraverse () );

        // Breadth first traversal
        System.out.println ( bsTree.levelOrderTraverse () );

        System.out.println ( bsTree.height () );
    }
}
