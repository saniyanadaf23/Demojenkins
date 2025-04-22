public class Course {

    public static void main(String[] args) {
        
        String courseName = "Introduction to Java Programming";

        String courseCode = "JAVA101";
    
        displayCourseDetails(courseName, courseCode);
    }
    public static void displayCourseDetails(String name, String code) {
        System.out.println("Course Name: " + name);  // Print the course name
        System.out.println("Course Code: " + code);  // Print the course code
    }
}
