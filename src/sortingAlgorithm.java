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
    public static void mergeSort(int [] theUnsortedArray){
        if(theUnsortedArray.length > 1){
            int mid = theUnsortedArray.length/2;
//            int [] leftSide = new int[mid];
//            int [] rightSide = new int[mid];


//            for(int i = 0; i < mid; i++){
//                leftSide[i] = theUnsortedArray[i];
//                rightSide[i] = theUnsortedArray[i+mid];
//            }

            int[] leftSide = new int[mid];
            int[] rightSide = new int[theUnsortedArray.length - mid];

// Split the array into left and right parts
            for (int i = 0; i < mid; i++) {
                leftSide[i] = theUnsortedArray[i];
            }
            for (int i = mid; i < theUnsortedArray.length; i++) {
                rightSide[i - mid] = theUnsortedArray[i];
            }

            mergeSort(leftSide);
            mergeSort(rightSide);

            merge(theUnsortedArray, leftSide, rightSide);
        }

    }

    public static void merge(int [] theUnsortedArray, int [] left, int [] right ){
        int i = 0, j = 0, k = 0;

        // merging temporary arrays back into theUnsortedArray
        while (i < left.length && j < right.length){
            if (left[i] <= right[j]){ // ensures the recurrence
                theUnsortedArray[k] = left[i];
                i += 1;
            }else{
                theUnsortedArray[k] = right[j];
                j += 1;
            }
            k += 1;
        }

        //Copy the remaining elements of left, if there are any
        while (i < left.length){
            theUnsortedArray[k++] = left[i++];
//            i += 1;
//            k += 1;
        }


        //Copy the remaining elements of right, if there are any
        while (j < right.length){
            theUnsortedArray[k++] = right[j++];
//            j += 1;
//            k += 1;
        }

    }

}
