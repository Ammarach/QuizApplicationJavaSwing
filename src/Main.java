import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Main implements ActionListener {

    JFrame quizFrame;
    JLabel buttonClicked;
    JRadioButton option[] = new JRadioButton[4];
    JButton nextButton, resultButton, okButton;
    ButtonGroup bg = new ButtonGroup();
    int count = 0;
    int current = 0;
    boolean optionSelected = false;
    JLabel quiz;
    public Main()
    {
        quizFrame = new JFrame("Quiz Application");
        quizFrame.setDefaultCloseOperation(quizFrame.EXIT_ON_CLOSE);
        quizFrame.setLayout(null);
        quizFrame.setSize(600, 400);
        quizFrame.setVisible(true);

        nextButton = new JButton("Next");
        nextButton.setBounds(50, 250, 100,30);
        quizFrame.add(nextButton);
        nextButton.addActionListener(this);

        resultButton = new JButton("Result");
        resultButton.setBounds(250, 250, 100,30);
        quizFrame.add(resultButton);
        resultButton.setEnabled(false);
        resultButton.addActionListener(this);

        buttonClicked = new JLabel("Correct answers : 0");
        buttonClicked.setBounds(50, 300, 250, 30);
        quizFrame.add(buttonClicked);

        quiz = new JLabel("Q1: Which one among these is not the data type?");
        quizFrame.add(quiz);
        Dimension size = quiz.getPreferredSize();
        quiz.setBounds(30, 50, 700, size.height);

//        JPopupMenu resultDisplay = new JPopupMenu("Result");
//        this.add(resultDisplay);
//        resultDisplay.setBounds(600, 600, 200, 200);
//
//        okButton = new JButton("Result");
//        okButton.setBounds(100, 100, 60,30);
//        quizFrame.add(okButton);
//      //  okButton.setEnabled(false);
//       // okButton.setVisible(false);
//        okButton.addActionListener(this);

        for (int i=0; i<4;i++) {
            option[i] = new JRadioButton();
            bg.add(option[i]);
            quizFrame.add(option[i]);
        }

        option[0].setText("int");
        option[1].setText("Float");
        option[2].setText("double");
        option[3].setText("char");
        option[0].setBounds(50, 80, 150, 20);
        option[1].setBounds(50, 110, 150, 20);
        option[2].setBounds(50, 140, 150, 20);
        option[3].setBounds(50, 170, 150, 20);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        new Main();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == nextButton)
        {
            current++;

            if(current == 1)
            {
                if(option[1].isSelected())
                {
                    count = count + 1;
                }
                quiz.setText("Q2: Which class is available to all the class automatically");
                option[0].setText("Swing");
                option[1].setText("Applet");
                option[2].setText("Object");
                option[3].setText("ActionEvent");
                buttonClicked.setText("Correct answers: " + count +"/10");

                bg.clearSelection();
            }

            if(current == 2)
            {
                if(option[2].isSelected())
                {
                    count = count + 1;
                }
                quiz.setText("Q3: Which package is directly available to our class without importing it");
                option[0].setText("swing");
                option[1].setText("applet");
                option[2].setText("net");
                option[3].setText("lang");
                buttonClicked.setText("Correct answers: " + count +"/10");

                bg.clearSelection();
            }

            if(current == 3)
            {
                if(option[3].isSelected())
                {
                    count = count + 1;
                }
                quiz.setText("Q4: String class is defined in which package");
                option[0].setText("lang");
                option[1].setText("Applet");
                option[2].setText("swing");
                option[3].setText("awt");
                buttonClicked.setText("Correct answers: " + count +"/10");

                bg.clearSelection();
            }

            if(current == 4)
            {
                if(option[0].isSelected())
                {
                    count = count + 1;
                }
                quiz.setText("Q5: Which institute is best for java coaching");
                option[0].setText("Guru99");
                option[1].setText("ABC");
                option[2].setText("xyz");
                option[3].setText("123");
                buttonClicked.setText("Correct answers: " + count +"/10");

                bg.clearSelection();
            }

            if(current == 5)
            {
                if(option[0].isSelected())
                {
                    count = count + 1;
                }
                quiz.setText("Q6: Which one among these is not a keyword");
                option[0].setText("class");
                option[1].setText("int");
                option[2].setText("get");
                option[3].setText("if");
                buttonClicked.setText("Correct answers: " + count +"/10");
                bg.clearSelection();
            }

            if(current == 6)
            {
                if(option[2].isSelected())
                {
                    count = count + 1;
                }
                quiz.setText("Q7: Which one among these is not a class");
                option[0].setText("Swing");
                option[1].setText("ActionPerformed");
                option[2].setText("ActionEvent");
                option[3].setText("Button");
                buttonClicked.setText("Correct answers: " + count +"/10");
                bg.clearSelection();
            }

            if(current == 7)
            {
                if(option[1].isSelected())
                {
                    count = count + 1;
                }
                quiz.setText("Q8: which one among these is not a function of Object class");
                option[0].setText("toString");
                option[1].setText("finalize");
                option[2].setText("equal");
                option[3].setText("getDocumentBase");
                buttonClicked.setText("Correct answers: " + count +"/10");
                bg.clearSelection();
            }

            if(current == 8)
            {
                if(option[3].isSelected())
                {
                    count = count + 1;
                }
                quiz.setText("Q9: which function is not present in Applet class");
                option[0].setText("init");
                option[1].setText("main");
                option[2].setText("start");
                option[3].setText("destroy");
                buttonClicked.setText("Correct answers: " + count +"/10");
                bg.clearSelection();
            }

            if(current == 9)
            {
                if(option[1].isSelected())
                {
                    count = count + 1;
                }
                quiz.setText("Q10: Which one among these is not a valid component");
                option[0].setText("JButton");
                option[1].setText("JList");
                option[2].setText("JButtonGroup");
                option[3].setText("JTextArea");
                buttonClicked.setText("Correct answers: " + count +"/10");
                bg.clearSelection();

                nextButton.setEnabled(false);
                resultButton.setEnabled(true);
            }

//            if(current == 10)
//            {
//                if(option[2].isSelected())
//                {
//                    count = count + 1;
//                }
//                bg.clearSelection();
//                for (int i=0; i<4; i++)
//                {
//                    option[i].setVisible(false);
//                    quiz.setVisible(false);
//                }
//            }
        }

        if (e.getSource() == resultButton)
        {
            if(option[2].isSelected())
            {
                count = count + 1;
            }
            buttonClicked.setText("Correct answers: " + count +"/10");
            JOptionPane.showMessageDialog(null, "Correct answers: " + count);
            System.exit(0);
        }
    }
}