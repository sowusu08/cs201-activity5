import java.util.ArrayList;
import java.util.Arrays;

public class PairDown {
    public /*static void*/ int[] fold(int[] list) {
        // initialize empty arrayList "list_ret"
        ArrayList<Integer> list_ret = new ArrayList<>();

        // loop through each element in "list"
        for(int i = 0; i < list.length; i+=2){
            // if the list has even number of indexes
            if(list.length % 2 == 0){
                // skip the last element
                if(i != list.length - 1) {
                    // get the next element, add it to the current element, and add the sum to "list_ret"
                    int sum = list[i] + list[i + 1];
                    list_ret.add(sum);
                }
            } else {
                // otherwise the list has an odd number of indexes
                // if the element is not the last element
                if(i != list.length - 1){
                    // get the next element, add it to the current element, and add the sum to "list_ret"
                    int sum = list[i] + list[i+1];
                    list_ret.add(sum);
                } else {
                    // else add the current element to zero and add the sum to "list_ret"
                    list_ret.add(list[i]);
                }
            }
        }

        // convert "list_ret" to an array "ret"
        int[] ret = new int[list_ret.size()];

        for(int i = 0; i < list_ret.size(); i++){
            ret[i] = list_ret.get(i);
        }

        return ret;
        /*for(int k : ret) {
            System.out.println(k);
        }*/
        //return list;
    }

    /*public static void main(String[] args) {
        int[] list_ = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
        fold(list_);
    }*/
}