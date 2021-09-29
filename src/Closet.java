import java.util.TreeSet;

public class Closet {
    public /*static void*/ String anywhere(String[] list) {
        // OVERVIEW
        // initialize empty TreeSet "unique"
        // loop through each element in list
            // use .split() to convert each element to String array called "thisString"
            // loop through each element in "thisString"
                // add each unique element to "unique"

        // return String.join(" ", "unique") to return string of elements found in "unique"
        // return ""

        // EXECUTION
        // initialize empty TreeSet "unique"
        TreeSet<String> unique = new TreeSet<>();

        // loop through each element in list
        for(int i = 0; i < list.length; i++) {
            // use .split() to convert each element to String array called "thisString"
            String[] thisString = list[i].split(" ");
            // loop through each element in "thisString"
            for(String s : thisString){
                // add each unique element to "unique"
                unique.add(s);
            }
        }
        // return String.join(" ", "unique") to return string of elements found in "unique"
        return String.join(" ", unique);
        //System.out.println(String.join(" ", unique));

        // return ""
    }

    /*public static void main(String[] args){
        String[] list_ = {"blue blue water", "blue skies are blue", "blue is blue"};
        anywhere(list_);
    }*/
}