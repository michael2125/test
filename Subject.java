package college.system;
import utils.In;
import java.util.Random;
import java.util.Scanner;

public class course {
    private String coursname;
    public static int[] selectedCourses;
    private String[][][] grade;
    private static int count = 0;
    private int[] score;
    private string Mark;

    String reset = "\u001B[0m";  
    String red = "\u001B[31m";   
    String green = "\u001B[32m"; 
    String yellow = "\u001B[33m"; 
    String blue = "\u001B[34m";    
    String gray = "\u001B[90m";    

private void change(){
    system.out.print(yellow+"Updating Password"+reset);
    string password_tempString=student.readPassword();
    system.out.print(gray+"New Password"+password_tempString+reset);
    string password_tempString1=student.readPassword();
    system.out.print(gray+"COnfirm Password"+password_tempString1+reset);
    while(true){
      if (password_tempString != password_tempString1){
        system.out.print(red+"Password does not match - try again"+reset);
        password_tempString1=student.readPassword();
        system.out.print(gray+"COnfirm Password"+password_tempString1+reset);
        }  
    }
    
}
public  enrol(){
    count++;
    swich(count){
        case 1:
            selectedCourses[0]=random[1000];
            System.out.println(yellow+ "Enrolling in Subject-" + selectedCourses[0] +reset);
            System.out.println(yellow+":You are now enrolled in 1 out of 4 subjects"+reset);
            return selectedCourses[0];
        case 2:
            selectedCourses[1]=random[1000];
            System.out.println(yellow+"Enrolling in Subject-" + selectedCourses[1] +reset);
            System.out.println(yellow+":You are now enrolled in 2 out of 4 subjects"+reset);
            
            return selectedCourses[1];
        case 3:
            selectedCourses[2]=random[1000];
            System.out.println(yellow+"Enrolling in Subject-" + selectedCourses[2]+reset);
            System.out.println(yellow+":You are now enrolled in 3 out of 4 subjects"+reset);
            return selectedCourses[2]
        case 4:
            selectedCourses[3]=random[1000];
            System.out.println(yellow+"Enrolling in Subject-" + selectedCourses[3] +reset);
            System.out.println(yellow+":You are now enrolled in 4 out of 4 subjects"+reset);
            return selectedCourses[3];
        default:
            System.out.println(red+"Student are allowed to enroll in 4 subjects only" +reset);
    }
}



private void checkClass(string[] count){
    if (selectedCourses.length < 4){
        Random random = new Random();
        int special_id = random.nextInt(999);
    }
    else if (selectedCourses.length > 4){
        int sendEmail=1;//send them a email to let them pay study fee.
    } 
    
}

private void remove(int i){
     courselist[i]= null;
    
}


private void show(){
    Random random = new Random();
    
    if (student.length != 0) {
        System.out.println(yellow+"Showing" + count + "subjects"+ reset);
        //System.out.println("ID  name email password");
        for (int i=0; 1<count;i++){
            score[i] = random.nextInt(100);
            if (score[i]>integer.grade[i][0][1]){ Mark="HD";}
            else if (score[i]>integer.grade[i][1][1]){ Mark="D";}
            else if (score[i]>integer.grade[i][2][1]){ Mark="c";}
            else if (score[i]>integer.grade[i][3][1]){ Mark="P";}
            else if (score[i]>integer.grade[i][4][1]){ Mark="Z";}
            else { Mark="?";}
            string passMark=passMark(score);
            system.out.print(gray+"[ Subject::"+ selectedCourses[i] + " -- mark = " + score[i]+ " --  grade =  " + Mark + "]" + reset);
        }
    }
    else{
            System.out.println(yellow+ "showing 0 subjects:"+ reset);
    }
    
}




private void coursesScore(){
    Random random = new Random();

    grade= new string[15][5][2];
    for(int i=0;i<=15 ;i++){
        int scoreRange = random.nextInt(16) + 85; // generate int from 85 to 100.
        grade[i][0][0] = database.courseList[i]+"HD :" ;
        grade[i][0][1] = scoreRange ;
        scoreRange = random.nextInt(10) + 75; 
        grade[i][1][0] = database.courseList[i]+"D :" ;
        grade[i][1][1] = scoreRange ;      
        scoreRange = random.nextInt(10) + 65; 
        grade[i][2][0] = database.courseList[i]+"C :" ;
        grade[i][2][1] = scoreRange ;
        scoreRange = random.nextInt(15) + 50; 
        grade[i][3][0] = database.courseList[i]+"P :" ;
        grade[i][3][1] = scoreRange ;
        scoreRange = random.nextInt(50) + 0; 
        grade[i][4][0] = database.courseList[i]+"Z :" ;
        grade[i][4][1] = scoreRange ;

   
    
    }
    return string[][][] grade;
}









}
