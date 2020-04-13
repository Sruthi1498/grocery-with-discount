/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery;

/**
 *
 * @author THIRUMALAI RAJU
 */

    class Discount extends Bill {

      
    public void discount1(){
    int s = 100 - 25;
            double amount;
            amount = (s*total)/100;
            System.out.println("Amount after discount:"+amount);
            int gst = 29;
        double final_amount;
        final_amount = amount + gst;
        System.out.println("Net amount with gst: "+final_amount);
    }

    void Discount1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
