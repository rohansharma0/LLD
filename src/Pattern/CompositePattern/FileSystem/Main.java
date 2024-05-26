package Pattern.CompositePattern.FileSystem;

public class Main {
    public static void main(String args[]){

        Directory movieFolder = new Directory("Movie");

        FileSystem border = new File("Border.mp4");
        movieFolder.add(border);

        Directory marvelFolder = new Directory("Marvel");
        File ironMan2 = new File("IronMan2.mp4");
        marvelFolder.add(ironMan2);
        movieFolder.add(marvelFolder);

        movieFolder.ls();
    }
}
