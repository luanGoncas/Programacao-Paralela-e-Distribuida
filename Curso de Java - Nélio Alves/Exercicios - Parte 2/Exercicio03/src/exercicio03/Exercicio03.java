package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if(A == B)
            System.out.println("Sao Multiplos");
        else
            if(A < B)
                if(B % A == 0)
                    System.out.println("Sao Multiplos");
                else
                    System.out.println("Nao sao Multiplos");
            if(B < A)
                if(A % B == 0)
                    System.out.println("Sao Multiplos");
                else
                    System.out.println("Nao sao Multiplos");
        
        sc.close();
    }
    
}
