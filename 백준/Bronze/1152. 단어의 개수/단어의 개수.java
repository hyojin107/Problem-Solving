import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = br.readLine();
        String trim = read.trim();
        int result = (trim.isBlank()) ? 0 : read.trim().split(" ").length;
        System.out.println(result);
    }
}
