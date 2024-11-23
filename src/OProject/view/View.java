package OProject.view;

import javax.swing.*;

public class View {
    public JList<String> list;

    View(){
        JFrame jFrame = new JFrame("File Explorer");
        jFrame.setSize(600,500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


         list = new JList<>();
        JScrollPane scrollPane = new JScrollPane(list);


        jFrame.add(scrollPane);
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        View view= new View();
    }
}
