import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] asc = new int[]{1,2,3,4,5,6,7,8};
        int[] desc = new int[]{8,7,6,5,4,3,2,1};
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (isSame(nums, asc)) System.out.println("ascending");
        else if (isSame(nums, desc)) System.out.println("descending");
        else System.out.println("mixed");
    }

    private static boolean isSame(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
