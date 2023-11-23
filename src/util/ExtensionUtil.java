package util;

import java.io.File;

public class ExtensionUtil {
    public static String getExtension(File file) {
        String fileName = file.toString();
        int index = fileName.lastIndexOf('.');
        String extension = null;
        if(index > 0) {
            extension = fileName.substring(index + 1);
        }
        return extension;
    }
}
