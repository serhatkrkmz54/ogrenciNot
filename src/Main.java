public class Main {
    public static void main(String[] args) {
        var deneme = "ddd";
        Teacher t1=new Teacher("Serhat","TRH","05419727016");
        Teacher t2=new Teacher("Mehmet","MAT","05419727016");
        Teacher t3=new Teacher("Ahmet","FZK","05419727016");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course matematik = new Course("Matematik" , "102" , "MAT");
        matematik.addTeacher(t2);

        Course fizik = new Course("Fizik","103","FZK");
        fizik.addTeacher(t3);

        Student s1 = new Student("İbrahim","123","4",tarih,matematik,fizik);
        s1.addBulkExamNote(50,30,20);
        s1.isPass();

        Student s2 = new Student("Mehmet","124","4",tarih,matematik,fizik);
        s2.addBulkExamNote (60,70,40);
//        s2.isPass();

        Student s3 = new Student("Ahmet","125","4",tarih,matematik,fizik);
        s3.addBulkExamNote(80,90,100);
//        s3.isPass();
    }
}