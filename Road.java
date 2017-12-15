package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Road extends JPanel implements ActionListener{
    Timer timer = new Timer(20 , this);
    Image img = new ImageIcon("res/road.jpg").getImage(); // Помещаем картинку на панель (в блокноте всё написано
    Player_car p = new Player_car();//Создали обект машину на в класе дорога
    public Road(){
        timer.start();
        addKeyListener(new myKeyAdapter());//Сделали что-бы обработка событий запускалась на дороге потомучто он приват
        setFocusable(true);//Сделали что-бы пр нажатими был фокус
    }
    //Обработка событий
    private class myKeyAdapter extends KeyAdapter{
        //нажимаем на право лево
        public void keyPressed(KeyEvent e){
            p.keyPressed(e);
        }
        //отпускаем
        public void keyReleased(KeyEvent e){
            p.ketReleased(e);
        }
    }

    public void paint(Graphics g){
        g = (Graphics2D) g ;//Grapgics g тожэ самое что и Grapgics 2g и что бы методы работали мы это написали

        g.drawImage(img , p.layer1 , 0 , null);
        g.drawImage(img , p.layer2 , 0 , null);// рисует картинку с кординатами 0 . 0 рисует на g (2д графика) дорогу
        g.drawImage(p.img , p.x, p.y,null);//Нарисовали машину  с кординатами задаными в том класе

    }


    public void actionPerformed(ActionEvent e) {
        p.move();//Заставлюет двигатся
        repaint();//Вызывает paint;
    }
}
