package Black_Belt.L02.Genenrics.Game;

public class Test {
    public static void main(String[] args) {
        playerList();
    }

    public static void playerList() {

        // Школьники
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 14);
        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Olya", 14);

        // Студенты
        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);

        // Работники
        Employee employee1 = new Employee("Maksim", 24);
        Employee employee2 = new Employee("Dasha", 14);

        Team<Schoolar> schoolTeam = new Team<>("Драконы");
        schoolTeam.addNewParticipant(schoolar1);
        schoolTeam.addNewParticipant(schoolar2);

        Team<Schoolar> schoolTeam2 = new Team<>("Мудрецы");
        schoolTeam2.addNewParticipant(schoolar3);
        schoolTeam2.addNewParticipant(schoolar4);

        Team<Student> studentTeam = new Team<>("Вперед!");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Работяги!");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolTeam.playWith(schoolTeam2);

    }
}
