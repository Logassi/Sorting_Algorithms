public class sortingAlgorithm {

    private static int temp;
    public static int [] bubbleSort(int [] theUnsortedArray){
        //int [] sortedArrayUsingBubbleSort = theUnsortedArray;
        int arrayLength = theUnsortedArray.length;

        for(int i = 0; i < arrayLength; i++){
            boolean isItSwapped = false;
            for(int j =0; j < arrayLength-i-1; j++){
                if(theUnsortedArray[j] > theUnsortedArray[j+1]){
                    temp = theUnsortedArray[j];
                    theUnsortedArray[j] = theUnsortedArray[j+1];
                    theUnsortedArray[j+1] = temp;
                    isItSwapped = true;
                }
            }
            if(!isItSwapped){
                break; // this line of code exit the unnecessary loops
            }
        }
        return theUnsortedArray;
    }

    public static int [] insertionSort(int [] theUnsortedArray){

        for(int i = 1; i < theUnsortedArray.length; i++){
            int key = theUnsortedArray[i];
            int j = i - 1;

            while(j >= 0 && theUnsortedArray[j] > key){
                theUnsortedArray[j + 1] = theUnsortedArray[j];
                j -= 1;
            }

            theUnsortedArray[j+1] = key ;

        }

        return theUnsortedArray;
    }
    public static int [] mergeSort(int [] theUnsortedArray){


        return theUnsortedArray;
    }

}
