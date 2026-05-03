package TESTOBJECT;

public class testBook {
       public static void main(String[] args) {
       Book A = new Book("Ky nang", 36000, 2005);
        // System.out.println(A.name +" "+ A.price +" "+ A.public_year );

        // Book A1 = new Book("Java", 32000, 2030);
        // System.out.println(A1.name +" "+ A1.price +" "+ A1.public_year );

        Book B = new Book();
        System.out.println(B.name +" "+ B.price +" "+ B.public_year );
        B.setName("ChatGPT");
         System.out.println(B.name +" "+ B.price +" "+ B.public_year );
        B.setPrice(10000);
        System.out.println(B.name +" "+ B.price +" "+ B.public_year );
        B.setYear(2019);
        System.out.println(B.name +" "+ B.price +" "+ B.public_year );

        System.err.println(B.getName());
        System.err.println(Book.dem_so_luong());

    }
    
    
}
