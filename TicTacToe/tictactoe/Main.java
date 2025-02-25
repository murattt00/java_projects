package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Board board = new Board();

        System.out.println(board);
        while (!board.isEnded()) {

            int player = board.getCurrentPlayer();
            int row = 0;
            int col = 0;
            boolean invaledRow;
            boolean invaledCol;
            do {
            System.out.print("Player " + player + " enter row number:");
                try {
                    row = Integer.valueOf(reader.nextLine());
                    invaledRow = false;
                }catch (NumberFormatException nfe){
                    System.out.println("Invaled Integer");
                    invaledRow = true;
                }
            }while (invaledRow);

            do {
                System.out.print("Player " + player + " enter column number:");
                try {
                    col = Integer.valueOf(reader.nextLine());
                    invaledCol = false;
                } catch (NumberFormatException nfe) {
                    System.out.println("Invaled Integer");
                    invaledCol = true;
                }
            }while (invaledCol);
            try {
                board.move(row, col);
            }catch (InvalidMoveException ime){
                System.out.println(ime.getMessage());
            }
            System.out.println(board);
        }
        reader.close();
    }


}
