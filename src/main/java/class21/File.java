package class21;

public abstract class File {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void edit() {
        System.out.println("Editing the file " + name);
    }

    public void close() {
        System.out.println("Closing the file "+name);
    }

    public abstract void open();
}

class JavaFile extends File{

    public JavaFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Opneing javaFile using Intellij");
    }
}

class WordFile extends File{

    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Using Microsoft word to open Word file");
    }
}
class PDFFile extends File{

    public PDFFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Using Adobe to open PDF file");
    }
}
