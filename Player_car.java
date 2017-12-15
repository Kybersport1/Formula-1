package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Player_car {
    Image img = new ImageIcon("res/player2.png").getImage();//По старой схеме
    int v = 10 ;//Скорость
    int dv = 0 ;// Ускорение
    int layer1 = 0 ;//Кординаты первого слоя
    int layer2= 800;
    int x = 40 ; //Координаты на дороге
    int  y = 15; //Координаты на дороге
    public void move(){
        if (layer2-v <= 0 ){
            layer1 = 0 ;
            layer2 = 800 ;
        }else {
            layer1 -= v;// Что бы была илюзия дивгуящегося
            layer2 -= v;
        }
    }
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        //ход клвиши вправо
        if(key == KeyEvent.VK_DOWN){
            y+=30;
        }
        if(key == KeyEvent.VK_RIGHT){
            v+=5;
            x+=45;
        }
    }
    public void ketReleased(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_UP){
            y-=30;
        }
        if(key == KeyEvent.VK_LEFT){
            v-=5;
            x-=45;
        }
    }
}
