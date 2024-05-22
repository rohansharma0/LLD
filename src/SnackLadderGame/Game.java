package SnackLadderGame;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> players = new LinkedList<>();
    Player winner;

    public Game(){
        initializeGame();
    }
    public void startGame() {
        while (winner == null){
           //check whose turn now
           Player playerTurn = findPlayerTurn();
           System.out.println("Player turn is : " + playerTurn.id + " current position is: " + playerTurn.currentPosition);

           //roll the dice
           int diceNumber = dice.rollDice();

           //get the new position
            int playerNewPosition = playerTurn.currentPosition + diceNumber;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currentPosition = playerNewPosition;

            System.out.println("Player turn is : " + playerTurn.id + " new Position is : " + playerNewPosition);

            //check winner
            if(playerNewPosition >= board.cells.length * board.cells.length-1){
                winner = playerTurn;
            }
        }
        System.out.println("WINNER is : " +winner.id);
    }

    private Player findPlayerTurn() {
        Player player = players.removeFirst();
        players.addLast(player);
        return player;
    }

    private int jumpCheck(int playerNewPosition) {
        if(playerNewPosition > board.cells.length * board.cells.length-1){
            return  playerNewPosition;
        }
        Cell cell = board.getCell(playerNewPosition);
        if(cell.jump != null && cell.jump.start == playerNewPosition){
            String jumpBy = (cell.jump.start < cell.jump.end) ? "Ladder" : "Snake";
            System.out.println("Jump done by : " + jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;
    }

    private void initializeGame() {
        board = new Board(10 , 5 , 4);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("Rohan" , 0);
        Player player2 = new Player("Rini" , 0);
        this.players.add(player1);
        this.players.add(player2);
    }
}
