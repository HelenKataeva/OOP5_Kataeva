package Controller;

import Model.*;
import Service.EducationalGroupService;
import View.StudentView;
import View.TeacherView;

import java.util.List;

public class Controller {
    private final EducationalGroupService service = new EducationalGroupService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    public void createStudent(String firstName, String secondName, String lastName) {
        service.create(firstName, secondName, lastName, Type.STUDENT);
    }
    public Teacher createTeacher(String firstName, String secondName, String lastName) {
        service.create(firstName, secondName, lastName, Type.TEACHER);
        return null;
    }
    public void studyGroup(Teacher teacher, List<Student> students) {
        service.studyGroup(teacher, students);
    }

    public List<Student> getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : service.getAllStudent()) {
            studentView.printOnConsole((Student) user);
        }
        return null;
    }

    public Teacher getAllTeacher() {
        List<User> userList = service.getAllTeacher();
        for (User user : service.getAllTeacher()) {
            teacherView.printOnConsole((Teacher) user);
        }
        return null;
    }

    public StudyGroup getStudyGroup(){
        List<User> userList2 = service.getAllStudent();
        for (User user : service.getAllTeacher()) {
            teacherView.printOnConsole((Teacher) user);
        }
        List<User> userList1 = service.getAllTeacher();
        for (User user : service.getAllStudent()) {
            studentView.printOnConsole((Student) user);
        }
        return null;
    }
}