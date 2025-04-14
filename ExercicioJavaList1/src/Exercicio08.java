public class Exercicio08 {
    public static void main(String[] args) {
        int N = 7;
        boolean primo = true;

        for(int i = 2; i < N; i++){
            if (N % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo && N > 1) {
            System.out.println(N + " é primo.");
        } else {
            System.out.println(N + " não é primo.");
        }
    }
}
