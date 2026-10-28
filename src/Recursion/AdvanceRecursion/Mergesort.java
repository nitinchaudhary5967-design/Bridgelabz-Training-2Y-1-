package Recursion.AdvanceRecursion;
import java.util.Arrays;
public class Mergesort {
    public static void mergeSort(int arr[], int l, int r) {

// Base Case
        if (l >= r) {
            return;
        }

        int mid = (r+l) / 2;

// rec Call
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);


        merge(arr, l, mid, r);
    }

    public static void merge(int arr[], int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 11, 3, 6, 16};

        System.out.println("Before Array is sorted:");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Array is sorted:");
        System.out.println(Arrays.toString(arr));
    }

    }

