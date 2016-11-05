package Readers.NathanNguyen;

/**
 * Created by Nathan on 10/4/2016.
 */

/* Previous import for processing the images. No longer applicable
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NathanImageReader {
    //images stores a list of the image file names
    public List<String> images;

    //Takes in String dataFile with the file names of each image and stores them in images
    public NathanImageReader(String dataFile) {
        //Stores the list of the names of the image file
        images = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(dataFile)));

            String str;
            while ((str = br.readLine()) != null) {
                images.add(str);
            }

            br.close();
        }catch (Exception e) {}

        /* Previous code for processing the incoming images. Current strategy is to store the list of image files and process them elsewhere
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(dataFile)));

            //Stores the buffered image
            BufferedImage img = null;
            String str;

            while ((str = br.readLine()) != null) {
                try {
                    img = ImageIO.read(new File(str));
                    images.add(" ");
                } catch (IOException e) {}
            }

            br.close();
            new FileInputStream(dataFile);
        } catch (Exception e) {}
        */

    }
}
