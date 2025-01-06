package Array.BasicOperation;
import java.util.Arrays ;
public class AcutalCopy {
    public static void main(String[] args){
        int[] arr = {10,20,30};
        int[] brr = Arrays.copyOf(arr,arr.length+2);
        for(int x:brr){
            System.out.println(x+"");
        }
    }
}
