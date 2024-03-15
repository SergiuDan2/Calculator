
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.Math;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.*;

class Test{
    static Logger logger = Logger.getLogger(Test.class.getName());
    static FileHandler fh;
    static void test(String abc){
        logger.setLevel(Level.FINE);
        try {
            fh = new FileHandler("Operatii.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.info(abc);

    }
}


public class calc {
    private JPanel Calculator;
    private JButton b7;
    private JButton b4;
    private JButton b1;
    private JButton negativ;
    private JButton b0;
    private JButton b2;
    private JButton b5;
    private JButton b8;
    private JButton punct;
    private JButton b3;
    private JButton b6;
    private JButton b9;
    private JButton egal;
    private JButton plus;
    private JButton minus;
    private JButton inm;
    private JButton imp;
    private JButton delete;
    private JButton clear;
    private JTextField textField1;
    private JList list1;
    private JLabel Istoric;
    private JButton radical;
    private JButton sqr;
    private JButton exp;
    private JButton ls;
    private JButton allclear;
    private JButton clearHistoryButton;
    private JLabel label;
    private JList list2;
    private JButton MSButton;
    private JButton mplus;
    private JButton mminus;
    private JButton clearMemoryButton;
    private JButton MRButton;
    private JComboBox from;
    private JComboBox to;
    private JButton c0;
    private JButton cpunct;
    private JButton c2;
    private JButton c1;
    private JButton c3;
    private JButton c4;
    private JButton c5;
    private JButton c6;
    private JButton c7;
    private JButton c8;
    private JButton c9;
    private JButton CClear;
    private JButton CDEL;
    private JButton jos;
    private JTextField cvalue;
    private JPanel currency;
    private JTextField result;
    private JPanel Temperature;
    private JPanel Standard;
    private JComboBox tfrom;
    private JComboBox tto;
    private JTextField tvalue;
    private JTextField tresult;
    private JButton tsemn;
    private JButton t0;
    private JButton tpunct;
    private JButton t1;
    private JButton t2;
    private JButton t3;
    private JButton t4;
    private JButton t5;
    private JButton t6;
    private JButton t7;
    private JButton t8;
    private JButton t9;
    private JButton tclear;
    private JButton tdel;
    private JCheckBox HEXCheckBox;
    private JCheckBox DECCheckBox;
    private JCheckBox OCTCheckBox;
    private JCheckBox BINCheckBox;
    private JTextField phex;
    private JTextField pdec;
    private JTextField poct;
    private JTextField pbin;
    private JButton pF;
    private JButton psemn;
    private JButton p0;
    private JButton PDEL;
    private JButton pE;
    private JButton p1;
    private JButton p2;
    private JButton p3;
    private JButton pD;
    private JButton p4;
    private JButton p5;
    private JButton p6;
    private JButton pC;
    private JButton p7;
    private JButton p8;
    private JButton p9;
    private JButton pB;
    private JButton PClear;
    private JButton pA;
    private JPanel Programmer;

    private double nr1 = 0.0;
    private double rez = 0.0;
    private int p = 0;
    private char math_operator;
    DefaultListModel<String> listModel = new DefaultListModel<>();
    DefaultListModel<String> listModel2 = new DefaultListModel<>();

    private void getOperator(String operatie) {
        math_operator = operatie.charAt(0);
        nr1 = Double.parseDouble(textField1.getText());
        if (operatie.charAt(0)=='-')
            label.setText(Double.toString(nr1) + "-");
        if (operatie.charAt(0)=='+')
            label.setText(Double.toString(nr1) + "+");
        if (operatie.charAt(0)=='/')
            label.setText(Double.toString(nr1) + "/");
        if (operatie.charAt(0)=='*')
            label.setText(Double.toString(nr1) + "*");
        textField1.setText("");
    }


    public calc() {
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton0;
                if (textField1.getText().equals("")) { // 0 pt butoane          // daca butonul 0 este primul caracter introdus in string, se va introduce automat si un '.', pentru
                    textField1.setText("0.");                                   // a evita numere gen 0x...(puteam face acest lucru si cu dezactivarea butoanelor)
                    //b0.setEnabled(false);
                }
                else{
                    buton0 = textField1.getText() + "0";
                    textField1.setText(buton0);
                }
                //b0.setEnabled(true);
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton1 = textField1.getText() + "1";     //restul butoanelor de la 1-9 doar scriu text in Text Field, netrebuind sa tratez nimic special
                textField1.setText(buton1);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton2 = textField1.getText() + "2";
                textField1.setText(buton2);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton3 = textField1.getText() + "3";
                textField1.setText(buton3);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton4 = textField1.getText() + "4";
                textField1.setText(buton4);
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton5 = textField1.getText() + "5";
                textField1.setText(buton5);
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton6 = textField1.getText() + "6";
                textField1.setText(buton6);
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton7 = textField1.getText() + "7";
                textField1.setText(buton7);
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton8 = textField1.getText() + "8";
                textField1.setText(buton8);
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton9 = textField1.getText() + "9";
                textField1.setText(buton9);
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals(""))            //pt. butonele care ne permit sa alegem operatia pe care dorim sa o efectuam, am dezactivat butonul, daca nu avem un numar
                    minus.setEnabled(false);                    // introdus, pentru a nu primi eroare de tipul out of string. Fiecare buton aplezeaza mai departe functia getOperator
                else {                                          // La apasarea fiecarui buton, se activeaza si butonul egal(care e dezactivat dupa fiecare apasare, printr-o variabila p,
                    String buton_inm = "-";                     // pentru a evita anumite bug-uri
                    getOperator(buton_inm);
                }
                minus.setEnabled(true);
                p = 0;
                egal.setEnabled(true);
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals(""))
                    plus.setEnabled(false);
                else {
                    String buton_inm = "+";
                    getOperator(buton_inm);
                }
                plus.setEnabled(true);
                p = 0;
                egal.setEnabled(true);
            }
        });
        inm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals(""))
                    inm.setEnabled(false);
                else {
                    String buton_inm = "*";
                    getOperator(buton_inm);
                }
                inm.setEnabled(true);
                p = 0;
                egal.setEnabled(true);
            }
        });
        imp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals(""))
                    imp.setEnabled(false);
                else {
                    String buton_inm = "/";
                    getOperator(buton_inm);
                }
                imp.setEnabled(true);
                p = 0;
                egal.setEnabled(true);
            }
        });
        
        egal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch ( math_operator ) {
                    case '-':
                        String str1;
                        rez = nr1 - Double.parseDouble(textField1.getText());
                        if (Double.parseDouble(textField1.getText())==0){
                            str1 = Double.toString(nr1) + "-" + "0.0" + "=" + Double.toString(rez);
                        }
                        else
                            str1 = Double.toString(nr1) + "-" + textField1.getText() + "=" + Double.toString(rez);      //butonul egal calculeaza rezultatul dupa operatorul introdus, cu ajutorul
                        if (textField1.getText().equals("0."))                                                      //unui siwtch, rezultat pe care in introduce intr-o JLIST(istoric) si pe care
                            label.setText(label.getText() + "0" + "=");                                             // il afiseaza intr-un label. Cu ajutorul unei variabile globale(p), dezactivez
                        else                                                                                        // butonul egal de cate ori acesta efectueaza o operatie.
                            label.setText(label.getText() + textField1.getText() + "=");
                        listModel.addElement(str1);
                        list1.setModel(listModel);
                        Test.test(str1);
                        break;
                    case '+':
                        String str2;
                        rez = nr1 + Double.parseDouble(textField1.getText());
                        if (Double.parseDouble(textField1.getText())==0){
                            str2 = Double.toString(nr1) + "+" + "0.0" + "=" + Double.toString(rez);
                        }
                        else
                            str2 = Double.toString(nr1) + "+" + textField1.getText() + "=" + Double.toString(rez);
                        if (textField1.getText().equals("0."))
                            label.setText(label.getText() + "0" + "=");
                        else
                            label.setText(label.getText() + textField1.getText() + "=");
                        listModel.addElement(str2);
                        list1.setModel(listModel);
                        Test.test(str2);
                        break;
                    case '/':
                        String str3;
                        rez = nr1 / Double.parseDouble(textField1.getText());
                        if (Double.parseDouble(textField1.getText())==0){
                            str3 = Double.toString(nr1) + "/" + "0.0" + "=" + Double.toString(rez);
                        }
                        else
                            str3 = Double.toString(nr1) + "/" + textField1.getText() + "=" + Double.toString(rez);
                        if (textField1.getText().equals("0."))
                            label.setText(label.getText() + "0" + "=");
                        else
                            label.setText(label.getText() + textField1.getText() + "=");
                        listModel.addElement(str3);
                        list1.setModel(listModel);
                        Test.test(str3);
                        break;
                    case '*':
                        String str4;
                        rez = nr1 * Double.parseDouble(textField1.getText());
                        if (Double.parseDouble(textField1.getText())==0){
                            str4 = Double.toString(nr1) + "*" + "0.0" + "=" + Double.toString(rez);
                        }
                        else
                            str4 = Double.toString(nr1) + "*" + textField1.getText() + "=" + Double.toString(rez);
                        if (textField1.getText().equals("0."))
                            label.setText(label.getText() + "0" + "=");
                        else
                            label.setText(label.getText() + textField1.getText() + "=");
                        listModel.addElement(str4);
                        list1.setModel(listModel);
                        Test.test(str4);
                        break;
                }
                if (p==0)
                    egal.setEnabled(false);
                textField1.setText( Double.toString(rez) );
                nr1 = 0;
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals(Double.toString(rez)))  // butonul clear reseteaza intratea curenta(nr curent) si label-ul care ne arata calculul efectuat, daca este cazul
                    label.setText("");
                rez = 0;
                textField1.setText("");
            }
        });
        punct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("") )           // butonul "." introduce un . in string, pentru a putea introduce numere reale. Daca prima cifra introdusa este 0, punctul
                    textField1.setText("0.");                   // este introdus imediat dupa. Daca avem deja un punct in numar, butonul este dezativat(pt a evita nr de genul x..x)
                else
                if (textField1.getText().contains("."))
                    punct.setEnabled(false);
                else{
                    String pct = textField1.getText() + ".";
                    textField1.setText(pct);
                }
                punct.setEnabled(true);
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String on;
                int del = textField1.getText().length()-1;
                if (del+1>0){
                    StringBuilder nn = new StringBuilder(textField1.getText());  //Butonul delete sterge un caracter din string-ul introdus, cu ajutorul clasei stringbuilder
                    nn.deleteCharAt(del);
                    on = nn.toString();
                    textField1.setText(on);
                }
            }
        });
        negativ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals(""))
                    negativ.setEnabled(false);
                else if (Double.parseDouble(textField1.getText())==0)       //Butonul negativ adauga un minus in fata string-ului introdus(schimba semnul nr-ului). Aici am tratat situatia cand
                    negativ.setEnabled(false);                           // nr introdus este 0(pt a evita -0) si am dezactivat butonul daca nu avem niciun nr introdus, pentru a evita erorea
                else {                                                      // empty String. Aceasta situatie am tratat-o la fiecare buton.
                    double semn = Double.parseDouble(textField1.getText());
                    semn = semn * (-1);
                    textField1.setText(Double.toString(semn));
                }
                negativ.setEnabled(true);
            }
        });
        radical.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals(""))
                    radical.setEnabled(false);
                else {
                    double rad = Double.parseDouble(textField1.getText());         //Cu ajutoul clasei Math am calculat unele operatii care apar si pe butoane, rezultat care l-am introdus
                    rad = Math.sqrt(rad);                                           // in text field si label.
                    label.setText("√" + textField1.getText()+"=");
                    textField1.setText(Double.toString(rad));
                }
                radical.setEnabled(true);
            }
        });
        sqr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals(""))
                    sqr.setEnabled(false);
                else {
                    double patrat = Double.parseDouble(textField1.getText());
                    patrat = Math.pow(patrat, 2);
                    label.setText(textField1.getText()+"^2"+"=");
                    textField1.setText(Double.toString(patrat));
                }
                sqr.setEnabled(true);
            }
        });
        exp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals(""))
                    exp.setEnabled(false);
                else {
                    double exp = Double.parseDouble(textField1.getText());
                    exp = Math.exp(exp);
                    label.setText("e^" + textField1.getText()+"=");
                    textField1.setText(Double.toString(exp));
                }
                exp.setEnabled(true);
            }
        });
        ls.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals(""))
                    ls.setEnabled(false);
                else {
                    double ls = Double.parseDouble(textField1.getText());
                    ls = ls / 100;
                    label.setText(textField1.getText()+"%"+"=");
                    textField1.setText(Double.toString(ls));
                }
                ls.setEnabled(true);
            }
        });
        allclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rez = 0;
                textField1.setText("");
                label.setText("");              // Butonul AC reseteaza text field-ul in care introducem numarul(sterge stringur introdus, la fel si pe cel din label), activeaza butonul egal.
                nr1 = 0;
                p = 0;
                egal.setEnabled(true);
            }
        });
        clearHistoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                // butoanele Clear History/Memory sterge din memorie elementele listei respective(cea care retine calculele efectuate
                listModel.removeAllElements();                          // si numerele salvate in memorie.
            }
        });
        MSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals(""))
                    MSButton.setEnabled(false);
                else if (Double.parseDouble(textField1.getText())==0){    // Butonul MS introduce in lista de memorie numarul curent tastat. Ca situatii speciale al tratat numarul 0, deoarece
                    listModel2.insertElementAt("0", 0);      // daca avem introdus un numar de forma 0.0000.., in lista va fi introdus doar '0'. Totodata, pentru ca putem avea ca nr
                }                                                         // '0.', motiv explicat la butonul 0, in lista va fi introdus tot caracterul 0. Elementul introdus in lista va fi
                else {                                                    // intotdeauna primul, in sens invers ca la cel din lista cu istoricul op.
                    if (textField1.getText().equals("0."))
                        listModel2.insertElementAt("0", 0);
                    else
                        listModel2.insertElementAt(textField1.getText(), 0);
                    textField1.setText("");
                    label.setText("");
                }
                MSButton.setEnabled(true);
                list2.setModel(listModel2);
            }
        });
        mplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals(""))
                    mplus.setEnabled(false);
                else {
                    if (textField1.getText().equals(""))
                        mplus.setEnabled(false);
                    mplus.setEnabled(true);
                    if (listModel2.size() == 0) {
                        if (Double.parseDouble(textField1.getText())==0)
                            listModel2.insertElementAt("0", 0);
                        else
                            listModel2.insertElementAt(textField1.getText(), 0);
                        textField1.setText("");
                        label.setText("");
                    } else {
                        double temp = Double.parseDouble(listModel2.elementAt(0));
                        temp = temp + Double.parseDouble(textField1.getText());
                        label.setText("");
                        listModel2.setElementAt(Double.toString(temp), 0);
                    }
                }
                mplus.setEnabled(true);                                                         // Butoanele M+, M- efectueaza operatii de adunare/scadere pe primul element din lista. Am tratat
                list2.setModel(listModel2);                                                 // situatia cand nu se afla niciun nr in lista, situatie in care se va introduce numarul curent in lista
            }                                                                               // (functioneaza asemenea butonului MS la size==0). Apasarea butoanelor duce si la resetarea
        });                                                                                 // label-ului si a text field-ului.
        mminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals(""))
                    mminus.setEnabled(false);
                else {
                    if (listModel2.size() == 0) {
                        if (Double.parseDouble(textField1.getText())==0)
                            listModel2.insertElementAt("0", 0);
                        else if (Double.parseDouble(textField1.getText()) < 0) {
                            double temp = (-1) * Double.parseDouble(textField1.getText());
                            listModel2.insertElementAt(Double.toString(temp), 0);
                        } else
                            listModel2.insertElementAt("-" + textField1.getText(), 0);
                        textField1.setText("");
                        label.setText("");
                    } else {
                        double temp = Double.parseDouble(listModel2.elementAt(0));
                        temp = temp - Double.parseDouble(textField1.getText());
                        label.setText("");
                        listModel2.setElementAt(Double.toString(temp), 0);
                    }
                }
                mminus.setEnabled(true);
                list2.setModel(listModel2);
            }
        });
        clearMemoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel2.removeAllElements();
            }
        });
        MRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (listModel2.size()==0)
                    MRButton.setEnabled(false);
                else                                                    //MR sterge elementele din lista de memorie, daca acestea exista. Se dezactiveaza butonul in caz contrar
                    textField1.setText(listModel2.elementAt(0));
                MRButton.setEnabled(true);
            }
        });

        list2.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String temp = String.valueOf(list2.getSelectedValue());         // daca unul din elementele listei memorie este selectat, acesta va fi scris in text field-ul principal
                textField1.setText(temp);
                label.setText("");
            }
        });

        //Currency Converter!!!!

        c0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {        // La versiunea Currency Converter, apasarea fiecarui buton ne aduce un rezultat "live" al conversiei. Conversia dintr-o valuta
                String buton0;                                  // in alta se face prin selectia acestora din doua ComboBox-uri, asadar am tratat fiecare posibilitate(ex euro-usd) cu ajutorul
                if (cvalue.getText().equals("")) {              // mai multor if-uri. Cand introducem prima cifra, conversia se face inmultind o variabila cu 1, iar cand ajungem la numere,
                    cvalue.setText("0.");                       // inmultim numarul introdus cu o valoare specifica(luam valoarea din text field prin .getText()). Rezultatul este afisat in
                }                                               // text field-ul result, prin metoda setText, la fiecare apasare de buton, dupa cum spuneam.
                else{
                    buton0 = cvalue.getText() + "0";
                    cvalue.setText(buton0);
                    double aux;
                    if (cvalue.getText().equals(""))
                        aux = 1;
                    else
                        aux = Double.parseDouble(cvalue.getText());
                    if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("USD"))
                        aux = Double.parseDouble(cvalue.getText());
                    if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("EURO"))
                        aux = aux * 0.95;
                    if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("USD"))
                        aux = aux * 1.05;

                    if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                        aux = aux * 1.44;
                    if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("USD"))
                        aux = aux * 0.69;

                    if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                        aux = aux * 53.85;
                    if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("USD"))
                        aux = aux * 0.019;

                    if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                        aux = aux * 6.70;
                    if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                        aux = aux * 0.15;

                    if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                        aux = aux * 6.70;
                    if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                        aux = aux * 0.15;

                    if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("LEI"))
                        aux = aux * 4.69;
                    if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("USD"))
                        aux = aux * 0.21;
                    //

                    if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("EURO"))
                        aux = Double.parseDouble(cvalue.getText());
                    if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                        aux = aux * 0.52;
                    if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("EURO"))
                        aux = aux * 0.66;

                    if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                        aux = aux * 56.28;
                    if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("EURO"))
                        aux = aux * 0.018;

                    if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RENMINBI"))
                        aux = aux * 7.08;
                    if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("EURO"))
                        aux = aux * 0.14;

                    if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("LEI"))
                        aux = aux * 4.95;
                    if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("EURO"))
                        aux = aux * 0.20;

                    //

                    if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                        aux = Double.parseDouble(cvalue.getText());
                    if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                        aux = aux * 37.24;
                    if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                        aux = aux * 0.027;

                    if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RENMINBI"))
                        aux = aux * 56.28;
                    if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                        aux = aux * 0.018;

                    if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("LEI"))
                        aux = aux * 3.24;
                    if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                        aux = aux * 0.31;
                    //

                    if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                        aux = Double.parseDouble(cvalue.getText());
                    if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RENMINBI"))
                        aux = aux * 0.12;
                    if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                        aux = aux * 8.05;

                    if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("LEI"))
                        aux = aux * 0.087;
                    if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                        aux = aux * 11.53;
                    //

                    if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RENMINBI"))
                        aux = Double.parseDouble(cvalue.getText());
                    if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("LEI"))
                        aux = aux * 0.70;
                    if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RENMINBI"))
                        aux = aux * 1.43;

                    //
                    result.setText(Double.toString(aux));
                }
            }
        });

        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton1 = cvalue.getText() + "1";
                cvalue.setText(buton1);
                double aux;
                if (cvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("USD"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.95;
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 1.05;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 1.44;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.69;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 53.85;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.019;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.69;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.21;
                //

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("EURO"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.52;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.66;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 7.08;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.14;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.95;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.20;

                //

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 37.24;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.027;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 3.24;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.31;
                //

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 0.12;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 8.05;

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.087;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 11.53;
                //

                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.70;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 1.43;

                //
                result.setText(Double.toString(aux));
            }
        });

        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton2 = cvalue.getText() + "2";
                cvalue.setText(buton2);
                double aux;
                if (cvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("USD"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.95;
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 1.05;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 1.44;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.69;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 53.85;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.019;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.69;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.21;
                //

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("EURO"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.52;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.66;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 7.08;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.14;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.95;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.20;

                //

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 37.24;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.027;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 3.24;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.31;
                //

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 0.12;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 8.05;

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.087;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 11.53;
                //

                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.70;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 1.43;

                //
                result.setText(Double.toString(aux));
            }
        });
        c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton3 = cvalue.getText() + "3";
                cvalue.setText(buton3);
                double aux;
                if (cvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("USD"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.95;
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 1.05;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 1.44;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.69;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 53.85;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.019;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.69;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.21;
                //

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("EURO"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.52;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.66;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 7.08;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.14;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.95;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.20;

                //

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 37.24;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.027;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 3.24;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.31;
                //

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 0.12;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 8.05;

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.087;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 11.53;
                //

                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.70;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 1.43;

                //
                result.setText(Double.toString(aux));
            }
        });
        c4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton4 = cvalue.getText() + "4";
                cvalue.setText(buton4);
                //double aux = Double.parseDouble(cvalue.getText());
                double aux;
                if (cvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("USD"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.95;
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 1.05;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 1.44;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.69;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 53.85;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.019;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.69;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.21;
                //

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("EURO"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.52;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.66;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 7.08;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.14;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.95;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.20;

                //

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 37.24;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.027;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 3.24;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.31;
                //

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 0.12;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 8.05;

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.087;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 11.53;
                //

                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.70;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 1.43;

                //
                result.setText(Double.toString(aux));
            }
        });
        c5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton5 = cvalue.getText() + "5";
                cvalue.setText(buton5);
                double aux;
                if (cvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("USD"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.95;
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 1.05;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 1.44;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.69;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 53.85;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.019;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.69;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.21;
                //

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("EURO"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.52;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.66;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 7.08;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.14;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.95;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.20;

                //

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 37.24;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.027;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 3.24;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.31;
                //

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 0.12;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 8.05;

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.087;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 11.53;
                //

                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.70;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 1.43;

                //
                result.setText(Double.toString(aux));
            }
        });
        c6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton6 = cvalue.getText() + "6";
                cvalue.setText(buton6);
                double aux;
                if (cvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("USD"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.95;
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 1.05;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 1.44;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.69;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 53.85;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.019;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.69;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.21;
                //

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("EURO"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.52;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.66;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 7.08;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.14;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.95;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.20;

                //

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 37.24;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.027;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 3.24;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.31;
                //

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 0.12;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 8.05;

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.087;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 11.53;
                //

                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.70;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 1.43;

                //
                result.setText(Double.toString(aux));
            }
        });
        c7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton7 = cvalue.getText() + "7";
                cvalue.setText(buton7);
                double aux;
                if (cvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("USD"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.95;
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 1.05;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 1.44;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.69;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 53.85;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.019;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.69;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.21;
                //

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("EURO"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.52;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.66;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 7.08;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.14;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.95;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.20;

                //

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 37.24;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.027;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 3.24;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.31;
                //

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 0.12;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 8.05;

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.087;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 11.53;
                //

                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.70;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 1.43;

                //
                result.setText(Double.toString(aux));
            }
        });
        c8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton8 = cvalue.getText() + "8";
                cvalue.setText(buton8);
                double aux;
                if (cvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("USD"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.95;
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 1.05;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 1.44;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.69;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 53.85;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.019;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.69;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.21;
                //

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("EURO"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.52;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.66;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 7.08;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.14;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.95;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.20;

                //

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 37.24;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.027;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 3.24;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.31;
                //

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 0.12;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 8.05;

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.087;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 11.53;
                //

                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.70;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 1.43;

                //
                result.setText(Double.toString(aux));
            }
        });
        c9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton9 = cvalue.getText() + "9";
                cvalue.setText(buton9);
                double aux;
                if (cvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("USD"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.95;
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 1.05;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 1.44;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.69;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 53.85;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.019;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 6.70;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.15;

                if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.69;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("USD"))
                    aux = aux * 0.21;
                //

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("EURO"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.52;
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.66;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 7.08;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.14;

                if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 4.95;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("EURO"))
                    aux = aux * 0.20;

                //

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 37.24;
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.027;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 56.28;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.018;

                if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 3.24;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                    aux = aux * 0.31;
                //

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 0.12;
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 8.05;

                if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.087;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                    aux = aux * 11.53;
                //

                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = Double.parseDouble(cvalue.getText());
                if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("LEI"))
                    aux = aux * 0.70;
                if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RENMINBI"))
                    aux = aux * 1.43;

                //
                result.setText(Double.toString(aux));
            }
        });
        CDEL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String on;
                int del = cvalue.getText().length()-1;      // Butonul DEL sterge un caracter din string, afisand totodata noul rezultat. Am tratat situatia cand avem doar o cifra in text field
                if (del==0){                                // ul in care este introdusa valoare pe care vrem sa o convertim, deoarece la stergerea acesteia, in chenarul rezultat ramaneau anumite
                    cvalue.setText("");                     // valori. Am rezolvat totodata si eroarea empty string. Asadar, daca ajungem la marimea stringului de un caracter, resetam ambele valori
                    result.setText("");
                }
                else {
                    if (del + 1 > 0) {
                        StringBuilder nn = new StringBuilder(cvalue.getText());
                        nn.deleteCharAt(del);
                        on = nn.toString();
                        cvalue.setText(on);
                        double aux;
                        if (cvalue.getText().equals(""))
                            aux = 1;
                        else
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("USD"))
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("EURO"))
                            aux = aux * 0.95;
                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 1.05;

                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = aux * 1.44;
                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 0.69;

                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = aux * 53.85;
                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 0.019;

                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 6.70;
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 0.15;

                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 6.70;
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 0.15;

                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("LEI"))
                            aux = aux * 4.69;
                        if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 0.21;
                        //

                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("EURO"))
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = aux * 0.52;
                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("EURO"))
                            aux = aux * 0.66;

                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = aux * 56.28;
                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("EURO"))
                            aux = aux * 0.018;

                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 7.08;
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("EURO"))
                            aux = aux * 0.14;

                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("LEI"))
                            aux = aux * 4.95;
                        if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("EURO"))
                            aux = aux * 0.20;

                        //

                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = aux * 37.24;
                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = aux * 0.027;

                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 56.28;
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = aux * 0.018;

                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("LEI"))
                            aux = aux * 3.24;
                        if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = aux * 0.31;
                        //

                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 0.12;
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = aux * 8.05;

                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("LEI"))
                            aux = aux * 0.087;
                        if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = aux * 11.53;
                        //

                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("LEI"))
                            aux = aux * 0.70;
                        if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 1.43;

                        //
                        result.setText(Double.toString(aux));
                    }

                }
            }
        });
        cpunct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cvalue.getText().equals("") )
                    cvalue.setText("0.");
                else
                if (cvalue.getText().contains("."))
                    cpunct.setEnabled(false);
                else{
                    String pct = cvalue.getText() + ".";
                    cvalue.setText(pct);
                }
                cpunct.setEnabled(true);
            }
        });
        CClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cvalue.setText("");
                result.setText("");
            }
        });
        from.addItemListener(new ItemListener() {               // Pentru ambele ComboBox-uri(to,from) am creat un itemlistener, tratand iarasi fiecare posibilitate de combinare a doua
            @Override                                            // valute, pentru a afisa conversia corecta de fiecare data cand schimbam un element al din lista. Pentru a nu returna eroarea
            public void itemStateChanged(ItemEvent e) {         // empty String la selectarea a doua valute egale, facem conversia doar daca avem o valoare introdusa(!cvalue.getText().equals(""))
                if (e.getStateChange()==ItemEvent.SELECTED){
                    if (!cvalue.getText().equals("")) {
                        double aux;
                        if (cvalue.getText().equals(""))
                            aux = 1;
                        else
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("USD"))
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("EURO"))
                            aux = aux * 0.95;
                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 1.05;

                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = aux * 1.44;
                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 0.69;

                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = aux * 53.85;
                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 0.019;

                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 6.70;
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 0.15;

                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 6.70;
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 0.15;

                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("LEI"))
                            aux = aux * 4.69;
                        if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 0.21;
                        //

                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("EURO"))
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = aux * 0.52;
                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("EURO"))
                            aux = aux * 0.66;

                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = aux * 56.28;
                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("EURO"))
                            aux = aux * 0.018;

                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 7.08;
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("EURO"))
                            aux = aux * 0.14;

                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("LEI"))
                            aux = aux * 4.95;
                        if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("EURO"))
                            aux = aux * 0.20;

                        //

                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = aux * 37.24;
                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = aux * 0.027;

                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 56.28;
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = aux * 0.018;

                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("LEI"))
                            aux = aux * 3.24;
                        if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = aux * 0.31;
                        //

                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 0.12;
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = aux * 8.05;

                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("LEI"))
                            aux = aux * 0.087;
                        if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = aux * 11.53;
                        //

                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("LEI"))
                            aux = aux * 0.70;
                        if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 1.43;

                        //
                        result.setText(Double.toString(aux));
                    }
                }
            }
        });
        to.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange()==ItemEvent.SELECTED){
                    if (!cvalue.getText().equals("")) {
                        double aux;
                        if (cvalue.getText().equals(""))
                            aux = 1;
                        else
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("USD"))
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("EURO"))
                            aux = aux * 0.95;
                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 1.05;

                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = aux * 1.44;
                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 0.69;

                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = aux * 53.85;
                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 0.019;

                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 6.70;
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 0.15;

                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 6.70;
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 0.15;

                        if (from.getSelectedItem().toString().equals("USD") && to.getSelectedItem().toString().equals("LEI"))
                            aux = aux * 4.69;
                        if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("USD"))
                            aux = aux * 0.21;
                        //

                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("EURO"))
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = aux * 0.52;
                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("EURO"))
                            aux = aux * 0.66;

                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = aux * 56.28;
                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("EURO"))
                            aux = aux * 0.018;

                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 7.08;
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("EURO"))
                            aux = aux * 0.14;

                        if (from.getSelectedItem().toString().equals("EURO") && to.getSelectedItem().toString().equals("LEI"))
                            aux = aux * 4.95;
                        if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("EURO"))
                            aux = aux * 0.20;

                        //

                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = aux * 37.24;
                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = aux * 0.027;

                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 56.28;
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = aux * 0.018;

                        if (from.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR") && to.getSelectedItem().toString().equals("LEI"))
                            aux = aux * 3.24;
                        if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("AUSTRALIAN DOLLAR"))
                            aux = aux * 0.31;
                        //

                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 0.12;
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = aux * 8.05;

                        if (from.getSelectedItem().toString().equals("RUSSAIN RUBLE") && to.getSelectedItem().toString().equals("LEI"))
                            aux = aux * 0.087;
                        if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RUSSAIN RUBLE"))
                            aux = aux * 11.53;
                        //

                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = Double.parseDouble(cvalue.getText());
                        if (from.getSelectedItem().toString().equals("RENMINBI") && to.getSelectedItem().toString().equals("LEI"))
                            aux = aux * 0.70;
                        if (from.getSelectedItem().toString().equals("LEI") && to.getSelectedItem().toString().equals("RENMINBI"))
                            aux = aux * 1.43;

                        //
                        result.setText(Double.toString(aux));
                    }
                }
            }
        });
        //Temperature!!!!

        t0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buton0;
                if (tvalue.getText().equals("") || tvalue.getText().equals("0")) {
                    tvalue.setText("0");

                    if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Kelvin"))
                        tresult.setText("273.15");
                    if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                        tresult.setText("32");
                    if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Celsius"))
                        tresult.setText("-17.77778");
                    if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Kelvin"))
                        tresult.setText("255.3722");
                    if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Celsius"))
                        tresult.setText("-273.15");
                    if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                        tresult.setText("-459.67");

                    if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Celsius"))
                        tresult.setText("0");
                    if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                        tresult.setText("0");
                    if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Kelvin"))
                        tresult.setText("0");

                    t0.setEnabled(false);


                }
                else{
                    buton0 = tvalue.getText() + "0";
                    tvalue.setText(buton0);


                    double aux;
                    if (tvalue.getText().equals(""))
                        aux = 1;
                    else
                        aux = Double.parseDouble(tvalue.getText());
                    if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Celsius"))
                        aux = Double.parseDouble(tvalue.getText());
                    if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                        aux = aux * 1.8 + 32;
                    if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Celsius"))
                        aux = (aux-32)*0.5556;

                    if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Kelvin"))
                        aux = aux + 273.15;
                    if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Celsius"))
                        aux = aux - 273.15;

                    if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                        aux = Double.parseDouble(tvalue.getText());
                    if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Kelvin"))
                        aux = (aux-32)*5/9 + 273.15;

                    if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Kelvin"))
                        aux = Double.parseDouble(tvalue.getText());
                    if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                        aux = (aux-273.15)*1.8 + 32;

                    tresult.setText(Double.toString(aux));
                }
                t0.setEnabled(true);
            }
                                                                //Pt versiunea Temperature am ales sa dezactivez celalte butoane, daca prima cifra introdusa este 0, din motive specificate anterior
        });                                                     // Interfata seamana cu cea din vers. Currency, asadar functionalitatea butoanelor  este aceeasi, transmitand rezultatul catre
        t1.addActionListener(new ActionListener() {             // text field-ul rezultat dupa apasarea fiecarui buton. Combinatiile de temperaturi, care pot fi selectate din ComboBox-uri,
            @Override                                           // le-am tratat cu ajutorul mai multor if-uri.
            public void actionPerformed(ActionEvent e) {
                if (tvalue.getText().equals("0"))
                    t1.setEnabled(false);
                else{
                    String buton1 = tvalue.getText() + "1";
                    tvalue.setText(buton1);
                }
                t1.setEnabled(true);
                double aux;
                if (tvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = aux * 1.8 + 32;
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = (aux-32)*0.5556;

                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = aux + 273.15;
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = aux - 273.15;

                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = (aux-32)*5/9 + 273.15;

                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = (aux-273.15)*1.8 + 32;

                tresult.setText(Double.toString(aux));
            }
        });
        t2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tvalue.getText().equals("0"))
                    t2.setEnabled(false);
                else{
                    String buton1 = tvalue.getText() + "2";
                    tvalue.setText(buton1);
                }
                t2.setEnabled(true);
                double aux;
                if (tvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = aux * 1.8 + 32;
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = (aux-32)*0.5556;

                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = aux + 273.15;
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = aux - 273.15;

                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = (aux-32)*5/9 + 273.15;

                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = (aux-273.15)*1.8 + 32;

                tresult.setText(Double.toString(aux));
            }
        });
        t3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tvalue.getText().equals("0"))
                    t3.setEnabled(false);
                else{
                    String buton1 = tvalue.getText() + "3";
                    tvalue.setText(buton1);
                }
                t3.setEnabled(true);
                double aux;
                if (tvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = aux * 1.8 + 32;
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = (aux-32)*0.5556;

                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = aux + 273.15;
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = aux - 273.15;

                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = (aux-32)*5/9 + 273.15;

                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = (aux-273.15)*1.8 + 32;

                tresult.setText(Double.toString(aux));
            }
        });
        t4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tvalue.getText().equals("0"))
                    t4.setEnabled(false);
                else{
                    String buton1 = tvalue.getText() + "4";
                    tvalue.setText(buton1);
                }
                t4.setEnabled(true);

                double aux;
                if (tvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = aux * 1.8 + 32;
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = (aux-32)*0.5556;

                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = aux + 273.15;
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = aux - 273.15;

                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = (aux-32)*5/9 + 273.15;

                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = (aux-273.15)*1.8 + 32;

                tresult.setText(Double.toString(aux));
            }
        });
        t5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tvalue.getText().equals("0"))
                    t5.setEnabled(false);
                else{
                    String buton1 = tvalue.getText() + "5";
                    tvalue.setText(buton1);
                }
                t5.setEnabled(true);
                double aux;
                if (tvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = aux * 1.8 + 32;
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = (aux-32)*0.5556;

                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = aux + 273.15;
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = aux - 273.15;

                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = (aux-32)*5/9 + 273.15;

                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = (aux-273.15)*1.8 + 32;

                tresult.setText(Double.toString(aux));
            }
        });
        t6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tvalue.getText().equals("0"))
                    t6.setEnabled(false);
                else{
                    String buton1 = tvalue.getText() + "6";
                    tvalue.setText(buton1);
                }
                t6.setEnabled(true);
                double aux;
                if (tvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = aux * 1.8 + 32;
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = (aux-32)*0.5556;

                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = aux + 273.15;
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = aux - 273.15;

                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = (aux-32)*5/9 + 273.15;

                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = (aux-273.15)*1.8 + 32;

                tresult.setText(Double.toString(aux));
            }
        });
        t7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tvalue.getText().equals("0"))
                    t7.setEnabled(false);
                else{
                    String buton1 = tvalue.getText() + "7";
                    tvalue.setText(buton1);
                }
                t7.setEnabled(true);
                double aux;
                if (tvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = aux * 1.8 + 32;
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = (aux-32)*0.5556;

                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = aux + 273.15;
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = aux - 273.15;

                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = (aux-32)*5/9 + 273.15;

                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = (aux-273.15)*1.8 + 32;

                tresult.setText(Double.toString(aux));
            }
        });
        t8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tvalue.getText().equals("0"))
                    t8.setEnabled(false);
                else{
                    String buton1 = tvalue.getText() + "8";
                    tvalue.setText(buton1);
                }
                t8.setEnabled(true);
                double aux;
                if (tvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = aux * 1.8 + 32;
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = (aux-32)*0.5556;

                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = aux + 273.15;
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = aux - 273.15;

                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = (aux-32)*5/9 + 273.15;

                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = (aux-273.15)*1.8 + 32;

                tresult.setText(Double.toString(aux));
            }
        });
        t9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tvalue.getText().equals("0"))
                    t9.setEnabled(false);
                else{
                    String buton1 = tvalue.getText() + "9";
                    tvalue.setText(buton1);
                }
                t9.setEnabled(true);
                double aux;
                if (tvalue.getText().equals(""))
                    aux = 1;
                else
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = aux * 1.8 + 32;
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = (aux-32)*0.5556;

                if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = aux + 273.15;
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Celsius"))
                    aux = aux - 273.15;

                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = (aux-32)*5/9 + 273.15;

                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Kelvin"))
                    aux = Double.parseDouble(tvalue.getText());
                if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                    aux = (aux-273.15)*1.8 + 32;

                tresult.setText(Double.toString(aux));
            }
        });

        tsemn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tvalue.getText().equals(""))
                    tsemn.setEnabled(false);
                else if (Double.parseDouble(tvalue.getText())==0)
                    tsemn.setEnabled(false);
                else {
                    double semn = Double.parseDouble(tvalue.getText());
                    semn = semn * (-1);
                    tvalue.setText(Double.toString(semn));

                    double aux;
                    aux = semn;
                    if (tvalue.getText().equals(""))
                        aux = 1;
                    else
                        aux = Double.parseDouble(tvalue.getText());
                    if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Celsius"))
                        aux = Double.parseDouble(tvalue.getText());
                    if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                        aux = aux * 1.8 + 32;
                    if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Celsius"))
                        aux = (aux-32)*0.5556;

                    if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Kelvin"))
                        aux = aux + 273.15;
                    if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Celsius"))
                        aux = aux - 273.15;

                    if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                        aux = Double.parseDouble(tvalue.getText());
                    if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Kelvin"))
                        aux = (aux-32)*5/9 + 273.15;

                    if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Kelvin"))
                        aux = Double.parseDouble(tvalue.getText());
                    if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                        aux = (aux-273.15)*1.8 + 32;

                    tresult.setText(Double.toString(aux));
                }
                tsemn.setEnabled(true);
            }
        });
        tclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tvalue.setText("");
                tresult.setText("");
            }
        });
        tpunct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tvalue.getText().equals("") )
                    tvalue.setText("0.");
                else
                if (tvalue.getText().contains("."))
                    tpunct.setEnabled(false);
                else{
                    String pct = tvalue.getText() + ".";
                    tvalue.setText(pct);
                }
                tpunct.setEnabled(true);
            }
        });

        tdel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String on;                                      // Butonul del are aceeasi functionalitate specificata la vers Currency, la fel ca si ItemListener-ul celor doua ComboBox-uri
                int del = tvalue.getText().length()-1;
                if (del==0){
                    tvalue.setText("");
                    tresult.setText("");
                }
                else{
                    if (del+1>0) {
                        StringBuilder nn = new StringBuilder(tvalue.getText());
                        nn.deleteCharAt(del);
                        on = nn.toString();
                        tvalue.setText(on);
                        double aux;
                        if (tvalue.getText().equals(""))
                            aux = 1;
                        else
                            aux = Double.parseDouble(tvalue.getText());
                        if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Celsius"))
                            aux = Double.parseDouble(tvalue.getText());
                        if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                            aux = aux * 1.8 + 32;
                        if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Celsius"))
                            aux = (aux-32)*0.5556;

                        if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Kelvin"))
                            aux = aux + 273.15;
                        if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Celsius"))
                            aux = aux - 273.15;

                        if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                            aux = Double.parseDouble(tvalue.getText());
                        if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Kelvin"))
                            aux = (aux-32)*5/9 + 273.15;

                        if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Kelvin"))
                            aux = Double.parseDouble(tvalue.getText());
                        if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                            aux = (aux-273.15)*1.8 + 32;

                        tresult.setText(Double.toString(aux));
                    }
                }

            }
        });
        tto.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange()==ItemEvent.SELECTED){
                    if (!tvalue.getText().equals("")) {
                        double aux;
                        if (tvalue.getText().equals(""))
                            aux = 1;
                        else
                            aux = Double.parseDouble(tvalue.getText());
                        if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Celsius"))
                            aux = Double.parseDouble(tvalue.getText());
                        if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                            aux = aux * 1.8 + 32;
                        if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Celsius"))
                            aux = (aux - 32) * 0.5556;

                        if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Kelvin"))
                            aux = aux + 273.15;
                        if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Celsius"))
                            aux = aux - 273.15;

                        if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                            aux = Double.parseDouble(tvalue.getText());
                        if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Kelvin"))
                            aux = (aux - 32) * 5 / 9 + 273.15;

                        if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Kelvin"))
                            aux = Double.parseDouble(tvalue.getText());
                        if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                            aux = (aux - 273.15) * 1.8 + 32;

                        tresult.setText(Double.toString(aux));
                    }
                }
            }
        });
        tfrom.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange()==ItemEvent.SELECTED){
                    if (!tvalue.getText().equals("")) {
                        double aux;
                        if (tvalue.getText().equals(""))
                            aux = 1;
                        else
                            aux = Double.parseDouble(tvalue.getText());
                        if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Celsius"))
                            aux = Double.parseDouble(tvalue.getText());
                        if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                            aux = aux * 1.8 + 32;
                        if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Celsius"))
                            aux = (aux - 32) * 0.5556;

                        if (tfrom.getSelectedItem().toString().equals("Celsius") && tto.getSelectedItem().toString().equals("Kelvin"))
                            aux = aux + 273.15;
                        if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Celsius"))
                            aux = aux - 273.15;

                        if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                            aux = Double.parseDouble(tvalue.getText());
                        if (tfrom.getSelectedItem().toString().equals("Fahrenheit") && tto.getSelectedItem().toString().equals("Kelvin"))
                            aux = (aux - 32) * 5 / 9 + 273.15;

                        if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Kelvin"))
                            aux = Double.parseDouble(tvalue.getText());
                        if (tfrom.getSelectedItem().toString().equals("Kelvin") && tto.getSelectedItem().toString().equals("Fahrenheit"))
                            aux = (aux - 273.15) * 1.8 + 32;

                        tresult.setText(Double.toString(aux));
                    }
                }
            }
        });

        //Programmer!!!! //Versiunea Programmer are la baza convertirea de numere dintr-o baza in altele.
        p0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {              // Butoanele din aceasta versiune functioneaza in fuctie de ce casuta CheckBox este bifata. Pt butonul 0, l-ma dezactivat
                    if (HEXCheckBox.isSelected()) {                   // atunci cand acesta poate fi prima cifra din numar, pt a evita numere de genul 0xx). Asadar, daca lungimea string-ului
                        if (phex.getText().length()<1) {              // este 0, il dezactivam, activandul in caz contrar. Restul butoanelor nu au avut nevoie de nimic special, fiecare scriind
                            p0.setEnabled(false);                     // in text field-ul specific CheckBox-ului bifat, iar conversia apare dupa apasarea fiecaruia, in celelalte text field-uri
                        }                                             // cu CheckBox-uri nebifate. Am realizat conversia prin metodele .toBazaString();
                        else {
                            String buton1 = phex.getText() + "0";
                            phex.setText(buton1);

                            final String hex = phex.getText();
                            final int dec = Integer.parseInt(hex, 16);
                            final String bin = Integer.toBinaryString(dec);
                            pbin.setText(bin);

                            final String hex2 = phex.getText();
                            final int dec2 = Integer.parseInt(hex2, 16);
                            final String oct = Integer.toOctalString(dec2);
                            poct.setText(oct);

                            final String hex3 = phex.getText();
                            final int dec3 = Integer.parseInt(hex3, 16);
                            pdec.setText(Integer.toString(dec3));
                        }
                        p0.setEnabled(true);
                    }

                    if (DECCheckBox.isSelected()){
                        if (pdec.getText().length()<1) { // 0 pt butoane
                            p0.setEnabled(false);
                        }
                        else {
                            String buton1 = pdec.getText() + "0";
                            pdec.setText(buton1);

                            final int dec = Integer.parseInt(pdec.getText());
                            final String hex = Integer.toHexString(dec);
                            phex.setText(hex);

                            final int dec2 = Integer.parseInt(pdec.getText());
                            final String oct = Integer.toOctalString(dec2);
                            poct.setText(oct);

                            final int dec3 = Integer.parseInt(pdec.getText());
                            final String bin = Integer.toBinaryString(dec3);
                            pbin.setText(bin);
                        }
                        p0.setEnabled(true);
                    }

                    if (OCTCheckBox.isSelected()) {
                        if (poct.getText().length() < 1) { // 0 pt butoane
                            p0.setEnabled(false);
                        } else {
                            String buton1 = poct.getText() + "0";
                            poct.setText(buton1);

                            final String oct = poct.getText();
                            final int dec = Integer.parseInt(oct, 8);
                            final String hex = Integer.toHexString(dec);
                            phex.setText(hex);

                            final String oct2 = poct.getText();
                            final int dec2 = Integer.parseInt(oct2, 8);
                            pdec.setText(Integer.toString(dec2));

                            final String oct3 = poct.getText();
                            final int dec3 = Integer.parseInt(oct3, 8);
                            final String bin = Integer.toBinaryString(dec3);
                            pbin.setText(bin);
                        }
                        p0.setEnabled(true);
                    }

                    if (BINCheckBox.isSelected()){
                        if (pbin.getText().length()<1) { // 0 pt butoane
                            p0.setEnabled(false);
                        }
                        else {
                            String buton1 = pbin.getText() + "0";
                            pbin.setText(buton1);


                            final String bin = pbin.getText();
                            final int dec = Integer.parseInt(bin, 2);
                            final String hex = Integer.toHexString(dec);
                            phex.setText(hex);

                            final String bin2 = pbin.getText();
                            final int dec2 = Integer.parseInt(bin2, 2);
                            pdec.setText(Integer.toString(dec2));

                            final String bin3 = pbin.getText();
                            final int dec3 = Integer.parseInt(bin3, 2);
                            final String oct = Integer.toOctalString(dec3);
                            poct.setText(oct);
                        }
                        p0.setEnabled(true);
                    }
                p0.setEnabled(true);
                }

        });
        p1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    String buton1 = phex.getText() + "1";
                    phex.setText(buton1);

                    final String hex = phex.getText();
                    final int dec = Integer.parseInt(hex, 16);
                    final String bin = Integer.toBinaryString(dec);
                    pbin.setText(bin);

                    final String hex2 = phex.getText();
                    final int dec2 = Integer.parseInt(hex2, 16);
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final String hex3 = phex.getText();
                    final int dec3 = Integer.parseInt(hex3, 16);
                    pdec.setText(Integer.toString(dec3));
                }

                if (DECCheckBox.isSelected()){
                    String buton1 = pdec.getText() + "1";
                    pdec.setText(buton1);

                    final int dec = Integer.parseInt(pdec.getText());
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final int dec2 = Integer.parseInt(pdec.getText());
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final int dec3 = Integer.parseInt(pdec.getText());
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (OCTCheckBox.isSelected()){
                    String buton1 = poct.getText() + "1";
                    poct.setText(buton1);

                    final String oct = poct.getText();
                    final int dec = Integer.parseInt(oct, 8);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String oct2 = poct.getText();
                    final int dec2 = Integer.parseInt(oct2, 8);
                    pdec.setText(Integer.toString(dec2));

                    final String oct3 = poct.getText();
                    final int dec3 = Integer.parseInt(oct3, 8);
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (BINCheckBox.isSelected()){
                    String buton1 = pbin.getText() + "1";
                    pbin.setText(buton1);


                    final String bin = pbin.getText();
                    final int dec = Integer.parseInt(bin, 2);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String bin2 = pbin.getText();
                    final int dec2 = Integer.parseInt(bin2, 2);
                    pdec.setText(Integer.toString(dec2));

                    final String bin3 = pbin.getText();
                    final int dec3 = Integer.parseInt(bin3, 2);
                    final String oct = Integer.toOctalString(dec3);
                    poct.setText(oct);
                }
            }
        });
        p2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    String buton1 = phex.getText() + "2";
                    phex.setText(buton1);

                    final String hex = phex.getText();
                    final int dec = Integer.parseInt(hex, 16);
                    final String bin = Integer.toBinaryString(dec);
                    pbin.setText(bin);

                    final String hex2 = phex.getText();
                    final int dec2 = Integer.parseInt(hex2, 16);
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final String hex3 = phex.getText();
                    final int dec3 = Integer.parseInt(hex3, 16);
                    pdec.setText(Integer.toString(dec3));
                }

                if (DECCheckBox.isSelected()){
                    String buton1 = pdec.getText() + "2";
                    pdec.setText(buton1);

                    final int dec = Integer.parseInt(pdec.getText());
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final int dec2 = Integer.parseInt(pdec.getText());
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final int dec3 = Integer.parseInt(pdec.getText());
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (OCTCheckBox.isSelected()){
                    String buton1 = poct.getText() + "2";
                    poct.setText(buton1);

                    final String oct = poct.getText();
                    final int dec = Integer.parseInt(oct, 8);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String oct2 = poct.getText();
                    final int dec2 = Integer.parseInt(oct2, 8);
                    pdec.setText(Integer.toString(dec2));

                    final String oct3 = poct.getText();
                    final int dec3 = Integer.parseInt(oct3, 8);
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (BINCheckBox.isSelected()){
                    String buton1 = pbin.getText() + "2";
                    pbin.setText(buton1);


                    final String bin = pbin.getText();
                    final int dec = Integer.parseInt(bin, 2);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String bin2 = pbin.getText();
                    final int dec2 = Integer.parseInt(bin2, 2);
                    pdec.setText(Integer.toString(dec2));

                    final String bin3 = pbin.getText();
                    final int dec3 = Integer.parseInt(bin3, 2);
                    final String oct = Integer.toOctalString(dec3);
                    poct.setText(oct);
                }
            }
        });
        p3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    String buton1 = phex.getText() + "3";
                    phex.setText(buton1);

                    final String hex = phex.getText();
                    final int dec = Integer.parseInt(hex, 16);
                    final String bin = Integer.toBinaryString(dec);
                    pbin.setText(bin);

                    final String hex2 = phex.getText();
                    final int dec2 = Integer.parseInt(hex2, 16);
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final String hex3 = phex.getText();
                    final int dec3 = Integer.parseInt(hex3, 16);
                    pdec.setText(Integer.toString(dec3));
                }

                if (DECCheckBox.isSelected()){
                    String buton1 = pdec.getText() + "3";
                    pdec.setText(buton1);

                    final int dec = Integer.parseInt(pdec.getText());
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final int dec2 = Integer.parseInt(pdec.getText());
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final int dec3 = Integer.parseInt(pdec.getText());
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (OCTCheckBox.isSelected()){
                    String buton1 = poct.getText() + "3";
                    poct.setText(buton1);

                    final String oct = poct.getText();
                    final int dec = Integer.parseInt(oct, 8);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String oct2 = poct.getText();
                    final int dec2 = Integer.parseInt(oct2, 8);
                    pdec.setText(Integer.toString(dec2));

                    final String oct3 = poct.getText();
                    final int dec3 = Integer.parseInt(oct3, 8);
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (BINCheckBox.isSelected()){
                    String buton1 = pbin.getText() + "3";
                    pbin.setText(buton1);


                    final String bin = pbin.getText();
                    final int dec = Integer.parseInt(bin, 2);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String bin2 = pbin.getText();
                    final int dec2 = Integer.parseInt(bin2, 2);
                    pdec.setText(Integer.toString(dec2));

                    final String bin3 = pbin.getText();
                    final int dec3 = Integer.parseInt(bin3, 2);
                    final String oct = Integer.toOctalString(dec3);
                    poct.setText(oct);
                }
            }
        });
        p4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    String buton1 = phex.getText() + "4";
                    phex.setText(buton1);

                    final String hex = phex.getText();
                    final int dec = Integer.parseInt(hex, 16);
                    final String bin = Integer.toBinaryString(dec);
                    pbin.setText(bin);

                    final String hex2 = phex.getText();
                    final int dec2 = Integer.parseInt(hex2, 16);
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final String hex3 = phex.getText();
                    final int dec3 = Integer.parseInt(hex3, 16);
                    pdec.setText(Integer.toString(dec3));
                }

                if (DECCheckBox.isSelected()){
                    String buton1 = pdec.getText() + "4";
                    pdec.setText(buton1);

                    final int dec = Integer.parseInt(pdec.getText());
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final int dec2 = Integer.parseInt(pdec.getText());
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final int dec3 = Integer.parseInt(pdec.getText());
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (OCTCheckBox.isSelected()){
                    String buton1 = poct.getText() + "4";
                    poct.setText(buton1);

                    final String oct = poct.getText();
                    final int dec = Integer.parseInt(oct, 8);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String oct2 = poct.getText();
                    final int dec2 = Integer.parseInt(oct2, 8);
                    pdec.setText(Integer.toString(dec2));

                    final String oct3 = poct.getText();
                    final int dec3 = Integer.parseInt(oct3, 8);
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (BINCheckBox.isSelected()){
                    String buton1 = pbin.getText() + "4";
                    pbin.setText(buton1);


                    final String bin = pbin.getText();
                    final int dec = Integer.parseInt(bin, 2);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String bin2 = pbin.getText();
                    final int dec2 = Integer.parseInt(bin2, 2);
                    pdec.setText(Integer.toString(dec2));

                    final String bin3 = pbin.getText();
                    final int dec3 = Integer.parseInt(bin3, 2);
                    final String oct = Integer.toOctalString(dec3);
                    poct.setText(oct);
                }


            }
        });
        p5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    String buton1 = phex.getText() + "5";
                    phex.setText(buton1);

                    final String hex = phex.getText();
                    final int dec = Integer.parseInt(hex, 16);
                    final String bin = Integer.toBinaryString(dec);
                    pbin.setText(bin);

                    final String hex2 = phex.getText();
                    final int dec2 = Integer.parseInt(hex2, 16);
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final String hex3 = phex.getText();
                    final int dec3 = Integer.parseInt(hex3, 16);
                    pdec.setText(Integer.toString(dec3));
                }

                if (DECCheckBox.isSelected()){
                    String buton1 = pdec.getText() + "5";
                    pdec.setText(buton1);

                    final int dec = Integer.parseInt(pdec.getText());
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final int dec2 = Integer.parseInt(pdec.getText());
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final int dec3 = Integer.parseInt(pdec.getText());
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (OCTCheckBox.isSelected()){
                    String buton1 = poct.getText() + "5";
                    poct.setText(buton1);

                    final String oct = poct.getText();
                    final int dec = Integer.parseInt(oct, 8);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String oct2 = poct.getText();
                    final int dec2 = Integer.parseInt(oct2, 8);
                    pdec.setText(Integer.toString(dec2));

                    final String oct3 = poct.getText();
                    final int dec3 = Integer.parseInt(oct3, 8);
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (BINCheckBox.isSelected()){
                    String buton1 = pbin.getText() + "5";
                    pbin.setText(buton1);


                    final String bin = pbin.getText();
                    final int dec = Integer.parseInt(bin, 2);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String bin2 = pbin.getText();
                    final int dec2 = Integer.parseInt(bin2, 2);
                    pdec.setText(Integer.toString(dec2));

                    final String bin3 = pbin.getText();
                    final int dec3 = Integer.parseInt(bin3, 2);
                    final String oct = Integer.toOctalString(dec3);
                    poct.setText(oct);
                }
            }
        });
        p6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    String buton1 = phex.getText() + "6";
                    phex.setText(buton1);

                    final String hex = phex.getText();
                    final int dec = Integer.parseInt(hex, 16);
                    final String bin = Integer.toBinaryString(dec);
                    pbin.setText(bin);

                    final String hex2 = phex.getText();
                    final int dec2 = Integer.parseInt(hex2, 16);
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final String hex3 = phex.getText();
                    final int dec3 = Integer.parseInt(hex3, 16);
                    pdec.setText(Integer.toString(dec3));
                }

                if (DECCheckBox.isSelected()){
                    String buton1 = pdec.getText() + "6";
                    pdec.setText(buton1);

                    final int dec = Integer.parseInt(pdec.getText());
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final int dec2 = Integer.parseInt(pdec.getText());
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final int dec3 = Integer.parseInt(pdec.getText());
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (OCTCheckBox.isSelected()){
                    String buton1 = poct.getText() + "6";
                    poct.setText(buton1);

                    final String oct = poct.getText();
                    final int dec = Integer.parseInt(oct, 8);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String oct2 = poct.getText();
                    final int dec2 = Integer.parseInt(oct2, 8);
                    pdec.setText(Integer.toString(dec2));

                    final String oct3 = poct.getText();
                    final int dec3 = Integer.parseInt(oct3, 8);
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (BINCheckBox.isSelected()){
                    String buton1 = pbin.getText() + "6";
                    pbin.setText(buton1);


                    final String bin = pbin.getText();
                    final int dec = Integer.parseInt(bin, 2);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String bin2 = pbin.getText();
                    final int dec2 = Integer.parseInt(bin2, 2);
                    pdec.setText(Integer.toString(dec2));

                    final String bin3 = pbin.getText();
                    final int dec3 = Integer.parseInt(bin3, 2);
                    final String oct = Integer.toOctalString(dec3);
                    poct.setText(oct);
                }
            }
        });
        p7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    String buton1 = phex.getText() + "7";
                    phex.setText(buton1);

                    final String hex = phex.getText();
                    final int dec = Integer.parseInt(hex, 16);
                    final String bin = Integer.toBinaryString(dec);
                    pbin.setText(bin);

                    final String hex2 = phex.getText();
                    final int dec2 = Integer.parseInt(hex2, 16);
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final String hex3 = phex.getText();
                    final int dec3 = Integer.parseInt(hex3, 16);
                    pdec.setText(Integer.toString(dec3));
                }

                if (DECCheckBox.isSelected()){
                    String buton1 = pdec.getText() + "7";
                    pdec.setText(buton1);

                    final int dec = Integer.parseInt(pdec.getText());
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final int dec2 = Integer.parseInt(pdec.getText());
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final int dec3 = Integer.parseInt(pdec.getText());
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (OCTCheckBox.isSelected()){
                    String buton1 = poct.getText() + "7";
                    poct.setText(buton1);

                    final String oct = poct.getText();
                    final int dec = Integer.parseInt(oct, 8);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String oct2 = poct.getText();
                    final int dec2 = Integer.parseInt(oct2, 8);
                    pdec.setText(Integer.toString(dec2));

                    final String oct3 = poct.getText();
                    final int dec3 = Integer.parseInt(oct3, 8);
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (BINCheckBox.isSelected()){
                    String buton1 = pbin.getText() + "7";
                    pbin.setText(buton1);


                    final String bin = pbin.getText();
                    final int dec = Integer.parseInt(bin, 2);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String bin2 = pbin.getText();
                    final int dec2 = Integer.parseInt(bin2, 2);
                    pdec.setText(Integer.toString(dec2));

                    final String bin3 = pbin.getText();
                    final int dec3 = Integer.parseInt(bin3, 2);
                    final String oct = Integer.toOctalString(dec3);
                    poct.setText(oct);
                }
            }
        });
        p8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    String buton1 = phex.getText() + "8";
                    phex.setText(buton1);

                    final String hex = phex.getText();
                    final int dec = Integer.parseInt(hex, 16);
                    final String bin = Integer.toBinaryString(dec);
                    pbin.setText(bin);

                    final String hex2 = phex.getText();
                    final int dec2 = Integer.parseInt(hex2, 16);
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final String hex3 = phex.getText();
                    final int dec3 = Integer.parseInt(hex3, 16);
                    pdec.setText(Integer.toString(dec3));
                }

                if (DECCheckBox.isSelected()){
                    String buton1 = pdec.getText() + "8";
                    pdec.setText(buton1);

                    final int dec = Integer.parseInt(pdec.getText());
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final int dec2 = Integer.parseInt(pdec.getText());
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final int dec3 = Integer.parseInt(pdec.getText());
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (OCTCheckBox.isSelected()){
                    String buton1 = poct.getText() + "8";
                    poct.setText(buton1);

                    final String oct = poct.getText();
                    final int dec = Integer.parseInt(oct, 8);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String oct2 = poct.getText();
                    final int dec2 = Integer.parseInt(oct2, 8);
                    pdec.setText(Integer.toString(dec2));

                    final String oct3 = poct.getText();
                    final int dec3 = Integer.parseInt(oct3, 8);
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (BINCheckBox.isSelected()){
                    String buton1 = pbin.getText() + "8";
                    pbin.setText(buton1);


                    final String bin = pbin.getText();
                    final int dec = Integer.parseInt(bin, 2);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String bin2 = pbin.getText();
                    final int dec2 = Integer.parseInt(bin2, 2);
                    pdec.setText(Integer.toString(dec2));

                    final String bin3 = pbin.getText();
                    final int dec3 = Integer.parseInt(bin3, 2);
                    final String oct = Integer.toOctalString(dec3);
                    poct.setText(oct);
                }
            }
        });
        p9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    String buton1 = phex.getText() + "9";
                    phex.setText(buton1);

                    final String hex = phex.getText();
                    final int dec = Integer.parseInt(hex, 16);
                    final String bin = Integer.toBinaryString(dec);
                    pbin.setText(bin);

                    final String hex2 = phex.getText();
                    final int dec2 = Integer.parseInt(hex2, 16);
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final String hex3 = phex.getText();
                    final int dec3 = Integer.parseInt(hex3, 16);
                    pdec.setText(Integer.toString(dec3));
                }

                if (DECCheckBox.isSelected()){
                    String buton1 = pdec.getText() + "9";
                    pdec.setText(buton1);

                    final int dec = Integer.parseInt(pdec.getText());
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final int dec2 = Integer.parseInt(pdec.getText());
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final int dec3 = Integer.parseInt(pdec.getText());
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (OCTCheckBox.isSelected()){
                    String buton1 = poct.getText() + "9";
                    poct.setText(buton1);

                    final String oct = poct.getText();
                    final int dec = Integer.parseInt(oct, 8);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String oct2 = poct.getText();
                    final int dec2 = Integer.parseInt(oct2, 8);
                    pdec.setText(Integer.toString(dec2));

                    final String oct3 = poct.getText();
                    final int dec3 = Integer.parseInt(oct3, 8);
                    final String bin = Integer.toBinaryString(dec3);
                    pbin.setText(bin);
                }

                if (BINCheckBox.isSelected()){
                    String buton1 = pbin.getText() + "9";
                    pbin.setText(buton1);


                    final String bin = pbin.getText();
                    final int dec = Integer.parseInt(bin, 2);
                    final String hex = Integer.toHexString(dec);
                    phex.setText(hex);

                    final String bin2 = pbin.getText();
                    final int dec2 = Integer.parseInt(bin2, 2);
                    pdec.setText(Integer.toString(dec2));

                    final String bin3 = pbin.getText();
                    final int dec3 = Integer.parseInt(bin3, 2);
                    final String oct = Integer.toOctalString(dec3);
                    poct.setText(oct);
                }
            }
        });


        // Pt fiecare CheckBox am creat un ActionListener, pentru a dezactiva(respectiv activa, pt cele care pot scrie o anumita baza) butoanele care nu pot scrie anumita baza(ex A,B..,F in baza Dec)
        // Schimbarea dintre baze reseteaza si valorile ce pot fi scrie in text field-uri.
        OCTCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (OCTCheckBox.isSelected()){
                    p8.setEnabled(false);
                    p9.setEnabled(false);
                    pA.setEnabled(false);
                    pB.setEnabled(false);
                    pC.setEnabled(false);
                    pD.setEnabled(false);
                    pE.setEnabled(false);
                    pF.setEnabled(false);
                    p0.setEnabled(true);
                    p1.setEnabled(true);
                    p2.setEnabled(true);
                    p3.setEnabled(true);
                    p4.setEnabled(true);
                    p5.setEnabled(true);
                    p6.setEnabled(true);
                    p7.setEnabled(true);
                    phex.setText("");
                    pdec.setText("");
                    poct.setText("");
                    pbin.setText("");
                }
            }
        });

        BINCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p8.setEnabled(false);
                p9.setEnabled(false);
                pA.setEnabled(false);
                pB.setEnabled(false);
                pC.setEnabled(false);
                pD.setEnabled(false);
                pE.setEnabled(false);
                pF.setEnabled(false);
                p0.setEnabled(true);
                p1.setEnabled(true);
                p2.setEnabled(false);
                p3.setEnabled(false);
                p4.setEnabled(false);
                p5.setEnabled(false);
                p6.setEnabled(false);
                p7.setEnabled(false);
                phex.setText("");
                pdec.setText("");
                poct.setText("");
                pbin.setText("");
            }
        });
        DECCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p8.setEnabled(true);
                p9.setEnabled(true);
                pA.setEnabled(false);
                pB.setEnabled(false);
                pC.setEnabled(false);
                pD.setEnabled(false);
                pE.setEnabled(false);
                pF.setEnabled(false);
                p0.setEnabled(true);
                p1.setEnabled(true);
                p2.setEnabled(true);
                p3.setEnabled(true);
                p4.setEnabled(true);
                p5.setEnabled(true);
                p6.setEnabled(true);
                p7.setEnabled(true);
                phex.setText("");
                pdec.setText("");
                poct.setText("");
                pbin.setText("");
            }
        });
        HEXCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p8.setEnabled(true);
                p9.setEnabled(true);
                pA.setEnabled(true);
                pB.setEnabled(true);
                pC.setEnabled(true);
                pD.setEnabled(true);
                pE.setEnabled(true);
                pF.setEnabled(true);
                p0.setEnabled(true);
                p1.setEnabled(true);
                p2.setEnabled(true);
                p3.setEnabled(true);
                p4.setEnabled(true);
                p5.setEnabled(true);
                p6.setEnabled(true);
                p7.setEnabled(true);
                phex.setText("");
                pdec.setText("");
                poct.setText("");
                pbin.setText("");
            }
        });
        PClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                phex.setText("");
                pdec.setText("");
                poct.setText("");
                pbin.setText("");
            }
        });
        PDEL.addActionListener(new ActionListener() {       // Butonul DEL functioneaza la fel ca in celelalte doua variante prezentate anterior
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()) {
                    String on;
                    int del = phex.getText().length() - 1;
                    if (del == 0) {
                        phex.setText("");
                        pdec.setText("");
                        poct.setText("");
                        pbin.setText("");
                    } else {
                        if (del + 1 > 0) {
                            StringBuilder nn = new StringBuilder(phex.getText());
                            nn.deleteCharAt(del);
                            on = nn.toString();
                            phex.setText(on);
                            final String hex = on;
                            final int dec = Integer.parseInt(hex, 16);
                            final String bin = Integer.toBinaryString(dec);
                            pbin.setText(bin);

                            final String hex2 = on;
                            final int dec2 = Integer.parseInt(hex2, 16);
                            final String oct = Integer.toOctalString(dec2);
                            poct.setText(oct);

                            final String hex3 = on;
                            final int dec3 = Integer.parseInt(hex3, 16);
                            pdec.setText(Integer.toString(dec3));
                        }
                    }
                }


                    if (DECCheckBox.isSelected()) {
                        String on;
                        int del = pdec.getText().length() - 1;
                        if (del == 0) {
                            phex.setText("");
                            pdec.setText("");
                            poct.setText("");
                            pbin.setText("");
                        } else {
                            if (del + 1 > 0) {
                                StringBuilder nn = new StringBuilder(pdec.getText());
                                nn.deleteCharAt(del);
                                on = nn.toString();
                                pdec.setText(on);
                                final int dec = Integer.parseInt(on);
                                final String hex = Integer.toHexString(dec);
                                phex.setText(hex);

                                final int dec2 = Integer.parseInt(on);
                                final String oct = Integer.toOctalString(dec2);
                                poct.setText(oct);

                                final int dec3 = Integer.parseInt(on);
                                final String bin = Integer.toBinaryString(dec3);
                                pbin.setText(bin);
                            }
                        }
                    }

                    if (OCTCheckBox.isSelected()) {
                        String on;
                        int del = poct.getText().length() - 1;
                        if (del == 0) {
                            phex.setText("");
                            pdec.setText("");
                            poct.setText("");
                            pbin.setText("");
                        } else {
                            if (del + 1 > 0) {
                                StringBuilder nn = new StringBuilder(poct.getText());
                                nn.deleteCharAt(del);
                                on = nn.toString();
                                poct.setText(on);
                                final String oct = on;
                                final int dec = Integer.parseInt(oct, 8);
                                final String hex = Integer.toHexString(dec);
                                phex.setText(hex);

                                final String oct2 = on;
                                final int dec2 = Integer.parseInt(oct2, 8);
                                pdec.setText(Integer.toString(dec2));

                                final String oct3 = on;
                                final int dec3 = Integer.parseInt(oct3, 8);
                                final String bin = Integer.toBinaryString(dec3);
                                pbin.setText(bin);
                            }
                        }
                    }

                    if (BINCheckBox.isSelected()) {
                        String on;
                        int del = pbin.getText().length() - 1;
                        if (del == 0) {
                            phex.setText("");
                            pdec.setText("");
                            poct.setText("");
                            pbin.setText("");
                        } else {
                            if (del + 1 > 0) {
                                StringBuilder nn = new StringBuilder(pbin.getText());
                                nn.deleteCharAt(del);
                                on = nn.toString();
                                pbin.setText(on);
                                final String bin = on;
                                final int dec = Integer.parseInt(bin, 2);
                                final String hex = Integer.toHexString(dec);
                                phex.setText(hex);

                                final String bin2 = on;
                                final int dec2 = Integer.parseInt(bin2, 2);
                                pdec.setText(Integer.toString(dec2));

                                final String bin3 = on;
                                final int dec3 = Integer.parseInt(bin3, 2);
                                final String oct = Integer.toOctalString(dec3);
                                poct.setText(oct);
                            }
                        }
                    }
                }

        });
        PClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                phex.setText("");
                pdec.setText("");
                poct.setText("");
                pbin.setText("");
            }
        });
        pA.addActionListener(new ActionListener() {     //Butoanele A-F sunt activate doar in baza HEX, functionand pe principiul but. 0-9
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    String buton1 = phex.getText() + "A";
                    phex.setText(buton1);

                    final String hex = phex.getText();
                    final int dec = Integer.parseInt(hex, 16);
                    final String bin = Integer.toBinaryString(dec);
                    pbin.setText(bin);

                    final String hex2 = phex.getText();
                    final int dec2 = Integer.parseInt(hex2, 16);
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final String hex3 = phex.getText();
                    final int dec3 = Integer.parseInt(hex3, 16);
                    pdec.setText(Integer.toString(dec3));
                }
            }
        });
        pB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    String buton1 = phex.getText() + "B";
                    phex.setText(buton1);

                    final String hex = phex.getText();
                    final int dec = Integer.parseInt(hex, 16);
                    final String bin = Integer.toBinaryString(dec);
                    pbin.setText(bin);

                    final String hex2 = phex.getText();
                    final int dec2 = Integer.parseInt(hex2, 16);
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final String hex3 = phex.getText();
                    final int dec3 = Integer.parseInt(hex3, 16);
                    pdec.setText(Integer.toString(dec3));
                }
            }
        });
        pC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    String buton1 = phex.getText() + "C";
                    phex.setText(buton1);

                    final String hex = phex.getText();
                    final int dec = Integer.parseInt(hex, 16);
                    final String bin = Integer.toBinaryString(dec);
                    pbin.setText(bin);

                    final String hex2 = phex.getText();
                    final int dec2 = Integer.parseInt(hex2, 16);
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final String hex3 = phex.getText();
                    final int dec3 = Integer.parseInt(hex3, 16);
                    pdec.setText(Integer.toString(dec3));
                }
            }
        });
        pD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    String buton1 = phex.getText() + "D";
                    phex.setText(buton1);

                    final String hex = phex.getText();
                    final int dec = Integer.parseInt(hex, 16);
                    final String bin = Integer.toBinaryString(dec);
                    pbin.setText(bin);

                    final String hex2 = phex.getText();
                    final int dec2 = Integer.parseInt(hex2, 16);
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final String hex3 = phex.getText();
                    final int dec3 = Integer.parseInt(hex3, 16);
                    pdec.setText(Integer.toString(dec3));
                }
            }
        });
        pE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    String buton1 = phex.getText() + "E";
                    phex.setText(buton1);

                    final String hex = phex.getText();
                    final int dec = Integer.parseInt(hex, 16);
                    final String bin = Integer.toBinaryString(dec);
                    pbin.setText(bin);

                    final String hex2 = phex.getText();
                    final int dec2 = Integer.parseInt(hex2, 16);
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final String hex3 = phex.getText();
                    final int dec3 = Integer.parseInt(hex3, 16);
                    pdec.setText(Integer.toString(dec3));
                }
            }
        });
        pF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    String buton1 = phex.getText() + "F";
                    phex.setText(buton1);

                    final String hex = phex.getText();
                    final int dec = Integer.parseInt(hex, 16);
                    final String bin = Integer.toBinaryString(dec);
                    pbin.setText(bin);

                    final String hex2 = phex.getText();
                    final int dec2 = Integer.parseInt(hex2, 16);
                    final String oct = Integer.toOctalString(dec2);
                    poct.setText(oct);

                    final String hex3 = phex.getText();
                    final int dec3 = Integer.parseInt(hex3, 16);
                    pdec.setText(Integer.toString(dec3));
                }
            }
        });
        psemn.addActionListener(new ActionListener() { //Butonul +/- schimba semnul nr-ului pe care vrem sa il convertim. Sunt tratare situatiile cand nu avem numar introdus (phex.getText().equals(""))
            @Override                                  // si cand nr introdus este 0(Integer.parseInt(phex.getText())==0), butonul fiind dezactivat.
            public void actionPerformed(ActionEvent e) {
                if (HEXCheckBox.isSelected()){
                    if (phex.getText().equals(""))
                        psemn.setEnabled(false);
                    else if (Integer.parseInt(phex.getText())==0)
                        psemn.setEnabled(false);
                    else {
                        int semn = Integer.parseInt(phex.getText());
                        semn = semn * (-1);
                        phex.setText(Integer.toString(semn));

                        final String hex = Integer.toString(semn);
                        final int dec = Integer.parseInt(hex, 16);
                        final String bin = Integer.toBinaryString(dec);
                        pbin.setText(bin);

                        final String hex2 = Integer.toString(semn);
                        final int dec2 = Integer.parseInt(hex2, 16);
                        final String oct = Integer.toOctalString(dec2);
                        poct.setText(oct);

                        final String hex3 = Integer.toString(semn);
                        final int dec3 = Integer.parseInt(hex3, 16);
                        pdec.setText(Integer.toString(dec3));
                    }
                    psemn.setEnabled(true);
                }
                if (DECCheckBox.isSelected()){
                    if (pdec.getText().equals(""))
                        psemn.setEnabled(false);
                    else if (Integer.parseInt(pdec.getText())==0)
                        psemn.setEnabled(false);
                    else {
                        int semn = Integer.parseInt(pdec.getText());
                        semn = semn * (-1);
                        pdec.setText(Integer.toString(semn));

                        final int dec = semn;
                        final String hex = Integer.toHexString(dec);
                        phex.setText(hex);

                        final int dec2 = semn;
                        final String oct = Integer.toOctalString(dec2);
                        poct.setText(oct);

                        final int dec3 = semn;
                        final String bin = Integer.toBinaryString(dec3);
                        pbin.setText(bin);
                    }
                    psemn.setEnabled(true);
                }
                if (OCTCheckBox.isSelected()){
                    if (poct.getText().equals(""))
                        psemn.setEnabled(false);
                    else if (Integer.parseInt(poct.getText())==0)
                        psemn.setEnabled(false);
                    else {
                        int semn = Integer.parseInt(poct.getText());
                        semn = semn * (-1);
                        poct.setText(Integer.toString(semn));

                        final String oct = Integer.toString(semn);
                        final int dec = Integer.parseInt(oct, 8);
                        final String hex = Integer.toHexString(dec);
                        phex.setText(hex);

                        final String oct2 = Integer.toString(semn);
                        final int dec2 = Integer.parseInt(oct2, 8);
                        pdec.setText(Integer.toString(dec2));

                        final String oct3 = Integer.toString(semn);
                        final int dec3 = Integer.parseInt(oct3, 8);
                        final String bin = Integer.toBinaryString(dec3);
                        pbin.setText(bin);
                    }
                    psemn.setEnabled(true);
                }
                if (BINCheckBox.isSelected()){
                    if (pbin.getText().equals(""))
                        psemn.setEnabled(false);
                    else if (Integer.parseInt(pbin.getText())==0)
                        psemn.setEnabled(false);
                    else {
                        int semn = Integer.parseInt(pbin.getText());
                        semn = semn * (-1);
                        pbin.setText(Integer.toString(semn));

                        final String bin = Integer.toString(semn);
                        final int dec = Integer.parseInt(bin, 2);
                        final String hex = Integer.toHexString(dec);
                        phex.setText(hex);

                        final String bin2 = Integer.toString(semn);
                        final int dec2 = Integer.parseInt(bin2, 2);
                        pdec.setText(Integer.toString(dec2));

                        final String bin3 = Integer.toString(semn);
                        final int dec3 = Integer.parseInt(bin3, 2);
                        final String oct = Integer.toOctalString(dec3);
                        poct.setText(oct);
                    }
                    psemn.setEnabled(true);
                }
            }
        });
    }

    public static void main(String[] args) throws Exception {
       // String str = "com.jtattoo.plaf.texture.TextureLookAndFeel";
       // UIManager.setLookAndFeel(str);

        JFrame frame = new JFrame("calc");
        frame.setContentPane(new calc().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
