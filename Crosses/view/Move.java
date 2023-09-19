package view;

import model.Field;

import java.util.Random;

public class Move {
    Field field = new Field();
    Random random = new Random();

    public void move() {
        int i = random.nextInt(3);
        int j = random.nextInt(3);
        while (field.getField()[i][j].equals("x") || field.getField()[i][j].equals("0")) {
            i = random.nextInt(3);
            j = random.nextInt(3);
        }
        field.setField()[i][j] = "0";
    }


    public void miMove(int index) {
        switch (index) {
            case 1:
                field.setField()[0][0] = "x";
                break;
            case 2:
                field.setField()[0][1] = "x";
                break;
            case 3:
                field.setField()[0][2] = "x";
                break;
            case 4:
                field.setField()[1][0] = "x";
                break;
            case 5:
                field.setField()[1][1] = "x";
                break;
            case 6:
                field.setField()[1][2] = "x";
                break;
            case 7:
                field.setField()[2][0] = "x";
                break;
            case 8:
                field.setField()[2][1] = "x";
                break;
            case 9:
                field.setField()[2][2] = "x";
                break;
            default:
                System.out.println("ведите коректное число");
        }
    }
}
