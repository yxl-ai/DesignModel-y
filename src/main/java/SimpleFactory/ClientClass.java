package SimpleFactory;

import prototypemode.Apple;
import prototypemode.Banana;
import prototypemode.MyFruit;

public class ClientClass {

    public static void main(String[] args){
        MyFruit fru1=new Apple();
        MyFruit fru2 = (Apple)fru1.clone();
        fru1.Display();
        fru2.Display();
        System.out.println("fru1:"+fru1.hashCode());
        System.out.println("fru2:"+fru2.hashCode());
    }
//    public static void main(String[] args){
////    Factory factory=new Factory();
//        Factory factory=new AFactory();
//        Fruit fruit=factory.CreateFruit();
////        Fruit fruit=factory.CreatFruit("B");
//        fruit.eat();
//    }
    public String factory(String fruitname){
        if(fruitname.equals("Apple"))
            return "Apple";
        if(fruitname.equals("Banana"))
            return "Banana";
        return  null;

    }
}
