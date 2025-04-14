public class Exercicio07 {
    public static void main(String[]args){
        int N = 1234;
        int soma = 0;

        while(N > 0){
            int num = N % 10;
            soma = soma + num;
            N = N / 10;
        }      
            System.out.println("A soma dos digitos é = " + soma);
    }
    
}
