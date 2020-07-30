package com.eliteams.quick4j.test.dao;



    import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;

public class Test17 {
        public static void main(String[] args)
        {
            JButton btn1 = new JButton("Button-1");
            btn1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    System.out.println("Button-1 pressed");
                }
            });
            JButton btn2 = new JButton("Button-2");
            btn2.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    System.out.println("Button-2 pressed");
                }
            });

            JPanel p = new JPanel();
            p.add(btn1);
            p.add(btn2);

            JFrame f = new JFrame();

//把GlassPane显示出来，拦截鼠标事件
            MouseInputListener ml = new MouseInputAdapter() {};
            f.getGlassPane().addMouseListener(ml);
            f.getGlassPane().addMouseMotionListener(ml);
            f.getGlassPane().setVisible(true);

            f.getContentPane().add(p, BorderLayout.CENTER);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        }
    }



