import java.util.ArrayList;
public class Developer{
    // Attributes
    private boolean canCode = true;
    private String name;
    private int age;
    private double salary;
    private ArrayList<String> languages;
    private ArrayList<Project> projects = new ArrayList<Project>();

    public Developer(){
        this.languages = new ArrayList<String>();
        this.name = "no name";
    }

    public Developer(String name, int age,double salary){
        this.languages = new ArrayList<String>();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

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
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }
}