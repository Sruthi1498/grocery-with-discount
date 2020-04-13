
package grocery;

public class Bill {
    
    private User user;
    private Product product;
    private int pid;
    private int quantity;
    static double total;

    Bill(User user, Product prod, int quan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
    public void Bill1(User user,Product pid,int quantity) {
     total = 0.00;
           
            this.user = user;
            this.product = pid;
            this.quantity = quantity;
            billcalc();
            displaybill();
            
    }

    private void billcalc() {
        
       Bill.total += this.quantity*product.get_price();
    }

    private void displaybill() {
        
         System.out.println("UID --  "+user.getUid()+" FIRSTNAME --  "+user.getFName()+"  LASTNAME --  "+user.getLName());
                 System.out.println("PID --"+product.get_id()+ " PNAME --"+product.get_name()+" PRICE --" +product.get_price());
                 total();
                 
    }
    public static void total(){
        System.out.printf("%.2f  ",total);
        
}
}


    
    

 

   
     
    

       
        
       
  
