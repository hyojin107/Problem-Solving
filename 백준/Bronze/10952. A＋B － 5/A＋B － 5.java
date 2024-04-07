import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums =  br.readLine();
        StringBuilder sb = new StringBuilder();
        while (Integer.parseInt(nums.split(" ")[0]) != 0 && Integer.parseInt(nums.split(" ")[1]) != 0) {
            sb.append(Integer.parseInt(nums.split(" ")[0]) + Integer.parseInt(nums.split(" ")[1])).append("\n");
            nums = br.readLine();
        }
        System.out.println(sb);
    }
}
