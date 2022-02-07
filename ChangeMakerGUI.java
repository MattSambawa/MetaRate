import javax.swing.JOptionPane;

public class ChangeMakerGUI {

    public static void main(String[] args) {

        int balance = Integer.parseInt(JOptionPane.showInputDialog("Enter number of cents: "));

        int countQuarters = 0;
        int countDimes = 0;
        int countNickels = 0;
        int countPennies = 0;

        countQuarters = balance / 25;
        balance = balance - (countQuarters * 25);
        countDimes = balance / 10;
        balance = balance - (countDimes * 10);
        countNickels = balance / 5;
        balance = balance - (countNickels * 5);
        countPennies = balance;

        String message = "";
        message += "Quarters: " + countQuarters + "\n";
        message += "Dimes: " + countDimes + "\n";
        message += "Nickels: " + countNickels + "\n";
        message += "Pennies: " + countPennies + "\n";

        JOptionPane.showMessageDialog(null, message);
    }

}