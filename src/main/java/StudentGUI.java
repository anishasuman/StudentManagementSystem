import javax.swing.*;
import java.awt.*;

public class StudentGUI extends JFrame {

    JTextField idField;
    JLabel idLabel, nameLabel, ageLabel, courseLabel;

    public StudentGUI() {

        setTitle("Student Management System");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Enter Student ID:"));

        idField = new JTextField(10);
        add(idField);

        JButton searchBtn = new JButton("Search");
        add(searchBtn);

        idLabel = new JLabel("ID : ");
        nameLabel = new JLabel("Name : ");
        ageLabel = new JLabel("Age : ");
        courseLabel = new JLabel("Course : ");

        add(idLabel);
        add(nameLabel);
        add(ageLabel);
        add(courseLabel);

        searchBtn.addActionListener(e -> {

            int id = Integer.parseInt(idField.getText());

            StudentDAO dao = new StudentDAO();

            Student s = dao.getStudent(id);

            if(s != null) {

                idLabel.setText("ID : " + s.id);
                nameLabel.setText("Name : " + s.name);
                ageLabel.setText("Age : " + s.age);
                courseLabel.setText("Course : " + s.course);

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Student Not Found"
                );
            }
        });

        setVisible(true);
    }
}