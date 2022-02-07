import java.awt.event.*;
import javax.swing.*;

class BasalMetabolicRateGUI {

    public static void main(String[] args) {
        JFrame f = new JFrame("BMI Calculator");
        JLabel weight = new JLabel("Weight in Pounds ");
        weight.setBounds(10, 10, 150, 30);
        JTextField weight_tf = new JTextField();

        weight_tf.setBounds(170, 10, 250, 30);
        JLabel height = new JLabel("Height in inches ");
        height.setBounds(10, 40, 150, 30);
        JTextField height_tf = new JTextField();

        height_tf.setBounds(170, 40, 250, 30);
        JLabel age = new JLabel("Age In Years ");
        age.setBounds(10, 70, 150, 30);
        JTextField age_tf = new JTextField();

        age_tf.setBounds(170, 70, 250, 30);
        JButton calc = new JButton("Calculate");
        calc.setBounds(10, 100, 100, 30);

        calc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (weight_tf.getText().length() > 0 && height_tf.getText().length() > 0 && age_tf.getText().length() > 0) {
                    String[] options = { "Male", "Female" };
                    int x = JOptionPane.showOptionDialog(null, "Choose gender", "Click a button", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                    if (x == 0 || x == 1) {
                        String[] options1 = { "Sedentary", "Somewhat inactive", "Active", "Highly active", };
                        String n = (String) JOptionPane.showInputDialog(null, "How active are you?", "Activity", JOptionPane.QUESTION_MESSAGE, null, options1, options1[0]);
                        double bmr = 0;

                        if (x == 0) {
                            bmr = 66 + (6.23 * Double.parseDouble(weight_tf.getText())) + (12.7 * Double.parseDouble(height_tf.getText())) - (6.8 * Double.parseDouble(age_tf.getText()));

                        } else if (x == 1) {

                            bmr = 655  + (4.35 * Double.parseDouble(weight_tf.getText())) + (4.7 * Double.parseDouble(height_tf.getText())) - (4.7 * Double.parseDouble(age_tf.getText()));

                        }

                        if (n.equals("Sedentary")) {
                            bmr = bmr * 1.2;

                        } else if (n.equals("Somewhat inactive")) {
                            bmr = bmr * 1.3;

                        } else if (n.equals("Active")) {
                            bmr = bmr*1.4;

                        }

                        else if (n.equals("Highly active")) {
                            bmr = bmr*1.5;

                        }

                        JOptionPane.showMessageDialog(null, "Calories Required : " + bmr);
                        int chocolateBars =(int)(Math.ceil(bmr / 230.0));
                        JOptionPane.showMessageDialog(null, "Chocolate Bars Required : " + chocolateBars);

                    }

                }

                else{

                    //show dialog msg inc ase of invalid msg

                    JOptionPane.showMessageDialog(null, "Invalid values enetered!");

                }

            }

        });

        // add the buttons and the text fields to the Jframe

        f.add(calc);

        f.add(weight);

        f.add(height);

        f.add(age);

        f.add(weight_tf);

        f.add(height_tf);

        f.add(age_tf);

        f.setSize(400, 400);// specifiy the size of the jframe

        f.setLayout(null);// set the layout of the frame

        f.setVisible(true);// specify the visibility of the frame to true

    }

}