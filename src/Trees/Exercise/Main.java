package Trees.Exercise;

public class Main {
    public static void main(String[] args) {
        var bTree = new BinaryTree ( 10 );
        bTree.insert ( 8 );
        bTree.insert ( 7 );
        bTree.insert ( 9 );
        bTree.insert ( 11 );
        bTree.insert ( 12 );
        bTree.insert ( 6 );

        System.out.println ( bTree.size() );
        System.out.println ( bTree.countLeaves () );
        System.out.println ( bTree.max () );
        System.out.println ( bTree.contains ( 1 ) );
        System.out.println ( bTree.contains ( 12 ) );
        System.out.println ( bTree.areSiblings ( 8, 12 ) );
        System.out.println ( bTree.areSiblings ( 7, 9 ) );

        var ancestors = bTree.getAncestors ( 6 );
        for (var item : ancestors) System.out.println ( item );
    }
}
