/*    Question 2: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and 
                  an eraser. You have to output the total cost of the items back to the user as their bill.

                (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */
        import java.util.Scanner;
        public class Item_bill_calculation {
        public static void main(String[]args){
            //input part.....

            System.out.println("give the the cost of these product");
            Scanner sc = new Scanner(System.in);
            System.out.println("pen cost -");
            float pen = sc.nextFloat();
            System.out.println("pencile cost - ");
            float pencil = sc.nextFloat();
            System.out.println("eraser cost - ");
            float eraser = sc.nextFloat();

            // calculation part ......
            double total = pen + pencil + eraser ;
            double gst  = total * 0.18;
            double price = total + gst;

            // Bill....
            System.out.println("\n .....................................");
            System.out.println("              ITEMAIZE BILL             ");
            System.out.println("  ......................................");
            System.out.printf("pencil:             rupess %.2f\n",pencil);
            System.out.printf("pen :                rupess %.2f\n",pen);
            System.out.printf("eraser:              rupess %.2f\n",eraser);
            System.out.println("........................................");
            System.out.printf("total :             rupess %.2f\n",total);
            System.out.println("gst 18% :                rupess " + gst);
            System.out.println(".........................................");
            System.out.printf("final amount :      rupess %.2f\n",price );

            System.out.println("thank you for visiting ");
            sc.close();
           }
        }   
