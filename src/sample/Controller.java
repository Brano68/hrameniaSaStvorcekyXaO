package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.util.Random;
import java.util.Timer;

public class Controller extends Main{
    public Button but1;
    public Button but2;
    public Button but3;
    public Button but4;
    public Button but5;
    public Button but6;
    public Button but7;
    public Button but8;
    public Button but9;
    public Button but10;
    public Button but11;
    public Button but12;
    public Button but13;
    public Button but14;
    public Button but15;
    public Button but16;
    public Pane platno;

    int[][] pole = new int[][] {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};


    public Controller(){

    }

    public void mix(){
        for(int i = 0; i < 19; i++){
            Random random = new Random();
            int cislo = random.nextInt(15)+1;
            switch (cislo){
                case 1:
                    click1(null);
                    break;
                case 2:
                    click2(null);
                    break;
                case 3:
                    click3(null);
                    break;
                case 4:
                    click4(null);
                    break;
                case 5:
                    click5(null);
                    break;
                case 6:
                    click6(null);
                    break;
                case 7:
                    click7(null);
                    break;
                case 8:
                    click8(null);
                    break;
                case 9:
                    click9(null);
                    break;
                case 10:
                    click10(null);
                    break;
                case 11:
                    click11(null);
                    break;
                case 12:
                    click12(null);
                    break;
                case 13:
                    click13(null);
                    break;
                case 14:
                    click14(null);
                    break;
                case 15:
                    click15(null);
                    break;
                case 16:
                    click16(null);
                    break;
            }
        }
    }

    public void click1(ActionEvent actionEvent) {
        zmenHodnotu(0, 1, but2);
        zmenHodnotu(1, 0, but5);
        zmenHodnotu(1, 1, but6);
    }

    public void click2(ActionEvent actionEvent) {
        zmenHodnotu(0, 0, but1);
        zmenHodnotu(1, 0, but5);
        zmenHodnotu(1, 1, but6);
        zmenHodnotu(1, 2, but7);
        zmenHodnotu(0, 2, but3);
    }

    public void click3(ActionEvent actionEvent) {
        zmenHodnotu(0, 2, but2);
        zmenHodnotu(1, 1, but6);
        zmenHodnotu(1, 2, but7);
        zmenHodnotu(1, 3, but8);
        zmenHodnotu(0, 3, but4);
    }

    public void click4(ActionEvent actionEvent) {
        zmenHodnotu(0, 2, but3);
        zmenHodnotu(1, 2, but7);
        zmenHodnotu(1, 3, but8);
    }

    public void click5(ActionEvent actionEvent) {
        zmenHodnotu(0, 0, but1);
        zmenHodnotu(0, 1, but2);
        zmenHodnotu(1, 1, but6);
        zmenHodnotu(2, 1, but10);
        zmenHodnotu(2, 0, but9);
    }

    public void click6(ActionEvent actionEvent) {
        zmenHodnotu(0, 0, but1);
        zmenHodnotu(0, 1, but2);
        zmenHodnotu(0, 2, but3);
        zmenHodnotu(1, 0, but5);
        zmenHodnotu(1, 2, but7);
        zmenHodnotu(2, 0, but9);
        zmenHodnotu(2, 1, but10);
        zmenHodnotu(2, 2, but11);
    }

    public void click7(ActionEvent actionEvent) {
        zmenHodnotu(0, 1, but2);
        zmenHodnotu(0, 2, but3);
        zmenHodnotu(0, 3, but4);
        zmenHodnotu(1, 2, but6);
        zmenHodnotu(1, 3, but8);
        zmenHodnotu(2, 1, but10);
        zmenHodnotu(2, 2, but11);
        zmenHodnotu(2, 3, but12);
    }

    public void click8(ActionEvent actionEvent) {
        zmenHodnotu(0, 2, but3);
        zmenHodnotu(0, 3, but4);
        zmenHodnotu(1, 2, but7);
        zmenHodnotu(2, 2, but11);
        zmenHodnotu(2, 3, but12);
    }

    public void click9(ActionEvent actionEvent) {
        zmenHodnotu(1, 0, but5);
        zmenHodnotu(1, 1, but6);
        zmenHodnotu(2, 1, but10);
        zmenHodnotu(3, 0, but13);
        zmenHodnotu(3, 1, but14);
    }

    public void click10(ActionEvent actionEvent) {
        zmenHodnotu(1, 0, but5);
        zmenHodnotu(1, 1, but6);
        zmenHodnotu(1, 2, but7);
        zmenHodnotu(2, 0, but9);
        zmenHodnotu(2, 2, but11);
        zmenHodnotu(3, 0, but13);
        zmenHodnotu(3, 1, but14);
        zmenHodnotu(3, 2, but15);
    }

    public void click11(ActionEvent actionEvent) {
        zmenHodnotu(1, 1, but6);
        zmenHodnotu(1, 2, but7);
        zmenHodnotu(1, 3, but8);
        zmenHodnotu(2, 1, but10);
        zmenHodnotu(2, 3, but12);
        zmenHodnotu(3, 1, but14);
        zmenHodnotu(3, 2, but15);
        zmenHodnotu(3, 3, but16);
    }

    public void click12(ActionEvent actionEvent) {
        zmenHodnotu(1, 2, but7);
        zmenHodnotu(1, 3, but8);
        zmenHodnotu(2, 2, but11);
        zmenHodnotu(3, 2, but15);
        zmenHodnotu(3, 3, but16);
    }

    public void click13(ActionEvent actionEvent) {
        zmenHodnotu(2, 0, but9);
        zmenHodnotu(2, 1, but10);
        zmenHodnotu(3, 1, but14);
    }

    public void click14(ActionEvent actionEvent) {
        zmenHodnotu(2, 0, but9);
        zmenHodnotu(2, 1, but10);
        zmenHodnotu(2, 2, but11);
        zmenHodnotu(3, 0, but13);
        zmenHodnotu(3, 2, but15);
    }

    public void click15(ActionEvent actionEvent) {
        zmenHodnotu(2, 1, but10);
        zmenHodnotu(2, 2, but11);
        zmenHodnotu(2, 3, but12);
        zmenHodnotu(3, 1, but14);
        zmenHodnotu(3, 3, but16);
    }

    public void click16(ActionEvent actionEvent) {
        zmenHodnotu(2, 2, but11);
        zmenHodnotu(2, 3, but12);
        zmenHodnotu(3, 2, but15);
    }

    private void zmenHodnotu(int suradnicaX, int suradnicaY, Button bt){
        if(pole[suradnicaX][suradnicaY] == 1){
            pole[suradnicaX][suradnicaY] = 0;
            bt.setText("X");
        }else{
            pole[suradnicaX][suradnicaY] = 1;
            bt.setText("O");
            //
        }
    }

}
