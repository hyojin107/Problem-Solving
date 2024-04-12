import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            String[] nums = br.readLine().split(" ");
            int h = Integer.parseInt(nums[0]);
            int n = Integer.parseInt(nums[2]);
            int yy = (n % h == 0) ? h : n % h;
            int xx = (int) Math.ceil(n / (h + 0.0));
            if (i != 0) sb.append("\n");
            sb.append(yy).append(String.format("%02d", xx));
        }
        System.out.print(sb);
    }
}