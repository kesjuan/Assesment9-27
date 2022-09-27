import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Clothing shirt = new Clothing("Red shirt", 10.00, 'L');
        Clothing pants = new Clothing("Black pants", 20.00, 'L');
        Clothing jacket = new Clothing("Orange Jacket", 30.00, 'L');
        Clothing jeans = new Clothing("Blue Jeans", 20, 'M');
        Clothing tShirt = new Clothing("White T Shirt", 5.0,'S');
        Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, 'L');


        Clothing []  managerCart = {jeans,tShirt,buttonUp};


        Manager manager1 = new Manager(managerCart, 'L', "Jared");
        Clothing[] employeeCart = {jeans,tShirt,buttonUp};

        HourlyEmployee employee1 = new HourlyEmployee(employeeCart, 'L', "Bob");

        System.out.println(ShopApp.calcTotal(managerCart));

        System.out.println(ShopApp.isAFit(manager1, pants));
        Discountable[] discountables = {employee1};
        Discountable[] discountables1 = {manager1};



        manager1.printEmpPriceAfterDisc(jeans);
        manager1.printEmpPriceAfterDisc(tShirt);
        employee1.printEmpPriceAfterDisc(jeans);
        employee1.printEmpPriceAfterDisc(tShirt);
        ShopApp.printDiscAmtOff(discountables, jeans);
        ShopApp.printDiscAmtOff(discountables,tShirt);
        ShopApp.printDiscAmtOff(discountables1, jeans);
        ShopApp.printDiscAmtOff(discountables1,tShirt);
        ArrayList<Clothing> clothingArrayList = new ArrayList<>();
        clothingArrayList.add(jeans);
        clothingArrayList.add(buttonUp);
        clothingArrayList.add(tShirt);
        for(Clothing x: clothingArrayList){
            System.out.println(x.toString());
        }
        ShopApp.printEmployeeName(manager1);
        ShopApp.printEmployeeName(employee1);
        ShopApp.printDiscAmtOff(manager1,jeans);
        ShopApp.printDiscAmtOff(employee1,jeans);
        ShopApp.sortAndPrintClothingByPrice(clothingArrayList);



    }
}
