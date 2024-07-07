import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < cnt; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }

        int lastNum = 0;
        int h = 0;
        for (int i = 0; i < cnt; i++) {
            int lastStack = stack.pop();
            if (lastStack > lastNum) {
                lastNum = lastStack;
                h++;
            }
        }
        System.out.println(h);
    }
}
