package college.system;
import utils.In;

public class Admin {
    private int grades;
    private string type;

    String reset = "\u001B[0m"; 
    String red = "\u001B[31m";   // 红色
    String green = "\u001B[32m"; // 绿色
    String yellow = "\u001B[33m"; // 黄色
    String blue = "\u001B[34m";    // 蓝色
    String gray = "\u001B[90m";    // 灰色

    private Admin (int grades, String type){
        this.grades= grades;
        this.type= type;  

        
    }


public static void main(String[] args) {
    // creage student object
    Student student1 = new Student("Alice", 10);
    Student student2 = new Student("Bob", 11);
    Student student3 = new Student("Charlie", 10);
    Student student4 = new Student("David", 12);

    // create sets to store students
    List<Student> students = new ArrayList<>();
    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);






}
private Admin admin(String name) {
        admin = database.read();  
        for(admin c:admins)
            if(c.match(name))
                return c;
        return null;
}
public void view() {
        customers = BackUp.read();
        customers.forEach(System.out::println);
}


private void ClearDatabaseFile(string email, string password ) {
    System.out.println(yellow+"Clearning student database"+reset);
    System.out.println(red+"Are you sure you want to clear the database (Y)ES/(N)O? "+reset);
    String userInput = scanner.nextLine();
    System.out.print(gray+userInput+reset);
    if(userInput=="Y"){student.Student = null;}
    
}
private int getGrade() {
    return grade;
}
private int getType() {
    return Type;
}
public  void GroupStudents(){
    System.out.print(yellow+"Grade Grouping"+reset);
    for (int i=0; 1<database.student.length;i++){
        if (subject.grade=="Z"){
            system.out.print(gray+"Z  -->["+database.student.name+"::"+ database.student.ID+"-->  Grade:  Z - MARK:"+subject.score[j] + reset);
        }
        else if(subject.grade=="P"){
            system.out.print(gray+"P  -->["+database.student.name+"::"+ database.student.ID+"-->  Grade:  P - MARK:"+subject.score[j] + reset);
        }
        else if(subject.grade=="C"){
            system.out.print(gray+"C  -->["+database.student.name+"::"+ database.student.ID+"-->  Grade:  C - MARK:"+subject.score[j] + reset);
        }
        else if(subject.grade=="D"){
            system.out.print(gray+"D  -->["+database.student.name+"::"+ database.student.ID+"-->  Grade:  D - MARK:"+subject.score[j] + reset);
        }
        else if(subject.grade=="HD"){
            system.out.print(gray+"HD  -->["+database.student.name+"::"+ database.student.ID+"-->  Grade:  HD - MARK:"+subject.score[j] + reset);
        }
    }
}
public  void PartitionStudents(){
    String[] passMark; 
    for (int i =0;i<subject.score.length;i++){
        if (subject.score >= 50){
            passMark[i] = "PASS";
        }
        else {
            passMark[i] = "FALL";
        }
    }
    for (int j =0;j<passMark.length;j++){
        if (passMark[j] = "FALL"){
            System.out.println(gray+"FALL -->["+database.student.name+"::"+database.student.ID+" --> GRADE:" + database.student.grade+" - MARK:"+databse.student.mark);
        }
        else {
            System.out.println(gray+"PASS -->["+database.student.name+"::"+database.student.ID+" --> GRADE:" + database.student.grade+" - MARK:"+databse.student.mark);

        }
    }
}

private void RemoveStudent( ) {
    int ID = scanner.nextInt();
    System.out.print(gray+"Remove by ID: "+ID+reset);
    for (int studentID : databse.student.ID) {
        if (ID == studentID) {
        Students[ID] = null;
        System.out.println(yellow+"Removing Student " + ID + " Acount."+reset);
            break;
        }
        else{
            System.out.println(red+"Student " + ID + " does not exist."+reset);
        }
    }

}

private void show(student student) {
    System.out.println(yellow+"Student List"+reset);
    for (int i=0; 1<database.student.length;i++){
        system.out.print(gray+database.student.name+"::"+ database.student.ID+"-->  Email:"+database.student.email + reset);
    }
}
}
