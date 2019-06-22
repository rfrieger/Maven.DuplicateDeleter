package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    Integer[] inputArr;

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        this.inputArr = intArray;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] toBeRemoved = new Integer[0];
        int count = 0;
        for (int i = 0; i < inputArr.length; i++) {
            for (int k = 0; k < inputArr.length; k++) {

                if (inputArr[i].equals(inputArr[k])) {
                    count++;
                }
            }
            if (count >= maxNumberOfDuplications) {
                Integer[] tempArr = {inputArr[i]};
                toBeRemoved = merge(tempArr, toBeRemoved);
            }
            count = 0;

        }

        return remove(toBeRemoved);
    }

        @Override
        public Integer[] removeDuplicatesExactly ( int exactNumberOfDuplications) {
            Integer[] toBeRemoved = new Integer[0];
            int count = 0;


            for (int i = 0; i < inputArr.length; i++) {
                for (int k = 0; k < inputArr.length; k++) {

                    if (inputArr[i].equals(inputArr[k])) {
                        count++;
                    }
                }
                if (count == exactNumberOfDuplications) {
                    Integer[] tempArr = {inputArr[i]};
                    toBeRemoved = merge(tempArr, toBeRemoved);
                }
                count = 0;

            }

          return remove(toBeRemoved);
        }







   //////Untils

    public Integer[] merge(Integer[] arr, Integer[] arr2){
        Integer[] arrMerged;

        int arrLength = arr2.length + arr.length;
        arrMerged = (Integer[]) new Integer[arrLength];
        int i;
        for(i = 0; i < arr2.length; i++){
            arrMerged[i] = arr2[i];
        }
        for (int j = 0; j< arr.length; j++){
            arrMerged[i] = arr[j];
            i++;
        }
        return arrMerged;
    }

    public Integer[] remove(Integer[] toBeRomoved) {
        Integer[] result = new Integer[0];
        for (int i = 0; i < inputArr.length; i++) {
            Boolean add = true;
            for (int k = 0; k < toBeRomoved.length; k++) {
                if(inputArr[i].equals(toBeRomoved[k])){
                    add = false;
                    break;
                }
            }
            if (add) {
                Integer[] tempArr = {inputArr[i]};
                result = merge(tempArr, result);
            }
        }
        return result;
    }

}



