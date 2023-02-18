import javax.swing.JOptionPane;

public class random {
    public static void main(String args[]) {
        double number1, number2;

        String num1 =

                JOptionPane.showInputDialog("First Number:");

        // create the message

        String num2 =

                JOptionPane.showInputDialog("Second Number:");

        number1 = Double.parseDouble(num1);

        number2 = Double.parseDouble(num2);

        String disp =

                String.format("%f multiply %f = %f ", number1, number2, number1 * number2);

        // display the message to welcome the user by name

        JOptionPane.showMessageDialog(null, disp);
    }
}
