package cz.vutbr.cviko04;

import java.io.File;

public class Movie {

    File file = null;
    String imageName = null;
    String fileName = null;

    public Movie(File file, String imageName, String fileName){
        this.file = file;
        this.imageName = imageName;
        this.fileName = fileName;
    }

    public Movie(){

    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
