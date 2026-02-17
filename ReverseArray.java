public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        reverseArr(arr);
        }
    public static void reverseArr(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        // for(int i = 0; i < arr.length; i++) {
        //     int temp = arr[first];
        //     arr[first] = arr[last];
        //     arr[last] = temp;
        //     first++;
        //     last--;
        //     if(last <= first) break;
        // }
        // for(int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        while(last>first) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    } 
    // public static void reverseArr(int[] arr) {
    //     int i = 0;
    //     while(i <= arr.length-i-1) {
    //         int temp = arr[i];
    //         arr[i] = arr[arr.length-i-1];
    //         arr[arr.length-i-1] = temp;
    //         i++;
    //     }
    // }
}

// Using recursion
// public class ReverseArray {
//     public static void main(String[] args) {
//         int [] arr = {1,2,3,4,5,6};
//         // int i = 0;
//         int start = 0;
//         int end = arr.length - 1;
//         reverseArr(arr, start, end);
//         for(int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }

//     }
//     public static void reverseArr(int[] arr, int start, int end) {
//         if(start > end) return;
//         int temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;
//         reverseArr(arr, start+1, end-1);
//     }
//     // public static void reverseArr(int[] arr, int i) {
//     //     if(i >= arr.length/2) return;
//     //     int temp = arr[i];
//     //     arr[i] = arr[arr.length-i-1];
//     //     arr[arr.length-i-1] = temp;
//     //     reverseArr(arr, i+1);
//     // }
// }
