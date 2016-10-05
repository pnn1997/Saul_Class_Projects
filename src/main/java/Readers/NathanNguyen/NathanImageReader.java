package Readers.NathanNguyen;

/**
 * Created by Nathan on 10/4/2016.
 */

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class NathanImageReader {
    //imgs stores a list of image data obtained from image processing the different images
    public List<ImageData> imgs;

    //Takes in String dataFile with the file names of each image and iterates through and processes all
    // the images in listed by the file and stores them in imgs
    public NathanImageReader(String dataFile) {
        imgs = new ArrayList<ImageData>();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(dataFile)));

            BufferedImage img = null;
            String str;

            while ((str = br.readLine()) != null) {
                try {
                    img = ImageIO.read(new File(str));
                    imgs.add(ImageProcess.edgeDetec(img));
                } catch (IOException e) {}
            }

            br.close();
            new FileInputStream(dataFile);
        } catch (Exception e) {}
    }
}
