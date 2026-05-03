package OBJECT;

public class Student {
    //tạo một đối tượng
    public String name;
    public int age;
    static int dem_sl;

    public Student(String ten, int tuoi){
        name = ten;
        age = tuoi;
        dem_sl ++;
        
    }
    // đây là sửa tên nếu sai
    public void update_ten(String ten_moi){
        name = ten_moi;
    }

    public String getName(){
        return name;
    }

    public static int get_so_luong_sv(){
        return dem_sl;

    }



    public static void main(String[] args){
        Student s1 = new Student("Hao", 18);
       // System.out.println(s1);
        System.out.println(s1.name + " "+ s1.age);
        //s1.update_ten("A LANG HAO"); // gọi tên để sửa
         System.out.println(s1.name + " "+ s1.age);
         System.out.println(Student.dem_sl);

        Student s2 = new Student("Thu", 20);
        System.out.println(s2.name + " " + s2.age);
        System.out.println(Student.dem_sl);
       System.out.println(s1.getName());
       System.out.println(Student.get_so_luong_sv());
    }

    
}
