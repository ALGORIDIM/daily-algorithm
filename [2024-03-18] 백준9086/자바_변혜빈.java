import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		String current;

		for (int i = 0; i < count; i++) {
			current = br.readLine();
			result.append(current.charAt(0))
			.append(current.charAt(current.length() -1))
			.append("\n");
		}

		bw.write(result.toString());

		br.close();
		bw.flush();
		bw.close();;
    }
}
