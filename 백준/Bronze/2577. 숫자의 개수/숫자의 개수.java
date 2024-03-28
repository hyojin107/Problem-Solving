import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String val = String.valueOf(a * b * c);

        int[] cnt = new int[10];
        for (int i = 0; i < val.length(); i++) {
            cnt[Integer.parseInt(val.charAt(i)+"")] += 1;
        }
        for (int i : cnt) {
            System.out.println(i);
        }
    }
}
