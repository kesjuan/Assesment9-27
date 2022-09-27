public abstract class Employee extends Customer{
    private final double DISCOUNT = 0.10;
    private String name;

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    public abstract String getName();

    public abstract void printEmpPriceAfterDisc(Clothing clothing);


}
