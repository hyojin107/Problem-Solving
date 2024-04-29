import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int M;
    private static int[] arr;
    private static int S;
    private static int[] out;

    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        String[] arrInput = br.readLine().split(" ");
        S = Integer.parseInt(inputs[1]);
        int N = Integer.parseInt(inputs[0]);

        arr = new int[N];
        out = new int[N];
        for (int i = 0; i < Integer.parseInt(inputs[0]); i++) {
            arr[i] = Integer.parseInt(arrInput[i]);
        }

        for (int i = 1; i <= N; i++) {
            M = i;
            out = new int[i];
            comb(0, 0);
        }
        System.out.println(count);
    }

    private static void comb(int start, int cnt) {
        if (cnt == M) {
            int sum = 0;
            for (int i = 0; i < out.length; i++) {
                sum += arr[out[i]];
            }
            if (sum == S) {
                count += 1;
            }
            return;
        }

        for (int i = start; i < arr.length; i++) {
            out[cnt] = i;
            comb(i + 1, cnt + 1);
        }
    }

}