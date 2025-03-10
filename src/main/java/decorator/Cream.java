package decorator;

public class Cream extends Decorating{
    public Cream(IBirthdayCake birthdayCake) {
        super(birthdayCake);
    }
    public void putCream(){
        System.out.println("...");
    }
}