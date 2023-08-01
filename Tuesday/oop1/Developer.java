import java.util.ArrayList;
public class Developer{
    // Attributes
    public boolean canCode = true;
    public String name;
    public int age;
    public double salary;
    public ArrayList<String> languages;
    public ArrayList<Project> projects = new ArrayList<Project>();

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
}