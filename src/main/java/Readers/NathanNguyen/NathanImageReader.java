package Readers.NathanNguyen;

/**
 * Created by Nathan on 10/4/2016.
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
    }
}
