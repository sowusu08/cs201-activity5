import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class SetAside {
    public /*static void*/ String common(String[] list) {
        // convert the first element in "list" to array using split and then pass it as list to TreeSet called "standard"
        TreeSet<String> standard = new TreeSet<>(Arrays.asList(list[0].split(" ")));
        // init ArrayList "list_ret"
        ArrayList<String> list_ret = new ArrayList<>();

        /**/

        // for each element in set "standard"
        for(String s : standard) {
            // save element as String "word"
            String word = s;

            // init boolean found to true
            boolean found = true;

            // loop through elements indexed 1 through list.length - 1
            for (int i = 1; i < list.length; i++) {
                // convert the indexed element to array using split then pass it as a list to a TreeSet called "searching"
                TreeSet<String> searching = new TreeSet<>(Arrays.asList(list[i].split(" ")));

                // call .contians() for "word" in "searching"
                // if .contains == false set "found" to false and break
                if (searching.contains(word) == false) {
                    found = false;
                    break;
                }
            }

            // if "found" == true
            if(found == true){
                // .add() "word" to "list_ret"
                list_ret.add(word);
            }
        }

        // if no common words are found return and empty list
        if(list_ret.size() == 0){
            return "";
            //System.out.println("");
        } else {
            // return String.join(" ",collection) on "list_ret"
            return String.join(" ", list_ret);
            //System.out.println(String.join(" ", list_ret));
        }

        /**/

        // for each element in "standard"
            // save element as String "word"
            // init boolean found to true
            // loop through elements indexed 1 through list.length() - 1
                // convert the indexed element to array using split then pass it as a list to a HashTree called "searching"

                // call .contians() for "word" in "searching"

                // if .contains == false set "found" to false and break
            // if "found" == true
                // .add() "word" to "list_ret"

        // return String.join(" ",collection) on "list_ret"

        //return "";
    }

    /*public static void main(String[] args) {
    String[] list_ = {"cow bell", "bell toll", "toll booth"};

    common(list_);
    }*/
}
