package OProject.controller;

import OProject.model.Model;
import OProject.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        updateFileList();
    }

    private void updateFileList() {
        String[] files = model.getFileList();
        if (files!= null){
            view.list.setListData(files);
        }else {
            System.out.println("No files to display");
        }
    }
}
