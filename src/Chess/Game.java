package Chess;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Deque<Player> players = new LinkedList<>();
    Player winner;
}
