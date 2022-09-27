import java.util.Arrays;

public class Manager extends Employee implements Discountable{
    private final double DISCOUNT = 0.25;
    private Clothing[] clothing;

    public Manager() {
    }
    private char size;
private String name;
    public Manager(Clothing[] clothing , char size, String name) {
        this.clothing = clothing;
        this.size = size;
        this.name = name;
    }

    @Override
    public double getDISCOUNT() {
        return DISCOUNT;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printEmpPriceAfterDisc( Clothing clothing) {
        System.out.println( clothing.getPrice() - calcDiscount(clothing));
    }


    @Override
    public char getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "clothing=" + Arrays.toString(clothing) +
                ", size=" + size +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice() * getDISCOUNT();

    }


}
