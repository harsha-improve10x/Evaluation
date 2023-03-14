public class RemoveVowels {

    public static void main(String[] args) {
        String str = removeVowels("");
        System.out.println(str);

    }
    public static String removeVowels(String str) {
        String s = "";
        String vowels = "aeiouAEIOU";
        if (str.length()==0) {
            s = "No Input";
        } else if (str.contains(vowels)) {
            s = str.replace(vowels, "");
        }
        return s;
    }
}
