import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) {
                continue;
            }

            int x;
            try {
                x = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                continue;
            }

            if (x == 0) {
                break;
            }

            int start = (x % 2 == 0) ? x : x + 1;
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += start + 2 * i;
            }

            output.append(sum).append('\n');
        }

        System.out.print(output);
    }
 
}