package java08_clean_code_and_refactoring.exercise;

public class Refactoring {

    public static final String SUBTRACTION = "-";

    public static String getScore(String player1Name, String player2Name, int pointPlayer1, int pointPlayer2) {
        String score = "";
        if (pointPlayer1 == pointPlayer2) {
            score = evenly(pointPlayer1);
        } else if (pointPlayer1 >= 4 || pointPlayer2 >= 4) {
            score = scoreGreaterThan4(pointPlayer1, pointPlayer2);
        } else {
            score = notEvenly(pointPlayer1, pointPlayer2, score);
        }
        return score;
    }

    public static String evenly(int pointPlayer1) {
        String score;
        switch (pointPlayer1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    public static String scoreGreaterThan4(int pointPlayer1, int pointPlayer2) {
        String score;
        int result = pointPlayer1 - pointPlayer2;

        if (result == 1) {
            score = "Advantage player1";
        } else if (result == -1) {
            score = "Advantage player2";
        } else if (result >= 2) {
            score = "Win for player1";
        } else score = "Win for player2";
        return score;
    }

    public static String notEvenly(int pointPlayer1, int pointPlayer2, String score) {
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = pointPlayer1;
            } else {
                score += SUBTRACTION;
                tempScore = pointPlayer2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }


}
