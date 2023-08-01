import java.util.ArrayList;
public class Developer{
    //------------------ attributes (private/protected) ----------------------
    private static int devCount;
    private static double totalSalary;
    private boolean canCode = true;
    private String name;
    private int age;
    private double salary;
    private ArrayList<String> languages;
    private ArrayList<Project> projects = new ArrayList<Project>();

    //------------------ constructors ----------------------
    public Developer(){
        this.languages = new ArrayList<String>();
        this.name = "no name";
        Developer.devCount++;
    }

    public Developer(String name, int age,double salary){
        this.languages = new ArrayList<String>();
        this.name = name;
        this.age = age;
        this.salary = salary;
        Developer.devCount++;
        Developer.totalSalary += salary;
    }

    //------------------ other class methods ----------------------
    public void displayStatus(){
        System.out.println("name: " + this.name);
        System.out.println("can code: " + this.canCode);
        System.out.println("age: " + this.age);
        System.out.println("salary: " + this.salary);
        System.out.println("languages: " + this.languages);

        System.out.println("Projects: ");
        for(Project project: this.projects){
            project.displayInfo();
        }
    }

    public void addProject(Project project){
        this.projects.add(project);
    }

    public void addLanguage(String language){
        this.languages.add(language);
    }

    //------------------ getters / setters  ----------------------
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setCanCode(boolean canCode){
        this.canCode = canCode;
    }

    public boolean getCanCode(){
        return this.canCode;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setSalary(double salary){
        Developer.totalSalary -= this.salary;
        Developer.totalSalary += salary;
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public static int getDevCount(){
        return Developer.devCount;
    }

    public static double getTotalSalary(){
        return Developer.totalSalary;
    }
}