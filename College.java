package college system
import utils.In;

public class college{
    String reset = "\u001B[0m";   
    String red = "\u001B[31m";   
    String green = "\u001B[32m"; 
    String yellow = "\u001B[33m"; 
    String blue = "\u001B[34m";    
    String gray = "\u001B[90m";    

private void college(){
        Admin = new Admin();
        Database.initialize();
        Student = Database.read();
    }
    
    
private char readStudentChoice() {
    System.out.print(blue+"Student System (l/r/x): "+reset);
    String userInput = scanner.nextLine();
    System.out.print(gray+userInput+reset);
    return userInput;
}


private void StudentMenu() {
    char c;
    while((c = this.readStudentChoice()) != 'x') {
       switch (c) {
            case 'l':
                student.login();
                break;
            case 'r':
                student.register();
                break;
          default:
             this.StudentHelp();
       }
    }

 }
private void StudentHelp() {
    System.out.println(blue+'=' * 30+reset);
    System.out.println(blue+"Admin system"+reset);
    System.out.println(blue+"l - login"+reset);
    System.out.println(blue+"r - register"+reset);
    System.out.println(blue+"x - exit"+reset);
 }

private char readStudentCourseChoice() {
    System.out.print("blue+Start choicing (c/e/r/s/x): "+reset);
    String userInput = scanner.nextLine();
    System.out.print(gray+userInput+reset);
    return userInput;
}
private void StudentCourseMenu() {
    char c;
    while((c = this.readStudentChoice()) != 'x') {
       switch (c) {
            case 'c':
                subject.change();
                break;
            case 'e':
                subject.enrol();
                break;
            case 'r':
                subject.remove();
                break;
            case 's':
                subject.show();
                break;
          default:
             this.StudentHelp();
       }
    }

 }
private void StudentCourseHelp() {
    System.out.println(blue+'=' * 30+reset);
    System.out.println(blue+"The student course system"+reset);
    System.out.println(blue+"c - change"+reset);
    System.out.println(blue+"e - enrol"+reset);
    System.out.println(blue+"r - remove"+reset);
    System.out.println(blue+"s - show"+reset);
    System.out.println(blue+"x - exit"+reset);
 }

private char readAdminChoice() {
    System.out.print(blue+" Admin System (c/g/p/r/s/x): "+reset);
    String userInput = scanner.nextLine();
    System.out.print(gray+userInput+reset);
    return userInput;
}
private void AdminMenu() {
    char c;
    while((c = this.readAdminChoice()) != 'x') {
       switch (c) {
            case 'c':
                Admin.ClearDatabaseFile();
                break;
            case 'g':
                Admin.GroupStudents();
                break;
            case 'p':
                Admin.PartitionStudents();
                break;
            case 'r':
                Admin.RemoveStudent();
                break;
            case 's':
                Admin.Show();
                break;
          default:
             this.AdminHelp();
       }
    }

 }
private void AdminHelp() {
    System.out.println(blue+'=' * 30+reset);
    System.out.println(blue+"the admin system"+reset);
    System.out.println(blue+"c - clear detabase file"+reset);
    System.out.println(blue+"g - group students"+reset);
    System.out.println(blue+"p - partition students"+reset);
    System.out.println(blue+"r - remove student"+reset);
    System.out.println(blue+"s - show"+reset);
    System.out.println(blue+"x - exit"+reset);
 }

private char readChoice() {
    System.out.print(blue+"University System: (A)dmin, (S)tudent, or X :: "+reset);
    String userInput = scanner.nextLine();
    System.out.print(gray+userInput+reset);
    return userInput;
}
private void Menu() {
    char c;
    while((c = this.readChoice()) != 'x') {
       switch (c) {
            case 'a':
                this.AdminMenu();
                break;
            case 's':
                this.StudentMenu();
                break;
            default:
             this.help();
             system.out.print(yellow+"Thank You"+reset)
       }
    }

 }
private void help() {
    System.out.println(blue+'=' * 30+reset);
    System.out.println(blue+"The university system"+reset);
    System.out.println(blue+"A - Admin"+reset);
    System.out.println(blue+"S - Student"+reset);
    System.out.println(blue+"X - Exit"+reset);
 }
}
