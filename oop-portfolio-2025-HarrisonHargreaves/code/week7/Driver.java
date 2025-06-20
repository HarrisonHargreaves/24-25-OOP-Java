package code.week7;

public class Driver {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Smith", 12345, "Cardiology");
        Nurse nurse = new Nurse("Nurse Jones", 54321, 10);
        Receptionist receptionist = new Receptionist("Receptionist Brown", 67890, "Opthalmology");
        Cleaner cleaner = new Cleaner("Cleaner White", 98765, "Neurology");
    
    doctor.getInfo();
    nurse.getInfo();
    receptionist.getInfo();
    cleaner.getInfo();
    }
}
