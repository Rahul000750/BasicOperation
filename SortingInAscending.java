package Array.BasicOperation;
import java.util.Arrays ;
public class SortingInAscending{
    public static void main(String[] args){
        int[] arr = {40,30,20};
        Arrays.sort(arr) ;
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
        }

    }
}