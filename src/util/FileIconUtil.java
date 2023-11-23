package util;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class FileIconUtil {
    public static Image getFileIcon(File file){
        if(file == null) return null;
        FileSystemView fileSystemView = FileSystemView.getFileSystemView();
        Icon icon = fileSystemView.getSystemIcon(file);
        int width = icon.getIconWidth();
        int height = icon.getIconHeight();

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();

        return SwingFXUtils.toFXImage(bufferedImage, null);
    }
}
