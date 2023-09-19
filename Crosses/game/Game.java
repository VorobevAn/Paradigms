package game;

import view.CheckForVictory;
import view.Move;
import view.PrintFiled;

import java.util.Scanner;

public class Game {
    public String start() {
        PrintFiled printFiled = new PrintFiled();
        Move move = new Move();
        Scanner scanner = new Scanner(System.in);
        CheckForVictory checkForVictory = new CheckForVictory();
        printFiled.printField();
        while (!checkForVictory.finish()) {
            System.out.println("Выберете поле от 1 до 9 ");
            move.miMove(scanner.nextInt());
            printFiled.printField();
            if (checkForVictory.finish()) {
                return "Вы победили";
            }
            System.out.println("Ход компьютера");
            move.move();
            printFiled.printField();
            checkForVictory.finish();

        }
        return "проигрыш";
    }
}

