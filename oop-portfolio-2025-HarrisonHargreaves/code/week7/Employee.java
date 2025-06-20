package code.week7;

class Employee
{
    protected String name;
    protected int EmployeeID;

    public Employee(String name, int EmployeeID)
    {
    this.name = name;
    this.EmployeeID = EmployeeID;
    }
}

class Doctor extends Employee {
    private String specialty;

    public Doctor(String name, int EmployeeID, String specialty) {
        super(name, EmployeeID);
        this.specialty = specialty;
    }
    public void getInfo() {
        System.out.println("Name: " + name + "\nEmployee ID: " + EmployeeID + "\nSpecialises in " + specialty);
    }
}

class Nurse extends Employee
{
    private int patientNumber;

    public Nurse(String name, int EmployeeID, int patientNumber)
    {
        super(name, EmployeeID);
        this.patientNumber = patientNumber;
    }

    public void getInfo()
    {
        System.out.println("Name: " + name + "\nEmployee ID: " + EmployeeID + "\nhas " + patientNumber + " patients.");
    }
}

class Receptionist extends Employee
{
    private String department;

    public Receptionist(String name, int EmployeeID, String department)
    {
        super(name, EmployeeID);
        this.department = department;
    }
    public void getInfo()
    {
        System.out.println("Name: " + name + "\nEmployee ID: " + EmployeeID + "is the receptionist for the " + department + " department.");
    }
}

class Cleaner extends Employee
{
    private String cleaningArea;

    public Cleaner(String name, int EmployeeID, String cleaningArea)
    {
        super(name, EmployeeID);
        this.cleaningArea = cleaningArea;
    }
    public void getInfo()
    {
        System.out.println("Name: " + name + "\nEmployee ID: " + EmployeeID + "\ncleans the " + cleaningArea  + " department.");
    }
}
