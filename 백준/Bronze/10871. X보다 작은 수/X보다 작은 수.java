import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cnt = br.readLine().split(" ");
        String[] nums = br.readLine().split(" ");
        int x = Integer.parseInt(cnt[1]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Integer.parseInt(cnt[0]); i++) {
            int num = Integer.parseInt(nums[i]);
            if (num < x) {
                sb.append(num).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
