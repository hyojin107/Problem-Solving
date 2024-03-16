import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = br.readLine();
        String[] numList = read.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.parseInt(numList[0]) * 1.0 / Integer.parseInt(numList[1]));
        System.out.println(sb);
    }
}
