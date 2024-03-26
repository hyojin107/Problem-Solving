import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[9];
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            nums[i] = num;
        }
        int max = 0, idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(++idx);
    }
}
