import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static int[] arr;
    private static int[] out;
    private static int m;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        m = Integer.parseInt(inputs[1]);
        out = new int[m];

        arr = new int[Integer.parseInt(inputs[0])];
        for (int i = 1; i <= arr.length; i++) {
            arr[i-1] = i;
        }
        comb(0, 0);
        System.out.println(sb.toString());
    }

    public static void comb(int start, int cnt) {
        if (cnt == m) {
            for (int i = 0; i < out.length; i++) {
                sb.append(arr[out[i]]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < arr.length; i++) {
            out[cnt] = i;
            comb(i + 1, cnt + 1);
        }
    }

}
