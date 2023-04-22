import java.util.*;

public class ClubManager {
    public static void turnAwayMembers(int[] clubScores, int m) {
        int n = clubScores.length;
        boolean[] turnAway = new boolean[n];
        int membersTurnedAway = 0;
        Arrays.fill(turnAway, false);

        for (int i = 0; i < n - 1; i++) {

            if (clubScores[i] < clubScores[i + 1]) {

                turnAway[i] = true;
                membersTurnedAway++;
                System.out.print(clubScores[i + 1] + " ");

                if (membersTurnedAway == m) {
                    break;
                }

                int j = i;
                while (j > 0 && clubScores[j - 1] > clubScores[j]) {

                    turnAway[j - 1] = true;
                    membersTurnedAway++;

                    if (membersTurnedAway == m) {
                        break;
                    }

                    j--;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int k = scn.nextInt();
        int n = scn.nextInt();
        int[] clubScores = new int[k];
        for (int i = 0; i < k; i++) {
            clubScores[i] = scn.nextInt();
        }

        turnAwayMembers(clubScores, n);
    }
}