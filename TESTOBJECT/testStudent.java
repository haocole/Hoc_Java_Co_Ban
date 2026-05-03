package TESTOBJECT;

import OBJECT.Student;

public class testStudent {
    public static void main(String[] args){
       // Bây giờ 'new' sẽ hết lỗi vì Constructor đã là public
        Student s1 = new Student("hao", 18); 
        
        // s1.name sẽ hết lỗi vì biến name đã là public
        System.out.println(s1.name); 
    
    }
    
}
