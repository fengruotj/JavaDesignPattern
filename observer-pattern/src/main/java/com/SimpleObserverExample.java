package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * locate com
 * Created by MasterTj on 2018/12/24.
 */
public class SimpleObserverExample {
    private JFrame jFrame;

    public void go(){
        jFrame=new JFrame();
        JButton jButton=new JButton("Should i do it? ");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Don't do it.");
            }
        });

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Come on do it .");
            }
        });

        jFrame.getContentPane().add(BorderLayout.CENTER,jButton);

        // 设置尺寸
        jFrame.setSize(500, 300);
        // JFrame在屏幕居中
        jFrame.setLocationRelativeTo(null);
        // JFrame关闭时的操作
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //显示JFrame
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleObserverExample example=new SimpleObserverExample();
        example.go();
    }
}
