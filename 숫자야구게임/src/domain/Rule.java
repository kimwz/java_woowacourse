package domain;

import java.util.ArrayList;

public class Rule {
    public static int[] ballStrike(ArrayList<Integer> comNum, ArrayList<Integer> userNum) {
        int[] ballStrike = compare(comNum, userNum);
        Output.outputBallStrike(ballStrike);
        return ballStrike;
    }

    public static int[] compare(ArrayList<Integer> comNum, ArrayList<Integer> userNum) {
        int[] ballStrike = new int[2];
        for (int i = 0; i < comNum.size(); i++) {
            if (comNum.get(i) == userNum.get(i)) {
                ballStrike[1] += 1;
                continue;
            } else if (comNum.contains(userNum.get(i))) {
                ballStrike[0] += 1;
            }
        }
        return ballStrike;
    }
}
