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
            sb.append(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1])).append("\n");
        }
        System.out.println(sb);
    }
}
