package OBJECT;

public class testQuanLyDiem {
    public static void main(String[] args) {
        QuanLyDiem hs1 = new QuanLyDiem("Hao", 9.0, 3.5, 7.9);
        QuanLyDiem hs2 = new QuanLyDiem("Phong", 8.0, 7.0, 9.0);

        // Không cần khai báo biến dtb1, loai1 lẻ tẻ ở đây nữa
       // hs1.hienThiToanBo(); 
       // hs2.hienThiToanBo();

       System.err.println(hs1.Ten);
       System.err.println("Điem TA: "+ hs1.Anh);
    }
  

}

    