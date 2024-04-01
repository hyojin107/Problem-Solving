import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");

        int min = 1_000_000;
        int max = -1_000_000;
        for (int i = 0; i < cnt; i++) {
            if (max < Integer.parseInt(nums[i])) {
                max = Integer.parseInt(nums[i]);
            }
            if (min > Integer.parseInt(nums[i])) {
                min = Integer.parseInt(nums[i]);
            }
        }
        System.out.println(min + " " + max);
    }
}
