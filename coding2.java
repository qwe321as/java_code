import java.util.ArrayList;
import java.util.List;

public class coding2 {

    int success = 0;
    int fail = 0;

    int[] pogi1 = { 1, 2, 3, 4, 5 };
    int[] pogi2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
    int[] pogi3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

    public void yeji() {
        System.out.println("1234");
    }

    public int test1(int n) {
        n = n + 1;
        return n;
    }

    public int[] solution(int[] answers) {
        int[] count = new int[3];
        for (int n = 0; n < count.length; n++) {
            if (answers[n] == pogi1[n % 5]) {
                count[0]++;
            }
            if (answers[n] == pogi2[n % 8]) {
                count[1]++;
            }
            if (answers[n] == pogi3[n % 10]) {
                count[2]++;
            }
        }
        int max = Math.max(count[0], Math.max(count[1], count[2]));

        List<Integer> list = new ArrayList<>();
        if (max == count[0]) {
            list.add(1);
        }
        if (max == count[1]) {
            list.add(2);
        }
        if (max == count[2]) {
            list.add(3);
        }
        int[] answer = new int[list.size()];
        for (int a = 0; a < list.size(); a++) {
            answer[a] = list.get(a);
        }

        return answer;
    }

    public static void main(String[] args) {
        coding2 co = new coding2();
        co.yeji();
        co.test1(2);
        System.out.println(co.test1(2));
        int[] qusteton = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        for (int i : co.solution(qusteton)) {
            System.out.println(co.solution(qusteton));

        }
    }

}
