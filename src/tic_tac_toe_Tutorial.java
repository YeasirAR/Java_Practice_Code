import java.util.Scanner;

public class tic_tac_toe_Tutorial {
    public static void main(String[] args) {
        String[] board = new String[9];
        board[0] = " - ";
        board[1] = " - ";
        board[2] = " - ";
        board[3] = " - ";
        board[4] = " - ";
        board[5] = " - ";
        board[6] = " - ";
        board[7] = " - ";
        board[8] = " - ";
        String player = " X ";
        while (true) {

            show_board(board);
            take_chance(board, player);
            if (player == " X ") {
                player = " O ";
            } else {
                player = " X ";
            }
            if (check_draw(board)) {
                show_board(board);
                System.out.println("Match drawn");
                System.exit(0);
            }
            check_win(board);

        }
    }

    public static void show_board(String[] board) {
        System.out.println(board[0] + board[1] + board[2]);
        System.out.println(board[3] + board[4] + board[5]);
        System.out.println(board[6] + board[7] + board[8]);

    }

    public static void take_chance(String[] board, String player) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers from 1 to 9");
        int chance = sc.nextInt();

        if (chance > 0 && chance < 10) {
            if (board[chance - 1] == " - ") {
                board[chance - 1] = player;

            } else {
                take_chance(board, player);
            }


        } else {
            take_chance(board, player);
        }
    }

    public static boolean check_draw(String[] board) {
        for (String i : board) {
            if (i == " - ") {
                return false;
            }
        }
        return true;
    }

    public static void check_win(String[] board) {
        String[] pieces = new String[2];
        pieces[0] = " X ";
        pieces[1] = " O ";

        for (String piece : pieces) {
            if (board[0] == piece && board[1] == piece && board[2] == piece) {
                show_board(board);
                System.out.println(piece + " won");
                System.exit(0);
            }
            if (board[3] == piece && board[4] == piece && board[5] == piece) {
                show_board(board);
                System.out.println(piece + " won");
                System.exit(0);
            }
            if (board[6] == piece && board[7] == piece && board[8] == piece) {
                show_board(board);
                System.out.println(piece + " won");
                System.exit(0);
            }
            if (board[0] == piece && board[3] == piece && board[6] == piece) {
                show_board(board);
                System.out.println(piece + " won");
                System.exit(0);
            }
            if (board[1] == piece && board[4] == piece && board[7] == piece) {
                show_board(board);
                System.out.println(piece + " won");
                System.exit(0);
            }
            if (board[2] == piece && board[5] == piece && board[8] == piece) {
                show_board(board);
                System.out.println(piece + " won");
                System.exit(0);
            }
            if (board[0] == piece && board[4] == piece && board[8] == piece) {
                show_board(board);
                System.out.println(piece + " won");
                System.exit(0);
            }
            if (board[2] == piece && board[4] == piece && board[6] == piece) {
                show_board(board);
                System.out.println(piece + " won");
                System.exit(0);
            }


        }
    }
}