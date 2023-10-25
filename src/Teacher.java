public class Teacher {
    String isim;
    String branch;
    String mphone;

    Teacher(String isim,String branch,String mphone){
        this.isim=isim;
        this.branch=branch;
        this.mphone=mphone;

    }
    void yazdir(){
        System.out.println("Öğretmenin ismi: "+isim);
        System.out.println("Öğretmenin branşı: "+branch);
        System.out.println("Öğretmenin telefonu: "+mphone);
    }
    }

