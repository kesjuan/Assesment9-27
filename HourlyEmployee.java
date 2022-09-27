import java.util.Arrays;

public class HourlyEmployee extends Employee implements Discountable{
private Clothing[] clothing;
private char size;

private String name;

    public HourlyEmployee() {
    }

    public HourlyEmployee(Clothing[] clothing, char size, String name) {
        this.clothing = clothing;
        this.size = size;
        this.name = name;
    }

    @Override
    public char getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "clothing=" + Arrays.toString(clothing) +
                ", size=" + size +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public double getDISCOUNT() {
        return super.getDISCOUNT();
    }

    @Override
    public String getName() {
        return name;
    }




    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice() - calcDiscount(clothing));

    }

    @Override
    public double calcDiscount( Clothing clothing) {
        double discount = clothing.getPrice() * getDISCOUNT();


        return discount;
    }



}
