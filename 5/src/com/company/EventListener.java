package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class EventListener implements ActionListener {
    //поля для получения данных полей
    public void actionPerformed(ActionEvent e) {
        Do d = new Do();
        d.setVisible(true);
        switch (e.getActionCommand()) {
            case "Выполнить":
                if (MainWindow.task2RadioButton.isSelected()) { //Если выбрано 2 задание
                    TaskBC stroka = new TaskBC(MainWindow.text.getText());
                    d.label2.setText(stroka.getTaskB());
                } else if (MainWindow.task1RadioButton.isSelected()) { //Если выбрано 1 задание
                    TaskA stroka = new TaskA(MainWindow.digits.getText());
                    d.label2.setText(stroka.getTaskA());
                }
                else{ //Если выбрано 3 задание
                    TaskBC stroka = new TaskBC(MainWindow.text2.getText());
                    d.label2.setText(stroka.getTaskC());
                }
                break;
            //если была нажата кнопка "Save"
            case "Сохранить":
                WorkFile sv = new WorkFile();
                if (MainWindow.task2RadioButton.isSelected()) {
                    d.setVisible(false);
                    sv.writeFile(d.label2.getText(), MainWindow.text1.getText());
                    if (!sv.getTrace().equals("")) {
                        d.setVisible(false);
                        JOptionPane.showMessageDialog(null, sv.getTrace());
                        sv.setTrace("");
                    }
                } else if (MainWindow.task3RadioButton.isSelected()) {
                    try {
                        sv.writeFile(d.label2.getText(), MainWindow.text1.getText());
                        if (!sv.getTrace().equals("")) {
                            d.setVisible(false);
                            JOptionPane.showMessageDialog(null, sv.getTrace());
                            sv.setTrace("");
                        }
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                } else {
                    sv.writeFile(d.label2.getText(), MainWindow.text1.getText());
                    if (!sv.getTrace().equals("")) {
                        d.setVisible(false);
                        JOptionPane.showMessageDialog(null, sv.getTrace());
                        sv.setTrace("");
                    }
                }
                break;
        }
        //если была нажата кнопка "Open"
        switch (e.getActionCommand()) {
            case "Открыть":
                WorkFile so = new WorkFile();

                if (MainWindow.task2RadioButton.isSelected() == true) {
                    try {
                        String path = MainWindow.text3.getText();
                        String text;
                        text = WorkFile.loadSFile(path);
                        TaskBC stroka = new TaskBC(text);
                        d.label2.setText(stroka.getTaskB());
                        if (!so.getTrace().equals("")) {
                            d.setVisible(false);
                            JOptionPane.showMessageDialog(null, so.getTrace());
                            so.setTrace("");
                        }
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                } else if (MainWindow.task3RadioButton.isSelected() == true) {
                    try {
                        String path = MainWindow.text3.getText();
                        String text = null;
                        text = WorkFile.loadSFile(path);
                        TaskBC stroka = new TaskBC(text);
                        d.label2.setText(stroka.getTaskC());
                        if (!so.getTrace().equals("")) {
                            d.setVisible(false);
                            JOptionPane.showMessageDialog(null, so.getTrace());
                            so.setTrace("");
                        }
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                } else {
                    try {
                        String path = MainWindow.text3.getText();
                        String text = null;
                        text = WorkFile.loadSFile(path);
                        TaskA stroka = new TaskA(text);
                        d.label2.setText(stroka.getTaskA());
                        if (!so.getTrace().equals("")) {
                            d.setVisible(false);
                            JOptionPane.showMessageDialog(null, so.getTrace());
                            so.setTrace("");
                        }
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
                break;
        }

        switch (e.getActionCommand()) {
            case "Выполнить по ум.":

                if (MainWindow.task2RadioButton.isSelected()) {
                    TaskBC stroka = new TaskBC();
                    d.label2.setText(stroka.getTaskB());
                } else if (MainWindow.task1RadioButton.isSelected()) {
                    TaskA stroka = new TaskA();
                    d.label2.setText(stroka.getTaskA());
                } else {
                    TaskBC stroka = new TaskBC();
                    d.label2.setText(stroka.getTaskC());
                }
                break;
        }
    }
}