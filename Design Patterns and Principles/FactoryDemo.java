public class FactoryDemo {

    public static void main(String[] args) {
        FileFactory textFactory = new TextFactory();
        FileFactory imageFactory = new ImageFactory();
        FileFactory videoFactory = new VideoFactory();
        FileType text = textFactory.createFile();
        FileType image = imageFactory.createFile();
        FileType video = videoFactory.createFile();
        text.openFile();
        image.openFile();
        video.openFile();
    }
}
interface FileType {
    void openFile();
}
class TextFile implements FileType {
    @Override
    public void openFile() {
        System.out.println("Opening Text File");
    }
}
class ImageFile implements FileType {
    @Override
    public void openFile() {
        System.out.println("Opening Image File");
    }
}
class VideoFile implements FileType {
    @Override
    public void openFile() {
        System.out.println("Opening Video File");
    }
}
abstract class FileFactory {
    public abstract FileType createFile();
}
class TextFactory extends FileFactory {
    @Override
    public FileType createFile() {
        return new TextFile();
    }
}
class ImageFactory extends FileFactory {
    @Override
    public FileType createFile() {
        return new ImageFile();
    }
}
class VideoFactory extends FileFactory {
    @Override
    public FileType createFile() {
        return new VideoFile();
    }
}