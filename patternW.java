package Patterns;

public class patternW {
    public static void main(String[] args) {
        int n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || i+j==n-1 && i>=(n-1)/2 || i==j && i>(n-1)/2 || j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
