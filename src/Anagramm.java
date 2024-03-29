import java.util.Arrays;

public class Anagramm {

        //to check anagram

        public static void anagram(String str, String reverse){

            Boolean anagramstat = false;

            if(str.length() != reverse.length()){
                System.out.print("given"+str+"and"+reverse+"is not anagram");
            }else{
                char[] anagram1 = str.toCharArray();
                char[] anagram2 = reverse.toCharArray();

                Arrays.sort(anagram1);
                Arrays.sort(anagram2);

                anagramstat = anagram1.equals(anagram2);

            }
            if(anagramstat == true){
                System.out.print("anagram");
            }else{
                System.out.print("not anagram");
            }

        }


        public static void main(String[] args) {
//            String str = "reverse";
//            String reverse= "versere";
        //      String result = anagram("reverses", "sesrever");
              anagram("reverses", "sesrever");

        }
    }


