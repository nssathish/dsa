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
        System.out.println ( bsTree.depth ( 12 ) );
        System.out.println ( bsTree.depth ( 8 ) );
        System.out.println ( bsTree.depthByRecursion ( 8 ) );
        System.out.println ( bsTree.depthByRecursion ( 12 ) );

        System.out.println ( bsTree.min() );
        System.out.println ( bsTree.minVal () );

        var bsTreeCopy = bsTree;
        bsTreeCopy = new BinarySearchTree ( 5 );
        System.out.println ( bsTreeCopy.equals ( bsTree ) );
        System.out.println ( bsTree.equals ( bsTreeCopy ) );

        System.out.println ( bsTree.isValid () );
        System.out.println ( bsTreeCopy.isValid () );

        bsTree.nodesAtKDistance ( 2 );
        for (var item : bsTree.nodesAtKDistanceByRecursion ( 2 ))
            System.out.println ( item );
    }
}
