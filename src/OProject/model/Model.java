package OProject.model;

import java.io.File;

public class Model {
    File currentDirectory = new File(System.getProperty("user.home"));

    public String[] getFileList(){
        if(currentDirectory != null && currentDirectory.isDirectory()){
            return currentDirectory.list();

        }else {
            System.out.println("Directory does not exist or is empty");
        }
        return new String[0];
    }



}
