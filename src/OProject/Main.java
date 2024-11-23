package OProject;


import OProject.controller.Controller;
import OProject.model.Model;
import OProject.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);
    }
}
