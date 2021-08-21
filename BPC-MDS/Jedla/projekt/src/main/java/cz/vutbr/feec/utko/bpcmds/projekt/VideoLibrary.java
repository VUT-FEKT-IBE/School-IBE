package cz.vutbr.feec.utko.bpcmds.projekt;

import org.apache.commons.io.FilenameUtils;

import org.jcodec.api.JCodecException;

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

public class VideoLibrary {
    public List<Video> getVideo(Collection<File> files) throws IOException, JCodecException {
        List<Video> movies = new ArrayList<Video>();
        for (File file:files) {
            movies.add(new Video(file, file.getParentFile().getName()));
        }
        return movies;
    }

    public Collection<File> getFiles(String path, String suffix){
        Collection<File> files = scanFiles(path);

        files.removeIf(file -> !FilenameUtils.getExtension(file.getName()).contains(suffix));

        return files;
    }

    private Collection<File> scanFiles(String path){
        Collection<File> files = new ArrayList<File>();
        Path directory = Path.of(path);
        try {
            discoverFiles(directory, files);
        } catch (IOException e) {
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
