import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] emergency = {30, 10, 23, 6, 100};
        System.out.println(Arrays.toString(solution(emergency)));
    }
    public static int[] solution(int[] emergency){

        int[] sort = new int[emergency.length];
        int[] answer = new int[emergency.length];

        for(int i=0; i<=emergency.length-1; i++) {
            sort[i]=emergency[i];
        }

        Arrays.sort(sort);

        for(int i=0; i<=emergency.length-1; i++) {
            for(int j=0; j<=emergency.length-1; j++) {
                if(sort[i]==emergency[j]) {
                    answer[j]=emergency.length-i;
                }
            }
        }
        return answer;
    }
}