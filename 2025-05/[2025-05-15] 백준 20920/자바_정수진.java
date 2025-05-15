import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class 자바_정수진 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //해시맵 사용(딕셔너리처럼 사용)
        Map<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() < M) continue;
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            //해시맵에 단어와 빈도수를 저장(없는경우 0반환)
        }

        //리스트로 변환
        List<String> wordList = new ArrayList<>(wordMap.keySet());

        //Comparator 오버라이드(재정의)
        //정렬 조건: 빈도수 -> 길이 -> 알파벳 순
        wordList.sort((w1, w2) -> {
            int freq1 = wordMap.get(w1);
            int freq2 = wordMap.get(w2);
            if (freq1 != freq2) {
                return Integer.compare(freq2, freq1); //빈도 높은 순
            }
            if (w1.length() != w2.length()) {
                return Integer.compare(w2.length(), w1.length()); //길이 긴 순
            }
            return w1.compareTo(w2); //사전순
        });

        for (String word : wordList) {
            bw.write(word);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
