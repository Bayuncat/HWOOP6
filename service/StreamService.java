package org.example.service;

import org.example.model.Stream;
import org.example.model.StudentGroup;

import java.util.ArrayList;
import java.util.List;

public class StreamService {

    private Stream stream;

    public List<StudentGroup> getSortedStudentBySize() {
        List<StudentGroup> studentGroupList = new ArrayList<>(stream.getStudentGroupList());
        studentGroupList.sort(new StreamComparator());
        return studentGroupList;
    }
}
