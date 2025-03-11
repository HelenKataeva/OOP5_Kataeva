package Service;

import Model.*;

import java.util.ArrayList;
import java.util.List;

public class EducationalGroupService {
    private List<User> userList;
    private List<StudyGroup> groupList;

    public EducationalGroupService() {
        this.userList = new ArrayList<>();
        this.groupList = new ArrayList<>();
    }

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getMaxId(type);
        if (type == Type.STUDENT) {
            userList.add(new Student(firstName, secondName, lastName, id));
        }
        if (type == Type.TEACHER) {
            userList.add(new Teacher(firstName, secondName, lastName, id));
        }
    }
    public void studyGroup(Teacher teacher, List<Student> students){
            groupList.add(new StudyGroup(teacher, students));
    }

    private int getMaxId(Type type) {
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 0;
        for (User user : userList) {
            if (user instanceof Teacher && !itsStudent) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Student && itsStudent) {
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;
    }

    public List<User> getAllStudent() {
        List<User> resultList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student)
                resultList.add(user);
        }
        return resultList;
    }

    public List<User> getAllTeacher() {
        List<User> resultList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Teacher)
                resultList.add(user);
        }
        return resultList;
    }

    public List<User> getUserList() {
        return userList;
    }

}