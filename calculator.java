package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator {
//    JFrame compponents declraions start here  :
    JFrame frame = new JFrame("calculator");
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JLabel jLabel3 = new JLabel();
    JButton exit = new JButton();
    JButton clear = new JButton();
    JButton subtraction = new JButton();
    JButton multiplication = new JButton();
    JButton division = new JButton();
    JButton addition = new JButton();

    //Create a constructor
    calculator(){
        //Label 1 for first value
        jLabel1.setFont(new Font("Segoe UI", 1, 24));
        jLabel1.setText("First Value :");
        frame.add(jLabel1);
        jLabel1.setBounds(280, 31, 140, 34);

        //Label 2 for Second value
        jLabel2.setFont(new Font("Segoe UI", 1, 24));
        jLabel2.setText("Second Value :");
        frame.add(jLabel2);
        jLabel2.setBounds(280, 78, 164, 34);

        //JTextField 1  for first value
        jTextField1.setFont(new Font("Segoe UI", 1, 24));
        jTextField1.setToolTipText("Enter First Value Here");
        jTextField1.setName("txtn1");
        frame.add(jTextField1);
        jTextField1.setBounds(495, 31, 220, 40);

        //JTextField 2  for first value
        jTextField2.setFont(new Font("Segoe UI", 1, 24));
        jTextField2.setToolTipText("Enter Second Value Here");
        jTextField2.setName("txtn2");
        frame.add(jTextField2);
        jTextField2.setBounds(495, 88, 220, 40);

        //Label 3 for displaying answer or errors
        jLabel3.setFont(new Font("Segoe UI", 1, 24));
        frame.add(jLabel3);
        jLabel3.setBounds(370, 238, 420, 34);

        //exit button for exit the form
        exit.setBackground(new Color(153, 204, 255));
        exit.setFont(new Font("Segoe UI", 1, 24));
        exit.setText("Exit");
        exit.setToolTipText("Exit");
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                frame.dispose();
            }
        });
       frame.add(exit);
        exit.setBounds(789, 161, 80, 41);

        //clear button for clear the jTextField text
        clear.setBackground(new Color(153, 204, 255));
        clear.setFont(new Font("Segoe UI", 1, 24));
        clear.setText("Clear");
        clear.setToolTipText("Clear");
        clear.setCursor(new Cursor(Cursor.HAND_CURSOR));
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField1.requestFocus();
                jTextField1.setText("");
                jTextField2.setText("");
                jLabel3.setText("");
                jTextField1.setBackground(Color.white);
                jTextField2.setBackground(Color.white);
            }
        });
       frame.add(clear);
        clear.setBounds(680, 161, 94, 41);

        //Arithmetic operations start here

        //1.Subtraction(-) :
        subtraction.setBackground(new Color(153, 204, 255));
        subtraction.setFont(new Font("Segoe UI", 1, 24));
        subtraction.setText("Subtraction");
        subtraction.setToolTipText("Subtraction");
        subtraction.setCursor(new Cursor(Cursor.HAND_CURSOR));
        subtraction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int n1=0;
                int n2=0;
                //condition for if first textbox is empty
                if(!jTextField1.getText().equals("")){
                    n1 = Integer.parseInt(jTextField1.getText());
                    jTextField1.setBackground(Color.white);
                }
                else{
                    jTextField1.setBackground(Color.red);
                }
                //condition for if second textbox is empty
                if(!jTextField2.getText().equals("")){
                    n2 = Integer.parseInt(jTextField2.getText());
                    jTextField2.setBackground(Color.white);
                }
                else{
                    jTextField2.setBackground(Color.red);
                }

                //Addtion operation start here
                if(!jTextField1.getText().equals("")&&!(jTextField2.getText().equals(""))){
                    int ans = n1 - n2;
                    jLabel3.setText("Your Ans Is : "+jTextField1.getText()+" - "+jTextField2.getText()+" = "+ans);
                }else{
                    jLabel3.setText("Required to be entering both values");
                }
            }
        });
        frame.add(subtraction);
        subtraction.setBounds(153, 161, 169, 41);

        //2.Multiplication(*) :
        multiplication.setBackground(new Color(153, 204, 255));
        multiplication.setFont(new Font("Segoe UI", 1, 24));
        multiplication.setText("Multiplication");
        multiplication.setToolTipText("multiplication");
        multiplication.setCursor(new Cursor(Cursor.HAND_CURSOR));

        multiplication.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int n1=0;
                int n2=0;
                //condition for if first textbox is empty
                if(!jTextField1.getText().equals("")){
                    n1 = Integer.parseInt(jTextField1.getText());
                    jTextField1.setBackground(Color.white);
                }
                else{
                    jTextField1.setBackground(Color.red);
                }
                //condition for if second textbox is empty
                if(!jTextField2.getText().equals("")){
                    n2 = Integer.parseInt(jTextField2.getText());
                    jTextField2.setBackground(Color.white);
                }
                else{
                    jTextField2.setBackground(Color.red);
                }

                //Addtion operation start here
                if(!jTextField1.getText().equals("")&&!(jTextField2.getText().equals(""))){
                    int ans = n1 * n2;
                    jLabel3.setText("Your Ans Is : "+jTextField1.getText()+" X "+jTextField2.getText()+" = "+ans);
                }else{
                    jLabel3.setText("Required to be entering both values");
                }
            }
        });
        frame.add(multiplication);
        multiplication.setBounds(335, 161, 195, 41);

        //3.Division(/) :
        division.setBackground(new Color(153, 204, 255));
        division.setFont(new Font("Segoe UI", 1, 24));
        division.setText("Division");
        division.setToolTipText("division");
        division.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));

        division.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int n1=0;
                int n2=0;
                //condition for if first textbox is empty
                if(!jTextField1.getText().equals("")){
                    n1 = Integer.parseInt(jTextField1.getText());
                    jTextField1.setBackground(Color.white);
                }
                else{
                    jTextField1.setBackground(Color.red);
                }
                //condition for if second textbox is empty
                if(!jTextField2.getText().equals("")){
                    n2 = Integer.parseInt(jTextField2.getText());
                    jTextField2.setBackground(Color.white);
                }
                else{
                    jTextField2.setBackground(Color.red);
                }

                //Addtion operation start here
                try{
                    if(!jTextField1.getText().equals("")&&!(jTextField2.getText().equals(""))){
                        int ans = n1 / n2;
                        jLabel3.setText("Your Ans Is : "+jTextField1.getText()+" / "+jTextField2.getText()+" = "+ans);
                    }else{
                        jLabel3.setText("Required to be entering both values");
                    }
                }catch(Exception e){
                    jLabel3.setText(jTextField1.getText()+" is cannot divided by zero");
                }
            }
        });
        frame.add(division);
        division.setBounds(546, 161, 125, 41);

        //4.Addition(+) :
        addition.setBackground(new Color(153, 204, 255));
        addition.setFont(new Font("Segoe UI", 1, 24));
        addition.setText("Addtion");
        addition.setToolTipText("addition");
        addition.setCursor(new Cursor(Cursor.HAND_CURSOR));

        addition.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int n1=0;
                int n2=0;
                //condition for if first textbox is empty
                if(!jTextField1.getText().equals("")){
                    n1 = Integer.parseInt(jTextField1.getText());
                    jTextField1.setBackground(Color.white);
                }
                else{
                    jTextField1.setBackground(Color.red);
                }
                if(!jTextField2.getText().equals("")){
                    n2 = Integer.parseInt(jTextField2.getText());
                    jTextField2.setBackground(Color.white);
                }
                else{
                    jTextField2.setBackground(Color.red);
                }

                //Addtion operation start here
                if(!jTextField1.getText().equals("")&&!(jTextField2.getText().equals(""))){
                    int ans = n1 + n2;
                    jLabel3.setText("Your Ans Is : "+jTextField1.getText()+" + "+jTextField2.getText()+" = "+ans);
                }else{
                    jLabel3.setText("Required to be entering both values");
                }
            }
        });
       frame.add(addition);
       addition.setBounds(15, 161, 130, 41);

        //Define Some JFrame Properties :
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        frame.setLocation(450, 200);
        frame.setSize(950,400);
        frame.getContentPane().setBackground(new Color(153, 170, 255, 255));
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new calculator();
    }
}
