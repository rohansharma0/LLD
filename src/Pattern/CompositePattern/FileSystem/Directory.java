package Pattern.CompositePattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String name){
        this.directoryName = name;
        this.fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory name : " + directoryName);

        for(FileSystem fs : fileSystemList){
            fs.ls();
        }
    }
}
