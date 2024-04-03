import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String nums = br.readLine();
        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += Integer.parseInt(nums.charAt(i) + "");
        }
        System.out.println(sum);
    }
}
