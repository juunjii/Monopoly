import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;

public class monopolyGame {
        public static void main(String args[]) {

                // To initialize image from case40 (land on go!) to start game

                // Prints a string
                System.out.print("\n Start the Game! ");
                // Creates an ImageIcon from the specified file
                ImageIcon case40 = new ImageIcon("images/case40.jpg");
                // Returns this icon's Image
                Image case40_image = case40.getImage();
                // scaling image to desired dimensions
                Image modified_case40_image = case40_image.getScaledInstance(650, 650,
                                java.awt.Image.SCALE_SMOOTH);
                // Creates an ImageIcon from an image object
                case40 = new ImageIcon(modified_case40_image);
                // Creates a JLabel instance with the specified image
                JLabel case40_icon = new JLabel(case40);
                JLabel case40_text = new JLabel(
                                "\n Let's start the game!");
                // using JPanel to arrange layout and align texts
                JPanel case40_panel = new JPanel();
                // Sets the layout manager for this container
                case40_panel.setLayout(new BorderLayout());
                // Adds the specified component to the end of this container.
                case40_panel.add(case40_icon, BorderLayout.CENTER);
                case40_panel.add(case40_text, BorderLayout.SOUTH);
                // Sets the alignment of the label's contents along the X axis
                case40_text.setHorizontalAlignment(JLabel.CENTER);
                // Displays dialog that shows message
                JOptionPane.showMessageDialog(null, case40_panel, "Player position",
                                JOptionPane.PLAIN_MESSAGE);

                // Create an object class for Dice()
                Dice dice = new Dice();
                // Initialize diceValue from roll()
                int diceValue = dice.diceValue;

                // To initialize images for case 10 and case 30

                // Creates an ImageIcon from the specified file
                ImageIcon case10 = new ImageIcon("images/case10.jpg");
                // Returns this icon's Image
                Image case10_image = case10.getImage();
                // scaling image to desired dimensions
                Image modified_case10_image = case10_image.getScaledInstance(650, 650,
                                java.awt.Image.SCALE_SMOOTH);
                // Creates an ImageIcon from an image object
                case10 = new ImageIcon(modified_case10_image);
                // Creates a JLabel instance with the specified image
                JLabel case10_icon = new JLabel(case10);
                JLabel case10_text = new JLabel(
                                "\n You have landed on Jail or Just Visiting Jail!");
                // using JPanel to arrange layout and align texts
                JPanel case10_panel = new JPanel();
                // Sets the layout manager for this container
                case10_panel.setLayout(new BorderLayout());
                // Adds the specified component to the end of this container.
                case10_panel.add(case10_icon, BorderLayout.CENTER);
                case10_panel.add(case10_text, BorderLayout.SOUTH);
                // Sets the alignment of the label's contents along the X axis
                case10_text.setHorizontalAlignment(JLabel.CENTER);

                // for loop to keep track of player position after every dice roll

                for (int pos = diceValue; pos <= 39; pos += dice.roll()) {
                        switch (pos) {

                                // Player position at "Mediteranean Avenue"
                                case 1:
                                        // Prints a string
                                        System.out.print("\n Landed on Mediteranean Avenue");

                                        // Creates an ImageIcon from the specified file.
                                        ImageIcon case1 = new ImageIcon("images/case1.jpg");

                                        // Returns this icon's Image.
                                        Image case1_image = case1.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case1_image = case1_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object.
                                        case1 = new ImageIcon(modified_case1_image);

                                        // Creates a JLabel instance with the specified text.
                                        JLabel case1_icon = new JLabel(case1);

                                        // Creates a JLabel instance with the specified text.
                                        JLabel case1_text = new JLabel("\n You have landed on Mediteranean Street!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case1_panel = new JPanel();

                                        // Sets the layout manager for this container.
                                        case1_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case1_panel.add(case1_icon, BorderLayout.CENTER);
                                        case1_panel.add(case1_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis.
                                        case1_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case1_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);

                                        break;
                                // Player position at "Community Chest"
                                case 2:
                                        // Prints a string
                                        System.out.print("\n Landed on Community Chest");

                                        // Creates an ImageIcon from the specified file.
                                        ImageIcon case2 = new ImageIcon("images/case2.jpg");

                                        // Returns this icon's Image.
                                        Image case2_image = case2.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case2_image = case2_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case2 = new ImageIcon(modified_case2_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case2_icon = new JLabel(case2);
                                        JLabel case2_text = new JLabel(
                                                        "\n You have landed on Community Chest! Collect a card!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case2_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case2_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container
                                        case2_panel.add(case2_icon, BorderLayout.CENTER);
                                        case2_panel.add(case2_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis.
                                        case2_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case2_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Baltic Avenue"
                                case 3:
                                        // Prints a string
                                        System.out.print("\n Landed on Baltic Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case3 = new ImageIcon("images/case3.jpg");

                                        // Returns this icon's Image.
                                        Image case3_image = case3.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case3_image = case3_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case3 = new ImageIcon(modified_case3_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case3_icon = new JLabel(case3);
                                        JLabel case3_text = new JLabel("\n You have landed on Baltic Avenue!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case3_panel = new JPanel();

                                        // Sets the layout manager for this container.
                                        case3_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container
                                        case3_panel.add(case3_icon, BorderLayout.CENTER);
                                        case3_panel.add(case3_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis.
                                        case3_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case3_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Income Tax"
                                case 4:
                                        // Prints a string
                                        System.out.print("\n Landed on Income Tax");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case4 = new ImageIcon("images/case4.jpg");

                                        // Returns this icon's Image.
                                        Image case4_image = case4.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case4_image = case4_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object.
                                        case4 = new ImageIcon(modified_case4_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case4_icon = new JLabel(case4);
                                        JLabel case4_text = new JLabel(
                                                        "\n You have landed on Income Tax! Pay 10% or $200!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case4_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case4_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container
                                        case4_panel.add(case4_icon, BorderLayout.CENTER);
                                        case4_panel.add(case4_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case4_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case4_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Reading Railroad"
                                case 5:
                                        // Prints a string
                                        System.out.print("\n Landed on Reading Railroad");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case5 = new ImageIcon("images/case5.jpg");

                                        // Returns this icon's Image.
                                        Image case5_image = case5.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case5_image = case5_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case5 = new ImageIcon(modified_case5_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case5_icon = new JLabel(case5);
                                        JLabel case5_text = new JLabel("\n You have landed on Reading Railroad!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case5_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case5_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container
                                        case5_panel.add(case5_icon, BorderLayout.CENTER);
                                        case5_panel.add(case5_text, BorderLayout.SOUTH);

                                        // Adds the specified component to the end of this container
                                        case5_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case5_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Oriental Avenue"
                                case 6:
                                        // Prints a string
                                        System.out.print("\n Landed on Oriental Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case6 = new ImageIcon("images/case6.jpg");

                                        // Returns this icon's Image.
                                        Image case6_image = case6.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case6_image = case6_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case6 = new ImageIcon(modified_case6_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case6_icon = new JLabel(case6);
                                        JLabel case6_text = new JLabel("\n You have landed on Oriental Avenue!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case6_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case6_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container
                                        case6_panel.add(case6_icon, BorderLayout.CENTER);
                                        case6_panel.add(case6_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case6_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case6_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Chance"
                                case 7:
                                        // Prints a string
                                        System.out.print("\n Landed on Chance");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case7 = new ImageIcon("images/case7.jpg");

                                        // Returns this icon's Image.
                                        Image case7_image = case7.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case7_image = case7_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case7 = new ImageIcon(modified_case7_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case7_icon = new JLabel(case7);
                                        JLabel case7_text = new JLabel("\n You have landed on Chance! Collect a card!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case7_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case7_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case7_panel.add(case7_icon, BorderLayout.CENTER);
                                        case7_panel.add(case7_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case7_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case7_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Vermont Avenue"
                                case 8:
                                        // Prints a string
                                        System.out.print("\n Landed on Vermont Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case8 = new ImageIcon("images/case8.jpg");

                                        // Returns this icon's Image.
                                        Image case8_image = case8.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case8_image = case8_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case8 = new ImageIcon(modified_case8_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case8_icon = new JLabel(case8);
                                        JLabel case8_text = new JLabel("\n You have landed on Vermont Avenue!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case8_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case8_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case8_panel.add(case8_icon, BorderLayout.CENTER);
                                        case8_panel.add(case8_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case8_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case8_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Conencticut Avenue"
                                case 9:
                                        // Prints a string
                                        System.out.print("\n Landed on Connecticut Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case9 = new ImageIcon("images/case9.jpg");

                                        // Returns this icon's Image.
                                        Image case9_image = case9.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case9_image = case9_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case9 = new ImageIcon(modified_case9_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case9_icon = new JLabel(case9);
                                        JLabel case9_text = new JLabel("\n You have landed on Connecticut Avenue!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case9_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case9_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case9_panel.add(case9_icon, BorderLayout.CENTER);
                                        case9_panel.add(case9_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case9_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case9_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "In jail or Just visiting jail"
                                case 10:
                                        // Prints a string
                                        System.out.print("\n Landed in Jail or Just Visiting Jail");

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case10_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "St Charles Place"
                                case 11:
                                        // Prints a string
                                        System.out.print("\n Landed on St Charles Place");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case11 = new ImageIcon("images/case11.jpg");

                                        // Returns this icon's Image.
                                        Image case11_image = case11.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case11_image = case11_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case11 = new ImageIcon(modified_case11_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case11_icon = new JLabel(case11);
                                        JLabel case11_text = new JLabel("\n You have landed on St Charles Place!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case11_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case11_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case11_panel.add(case11_icon, BorderLayout.CENTER);
                                        case11_panel.add(case11_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case11_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case11_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Electric Company"
                                case 12:
                                        // Prints a string
                                        System.out.print("\n Landed on Electric Company");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case12 = new ImageIcon("images/case12.jpg");

                                        // Returns this icon's Image.
                                        Image case12_image = case12.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case12_image = case12_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case12 = new ImageIcon(modified_case12_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case12_icon = new JLabel(case12);
                                        JLabel case12_text = new JLabel("\n You have landed on Electric Company!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case12_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case12_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case12_panel.add(case12_icon, BorderLayout.CENTER);
                                        case12_panel.add(case12_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case12_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case12_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "States Avenue"
                                case 13:
                                        // Prints a string
                                        System.out.print("\n Landed on States Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case13 = new ImageIcon("images/case13.jpg");

                                        // Returns this icon's Image.
                                        Image case13_image = case13.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case13_image = case13_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case13 = new ImageIcon(modified_case13_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case13_icon = new JLabel(case13);
                                        JLabel case13_text = new JLabel("\n You have landed on States Avenue!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case13_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case13_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case13_panel.add(case13_icon, BorderLayout.CENTER);
                                        case13_panel.add(case13_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case13_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case13_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Virginia Avenue"
                                case 14:
                                        // Prints a string
                                        System.out.print("\n Landed on Virginia Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case14 = new ImageIcon("images/case14.jpg");

                                        // Returns this icon's Image.
                                        Image case14_image = case14.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case14_image = case14_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case14 = new ImageIcon(modified_case14_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case14_icon = new JLabel(case14);
                                        JLabel case14_text = new JLabel("\n You have landed on Virginia Avenue!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case14_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case14_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case14_panel.add(case14_icon, BorderLayout.CENTER);
                                        case14_panel.add(case14_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case14_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case14_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Pennsylvania Railroad"
                                case 15:
                                        // Prints a string
                                        System.out.print("\n Landed on Pennsylvania Railroad");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case15 = new ImageIcon("images/case15.jpg");

                                        // Returns this icon's Image.
                                        Image case15_image = case15.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case15_image = case15_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case15 = new ImageIcon(modified_case15_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case15_icon = new JLabel(case15);
                                        JLabel case15_text = new JLabel("\n You have landed on Pennsylvania Railroad!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case15_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case15_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case15_panel.add(case15_icon, BorderLayout.CENTER);
                                        case15_panel.add(case15_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case15_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case15_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "St James Place"
                                case 16:
                                        // Player position at "St James Place"
                                        System.out.print("\n Landed on St James Place");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case16 = new ImageIcon("images/case16.jpg");

                                        // Returns this icon's Image.
                                        Image case16_image = case16.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case16_image = case16_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case16 = new ImageIcon(modified_case16_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case16_icon = new JLabel(case16);
                                        JLabel case16_text = new JLabel("\n You have landed on St James Place!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case16_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case16_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case16_panel.add(case16_icon, BorderLayout.CENTER);
                                        case16_panel.add(case16_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case16_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case16_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Community Chest"
                                case 17:
                                        // Prints a string
                                        System.out.print("\n Landed on Community Chest");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case17 = new ImageIcon("images/case17.jpg");

                                        // Returns this icon's Image.
                                        Image case17_image = case17.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case17_image = case17_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case17 = new ImageIcon(modified_case17_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case17_icon = new JLabel(case17);
                                        JLabel case17_text = new JLabel(
                                                        "\n You have landed on Community Chest! Collect a card!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case17_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case17_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case17_panel.add(case17_icon, BorderLayout.CENTER);
                                        case17_panel.add(case17_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case17_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case17_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Tennessee Avenue"
                                case 18:
                                        // Prints a string
                                        System.out.print("\n Landed on Tennessee Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case18 = new ImageIcon("images/case18.jpg");

                                        // Returns this icon's Image.
                                        Image case18_image = case18.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case18_image = case18_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case18 = new ImageIcon(modified_case18_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case18_icon = new JLabel(case18);
                                        JLabel case18_text = new JLabel("\n You have landed on Tennessee Avenue!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case18_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case18_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case18_panel.add(case18_icon, BorderLayout.CENTER);
                                        case18_panel.add(case18_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case18_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case18_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "New York Avenue"
                                case 19:
                                        // Prints a string
                                        System.out.print("\n Landed on New York Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case19 = new ImageIcon("images/case19.jpg");

                                        // Returns this icon's Image.
                                        Image case19_image = case19.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case19_image = case19_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case19 = new ImageIcon(modified_case19_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case19_icon = new JLabel(case19);
                                        JLabel case19_text = new JLabel("\n You have landed on New York Avenue!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case19_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case19_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case19_panel.add(case19_icon, BorderLayout.CENTER);
                                        case19_panel.add(case19_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case19_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case19_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Free Parking"
                                case 20:
                                        // Prints a string
                                        System.out.print("\n Landed on Free Parking");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case20 = new ImageIcon("images/case20.jpg");

                                        // Returns this icon's Image.
                                        Image case20_image = case20.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case20_image = case20_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case20 = new ImageIcon(modified_case20_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case20_icon = new JLabel(case20);
                                        JLabel case20_text = new JLabel("\n You have landed on Free Parking!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case20_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case20_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case20_panel.add(case20_icon, BorderLayout.CENTER);
                                        case20_panel.add(case20_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case20_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case20_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Kentucky Avenue"
                                case 21:
                                        // Prints a string
                                        System.out.print("\n Landed on Kentucky Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case21 = new ImageIcon("images/case21.jpg");

                                        // Returns this icon's Image.
                                        Image case21_image = case21.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case21_image = case21_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case21 = new ImageIcon(modified_case21_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case21_icon = new JLabel(case21);
                                        JLabel case21_text = new JLabel("\n You have landed on Kentucky Avenue!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case21_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case21_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case21_panel.add(case21_icon, BorderLayout.CENTER);
                                        case21_panel.add(case21_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case21_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case21_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Chance"
                                case 22:
                                        // Prints a string
                                        System.out.print("/n Landed on Chance");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case22 = new ImageIcon("images/case22.jpg");

                                        // Returns this icon's Image.
                                        Image case22_image = case22.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case22_image = case22_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case22 = new ImageIcon(modified_case22_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case22_icon = new JLabel(case22);
                                        JLabel case22_text = new JLabel(
                                                        "\n You have landed on Chance! Collect a card!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case22_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case22_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case22_panel.add(case22_icon, BorderLayout.CENTER);
                                        case22_panel.add(case22_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case22_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case22_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Indiana Avenue"
                                case 23:
                                        // Prints a string
                                        System.out.print("\n Landed on Indiana Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case23 = new ImageIcon("images/case23.jpg");

                                        // Returns this icon's Image.
                                        Image case23_image = case23.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case23_image = case23_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case23 = new ImageIcon(modified_case23_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case23_icon = new JLabel(case23);
                                        JLabel case23_text = new JLabel("\n You have landed on Indiana Avenue!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case23_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case23_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case23_panel.add(case23_icon, BorderLayout.CENTER);
                                        case23_panel.add(case23_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case23_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case23_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Illinois Avenue"
                                case 24:
                                        // Prints a string
                                        System.out.print("\n Landed on Illinois Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case24 = new ImageIcon("images/case24.jpg");

                                        // Returns this icon's Image.
                                        Image case24_image = case24.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case24_image = case24_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case24 = new ImageIcon(modified_case24_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case24_icon = new JLabel(case24);
                                        JLabel case24_text = new JLabel("\n You have landed on Illinois Avenue!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case24_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case24_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case24_panel.add(case24_icon, BorderLayout.CENTER);
                                        case24_panel.add(case24_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case24_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case24_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "B & O Railroad"
                                case 25:
                                        // Prints a string
                                        System.out.print("\n Landed on B & O Railroad");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case25 = new ImageIcon("images/case25.jpg");

                                        // Returns this icon's Image.
                                        Image case25_image = case25.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case25_image = case25_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case25 = new ImageIcon(modified_case25_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case25_icon = new JLabel(case25);
                                        JLabel case25_text = new JLabel("\n You have landed on B & O Railroad!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case25_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case25_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case25_panel.add(case25_icon, BorderLayout.CENTER);
                                        case25_panel.add(case25_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case25_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case25_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Atlantic Avenue"
                                case 26:
                                        // Prints a string
                                        System.out.print("\n Landed on Atlantic Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case26 = new ImageIcon("images/case26.jpg");

                                        // Returns this icon's Image.
                                        Image case26_image = case26.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case26_image = case26_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case26 = new ImageIcon(modified_case26_image);
                                        // Creates a JLabel instance with the specified image

                                        JLabel case26_icon = new JLabel(case26);
                                        JLabel case26_text = new JLabel("\n You have landed on Atlantic Avenue!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case26_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case26_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case26_panel.add(case26_icon, BorderLayout.CENTER);
                                        case26_panel.add(case26_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case26_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case26_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Ventor Avenue"
                                case 27:
                                        // Prints a string
                                        System.out.print("\n Landed on Ventor Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case27 = new ImageIcon("images/case27.jpg");

                                        // Returns this icon's Image.
                                        Image case27_image = case27.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case27_image = case27_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case27 = new ImageIcon(modified_case27_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case27_icon = new JLabel(case27);
                                        JLabel case27_text = new JLabel("\n You have landed on Ventor Avenue!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case27_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case27_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case27_panel.add(case27_icon, BorderLayout.CENTER);
                                        case27_panel.add(case27_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case27_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case27_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Water Works"
                                case 28:
                                        // Prints a string
                                        System.out.print("\n Landed on Water Works");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case28 = new ImageIcon("images/case28.jpg");

                                        // Returns this icon's Image.
                                        Image case28_image = case28.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case28_image = case28_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case28 = new ImageIcon(modified_case28_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case28_icon = new JLabel(case28);
                                        JLabel case28_text = new JLabel("\n You have landed on Water Works!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case28_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case28_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case28_panel.add(case28_icon, BorderLayout.CENTER);
                                        case28_panel.add(case28_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case28_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case28_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Marvin Gardens"
                                case 29:
                                        // Prints a string
                                        System.out.print("\n Landed on Marvin Gardens");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case29 = new ImageIcon("images/case29.jpg");

                                        // Returns this icon's Image.
                                        Image case29_image = case29.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case29_image = case29_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case29 = new ImageIcon(modified_case29_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case29_icon = new JLabel(case29);
                                        JLabel case29_text = new JLabel("\n You have landed on Marvin Gardens!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case29_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case29_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case29_panel.add(case29_icon, BorderLayout.CENTER);
                                        case29_panel.add(case29_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case29_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case29_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Jail"
                                case 30:
                                        // Prints a string
                                        System.out.print("\n Landed on Jail");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case30 = new ImageIcon("images/case30.jpg");

                                        // Returns this icon's Image.
                                        Image case30_image = case30.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case30_image = case30_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case30 = new ImageIcon(modified_case30_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case30_icon = new JLabel(case30);
                                        JLabel case30_text = new JLabel(
                                                        "\n You have landed on Jail! Player position will return to Jail or Just Visiting Jail.");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case30_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case30_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case30_panel.add(case30_icon, BorderLayout.CENTER);
                                        case30_panel.add(case30_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case30_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case30_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);

                                        // Prints a string
                                        System.out.print("\n Returns to Jail or Just Visiting Jail");

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case10_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);

                                        pos -= 20;
                                        break;

                                // Player position at "Pacific Avenue"
                                case 31:
                                        // Prints a string
                                        System.out.print("\n Landed on Pacific Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case31 = new ImageIcon("images/case31.jpg");

                                        // Returns this icon's Image.
                                        Image case31_image = case31.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case31_image = case31_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case31 = new ImageIcon(modified_case31_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case31_icon = new JLabel(case31);
                                        JLabel case31_text = new JLabel("\n You have landed on Pacific Avenue");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case31_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case31_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case31_panel.add(case31_icon, BorderLayout.CENTER);
                                        case31_panel.add(case31_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case31_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case31_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "North Carolina Avenue"
                                case 32:
                                        // Prints a string
                                        System.out.print("\n Landed on North Carolina Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case32 = new ImageIcon("images/case32.jpg");

                                        // Returns this icon's Image.
                                        Image case32_image = case32.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case32_image = case32_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case32 = new ImageIcon(modified_case32_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case32_icon = new JLabel(case32);
                                        JLabel case32_text = new JLabel("\n You have landed on North Carolina Avenue!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case32_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case32_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case32_panel.add(case32_icon, BorderLayout.CENTER);
                                        case32_panel.add(case32_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case32_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case32_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Community Chest"
                                case 33:
                                        // Prints a string
                                        System.out.print("\n Landed on Community Chest");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case33 = new ImageIcon("images/case33.jpg");

                                        // Returns this icon's Image.
                                        Image case33_image = case33.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case33_image = case33_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case33 = new ImageIcon(modified_case33_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case33_icon = new JLabel(case33);
                                        JLabel case33_text = new JLabel(
                                                        "\n You have landed on Community Chest! Collect your card!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case33_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case33_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case33_panel.add(case33_icon, BorderLayout.CENTER);
                                        case33_panel.add(case33_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case33_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case33_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Pennsylvania Avenue"
                                case 34:
                                        // Prints a string
                                        System.out.print("\n Landed on Pennsylvania Avenue");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case34 = new ImageIcon("images/case34.jpg");

                                        // Returns this icon's Image.
                                        Image case34_image = case34.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case34_image = case34_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case34 = new ImageIcon(modified_case34_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case34_icon = new JLabel(case34);
                                        JLabel case34_text = new JLabel("\n You have landed on Pennsylvania Avenue!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case34_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case34_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case34_panel.add(case34_icon, BorderLayout.CENTER);
                                        case34_panel.add(case34_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case34_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case34_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Short Line Railroad"
                                case 35:
                                        // Prints a string
                                        System.out.print("\n Landed on Short Line Railroad");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case35 = new ImageIcon("images/case35.jpg");

                                        // Returns this icon's Image.
                                        Image case35_image = case35.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case35_image = case35_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case35 = new ImageIcon(modified_case35_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case35_icon = new JLabel(case35);
                                        JLabel case35_text = new JLabel("\n You have landed on Short Line Railroad!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case35_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case35_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case35_panel.add(case35_icon, BorderLayout.CENTER);
                                        case35_panel.add(case35_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case35_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case35_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Chance"
                                case 36:
                                        // Prints a string
                                        System.out.print("\n Landed on Chance");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case36 = new ImageIcon("images/case36.jpg");

                                        // Returns this icon's Image.
                                        Image case36_image = case36.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case36_image = case36_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case36 = new ImageIcon(modified_case36_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case36_icon = new JLabel(case36);
                                        JLabel case36_text = new JLabel(
                                                        "\n You have landed on Chance! Collect your card!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case36_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case36_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case36_panel.add(case36_icon, BorderLayout.CENTER);
                                        case36_panel.add(case36_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case36_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case36_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Park Place"
                                case 37:
                                        // Prints a string
                                        System.out.print("\n Landed on Park Place");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case37 = new ImageIcon("images/case37.jpg");

                                        // Returns this icon's Image.
                                        Image case37_image = case37.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case37_image = case37_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case37 = new ImageIcon(modified_case37_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case37_icon = new JLabel(case37);
                                        JLabel case37_text = new JLabel("\n You have landed on Park Place!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case37_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case37_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case37_panel.add(case37_icon, BorderLayout.CENTER);
                                        case37_panel.add(case37_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case37_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case37_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Luxury Tax"
                                case 38:
                                        // Prints a string
                                        System.out.print("/n Landed on Luxury Tax");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case38 = new ImageIcon("images/case38.jpg");

                                        // Returns this icon's Image.
                                        Image case38_image = case38.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case38_image = case38_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case38 = new ImageIcon(modified_case38_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case38_icon = new JLabel(case38);
                                        JLabel case38_text = new JLabel("\n You have landed on Luxury Tax! Pay $75!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case38_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case38_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case38_panel.add(case38_icon, BorderLayout.CENTER);
                                        case38_panel.add(case38_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case38_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case38_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Boardwalk"
                                case 39:
                                        // Prints a string
                                        System.out.print("\n Landed on Boardwalk");

                                        // Creates an ImageIcon from the specified file
                                        ImageIcon case39 = new ImageIcon("images/case39.jpg");

                                        // Returns this icon's Image.
                                        Image case39_image = case39.getImage();

                                        // scaling image to desired dimensions
                                        Image modified_case39_image = case39_image.getScaledInstance(650, 650,
                                                        java.awt.Image.SCALE_SMOOTH);

                                        // Creates an ImageIcon from an image object
                                        case39 = new ImageIcon(modified_case39_image);

                                        // Creates a JLabel instance with the specified image
                                        JLabel case39_icon = new JLabel(case39);
                                        JLabel case39_text = new JLabel("\n You have landed on Boardwalk!");

                                        // using JPanel to arrange layout and align texts
                                        JPanel case39_panel = new JPanel();

                                        // Sets the layout manager for this container
                                        case39_panel.setLayout(new BorderLayout());

                                        // Adds the specified component to the end of this container.
                                        case39_panel.add(case39_icon, BorderLayout.CENTER);
                                        case39_panel.add(case39_text, BorderLayout.SOUTH);

                                        // Sets the alignment of the label's contents along the X axis
                                        case39_text.setHorizontalAlignment(JLabel.CENTER);

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case39_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;

                                // Player position at "Go!"
                                case 40:
                                        // Prints a string
                                        System.out.print("\n Go! ");

                                        // Displays dialog that shows message
                                        JOptionPane.showMessageDialog(null, case40_panel, "Player position",
                                                        JOptionPane.PLAIN_MESSAGE);
                                        break;
                        } // end switch

                } // end for
                System.out.print("\n You Have Won! ");
                JOptionPane.showMessageDialog(null, "You Have Won!", "Game Over",
                                JOptionPane.PLAIN_MESSAGE);

        } // end main class
} // end monopoly
