package Stacks;

public class Main {
    public static void main(String[] args) {
        var reverser = new StringReverser ();
        System.out.println (reverser.reverse ( "abcd" ) );
        System.out.println (reverser.reverse ( "" ) );
//        System.out.println (reverser.reverse ( null ) );

        var validator = new ExpressionBracketsValidator ();
        System.out.println (validator.validate ( "(1 + 2)" ));
        System.out.println (validator.validate ( ")1 + 2(" ));
        System.out.println (validator.validate ( "(1 + 2{)}[3]()[]" ) );

        var newStack = new NewStack ( 5 );
        newStack.push ( 1 );
        newStack.push ( 2 );
        newStack.push ( 3 );
        try {
            System.out.println (newStack.pop ());
            System.out.println (newStack.peek ());
            newStack.pop ();
            newStack.pop ();
//            newStack.pop ();
        } catch (Exception e) {
            e.printStackTrace ( );
        }
        for (int i = 0; i < 5; i++)
            newStack.push ( i + 10 );

//        System.out.println ( newStack );

        var twoInOne = new TwoStacksInOne ( 2 );
        twoInOne.push1 ( 10 );
        twoInOne.push1 ( 20 );
        twoInOne.push2 ( 30 );
        twoInOne.push2 ( 60 );
        try {
            System.out.println ( twoInOne.peek1 () );
//            twoInOne.push1 ( 30 );
            System.out.println ( twoInOne.peek2 () );
//            twoInOne.push2 ( 90 );
            System.out.println ( twoInOne.pop1 () );
            System.out.println ( twoInOne.pop1 () );
//            System.out.println ( twoInOne.pop1 () );

            System.out.println ( twoInOne.pop2 () );
            System.out.println ( twoInOne.pop2 () );
//            System.out.println ( twoInOne.pop2 () );
        } catch (Exception e) {
            e.printStackTrace ();
        }
        var minStack = new MinStack ( 4 );
        minStack.push ( 5 );
        minStack.push ( 2 );
        minStack.push ( 10 );
        minStack.push ( 1 );
        System.out.println ("min: " + minStack.getMin () );
        minStack.pop ();
        minStack.pop ();
        System.out.println ("min: " + minStack.getMin () );

        var minStackOf1Space = new MinStackOof1 ( 4 );
        minStackOf1Space.push ( 5 );
        minStackOf1Space.push ( 2 );
        minStackOf1Space.push ( 10 );
        minStackOf1Space.push ( 1 );
        System.out.println ("min O(1) space: " + minStackOf1Space.getMin () );
        minStackOf1Space.pop ();
        minStackOf1Space.pop ();
        System.out.println ("min O(1) space: " + minStackOf1Space.getMin () );
    }
}
