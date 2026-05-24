import java.util.Arrays;
// import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
    int [] arr={5,66,7,52,31,65};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println(arr[0]);
    System.out.println(arr[arr.length-1]);
    }
}
