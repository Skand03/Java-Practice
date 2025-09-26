public class FIndMiddleWordsInString {
    public static void main(String[] args) {
        String s = "Hello how are you ?";
        String[] word= s.trim().split("\\s+");
        int n = word.length;

        if(n%2==1){
            System.out.println(word[n/2]);
        }else{
            System.out.println(word[n/2-1]+ " " + word[n/2]);

        }

    }
}
