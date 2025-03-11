import Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createTeacher("Иванов", "Петр", "Иваныч");

        controller.createStudent("Петров", "Петр", "Петрович");
        controller.createStudent("Сидоров", "Иван", "Иваныч");
        controller.createStudent("Никитин", "Дмитрий", "Дмитриевич");

        controller.studyGroup(controller.getAllTeacher(),controller.getAllStudent());
        System.out.println();
        controller.getStudyGroup();
    }
}