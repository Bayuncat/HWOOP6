package org.example.controller;

import org.example.model.Teacher;
import org.example.service.TeacherService;
import org.example.view.TeacherView;

import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    public void editTecher(int index, String firstName, String lastName, String middleName){
        teacherService.editTeacher(index, firstName, lastName, middleName);
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);
    }

    public void printTeacherList(){

        List<Teacher> teacherList = teacherService.printTeacherList();
        teacherView.sendOnConsole(teacherList);
    }

}
