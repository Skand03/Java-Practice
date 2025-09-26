public class FIndMiddleCharacterInString {
    public static void main(String[] args) {
        String s = "abcdefgh";
//        String s = "Hello how are you ";
        int n = s.length();

        if(n%2==1){
            System.out.println(s.charAt(n/2));
        }else{
//            System.out.println(" " + s.charAt(n/2-1) + s.charAt(n/2));
//            System.out.println(s.charAt(n/2-1) + s.charAt(n/2) + " ");
            System.out.println(s.charAt(n/2-1) + s.charAt(n/2));
        }

//        int left = 0;
//        int right = s.length()-1;
//
//        while(left < right){
//            left++;
//            right--;
//        }
//
//        if(left==right){
//            System.out.println(s.charAt(left));
//        }else{
//            System.out.println("" + s.charAt(right) + s.charAt(left));
//        }

    }
}
