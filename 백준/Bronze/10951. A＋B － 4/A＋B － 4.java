import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();
        while ((str = br.readLine()) != null) {
            String[] nums = str.split(" ");
            sb.append(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1])).append("\n");
        }
        System.out.println(sb);
    }
}
