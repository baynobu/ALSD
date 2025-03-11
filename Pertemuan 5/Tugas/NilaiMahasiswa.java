package Tugas;

public class NilaiMahasiswa {
    static int findMax(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int maxLeft = findMax(arr, left, mid);
        int maxRight = findMax(arr, mid + 1, right);
        return Math.max(maxLeft, maxRight);
    }

    static int findMin(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int minLeft = findMin(arr, left, mid);
        int minRight = findMin(arr, mid + 1, right);
        return Math.min(minLeft, minRight);
    }

    static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return (double) sum / arr.length;
    }
}

