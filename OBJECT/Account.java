package OBJECT;

public class Account {
    //1. thuôc tính dữu liệu
    public String owner;
    public double balance;
    public static String BankName = "JavaBank";

    //2. hàm khởi tạo
    public Account(String ten, double tienNap){
        owner = ten;
        balance = tienNap;
    }
    // 3. nap tien
    public void deposit(double amount){
        balance = balance + amount;

    }
    //4. tut tien
    public void withdraw(double amount){
        if (amount <= balance) { // BỎ dấu ; ở đây đi
        balance = balance - amount; // Phải có dòng này thì tiền mới trừ đi
        System.out.println("Rut tien thanh cong!");
    } else {
        System.out.println("So du khong du de rut!");
    }

    }
    //5. xem thong tin
    public void showInfo() {
        System.out.println("Chu TK: " + owner + " | So du: " + balance + " | Ngan hang: " + BankName);
    }
}
