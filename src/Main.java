public class Main {
    public static void main(String[] args) {

        int [] unsortedArray = {5, 2, 9, 1, 2, 6, 4, 8, 3, 10, 7} ;
        int [] sortingResult = new int[unsortedArray.length];

        int index = 0;

        while(index < unsortedArray.length){
            System.out.print(unsortedArray[index] + " ");
            index++;
        }
        index = 0;

        System.out.println(" ");

        //sortingResult = sortingAlgorithm.bubbleSort(unsortedArray); // USING BUBBLE SORT
        //sortingResult = sortingAlgorithm.insertionSort(unsortedArray); // USING INSERTION SORT
        sortingAlgorithm.mergeSort(unsortedArray); // USING MERGE SORT

//        while(index < sortingResult.length){
//            System.out.print(sortingResult[index] + " ");
//            index++;
//        }
//        index = 0;

        while(index < unsortedArray.length){
            System.out.print(unsortedArray[index] + " ");
            index++;
        }
        index = 0;
    }
}