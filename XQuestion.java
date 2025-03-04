import java.util.Arrays;

public class XQuestion {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,3,11};

        xD xd = new xD();
        System.out.println(Arrays.toString(xd.mergeTwoArrays(arr1,arr2)));

    }
}

class xD {
    public int[] mergeTwoArrays(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length+arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i != arr1.length && j != arr2.length) {
            if(arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                k++; i++;
            }else{
                arr[k] = arr2[j];
                k++; j++;
            }
        }

        while (i != arr1.length) {
            arr[k] = arr1[i];
            k++; i++;
        }

        while (j != arr2.length) {
            arr[k] = arr2[j];
            k++; j++;
        }

        return arr;
    }
}
