
public class GraduateStudent extends Student{

    private String studyLevel;
    private String thesisAdviser;

    public void oralExamination() {
        System.out.println("GraduateStudent oralExamination");
    }
    public void thesisExamination() {
        System.out.println("GraduateStudent thesisExamination");
    }
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent();
        gs.oralExamination();
        gs.thesisExamination();
        //call superclass method
        gs.payment();
        gs.addCourse();
        gs.dropCourse();
        gs.enrollment();
        
    }

}
