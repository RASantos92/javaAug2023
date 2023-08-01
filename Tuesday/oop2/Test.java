import java.util.ArrayList;
public class Test {
    public static void main(String[] args){
        Developer dev = new Developer();
        System.out.println(dev);

        dev.setName("Kyle Smyth");
        dev.setAge(26) ;
        dev.setSalary(120000.23) ;
        dev.addLanguage("Python");
        dev.addLanguage("Java");

        Project project1 = new Project();
        project1.title = "Lookify";
        project1.language = "Java";

        Project project2 = new Project();
        project2.title = "Netflix clone";
        project2.language = "Python";

        dev.addProject(project1);
        dev.addProject(project2);

        // dev.displayStatus();


        Developer dev1 = new Developer("Isaiah Tran",24,120000.45);
        dev1.displayStatus();
    }
}