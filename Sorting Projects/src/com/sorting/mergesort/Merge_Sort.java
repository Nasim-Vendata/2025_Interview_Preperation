package com.sorting.mergesort;

public class Merge_Sort {
	
	
	private static void divideArray(Integer[] arr,Integer leftIndex,Integer rightIndex) {
		
		if(leftIndex < rightIndex) {
			Integer medianIndex=(leftIndex + rightIndex)/2;
			
			//Starting the recurrsion for Divide the Array
			divideArray(arr,leftIndex,medianIndex);
			divideArray(arr, medianIndex+1, rightIndex);
			//Ending the Recurrsion of the Array & all the data come in a single array form.
			
			mergeArray(arr, leftIndex, medianIndex, rightIndex);
			
		}
	}

	private static void mergeArray(Integer[] arr, Integer leftIndex,Integer medianIndex,Integer rightIndex) {
		
		Integer leftArraysize = medianIndex - leftIndex + 1;
		Integer rightArraySize = rightIndex - medianIndex;
		
		Integer[] leftArray=new Integer[leftArraysize];
		Integer[] rightArray=new Integer[rightArraySize];
		
		for(int x=0;x<leftArraysize;x++) {
			leftArray[x]=arr[leftIndex + x];
		}
		
		for(int y=0;y<rightArraySize;y++) {
			rightArray[y]=arr[medianIndex + 1 + y];
		}
		
		Integer i=0;
		Integer j=0;
		Integer k=leftIndex;
		
		while(i<leftArraysize && j<rightArraySize) {
			if(leftArray[i]<=rightArray[j]) {
				arr[k]=leftArray[i];
				i++;
			}else {
				arr[k]=rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i<leftArraysize) {
			arr[k]=leftArray[i];
			i++;
			k++;
		}
		
		while(j<rightArraySize) {
			arr[k]=rightArray[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		
		Integer arr[]= {1,3,5,9,8,7};
		
		for(Integer i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("After Merge Sort");
		divideArray(arr,0,arr.length-1);
		for(Integer i : arr) {
			System.out.print(i+" ");
		}
		
		
	}

}
