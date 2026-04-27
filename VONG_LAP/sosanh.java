package VONG_LAP;

public class sosanh {
    public static void main(String[] args) {
        String chuoi_1 = "Hello";
        String chuoi_2 = "Hello";
        String chuoi_3 = new String("Hello");
        Boolean check_ch_1 = chuoi_1==chuoi_2;
        Boolean check_ch_2 =  chuoi_1==chuoi_3; 
        Boolean check_ch_3 = chuoi_1.equals(chuoi_3);
        System.out.println(check_ch_1);
        System.out.println(check_ch_2);
        System.out.println(check_ch_3);

        int so_1 = 5;
        int so_2 = 5;
        int so_3 = 128;
        Integer so_4 = 128;
        Integer so_5 = 128;
        boolean check_so_1 = so_1 == so_2;
        boolean check_so_2 = so_3 == so_4;
        boolean check_so_3 = so_4 == so_5;

        System.out.println(check_so_1);
        System.out.println(check_so_2);
        System.out.println(check_so_3);
    }
    
}
