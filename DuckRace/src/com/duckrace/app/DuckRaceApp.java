package com.duckrace.app;

import com.duckrace.Board;
import com.duckrace.Reward;

import java.util.Scanner;
import static com.duckrace.Reward.*;

/*
 * Application controller. Directs overal flow of the application.
 * and prompts user for inputs, then "pases" those inputs into the System.
 */

public class DuckRaceApp {
    private final Board board = new Board();
    private final Scanner scanner = new Scanner(System.in);

    public void execute() {
        welcome();
        showBoard();
        int id = promptForID();
        Reward reward = promptForReward();
        updateBoard(id, reward);
        showBoard();

    }

    private void updateBoard(int id, Reward reward) {
        board.update(id, reward);
    }

    private Reward promptForReward() {
        Reward reward = null;

        boolean validInput = false;
        while(!validInput) {
            System.out.println("Please enter your choice of [D]ebit card or [P]rizes: ");
            String input = scanner.nextLine().trim().toUpperCase();
            if(input.matches("D|P")) {
                validInput = true;
                reward = (input.equals("D")) ? DEBIT_CARD : PRIZES;  // ternary

            }

        }
        return reward;
    }

    private int promptForID() {
        int id = 0;

        boolean validInput = false;
        while(!validInput) {
            System.out.print("Please enter the winner's ID [1-16]");  // don't hardcode the 16
            String input = scanner.nextLine();  // BLOCKS for input, i.e., the Enter key
            if(input.matches("\\d{1,2}")) {  // any digit, one or two times


            }

        }

        return id;
    }

    private void showBoard() {
        board.show();
    }

    private void welcome() {
        System.out.println("-  *  -  *  -  *  -    *  -    *  -  *    -  *  -  *    -  *  -  *  - \n");
        System.out.println("W  E  L  C  O  M  E    T  O    T  H  E    D  U  C  K    R  A  C  E  !\n");
        System.out.println("-  *  -  *  -  *  -    *  -    *  -  *    -  *  -  *    -  *  -  *  -");

    }
}
