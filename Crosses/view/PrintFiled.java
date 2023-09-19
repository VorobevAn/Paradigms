package view;

import model.Field;

public class PrintFiled {
    Field field = new Field();

    public void printField(){
        for (int i = 0; i < field.getField().length; i++) {
            for (int j = 0; j < field.getField()[i].length; j++) {
                System.out.print(" "+field.getField()[i][j]);
            }
            System.out.println();
        }
    }



}

