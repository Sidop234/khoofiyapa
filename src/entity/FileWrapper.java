package entity;

import java.io.File;

public class FileWrapper {
    private String fileName;
    private String filePath;
    public FileWrapper(String fileName, String filePath){
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }
    @Override
    public String toString(){
        return getFileName();
    }
}
