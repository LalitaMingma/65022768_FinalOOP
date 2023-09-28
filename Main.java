import java.util.ArrayList;
import java.util.List;

class Employee {
  private String Name;
  private int EmpID;
  private String Position;
  private List<Project> Projects;

  public Employee(String Name, int EmpID, String Position) {
    this.Name = Name;
    this.EmpID = EmpID;
    this.Position = Position;
    this.Projects = new ArrayList<Project>();
  }

  public void setName(String name) {
    this.Name = name;
  }

  public String getName() {
    return Name;
  }

  public void setEmpID(int empID) {
    this.EmpID = empID;
  }

  public int getEmpID() {
    return EmpID;
  }

  public void setPosition(String position) {
    this.Position = position;
  }

  public String getPosition() {
    return Position;
  }

  public void addProject(Project project) {
    Projects.add(project);
  }

  public List<Project> getProjects() {
    return Projects;
  }

  @Override
  public String toString() {
    StringBuilder details = new StringBuilder();
    details.append("Name: " + Name + "\n");
    details.append("EmpID: " + EmpID + "\n");
    details.append("Position: " + Position + "\n");
    details.append("Projects:\n");
    for (Project project : Projects) {
      details.append(project.getName() + ": " + project.getDescription() + "\n");
    }
    return details.toString();
  }
}

class Project {
  private String Name;
  private String description;

  public Project(String name, String description) {
    this.Name = name;
    this.description = description;
  }

  public String getName() {
    return Name;
  }

  public String getDescription() {
    return description;
  }
}

public class Main {
  public static void main(String[] args) {
    Employee employee1 = new Employee("Tom", 0001, "UX/UI");
    Employee employee2 = new Employee("Tim", 0002, "FrontEnd");

    Project project1 = new Project("Web A", "Developing a web application");
    Project project2 = new Project("Mobile app A", "Developing a mobile app");

    employee1.addProject(project1);
    employee1.addProject(project2);
    employee2.addProject(project1);

    System.out.println("******************\n" + employee1.toString());
    System.out.println("******************\n" + employee2.toString());
  }
}
