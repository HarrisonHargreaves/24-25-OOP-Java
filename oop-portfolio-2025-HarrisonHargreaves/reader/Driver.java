package reader;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class Driver {
    private static final String[] IMAGE_EXTENSIONS = {"jpg", "png", "gif","bmp"};
    private static final String[] TEXT_EXTENSIONS = {"txt"};
    public static void main(String[] args) {
        //gets file name
        System.out.println("Please enter the file name to read in:");
        Scanner scan = new Scanner(System.in);
        String filename = scan.nextLine();
        //check valid extension
        String extension = filename.split("\\.")[1];
        //load image
        if (Arrays.stream(IMAGE_EXTENSIONS).anyMatch(extension::equals)) {
            //load image
        }
        //load text
        else if (Arrays.stream(TEXT_EXTENSIONS).anyMatch(extension::equals)) {
            loadTextFile(filename);
        //load text
        loadImageFile(filename);
        }
        else {
            System.out.println("Invalid extension");
        }
    }
    private static void loadTextFile(String filename) {
        //load text file here
        System.out.println("Loading text file: " + filename);
        // Implement text file reading logic here
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading file: " + filename);
        }
    }
    private static void loadImageFile(String filename) {
        //load image file here
        System.out.println("Loading image file: " + filename);
        // Implement image file reading logic here
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(filename));
            BufferedImage result = getProcessedImage(img);
            ImageIO.write(result, "jpg", new File("output.jpg"));
        } catch (IOException e) {
            System.out.println("fIle not found or Error reading image file: " + filename);
        }
        // Note: Actual image loading would require a library like BufferedImage, etc.
    }

    private static BufferedImage getProcessedImage(BufferedImage img) {
        BufferedImage result = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);
        int width = img.getWidth();
        int height = img.getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int r=0,g=0,b=0;
                try {
                    Color c=new Color(img.getRGB(x-1, y-1));
                    r=c.getRed();
                    g=c.getGreen();
                    b=c.getBlue();
                } catch (Exception e) {}
            }
        }
        return result;
    }
}
