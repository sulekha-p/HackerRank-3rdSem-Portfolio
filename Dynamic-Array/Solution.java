import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        List<List<Integer>> seqList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<>());
        }

        int lastAnswer = 0;

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int idx = (x ^ lastAnswer) % n;

            if (type == 1) {
                seqList.get(idx).add(y);
            } else {
                lastAnswer = seqList.get(idx).get(y % seqList.get(idx).size());
                System.out.println(lastAnswer);
            }
        }

        sc.close();
    }
}