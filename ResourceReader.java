package Core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ResourceReader {

   public static Properties properties;
    public void getConnection() {

        new Properties();
        String root = System.getProperty("user.dir");
        FileInputStream fileInputStream = null;

        {
            try {
                fileInputStream = new FileInputStream(root + "\\" + "src\\test\\java\\resource\\application.properties");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                properties.load(fileInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(properties.getProperty("learn_name"));
        }
    }

    public static String getProperty(String Key)
    {
        return properties.getProperty(Key);
    }
}

