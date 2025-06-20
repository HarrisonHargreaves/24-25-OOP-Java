package AssignmentTurtleGraphicsProgram;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import uk.ac.leedsbeckett.oop.LBUGraphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TurtleGraphics extends LBUGraphics {

    private JFrame MainFrame;
    private final String[] VALID_COMMANDS = {
            "about", "move", "right", "left", "green", "blue", "yellow", "pink",
            "red", "white", "black", "clear", "pendown", "penup", "reverse", "reset",
            "square", "exit", "triangle", "windows", "loadcommands", "savecommands",
            "loadimage", "saveimage", "pencolor", "penwidth","Triangle", "faster"
    };

    private static final String[] IMAGE_EXTENSIONS = { "jpg", "png", "gif", "bmp" };

    private int ERROR = 0;
    private int WARNING = 1;
    private int INFORMATION = 2;

    private ArrayList<String> commandHistory = new ArrayList<String>();

    public TurtleGraphics() {
        JFrame MainFrame = new JFrame();// create a frame to display the turtle panel on
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Make sure the app exits when closed
        MainFrame.setLayout(new FlowLayout()); // not strictly necessary
        MainFrame.add(this);// "this" is this object that extends turtle graphics so we are adding a turtle
                            // graphics panel to the frame
        MainFrame.pack();// set the frame to a size we can see
        MainFrame.setVisible(true);// now display it
        // about();//call the LBUGraphics about method to display version information.
        setInternalTurtle(4);
        setTurtleImage("AssignmentTurtleGraphicsProgram\\pngegg.png");
        displayMessage("Welcome to Turtle Graphics!");// display a welcome message
        about();
    }

    public void processCommand(String command)// this method must be provided because LBUGraphics will call it when it's
                                              // JTextField is used
    {
        displayMessage("");
        System.out.println(command);// print the command to the console
        String[] parts = command.split(" ");// split the command into parts

        if (!isValidCommand(parts[0]))// if the first part of the command is not valid
        {
            displayMessage("Invalid command: " + parts[0], ERROR);// display an error message
            return;// and return
        }

        switch (parts[0]) {
            case "about":
                doAbout(parts);
                break;

            case "move":
                doMove(parts);
                break;

            case "right":
                doRight(parts);

                break;

            case "left":
                doLeft(parts);

                break;

            case "pendown":
                doPenDown(parts);

                break;

            case "penup":
                doPenUp(parts);

                break;

            case "green":
                doGreen(parts);

                break;

            case "blue":
                doBlue(parts);

                break;

            case "yellow":
                doYellow(parts);

                break;

            case "pink":
                doPink(parts);

                break;

            case "red":
                doRed(parts);

                break;

            case "black":
                doBlack(parts);

                break;

            case "white":
                doWhite(parts);

                break;

            case "clear":
                doClear(parts);

                break;

            case "reverse":
                doReverse(parts);
                break;

            case "reset":
                doReset(parts);

                break;

            case "square":
                doSquare(parts);

                break;

            case "triangle":
                doTriangle(parts);

                break;

            case "exit":
                doExit(parts);

                break;
            case "windows":
                doWindows(parts);
                System.out.println(commandHistory);
                break;
            case "loadcommands":
                loadCommands(parts);
                break;
            case "savecommands":
                saveCommands(parts);
                break;
            case "loadimage":
                loadImage(parts);
                break;
            case "saveimage":
                saveImage(parts);
                break;
            case "pencolor":
                doPenColour(parts);
                break;
            case "penwidth":
                doPenWidth(parts);
                break;
            case "Triangle":
                triangle(parts);
                break;
            case "faster":
                doFaster(parts);        
                break;

            default:
                displayMessage(parts[0] + " not yet implemented", WARNING);
        }
    }
    
    private void doAbout(String[] parts) {
        if (parts.length > 1) {
            displayMessage(parts[0] + " does not take any parameters", INFORMATION);
            return;
        } else 
        {
            about();
        }
    }

    private void doRight(String[] parts) {
        if (!paramChecker(parts, 2)) {
            return;
        }

        else {
            int angle = Integer.parseInt(parts[1]);
            right(angle);
        }
    }

    private void doLeft(String[] parts) {
        if (!paramChecker(parts, 2)) {
            return;
        } else {
            int angle = Integer.parseInt(parts[1]);
            left(angle);
        }
    }

    private void doPenDown(String[] parts) {
        if (!paramChecker(parts, 1)) {
            return;
        }

        drawOn();
    }

    private void doPenUp(String[] parts) {
        if (!paramChecker(parts, 1)) {
            return;
        }

        drawOff();
    }

    private void doGreen(String[] parts) {
        if (!paramChecker(parts, 1)) {
            return;
        }
        setPenColour(Color.GREEN);
    }

    private void doBlue(String[] parts) {
        if (!paramChecker(parts, 1)) {
            return;
        }
        setPenColour(Color.BLUE);
    }

    private void doYellow(String[] parts) {
        if (!paramChecker(parts, 1)) {
            return;
        }
        setPenColour(Color.YELLOW);
    }

    private void doPink(String[] parts) {
        if (!paramChecker(parts, 1)) {
            return;
        }
        setPenColour(Color.PINK);
    }

    private void doRed(String[] parts) {
        if (!paramChecker(parts, 1)) {
            return;
        }
        setPenColour(Color.RED);
    }

    private void doBlack(String[] parts) {
        if (!paramChecker(parts, 1)) {
            return;
        }
        setPenColour(Color.BLACK);
    }

    private void doWhite(String[] parts) {
        if (!paramChecker(parts, 1)) {
            return;
        }
        setPenColour(Color.WHITE);
    }

    private void doClear(String[] parts) {
        if (!paramChecker(parts, 1)) {
            return;
        }
        clear();
    }

    private void doReverse(String[] parts) {
        if (!paramChecker(parts, 2)) {
            return;
        } else {
            int distance = Integer.parseInt(parts[1]);
            forward(-distance);
        }
    }

    private void doReset(String[] parts) {
        if (!paramChecker(parts, 1)) {
            return;
        } else {
            reset();
            clear();
        }
    }

    private void doMove(String[] parts) {
        if (!paramChecker(parts, 2)) {
            return;
        } else {
            int distance = Integer.parseInt(parts[1]);
            forward(distance);
        }
    }

    private void doSquare(String[] parts) {
        if (!paramChecker(parts, 2)) {
            return;
        } else {
            int size = Integer.parseInt(parts[1]);
            for (int i = 0; i < 4; i++) {
                forward(size);
                right(90);
            }
        }
    }

    private void doTriangle(String[] parts) {
        if (!paramChecker(parts, 2)) {
            return;
        } else {
            int size = Integer.parseInt(parts[1]);
            for (int i = 0; i < 3; i++) {
                forward(size);
                right(120);
            }
        }
    }

    public void triangle(String[] parts) {
        if (!paramChecker(parts, 4)) {
            return;
        } else 
        {
            int lengthA = Integer.parseInt(parts[1]);
            int lengthB = Integer.parseInt(parts[2]);
            int lengthC = Integer.parseInt(parts[3]);

            double angleA = Math.acos(((Math.pow(lengthB, 2) + Math.pow(lengthC, 2) - Math.pow(lengthA, 2)) / (2.0 * lengthB * lengthC))) * (180 / Math.PI);
            double angleB = Math.acos(((Math.pow(lengthA, 2) + Math.pow(lengthC, 2) - Math.pow(lengthB, 2)) / (2.0 * lengthA * lengthC))) * (180 / Math.PI);
            double angleC = Math.acos(((Math.pow(lengthA, 2) + Math.pow(lengthB, 2) - Math.pow(lengthC, 2)) / (2.0 * lengthA * lengthB))) * (180 / Math.PI);
            System.out.println(angleA + " " + angleB + " " + angleC);
            
            pointTurtle(270);
            right(Math.toIntExact(Math.round(180-angleB)));
            int a = (int) Math.round(lengthA);
            forward(a);
            right(Math.toIntExact(Math.round(180-angleC)));
            int b = (int) Math.round(lengthB);
            forward(b);
            right(Math.toIntExact(Math.round(180-angleA)));
            int c = (int) Math.round(lengthC);
            forward(c);
            pointTurtle(0);
            }
        }

    private void doWindows(String[] parts) {
        if (!paramChecker(parts, 2)) {
            return;
        } else {
            drawOn();
            setPenColour(PenColour.BLUE);
            doSquare(parts);
            left();
            drawOff();
            forward(5);
            setPenColour(PenColour.YELLOW);
            drawOn();
            doSquare(parts);
            left();
            drawOff();
            forward(5);
            setPenColour(PenColour.GREEN);
            drawOn();
            doSquare(parts);
            left();
            drawOff();
            forward(5);
            setPenColour(PenColour.RED);
            drawOn();
            doSquare(parts);

        }

    }

    private void doExit(String[] parts) {
        if (!paramChecker(parts, 1)) {
            return;
        } else {
            System.exit(0);
        }
    }

    public void displayMessage(String message, int alert_type) {
        switch (alert_type) {
            case 0:
                JOptionPane.showMessageDialog(MainFrame,
                        message,
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(MainFrame,
                        message,
                        "WARNING",
                        JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(MainFrame,
                        message,
                        "INFORMATION",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }

    private boolean paramChecker(String parts[], int expected) {
        if (parts.length != expected) {
            displayMessage(parts[0] + " requires " + (expected - 1) + " parameters", INFORMATION);
            return false;
        }
        try {
            for (int i = 1; i < parts.length; i++) {
                if (Integer.parseInt(parts[i]) < 0) {
                    displayMessage(parts[0] + " does not allow negative parameters: " + parts[i], WARNING);
                    return false;
                }
            }
        } catch (NumberFormatException e) {
            displayMessage("Invalid parameter needs to be numeric: " + parts[1], WARNING);
            return false;
        }
        commandHistory.add(String.join(" ", parts)); // Safely add the full command to history
        return true;
    }

    private void loadCommands(String parts[]) {
        Object[] option = { "YES", "NO", "CANCEL" };
        int result = JOptionPane.showOptionDialog(MainFrame, "Do you want to save current image?", "Load Image",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
        if (result == JOptionPane.YES_OPTION) {
            saveCommands(parts);
            return; // Exit after saving
        } else if (result == JOptionPane.NO_OPTION) {
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Specify a file to load");
            int userSelection = chooser.showOpenDialog(null);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToLoad = chooser.getSelectedFile();
                String filename = fileToLoad.getAbsolutePath();
                if (!filename.endsWith(".txt")) {
                    displayMessage("Invalid file extension. Please select a .txt file.", ERROR);
                    return;
                }
                try (Scanner scanner = new Scanner(fileToLoad)) {
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        processCommand(line);
                    }
                    displayMessage("Commands loaded from " + filename, INFORMATION);
                } catch (FileNotFoundException e) {
                    displayMessage("Error loading commands: " + e.getMessage(), ERROR);
                }
            }
        } else {
            return; // User cancelled the operation
        }
    }

    private void saveCommands(String parts[]) {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Specify a file to save");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
        chooser.setFileFilter(filter);
        int userSelection = chooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = chooser.getSelectedFile();
            String filename = fileToSave.getAbsolutePath();
            if (!filename.endsWith(".txt")) {
                filename += ".txt";
            }
            try (FileWriter writer = new FileWriter(fileToSave)) {
                for (String command : commandHistory) {
                    writer.write(command + "\n");
                }
                displayMessage("Commands saved to " + filename, INFORMATION);
            } catch (IOException e) {
                displayMessage("Error saving commands: " + e.getMessage(), ERROR);
            }
        }
    }

    public void saveImage(String parts[]) {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Specify a file to save");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", IMAGE_EXTENSIONS);
        chooser.setFileFilter(filter);
        int userSelection = chooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = chooser.getSelectedFile();
            String filename = fileToSave.getAbsolutePath();
            if (!filename.endsWith(".png") && !filename.endsWith(".jpg")) {
                filename += ".png";
            }
            try {
                BufferedImage image = getBufferedImage();
                ImageIO.write(image, "png", fileToSave);
                displayMessage("Image saved to " + filename, INFORMATION);
            } catch (IOException e) {
                displayMessage("Error saving image: " + e.getMessage(), ERROR);
            }
        }
    }

    public void loadImage(String parts[]) {
        Object[] option = { "YES", "NO", "CANCEL" };
        int result = JOptionPane.showOptionDialog(MainFrame, "Do you want to save current image?", "Load Image",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
        if (result == JOptionPane.YES_OPTION) {
            saveImage(parts);
            return; // Exit after saving
        } else if (result == JOptionPane.NO_OPTION) {
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Specify a file to load");
            int userSelection = chooser.showOpenDialog(null);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToLoad = chooser.getSelectedFile();
                String filename = fileToLoad.getAbsolutePath();
                if (!filename.endsWith(".png") && !filename.endsWith(".jpg")) {
                    displayMessage("Invalid file extension. Please select a .png or .jpg file.", ERROR);
                    return;
                }
                try {
                    BufferedImage image = ImageIO.read(fileToLoad);
                    setBufferedImage(image);
                    displayMessage("Image loaded from " + filename, INFORMATION);
                } catch (IOException e) {
                    displayMessage("Error loading image: " + e.getMessage(), ERROR);
                }

            }
        } else {
            return; // User cancelled the operation
        }
    }

    private void doPenColour(String[] parts) {
        // Check if the correct number of parameters is provided
        if (!paramChecker(parts, 4)) { // Expecting 3 parameters + 1 for the command
            return;
        }
    
        try {
            // Parse the RGB values
            int red = Integer.parseInt(parts[1]);
            int green = Integer.parseInt(parts[2]);
            int blue = Integer.parseInt(parts[3]);
    
            // Validate RGB values (must be between 0 and 255)
            if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
                displayMessage("RGB values must be between 0 and 255");
                return;
            }
    
            // Set the pen colour
            setPenColour(new Color(red, green, blue));
        } catch (NumberFormatException e) {
            // Handle invalid inputs
            displayMessage("RGB values must be numeric");
        }
    }

    private void doPenWidth(String[] parts) {
        // Check if the correct number of parameters is provided
        if (!paramChecker(parts, 2)) { // Expecting 1 parameter + 1 for the command
            return;
        }
    
        try {
            // Parse the width parameter
            int width = Integer.parseInt(parts[1]);
    
            // Validate the width (must be a positive integer)
            if (width <= 0) {
                displayMessage("Pen width must be greater than 0");
                return;
            }
    
            // Set the pen width
            setStroke(width);
        } catch (NumberFormatException e) {
            // Handle invalid input
            displayMessage("Pen width must be numeric");
        }
    }

    public void doFaster(String[] parts) {
        if (!paramChecker(parts, 1)) {
            return;
        } else {
            
        }
    }

    @Override
    public void about()
    {
            super.about();
            Graphics g = getGraphics2DContext();
            g.setColor(Color.CYAN);
            Font font = new Font("Arial", Font.BOLD, 50);
            g.setFont(font);
            g.setColor(Color.CYAN);
            g.drawString("Harrison Hargreaves", 50, 350);       
            
    }

    private boolean isValidCommand(String parts) {
        for (String command : VALID_COMMANDS) {
            if (command.equals(parts)) {
                return true;
            }
        }
        return false;
    }
}
