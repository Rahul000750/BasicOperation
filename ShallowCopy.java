package Array.BasicOperation;

public class ShallowCopy {
    public static void main(String[] args){
        int[] arr = {10,20,30};
        int[] num = arr ;
        num[0] = 40 ;
        System.out.println(num[0]);
        System.out.println(arr[0]);
    }
}
