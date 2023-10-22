package college.system;
public class Student {
    private String name;
    private Account emails;
    private Account passwords;

    String reset = "\u001B[0m";  
    String red = "\u001B[31m";  
    String green = "\u001B[32m"; 
    String yellow = "\u001B[33m";
    String blue = "\u001B[34m";  
    String gray = "\u001B[90m"; 

public Student(String name, int grade) {
    this.name = readName(); 
    this.email = readEmail();     
    this.password = readPassword();  
}

private void login(){
    system.out.print(green+"Student Sign Up"+reset);
    string email_tempString =this.readEmail();
    string password_tempString=this.readPassword();
    if (email_tempString == database.StudentList[][2] & password_tempString==database.StudentList[][3] ){//here needs to add with database.
        course.addClass();
        system.out.print(yellow+"Email and password formats acceptable"+reset);
        college.StudentCourseMenu();

        int index = customers.indexOf(c);
        c.use();
        customers.set(index, c);
        database.write(customers);
    }
    else {
        system.out.print(yellow+"Email and password formats acceptable"+reset);
        system.out.print(red+"Student does not exist"+reset);
    }
}

private Student student(String name) {
    student = database.read();  
    for(student c:students)
        if(c.match(name))
            return c;
    return null;
}

public void view() {
    students = database.read();
    students.forEach(System.out::println);
}
    
private double readName() {
    //System.out.print(gray+"your name is :"+reset);
    return In.nextDouble();
}
private String readEmail() {
    while (true) {
        //System.out.print("Your email (please input a valid email that ends with '@university.com'): ");
        String email_tempString = System.console().readLine();
        System.out.print(gray+"Email: " + email_tempString+reset);
        //System.out.print("Your password (please input your password): ");
        String password_tempString= System.console().readLine();
        System.out.print(gray+"password: " + password_tempString+reset);

        if (email_tempString.endsWith("@university.com")) {
            return email_tempString;
        } else {
            System.out.println(red+"Incorrect email or password format"+reset);
        }
    }

}
private String readPassword() {
    while (true) {
        //System.out.print("Your password (please input your password): ");
        String password_tempString= System.console().readLine();

        int letters = 0;
        int numbers = 0;

        for (char c : password_tempString.toCharArray()) {
            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isDigit(c)) {
                numbers++;
            }
        }

        if (password_tempString.length() <= 9) {
            //System.out.println("Your password is too short. Please input the password again (capital first, more than 5 letters, and 4 numbers):");
            System.out.println(red+"Incorrect email or password format"+reset);
        } else if (!Character.isUpperCase(password_tempString.charAt(0))) {
            //System.out.println("The first letter of your password is not uppercase. Please input the password again (capital first, more than 5 letters, and 4 numbers):");
            System.out.println(red+"Incorrect email or password format"+reset);
        } else if (letters < 5 || numbers < 4) {
            //System.out.println("Your password doesn't meet the requirements. Please input the password again (capital first, more than 5 letters, and 4 numbers):");
            System.out.println(red+"Incorrect email or password format"+reset);
        
        } else {
            return password_tempString;
        }
    }
}
private void register(student student){
    system.out.print(green+"Student Sign Up"+reset);
    
    this.emails.readEmail();
    this.passwords.readPassword();
    system.out.print(yellow+"email and password acceptable"+reset);
    name=this.name.readName();
    for( int i=1;i< database.studentNameList.length;i++){
        if (name == database.studentNameList[i]){
            system.out.print(red+"Student " + name +"already exists"+reset);
        }
        else{
            system.out.print(gray+"Name: " + name +reset);
            system.out.print(yellow+"Enrolling Student " + name +reset);
        }
    }
    
    Random random = new Random();
    int ID = random.nextInt(1000000);
    String formattedID = String.format("%06d",ID); // for 000100
    this.ID = Integer.parseInt(formattedID);
}

//these two that i can't do it
private void ID(student students,int ID ) {
    if (ID >= 0 && ID < 999999) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please input changing student\'s name: ");
        int rev_name = scanner.nextInt();
  
        this.name.readName();
        this.emails.readEmail();
        this.passwords.readPassword();
     
    }  
    else{
        print("the student information table is NULL");
    }
}


}
