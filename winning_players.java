import java.util.*;
public class winning_players {
    public static int winningPlayerCount(int n, int[][] pick) {

        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        Set<Integer> winners = new HashSet<>();

        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];

            map.putIfAbsent(player, new HashMap<>());
            Map<Integer,Integer> colorMap = map.get(player);

            colorMap.put(color, colorMap.getOrDefault(color, 0) + 1);

            if (colorMap.get(color) >= player + 1) {
                winners.add(player);
            }
        }
        return winners.size();
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] pick = {
            {0,0},
            {1,0},
            {1,0},
            {2,1},
            {2,1},
            {2,0},
        };

        int result = winningPlayerCount(n, pick);
        System.out.println("Number of winning players:" + result);
    }
}