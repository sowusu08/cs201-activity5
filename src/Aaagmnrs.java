import java.util.*;

public class Aaagmnrs {
    public /*static void*/ String[] anagrams(String[] phrases) {
        //OVERVIEW
        // init String, Integer map "uniqueGrams"
        // loop through each element in "phrases"
            // split element using .toCharArray; then sort CharArray and save as anagram
            // putIfAbsent anagram to map and current index

        // init String ArrayList "gramsList"
        // loop through values of map using <mapName>.values() (for each)
            // using phrases[variable] to get element at each index; call gramsList.add() on this value

        // Convert ArrayList to array using .toArrayList (since both will have String type); return array

        // EXECUTION
        // init String, Integer map "uniqueGrams"
        //HashMap<String, Integer> uniqueGrams = new HashMap<>();
        // looked up LinkedHashMap so that order of insertion is preserved
        LinkedHashMap<String, Integer> uniqueGrams = new LinkedHashMap<>();

        // loop through each element in "phrases" using index for loop
        for(int i = 0; i < phrases.length; i++) {
            // remove spaces by calling <stringObject>.replace(" ", "") and convert all characters to lower case
            String letters = phrases[i].replace(" ", "").toLowerCase();
            // then convert to String array by calling <stringObject>.split("")
            String[] letters_array = letters.split("");
            // then sort String array by converting to ArrayList
            ArrayList<String> sorted_letters = new ArrayList<>(Arrays.asList(letters_array));
            Collections.sort(sorted_letters);
            // use String.join() to create string and save as "anagram"
            String anagram = String.join("", sorted_letters.toArray(new String[sorted_letters.size()]));
            // putIfAbsent anagram to map and current index
            uniqueGrams.putIfAbsent(anagram, i);
            //System.out.println(uniqueGrams);
        }
        // init String ArrayList "gramsList"
        ArrayList<String> gramsList = new ArrayList<>();
        // loop through values of map using <mapName>.values() (for each)
        for(Integer i : uniqueGrams.values()) {
            // using phrases[variable] to get element at each index; call gramsList.add() on this value
            gramsList.add(phrases[i]);
        }
        // Convert ArrayList to array using .toArray (since both will have String type); return array
        return gramsList.toArray(new String[gramsList.size()]);
        //System.out.println(gramsList);

    }

    /*public static void main(String[] args){
        String[] phrases_ = { "Radar ghost jilts Kim", "patched hers first",
                "DEPTH FIRST SEARCH", "DIJKSTRAS ALGORITHM" };

        anagrams(phrases_);
    }*/
}