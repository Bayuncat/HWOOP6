package org.example.controller;

import org.example.model.Student;
import org.example.model.StudentGroup;
import org.example.service.StreamService;
import org.example.service.StudentGroupService;
import org.example.view.StudentView;

import java.util.List;

public class StudentController implements UserController<Student> {

    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService studentStreamService = new StreamService();
    private final StudentView studentView = new StudentView();


    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList(){

        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO(){
        List<Student> studentList = studentGroupService.getSortedStudentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<StudentGroup> getSortedStreamList() {
        return studentStreamService.getSortedStudentBySize();
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}
