package cz.vutbr.cviko04;

import org.apache.commons.io.FilenameUtils;
import org.jcodec.api.FrameGrab;
import org.jcodec.api.JCodecException;
import org.jcodec.common.model.Picture;
import org.jcodec.scale.AWTUtil;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MovieLibrary {

    public List<Movie> getMovieWithImages(Collection<File> files, String pathToStore) throws IOException, JCodecException {
        List<Movie> movies = new ArrayList<Movie>();
        for (File file:files){
            int frameTime = 150;
            Picture frame = FrameGrab.getFrameFromFile(file, frameTime);
            BufferedImage bufferedImage = AWTUtil.toBufferedImage(frame);
            String[] fileName = file.getName().split("\\.(?=[^\\.]+$)");
            String imageName = fileName[0] + "frame_" + frameTime + ".png";
            String imagePath = pathToStore + imageName;
            ImageIO.write(bufferedImage, "png", new File(imagePath));
            movies.add(new Movie(file, imageName, file.getName()));
        }
        return movies;
    }


    public Collection<File> getFiles(String path, String suffix){
        Collection<File> files = scanFiles(path);

        files.removeIf(file -> !FilenameUtils.getExtension(file.getName()).contains(suffix));

        return files;
    }

    private Collection<File> scanFiles(String path) {
        Collection<File> files = new ArrayList<File>();
        Path directory = Path.of(path);
        try{
            discoverFiles(directory, files);
        } catch (IOException e){
            e.printStackTrace();
        }
        return files;
    }

    static void discoverFiles(Path directory, final Collection<File> all) throws IOException{
        Files.walkFileTree(directory, new SimpleFileVisitor<Path>(){
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                all.add(new File(String.valueOf(file)));
                return super.visitFile(file, attrs);
            }
        });
    }
}