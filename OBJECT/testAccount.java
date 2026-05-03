package OBJECT;

public class testAccount {
    public static void main(String[] args) {
        Account user1 = new Account("HAO", 10000);
        Account user2 = new Account("Tin", 1000);

        // System.err.println("---TRANG THAI---");
        // user1.showInfo();
        // user2.showInfo();

        //2. nap tien cho hao
        System.err.println("\n Nap 500$ cho HAO");
        user1.deposit(500);
        user1.showInfo();

        //3. rut tien cho hao
               // System.err.println("\n HAO rut 50$ go to WEDING");
                //user1.withdraw(50);
                //user1.showInfo();


        //4. kiem tra tinh Static doi ten ngan hang
           // System.err.println("\n NGAN HANG DOI TEN");
            //Account.BankName = "Java International Bank";
            //user1.showInfo();
            //user2.showInfo();

        //5. nap cho tin 10$
            //System.err.println("Nap cho e tin 10$");
            //user2.deposit(10);
            //user2.showInfo();

        user1.showInfo();
        user2.showInfo();
    }

    
}
