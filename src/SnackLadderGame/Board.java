package SnackLadderGame;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    public Board(int boardSize , int numberOfSnakes , int numberOfLadders){
        initializeCells(boardSize);
        addSnacksLadders(numberOfSnakes , numberOfLadders);
    }

    private void addSnacksLadders(int numberOfSnakes, int numberOfLadders) {
        while (numberOfSnakes > 0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1 , cells.length * cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1 , cells.length * cells.length-1);
            if(snakeTail >= snakeHead) continue;

            Jump snake = new Jump(snakeHead , snakeTail);

            Cell cell = getCell(snakeHead);
            cell.jump = snake;
            numberOfSnakes--;
        }
        while (numberOfLadders > 0){
            int ladderHead = ThreadLocalRandom.current().nextInt(1 , cells.length * cells.length-1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1 , cells.length * cells.length-1);
            if(ladderHead >= ladderTail) continue;

            Jump ladder = new Jump(ladderHead , ladderTail);

            Cell cell = getCell(ladderHead);
            cell.jump = ladder;
            numberOfLadders--;
        }
    }

    public Cell getCell(int pos) {
        int boardRow = pos / cells.length;
        int boardCol = pos % cells.length;
        return cells[boardRow][boardCol];
    }

    private void initializeCells(int boardSize) {
        cells = new Cell[boardSize][boardSize];
        for(int i = 0 ; i < boardSize ; i++){
            for(int j = 0 ; j< boardSize ;j++){
                cells[i][j] = new Cell();
            }
        }
    }
}
