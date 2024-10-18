package v1ch09;
import java.util.HashMap;
import java.util.Map;
/**
 * @author 刘季伟
 * @implNote 创建一个学生管理系统，私用Map来储存学生姓名与成绩的对应关系
 * @since 2024/10/18 10:07:08
 */
public class StudentsGrades {
    private Map<String, Integer> grades = new HashMap<>();

    // 添加或者更新学生成绩
    public void addOrUpdateStudent(String name, int score) {
        grades.put(name, score);
    }

    // 打印所有学生的成绩
    public void printAllGrades() {
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println("学生：" + entry.getKey() + "，成绩：" + entry.getValue());
        }
    }

    // 获取某个学生的成绩
    public String  getStudentScore(String name) {
        return grades.containsKey(name) ? "成绩：" + grades.get(name) : "学生不存在";
    }

    public static void main(String[] args) {
        StudentsGrades sg = new StudentsGrades();
        sg.addOrUpdateStudent("Alice", 85);
        sg.addOrUpdateStudent("Bob", 90);
        sg.printAllGrades();
        System.out.println(sg.getStudentScore("Alice"));
        System.out.println(sg.getStudentScore("Charlie"));
    }
}
