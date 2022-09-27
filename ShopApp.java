import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ShopApp  {

    public static double calcTotal(Clothing[] clothingArray){
        return 0.0;
    }
    public static boolean isAFit(Customer customer, Clothing clothing){
        boolean answer = true;
        if (customer.getSize() == clothing.getSize()){
           answer = true;

        }
        else {answer = false;}
        return answer;
    }
    public static void addClothingByPrice(Clothing[] clothingArray){

      // need to figure out why it is not getting price
       double finalPrice = 0.0;
        for(int x = 0; x < clothingArray.length; x++) {
            finalPrice += clothingArray[x].getPrice();
        }

            System.out.println(finalPrice);

//        System.out.println(finalPrice);
    }

public static Comparator<Clothing> clothingComparator = new Comparator<Clothing>() {
    @Override
    public int compare(Clothing o1, Clothing o2) {
        int clothingprice1 =  (int) o1.getPrice();
        int clothingprice2 = (int)o2.getPrice();

        return clothingprice1-clothingprice2;
    }
    };



    public static void sortAndPrintClothingByPrice (ArrayList<Clothing> clothingArray){

        // need to figure out why it is not getting price
        //double finalPrice = 0.0;
          Collections.sort(clothingArray ,clothingComparator );
          for (Clothing x : clothingArray){
            System.out.println(x.getPrice());
        }



//        System.out.println(finalPrice);
    }
    public static void printEmployeeName(Employee employee){

        System.out.println(employee.getName());
    }
    public static void printDiscAmtOff(Discountable[] discountables, Clothing clothing ){
        double discount = 0.0;
        double finalPrice = 0.0;
        for(int x = 0; x < discountables.length; x++){
          discount =  discountables[x].calcDiscount(clothing);
          finalPrice = clothing.getPrice() - discount;

        }
        System.out.println(discount);
    }
    // overloaded method
    public static void printDiscAmtOff(Discountable discountable, Clothing clothing){
        System.out.println(discountable.calcDiscount(clothing));
    }

}
