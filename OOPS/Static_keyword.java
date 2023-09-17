public class Static_keyword {
    public static void main(String[] args) {

        SchoolStudents s1 = new SchoolStudents();
        s1.setRollNo(94);
        s1.getRollNo();
        s1.schoolName = "SPS";
        SchoolStudents s2 = new SchoolStudents();
        s2.schoolName = "DAV";

        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
    }
}


class SchoolStudents{

    int rollNo;
    String name;

    static String schoolName;

    String getSchoolName(){
        return schoolName;
    }
    void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    int getRollNo(){
        return this.rollNo;
    }



}

