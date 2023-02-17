import java.util.ArrayList;
import java.util.HashMap;

public class TournamentWinner {

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        HashMap<String, Integer> scores = new HashMap<String, Integer>();

        String winningTeam = "";

        for(int i = 0; i < competitions.size(); i++){
            String gameWinner = competitions.get(i).get(results.get(i) == 0 ? 1 : 0);
            scores.put(gameWinner, scores.getOrDefault(gameWinner, 0) + 3);
            winningTeam = scores.get(gameWinner) > scores.getOrDefault(winningTeam, 0) ? gameWinner : winningTeam;
        }


        return winningTeam;
    }
}
