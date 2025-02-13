package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        boolean e = false;
        for (int i = 0; i < list.size(); i++) {
            if (e)
                break;
            e = true;
            for (int ii = 1; ii < list.size(); ii++) {
                Student s1 = list.get(ii - 1);
                Student s2 = list.get(ii);
                int c1 = s2.getLastName().compareTo(s1.getLastName());
                if (c1 < 0) {
                    list.add(ii, list.remove(ii - 1));
                    e = false;
                }else if (c1 == 0) {
                    int c2 = s2.getFirstName().compareTo(s1.getFirstName());
                    if (c2 < 0 || c2 == 0 && s2.getGpa() > s1.getGpa()) {
                        list.add(ii, list.remove(ii - 1));
                        e = false;
                    }
                }
            }
        }
        return list;
    }

}
