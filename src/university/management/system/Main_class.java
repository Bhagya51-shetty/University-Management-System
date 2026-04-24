package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame implements ActionListener {

    Main_class(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/background.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        JMenuBar mb = new JMenuBar();

        JMenu newInfo = new JMenu("New Information");
        newInfo.setForeground(Color.BLACK);
        mb.add(newInfo);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.white);
        facultyInfo.addActionListener(this);
        newInfo.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.white);
        studentInfo.addActionListener(this);
        newInfo.add(studentInfo);

        //Details


        JMenu Details = new JMenu("View Details");
        Details.setForeground(Color.BLACK);
        Details.addActionListener(this);
        mb.add(Details);

        JMenuItem facultyDetails = new JMenuItem("View Faculty Details");
        facultyDetails.setBackground(Color.white);
        facultyDetails.addActionListener(this);
        Details.add(facultyDetails);

        JMenuItem studentDetails = new JMenuItem("View Student Details");
        studentDetails.setBackground(Color.white);
        studentDetails.addActionListener(this);
        Details.add(studentDetails);

        //Leave

        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLACK);
        leave.addActionListener(this);
        mb.add(leave);

        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.white);
        facultyLeave.addActionListener(this);
        leave.add(facultyLeave);

        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.white);
        studentLeave.addActionListener(this);
        leave.add(studentLeave);

        //LeaveDetails

        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.BLACK);
        leaveDetails.addActionListener(this);
        mb.add(leaveDetails);

        JMenuItem facultyLeaveDetails = new JMenuItem("Faculty Leave Details");
        facultyLeaveDetails.setBackground(Color.white);
        facultyLeaveDetails.addActionListener(this);
        leaveDetails.add(facultyLeaveDetails);

        JMenuItem studentLeaveDetails = new JMenuItem("Student Leave Details");
        studentLeaveDetails.setBackground(Color.white);
        studentLeaveDetails.addActionListener(this);
        leaveDetails.add(studentLeaveDetails);

        //Exams

        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLACK);
        exam.addActionListener(this);
        mb.add(exam);

        JMenuItem ExaminationDetails = new JMenuItem("Examination Results");
        ExaminationDetails.setBackground(Color.white);
        ExaminationDetails.addActionListener(this);
        exam.add(ExaminationDetails);

        JMenuItem EnterMarks = new JMenuItem("Enter Marks");
        EnterMarks.setBackground(Color.white);
        EnterMarks.addActionListener(this);
        exam.add(EnterMarks);

        //UpdateInfo

        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.BLACK);
        updateInfo.addActionListener(this);
        mb.add(updateInfo);

        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.white);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);

        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.white);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);

        //Fee

        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLACK);
        fee.addActionListener(this);
        mb.add(fee);

        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.white);
        feestructure.addActionListener(this);
        fee.add(feestructure);

        JMenuItem feeForm = new JMenuItem("Student Fee Form");
        feeForm.setBackground(Color.white);
        feeForm.addActionListener(this);
        fee.add(feeForm);

        //utility

        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLACK);

        mb.add(utility);

        JMenuItem ca = new JMenuItem("Calculator");
        ca.setBackground(Color.white);
        ca.addActionListener(this);
        utility.add(ca);

        JMenuItem Notepad = new JMenuItem("Notepad");
        Notepad.setBackground(Color.white);
        Notepad.addActionListener(this);
        utility.add(Notepad);

        //about

        JMenu about = new JMenu("About");
        about.setForeground(Color.BLACK);
        mb.add(about);

        JMenuItem About = new JMenuItem("About");
        About.setBackground(Color.white);
        About.addActionListener(this);
        about.add(About);

        //exit

        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLACK);
        mb.add(exit);

        JMenuItem Exit = new JMenuItem("Exit");
        Exit.setBackground(Color.white);
        Exit.addActionListener(this);
        exit.add(Exit);


        setJMenuBar(mb);

        setSize(1540,850);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sm = e.getActionCommand();
        if (sm.equals("Exit")) {
            System.exit(15);
        } else if (sm.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception E) {
                E.printStackTrace();
            }
        } else if (sm.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception E) {
                E.printStackTrace();
            }
        } else if (sm.equals("New Faculty Information")) {
            new AddFaculty();
        } else if (sm.equals("New Student Information")) {
            new AddStudent();
        }else if (sm.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (sm.equals("View Student Details")) {
            new StudentDetails();
        } else if (sm.equals("Faculty Leave")) {
            new TeacherLeave();
        } else if (sm.equals("Student Leave")) {
            new StudentLeave();
        } else if (sm.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if (sm.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        } else if (sm.equals("Update Faculty Details")) {
            new updateTeacher();
        } else if (sm.equals("Update Student Details")) {
            new updateStudent();
        } else if (sm.equals("Enter Marks")) {
            new EnterMarks();
        } else if (sm.equals("Examination Results")) {
            new ExaminationDetails();
        } else if (sm.equals("Fee Structure")) {
            new FeeStructure();
        }else if (sm.equals("Student Fee Form")){
            new StudentFeeForm();
        } else if (sm.equals("About")) {
            new About();
        }
    }
    public static void main(String[] args) {
        new Main_class();


    }
}
