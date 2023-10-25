public class Course {
    String dersAdi;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    Course(String dersAdi,String code,String prefix){
        this.dersAdi=dersAdi;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher= teacher;
//            printTeacher();
        }else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }
    void printTeacher(){
        this.teacher.yazdir();
    }
}