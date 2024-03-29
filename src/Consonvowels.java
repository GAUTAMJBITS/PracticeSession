public class Consonvowels {

//count total number of constant and vowels

    static void voels(String str){
        int vowels =0;
        int constants =0;

        String strin = str.toLowerCase();
        for (int k =0; k < strin.length(); k++ ){
            char c = strin.charAt(k);
            if (c == 'a'|| c=='e'|| c=='i' || c=='o'||c=='u'){
                vowels++;
                //k++;
            }else{
                constants++;
               // k++;
            }
        }

        System.out.println("vowels=="+vowels);
        System.out.println("constants=="+constants);

    }
    public static void main(String[] args) {

        voels("ANMIMAL");


    }
}
