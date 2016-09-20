import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;
import java.awt.event.*;

public class CalcWindow extends JFrame {

    JFrame frame = new JFrame("Калькулятор ");
    Font jButtonFont = new Font("Arial", Font.CENTER_BASELINE, 13);
    Font jTextFieldFont = new Font("Arial", Font.CENTER_BASELINE, 20);

    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton zero = new JButton("0");

    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton multiplication = new JButton("*");
    JButton division = new JButton("/");
    JButton equally = new JButton("=");
    JButton clean = new JButton("c");
    JButton point = new JButton(".");
    JButton sqrt = new JButton("√");
    JButton plusminus = new JButton("+-");
    JButton reciproc = new JButton("1/x");

    JTextField calcField = new JTextField(18);

    double firstTemp = 0;
    double firstCountForManyOperation = 0;
    String arifmeticOperations = "+";

    public void creatingWindow() {

        Container colorCont = frame.getContentPane();
        colorCont.setBackground(Color.DARK_GRAY);
        colorCont.setForeground(Color.DARK_GRAY);

        frame.setDefaultLookAndFeelDecorated(true);
        frame.setSize(new Dimension(300, 300));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        frame.setVisible(true);
        frame.setResizable(false);

        AbstractDocument doc = (AbstractDocument) calcField.getDocument();
        doc.setDocumentFilter(new LengthFilter(doc.getLength(), 20)); //длина строки
    }

    public void creatingButtons() { //описание кнопок

        calcField.setFont(jTextFieldFont);
        calcField.setBackground(Color.DARK_GRAY);
        calcField.setForeground(Color.CYAN);
        calcField.setBorder(null);
        calcField.setHorizontalAlignment(JTextField.RIGHT);


        one.setFont(jButtonFont);
        one.setFocusPainted(false);
        one.setBackground(Color.DARK_GRAY);
        one.setForeground(Color.CYAN);
        one.setBorder(null);
        one.setPreferredSize(new Dimension(40, 30));

        two.setFont(jButtonFont);
        two.setFocusPainted(false);
        two.setBackground(Color.DARK_GRAY);
        two.setForeground(Color.CYAN);
        two.setBorder(null);
        two.setPreferredSize(new Dimension(40, 30));

        three.setFont(jButtonFont);
        three.setFocusPainted(false);
        three.setBackground(Color.DARK_GRAY);
        three.setForeground(Color.CYAN);
        three.setBorder(null);
        three.setPreferredSize(new Dimension(40, 30));

        four.setFont(jButtonFont);
        four.setFocusPainted(false);
        four.setBackground(Color.DARK_GRAY);
        four.setForeground(Color.CYAN);
        four.setBorder(null);
        four.setPreferredSize(new Dimension(40, 30));

        five.setFont(jButtonFont);
        five.setFocusPainted(false);
        five.setBackground(Color.DARK_GRAY);
        five.setForeground(Color.CYAN);
        five.setBorder(null);
        five.setPreferredSize(new Dimension(40, 30));

        six.setFont(jButtonFont);
        six.setFocusPainted(false);
        six.setBackground(Color.DARK_GRAY);
        six.setForeground(Color.CYAN);
        six.setBorder(null);
        six.setPreferredSize(new Dimension(40, 30));

        seven.setFont(jButtonFont);
        seven.setFocusPainted(false);
        seven.setBackground(Color.DARK_GRAY);
        seven.setForeground(Color.CYAN);
        seven.setBorder(null);
        seven.setPreferredSize(new Dimension(40, 30));

        eight.setFont(jButtonFont);
        eight.setFocusPainted(false);
        eight.setBackground(Color.DARK_GRAY);
        eight.setForeground(Color.CYAN);
        eight.setBorder(null);
        eight.setPreferredSize(new Dimension(40, 30));

        nine.setFont(jButtonFont);
        nine.setFocusPainted(false);
        nine.setBackground(Color.DARK_GRAY);
        nine.setForeground(Color.CYAN);
        nine.setBorder(null);
        nine.setPreferredSize(new Dimension(40, 30));

        zero.setFont(jButtonFont);
        zero.setFocusPainted(false);
        zero.setBackground(Color.DARK_GRAY);
        zero.setForeground(Color.CYAN);
        zero.setBorder(null);
        zero.setPreferredSize(new Dimension(40, 30));

        plus.setFont(jButtonFont);
        plus.setFocusPainted(false);
        plus.setBackground(Color.DARK_GRAY);
        plus.setForeground(Color.CYAN);
        plus.setBorder(null);
        plus.setPreferredSize(new Dimension(40, 30));

        minus.setFont(jButtonFont);
        minus.setFocusPainted(false);
        minus.setBackground(Color.DARK_GRAY);
        minus.setForeground(Color.CYAN);
        minus.setBorder(null);
        minus.setPreferredSize(new Dimension(40, 30));

        multiplication.setFont(jButtonFont);
        multiplication.setFocusPainted(false);
        multiplication.setBackground(Color.DARK_GRAY);
        multiplication.setForeground(Color.CYAN);
        multiplication.setBorder(null);
        multiplication.setPreferredSize(new Dimension(40, 30));

        division.setFont(jButtonFont);
        division.setFocusPainted(false);
        division.setBackground(Color.DARK_GRAY);
        division.setForeground(Color.CYAN);
        division.setBorder(null);
        division.setPreferredSize(new Dimension(40, 30));

        equally.setFont(jButtonFont);
        equally.setFocusPainted(false);
        equally.setBackground(Color.DARK_GRAY);
        equally.setForeground(Color.CYAN);
        equally.setBorder(null);
        equally.setPreferredSize(new Dimension(40, 30));

        clean.setFont(jButtonFont);
        clean.setFocusPainted(false);
        clean.setBackground(Color.DARK_GRAY);
        clean.setForeground(Color.CYAN);
        clean.setBorder(null);
        clean.setPreferredSize(new Dimension(40, 30));

        point.setFont(jButtonFont);
        point.setFocusPainted(false);
        point.setBackground(Color.DARK_GRAY);
        point.setForeground(Color.CYAN);
        point.setBorder(null);
        point.setPreferredSize(new Dimension(40, 30));

        sqrt.setFont(jButtonFont);
        sqrt.setFocusPainted(false);
        sqrt.setBackground(Color.DARK_GRAY);
        sqrt.setForeground(Color.CYAN);
        sqrt.setBorder(null);
        sqrt.setPreferredSize(new Dimension(40, 30));

        plusminus.setFont(jButtonFont);
        plusminus.setFocusPainted(false);
        plusminus.setBackground(Color.DARK_GRAY);
        plusminus.setForeground(Color.CYAN);
        plusminus.setBorder(null);
        plusminus.setPreferredSize(new Dimension(40, 30));

        reciproc.setFont(jButtonFont);
        reciproc.setFocusPainted(false);
        reciproc.setBackground(Color.DARK_GRAY);
        reciproc.setForeground(Color.CYAN);
        reciproc.setBorder(null);
        reciproc.setPreferredSize(new Dimension(40, 30));
    }

    public void addButtons() { //добавление их на форму
        frame.add(calcField, new GridBagConstraints(0, 0, 0, 0, 0, 0,
                GridBagConstraints.NORTHWEST, GridBagConstraints.NONE,
                new Insets(5, 10, 10, 0), 0, 0));

        frame.add(one, new GridBagConstraints(0, 3, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(5, 10, 0, 5), 0, 0));
        frame.add(two, new GridBagConstraints(1, 3, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(5, 0, 0, 5), 0, 0));
        frame.add(three, new GridBagConstraints(2, 3, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(5, 0, 0, 0), 0, 0));
        frame.add(four, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(5, 10, 0, 5), 0, 0));
        frame.add(five, new GridBagConstraints(1, 2, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(5, 0, 0, 5), 0, 0));
        frame.add(six, new GridBagConstraints(2, 2, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(5, 0, 0, 0), 0, 0));
        frame.add(seven, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(47, 10, 0, 5), 0, 0));
        frame.add(eight, new GridBagConstraints(1, 1, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(47, 0, 0, 5), 0, 0));
        frame.add(nine, new GridBagConstraints(2, 1, 0, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(47, 0, 0, 5), 0, 0));
        frame.add(zero, new GridBagConstraints(0, 4, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(5, 10, 10, 0), 0, 0));

        frame.add(plus, new GridBagConstraints(2, 4, 0, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(5, 0, 10, 5), 0, 0));
        frame.add(minus, new GridBagConstraints(3, 4, 0, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(-5, 5, 0, 5), 0, 0));
        frame.add(multiplication, new GridBagConstraints(3, 3, 0, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(5, 5, 0, 5), 0, 0));
        frame.add(division, new GridBagConstraints(3, 2, 0, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(5, 5, 0, 5), 0, 0));
        frame.add(equally, new GridBagConstraints(1, 4, 0, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(0, 0, 5, 0), 0, 0));

        frame.add(point, new GridBagConstraints(4, 4, 0, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(0, 0, 10, 0), 0, 0));
        frame.add(plusminus, new GridBagConstraints(4, 3, 0, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 0, 0));
        frame.add(sqrt, new GridBagConstraints(4, 2, 0, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 0, 0));
        frame.add(reciproc, new GridBagConstraints(4, 1, 0, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(47, 0, 0, 0), 0, 0));

        frame.add(clean, new GridBagConstraints(3, 1, 1, 1, 1, 1,
                GridBagConstraints.WEST, GridBagConstraints.NONE,
                new Insets(47, 5, 0, 0), 0, 0));

        frame.pack();

    }

    public void addActionForButtons() { //приписывание каждой кнопке соответствующего события 

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.setText(calcField.getText() + "1");
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.setText(calcField.getText() + "2");
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.setText(calcField.getText() + "3");
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.setText(calcField.getText() + "4");
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.setText(calcField.getText() + "5");
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.setText(calcField.getText() + "6");
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.setText(calcField.getText() + "7");
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.setText(calcField.getText() + "8");
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.setText(calcField.getText() + "9");
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.setText(calcField.getText() + "0");
            }
        });

        calcField.addKeyListener(new KeyListener() { 
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e)  { //слушатель кнопок клавиатуры при нажатие
                try {
                    calcField.setText(calcField.getText());
                    firstTemp = Integer.valueOf(calcField.getText());
                    if (e.getKeyChar() == '/')
                        calcField.setText("");
                    if (e.getKeyChar() == '*')
                        calcField.setText("");
                    if (e.getKeyChar() == '+')
                        calcField.setText("");
                    if (e.getKeyChar() == '-')
                        calcField.setText("");

                    if (e.getKeyChar() == '=')
                        try {
                            int secondTemp = Integer.valueOf(calcField.getText());
                            if ("+".equals(arifmeticOperations)) {
                                calcField.setText((firstCountForManyOperation + secondTemp) + "");
                            }
                            if ("-".equals(arifmeticOperations))
                                calcField.setText((firstCountForManyOperation - secondTemp) + "");
                            if ("*".equals(arifmeticOperations))
                                calcField.setText((firstCountForManyOperation * secondTemp) + "");

                            if ("/".equals(arifmeticOperations)) {
                                calcField.setText("");
                                if (secondTemp == 0)
                                    calcField.setText("is impossible");
                                calcField.setText((firstCountForManyOperation / secondTemp) + "");
                            }

                            } catch (NumberFormatException nfe) {}
                } catch (NumberFormatException nfe) {
                }
            }

            @Override
            public void keyReleased(KeyEvent e) { //слушатель кнопоки когда она отжалась

                if (e.getKeyChar() == '=') {
                    String temp = calcField.getText();
                    calcField.setText(temp.substring(0, temp.length() - 1));
                    firstTemp = 0;
                    arifmeticOperations = "+";
                }
                if (e.getKeyChar() == '/') {
                    try {
                        calcField.setText("");
                        arifmeticOperations = "/";
                        firstCountForManyOperation = firstTemp;
                    } catch (NumberFormatException n) {
                    }
                }
                if (e.getKeyChar() == '+') {
                    try {
                        calcField.setText("");
                        arifmeticOperations = "+";
                        firstCountForManyOperation = firstTemp;
                    } catch (NumberFormatException n) {
                    }
                }
                if (e.getKeyChar() == '-') {
                    try {
                        calcField.setText("");
                        arifmeticOperations = "-";
                        firstCountForManyOperation = firstTemp;
                    } catch (NumberFormatException n) {
                    }
                }
                if (e.getKeyChar() == '*') {
                    try {
                        calcField.setText("");
                        arifmeticOperations = "*";
                        firstCountForManyOperation = firstTemp;
                    } catch (NumberFormatException n) {
                    }
                }
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    calcField.setText(calcField.getText());
                    firstTemp = Double.valueOf(calcField.getText());
                    calcField.setText("");
                    arifmeticOperations = "+";
                }catch (NumberFormatException nfe){}
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    calcField.setText(calcField.getText());
                    firstTemp = Double.valueOf(calcField.getText());
                    calcField.setText("");
                    arifmeticOperations = "-";
                }catch (NumberFormatException nfe){}
            }
        });

        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    calcField.setText(calcField.getText());
                    firstTemp = Double.valueOf(calcField.getText());
                    calcField.setText("");
                    arifmeticOperations = "*";
                }catch (NumberFormatException nfe){}
            }
        });

        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    calcField.setText(calcField.getText());
                    firstTemp = Double.valueOf(calcField.getText());
                    calcField.setText("");
                    arifmeticOperations = "/";
                } catch (NumberFormatException nfe) {}
            }
        });

        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double tmpD;
                    int tmpI;
                    calcField.setText(calcField.getText());
                    tmpD = Double.valueOf(calcField.getText());
                    tmpD = Math.sqrt(tmpD);
                    tmpI = (int)tmpD;
                    if(tmpD > tmpI)
                        calcField.setText(tmpD + "");
                    if(tmpD == tmpI)
                        calcField.setText(tmpI + "");



                }catch (NumberFormatException nfe){}
            }
        });

        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcField.setText(calcField.getText() + ".");
                calcField.setText(inputDigitsOnly(calcField.getText()));

            }
        });

        reciproc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double tmpD;
                    int tmpI;
                    calcField.setText(calcField.getText());
                    tmpD = Double.valueOf(calcField.getText());
                    tmpD = 1 / tmpD;
                    tmpI = (int) tmpD;
                    if (tmpD > tmpI)
                        calcField.setText(tmpD + "");
                    if (tmpD == tmpI)
                        calcField.setText(tmpI + "");
                }catch (NumberFormatException nfe){}

            }
        });

        plusminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double tmpD;
                    int tmpI;
                    calcField.setText(calcField.getText());
                    tmpD = Double.valueOf(calcField.getText());
                    tmpD = 0 - tmpD;
                    tmpI = (int)tmpD;
                    if(tmpD > tmpI)
                        calcField.setText(tmpD + "");
                    if(tmpD == tmpI)
                        calcField.setText(tmpI + "");
                }catch (NumberFormatException nfe){}
            }
        });

        equally.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {


                    Double secondTemp = Double.valueOf(calcField.getText());
                    if ("+".equals(arifmeticOperations))
                        calcField.setText((firstTemp + secondTemp) + "");
                    if ("-".equals(arifmeticOperations))
                        calcField.setText((firstTemp - secondTemp) + "");
                    if ("*".equals(arifmeticOperations))
                        calcField.setText((firstTemp * secondTemp) + "");

                    if ("/".equals(arifmeticOperations)) {
                        calcField.setText("");
                        if (secondTemp == 0)
                            calcField.setText("is impossible");
                        calcField.setText((firstTemp / secondTemp) + "");
                    }
                } catch (NumberFormatException nfe) {
                }
                firstTemp = 0;
                arifmeticOperations = "+";

            }
        });

        clean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String temp = calcField.getText();
                    calcField.setText("");
                } catch (StringIndexOutOfBoundsException siooe) {
                }
            }
        });

        calcField.addKeyListener(new KeyAdapter() { //проверка на ввод только цифр
            @Override
            public void keyReleased(KeyEvent e) {
                calcField.setText(inputDigitsOnly(calcField.getText()));
            }
        });
    }

    public String inputDigitsOnly(String tmp){ //проверка цифр
        int lost = tmp.length();
        String result = "";
        boolean onlyOne = false;

        for(int i = 0; i < lost; i++) {
            char dig = tmp.charAt(i);
            if(Character.isDigit(dig)) {
                result += tmp.substring(i, i + 1);
            } else if ((dig == '.') && !onlyOne) {
                onlyOne = true;
                result += tmp.substring(i, i + 1);
            }
        }
        return result;
    }

}
