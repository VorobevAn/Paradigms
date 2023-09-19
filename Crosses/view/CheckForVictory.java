package view;

import model.Field;

public class CheckForVictory {
    Field field = new Field();

    public CheckForVictory() {
        this.field = field;
    }

    public boolean finish() {
        String[][] a = field.getField();
        if (a[0][0] == "0" && a[0][1] == "0" && a[0][2] == "0" || a[0][0] == "x" && a[0][1] == "x" && a[0][2] == "x") {
            return true;
        }
        else if (a[1][0] == "0" && a[1][1] == "0" && a[1][2] == "0" || a[1][0] == "x" && a[1][1] == "x" && a[1][2] == "x") {
            return true;
        }
        else if (a[2][0] == "0" && a[2][1] == "0" && a[2][2] == "0" || a[2][0] == "x" && a[2][1] == "x" && a[2][2] == "x") {
            return true;
        }
        else if (a[0][0] == "0" && a[1][0] == "0" && a[2][0] == "0" || a[0][0] == "x" && a[1][0] == "x" && a[2][0] == "x") {
            return true;
        }
        else if (a[1][0] == "0" && a[1][1] == "0" && a[2][1] == "0" || a[1][0] == "x" && a[1][1] == "x" && a[2][1] == "x") {
            return true;
        }
        else if (a[2][0] == "0" && a[1][2] == "0" && a[2][2] == "0" || a[2][0] == "x" && a[1][2] == "x" && a[2][2] == "x") {
            return true;
        }
        else if (a[0][0] == "0" && a[1][1] == "0" && a[2][2] == "0" || a[0][0] == "x" && a[1][1] == "x" && a[2][2] == "x") {
            return true;
        }
        else if (a[0][2] == "0" && a[1][1] == "0" && a[2][0] == "0" || a[0][2] == "x" && a[1][1] == "x" && a[2][0] == "x") {
            return true;
        }
        return false;
    }
}
