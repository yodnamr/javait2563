public class Student {
    protected String studentId;
    protected String studentName;
    protected String faculty;
    protected String major;
    
    public void enrollment(){
        System.out.println("student enrollment");
    }
    public void payment(){
        System.out.println("student payment");
    }
    public void addCourse(){
        System.out.println("student addCourse");
    }
    public void dropCourse(){
        System.out.println("student dropCourse");
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        Student nalinee = new Student();
        System.out.println("Object = "+nalinee);
        nalinee.enrollment();
        nalinee.dropCourse();
        nalinee.dropCourse();
        nalinee.payment();
    }
    
}//end class



















