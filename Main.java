package grocery;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String more;
        String sb;
        User user;
        Discount discount;
        int choice;
        Product prod = new Product(101, "POTATO", 30);
        Product prod1 = new Product(102, "TOMATO", 90);
        Product prod2 = new Product(103, "ONION", 70);
        Product prod3 = new Product(104, "LADIES FINGER", 10);
        Product prod4 = new Product(105, "COCUNUT", 30);

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Display all the items");
            System.out.println("2. Buy items");
            System.out.println("3. Apply discount");
        
            System.out.println("4. Exit");
            
            System.out.println("Choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("PID --" + prod.get_id() + " PNAME --" + prod.get_name() + " PRICE --" + prod.get_price());
                    System.out.println("PID --" + prod1.get_id() + " PNAME --" + prod1.get_name() + " PRICE --" + prod1.get_price());
                    System.out.println("PID --" + prod2.get_id() + " PNAME --" + prod2.get_name() + " PRICE --" + prod2.get_price());
                    System.out.println("PID --" + prod3.get_id() + " PNAME --" + prod3.get_name() + " PRICE --" + prod3.get_price());
                    System.out.println("PID --" + prod4.get_id() + " PNAME --" + prod4.get_name() + " PRICE --" + prod4.get_price());
                    break;

                case 2:
                    System.out.println("userid:");
                    int Uid = sc.nextInt();
                    System.out.println("FIRSTname:");
                    String Uname1 = sc.next();
                    System.out.println("LASTname:");
                    String Uname2 = sc.next();
                    user = new User(Uid, Uname1, Uname2) {};
                    System.out.println("*************");
                    do {
                        System.out.println("Enter product id:");
                        int pid = sc.nextInt();
                        System.out.println("quantity:");
                        int quan = sc.nextInt();
                        if (pid == 101) {
                            Bill bill = new Bill(user, prod, quan);
                        } else if (pid == 102) {
                            Bill bill = new Bill(user, prod1, quan);
                        } else if (pid == 103) {
                            Bill bill = new Bill(user, prod2, quan);
                        } else if (pid == 104) {
                            Bill bill = new Bill(user, prod3, quan);
                        } else if (pid == 105) {
                            Bill bill = new Bill(user, prod4, quan);
                        } else {
                            System.out.println("product not available");
                        }
                        System.out.println("more items?");

                        more = sc.next();
                    } while (more.equals("yes"));
                    break;

                case 3:
                    System.out.println("userid:");
                    int Uid1 = sc.nextInt();
                    System.out.println("FIRSTname:");
                    String Uname11 = sc.next();
                    System.out.println("LASTname:");
                    String Uname21 = sc.next();
                    user = new User(Uid1, Uname11, Uname21) {};
                    System.out.println("*************");
                    do {
                        System.out.println("Enter product id:");
                        int pid = sc.nextInt();
                        System.out.println("quantity:");
                        int quan = sc.nextInt();
                        if (pid == 101) {
                            Bill bill = new Bill(user, prod, quan);
                        } else if (pid == 102) {
                            Bill bill = new Bill(user, prod1, quan);
                        } else if (pid == 103) {
                            Bill bill = new Bill(user, prod2, quan);
                        } else if (pid == 104) {
                            Bill bill = new Bill(user, prod3, quan);
                        } else if (pid == 105) {
                            Bill bill = new Bill(user, prod4, quan);
                        } else {
                            System.out.println("product not available");
                        }
                        System.out.println("more items?");

                        more = sc.next();
                    } while (more.equals("yes"));
                    Discount Discount = new Discount();
                    Discount.total();
                    Discount.Discount1();
                    break;

                case 4:
                    System.out.println("Thank you !!");

            }
        } while (4 > choice);

    }

}
