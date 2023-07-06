package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){

        //tried to count each iteration of z and y that shows up did not work;
        //it was easier to use arrays to check if it contains y or z in each element
        String arr[] = input.split(" ");
        int counter = 0;
        //loop through each char
        for (int i = 0; i < arr.length; i++){
            if(arr[i].contains("z") || arr[i].contains("y")){
                counter++;
            }
        }
        //if char contains y or z
        // increment counter
        return counter;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        String newStr = "";

        //loop through each char
        for (int i = 0; i < base.length(); i++){
            if(base.contains(remove)){
                newStr = base.replace(remove,"");
            } else {
                return base;
            }
        }
        return newStr;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        StringBuilder builder = new StringBuilder();
        String newStr = input;
        //split the string

        //initialize two counts one for "is" and "not
        int is = 0;
        int not = 0;

        //take each element of the string and check if it contains is or not
        for (int i = 0; i < input.length() - 2; i++){
            if (input.charAt(i) == 'i'){
                if (input.charAt(i + 1) == 's'){
                    is += 1;
                }
            } else if (input.charAt(i) == 'n') {
                if ((input.charAt(i + 1) == 'o') && (input.charAt(i + 2) == 't')){
                    not += 1;
                }
            }
        }
        if (is == not){
            return true;
        } else {
            return false;
        }
        //if it contains is or not increment the respective counter

        //compare both the counters once it is done traversing through the array
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == 'g'){
                if ((input.charAt(i + 1) == 'g' || input.charAt(i - 1) == 'g')){
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int counter = 0;

        for (int i = 0; i < input.length() - 3; i++){

            if ((input.charAt(i + 1) == input.charAt(i)) && (input.charAt(i + 2) == input.charAt(i))){
                counter++;
            }
        }
        return counter;
    }
}
