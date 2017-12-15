package com.company;

import javax.swing.* ;

public class Main {

    public static void main(String[] args) {
        JFrame f = new JFrame("Java F1");//Создали окашко
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Операция закрывания
        f.setSize(800 , 560);//размер окна
        f.add(new Road());// поместили панель в главное окно
        f.setVisible(true);//делаем видимим

    }
}
