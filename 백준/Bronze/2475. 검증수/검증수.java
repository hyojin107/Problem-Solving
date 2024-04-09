import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int num1 = Integer.parseInt(nums[0]) * Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]) * Integer.parseInt(nums[1]);
        int num3 = Integer.parseInt(nums[2]) * Integer.parseInt(nums[2]);
        int num4 = Integer.parseInt(nums[3]) * Integer.parseInt(nums[3]);
        int num5 = Integer.parseInt(nums[4]) * Integer.parseInt(nums[4]);
        System.out.println((num1 + num2 + num3 + num4 + num5) % 10);
    }
}
