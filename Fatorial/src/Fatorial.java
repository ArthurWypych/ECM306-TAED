import javax.annotation.processing.SupportedOptions;

public class Fatorial {
    public static void main(String[] args) throws Exception {
        int n=4;
        System.out.println("Fatorial(" + n + ") = " + fat(n) );
    }
    public static int fat(int n){
        if (n==0)
            return 1;
        else
            return (n*fat(n-1));
    }
}
