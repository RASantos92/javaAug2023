import java.util.ArrayList;
public class Test {
    public static void main(String[] args){
        Developer dev = new Developer();
        System.out.println(dev);

        dev.name = "Kyle Smyth";
        dev.age = 26;
        dev.salary = 120000.23;
        dev.languages = new ArrayList<>();
        dev.languages.add("Python");
        dev.languages.add("Java");

        Project project1 = new Project();
        project1.title = "Lookify";
        project1.language = "Java";

        Project project2 = new Project();
        project2.title = "Netflix clone";
        project2.language = "Python";

        dev.addProject(project1);
        dev.addProject(project2);

        dev.displayStatus();
    }
}