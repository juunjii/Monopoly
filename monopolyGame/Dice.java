
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Dice {
    // Create an object of Random class
    Random rand = new Random();
    public int diceValue;

    // Roll method
    public int roll() {
        // Declare diceValue variable
        int diceValue;
        diceValue = rand.nextInt(6) + 1; // Random number generator from 1-6

        // Conditions when the diceValue is 1
        if (diceValue == 1) {
            // Image Icon for JOptionPane
            ImageIcon icon = new ImageIcon("images/Photo/dice1.png");
            // Make an image object to enable resizing of the image
            Image image = icon.getImage();
            // Setting dimensions for image object
            Image modifiedImage = image.getScaledInstance(45, 45, java.awt.Image.SCALE_SMOOTH);
            // Assign modified image to icon
            icon = new ImageIcon(modifiedImage);
            JOptionPane.showMessageDialog(null, "You rolled " + diceValue + ".",
                    "Dice", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        // Conditions when the diceValue is 2
        if (diceValue == 2) {
            // Image Icon for JOptionPane
            ImageIcon icon = new ImageIcon("images/Photo/dice2.png");
            // Make an image object to enable resizing of the image
            Image image = icon.getImage();
            // Setting dimensions for image object
            Image modifiedImage = image.getScaledInstance(45, 45, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(modifiedImage); // Assign modified image to icon
            JOptionPane.showMessageDialog(null, "You rolled " + diceValue + ".",
                    "Dice", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        // Conditions when the diceValue is 3
        if (diceValue == 3) {
            ImageIcon icon = new ImageIcon("images/Photo/dice3.png"); // Image Icon for JOptionPane
            Image image = icon.getImage(); // Make an image object to enable resizing of the image
            // Setting dimensions for image object
            Image modifiedImage = image.getScaledInstance(45, 45, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(modifiedImage); // Assign modified image to icon
            JOptionPane.showMessageDialog(null, "You rolled " + diceValue + ".",
                    "Dice", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        // Conditions when the diceValue is 4
        if (diceValue == 4) {
            ImageIcon icon = new ImageIcon("images/Photo/dice4.png"); // Image Icon for JOptionPane
            Image image = icon.getImage(); // Make an image object to enable resizing of the image
            // Setting dimensions for image object
            Image modifiedImage = image.getScaledInstance(45, 45, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(modifiedImage); // Assign modified image to icon
            JOptionPane.showMessageDialog(null, "You rolled " + diceValue + ".",
                    "Dice", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        // Conditions when the diceValue is 5
        if (diceValue == 5) {
            ImageIcon icon = new ImageIcon("images/Photo/dice5.png"); // Image Icon for JOptionPane
            Image image = icon.getImage();
            // Setting dimensions for Icon
            Image modifiedImage = image.getScaledInstance(45, 45, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(modifiedImage); // Assign modified image to icon
            JOptionPane.showMessageDialog(null, "You rolled " + diceValue + ".",
                    "Dice", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        // Conditions when the diceValue is 6
        if (diceValue == 6) {
            ImageIcon icon = new ImageIcon("images/Photo/dice6.png"); // Image Icon for JOptionPane
            Image image = icon.getImage();
            // Setting dimensions for Icon
            Image modifiedImage = image.getScaledInstance(45, 45, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(modifiedImage); // Assign modified image to icon
            JOptionPane.showMessageDialog(null, "You rolled dice " + diceValue + ".",
                    "Dice", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        return diceValue;
    }
}