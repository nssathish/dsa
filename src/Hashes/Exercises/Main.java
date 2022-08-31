package Hashes.Exercises;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 3, 4, 4};
        var frequentEntriesAnalyzer = new MostFrequentEntriesInArray ();
        System.out.println ( frequentEntriesAnalyzer.mostFrequentEntryInArray ( array ) );

        array = new int[] {1, 7, 5, 9, 2, 12, 3};
        var countPairsWithDiffInArray = new CountPairsWithDiffInArray ();
        System.out.println ( countPairsWithDiffInArray.countPairsWithDiff ( array, 2 ) );
        System.out.println ( countPairsWithDiffInArray.countPairsWithDiff ( new int[] {1, 7, 5, 9, 2, 12, 3, 4}, 2 ) );

        System.out.println (
                TwoNumbersAddUpToTarget
                        .indexOfTwoNumbersAddUpToTarget ( new int[] {2, 7, 11, 15}, 9 )
        );
    }
}
