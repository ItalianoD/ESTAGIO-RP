import java.util.Scanner;

public class LetterACounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string para verificar a existência da letra 'a' (maiúscula ou minúscula): ");
        String inputString = scanner.nextLine();
        scanner.close();

        int count = countLetterA(inputString);

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }

    // Função para contar a presença da letra 'a' (maiúscula ou minúscula) na string
    public static int countLetterA(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}