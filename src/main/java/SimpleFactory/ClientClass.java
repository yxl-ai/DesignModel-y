package SimpleFactory;

import adaptermode.Adapter;
import adaptermode.InewJuicer;
import prototypemode.Apple;
import prototypemode.Banana;
import prototypemode.MyFruit;
import prototypemode.MyFruitStore;


public class ClientClass {
    public static void main(String[] args){
        MyFruit fru1=new Apple();
        MyFruit fru2=new Banana();
        MyFruitStore mfs1=MyFruitStore.Getfruitstore();
        mfs1.Add(1,fru1);
        mfs1.Add(2,fru2);
        mfs1.Add(3,new Apple());
        mfs1.Add(4,new Banana());
        MyFruitStore mfs2=MyFruitStore.Getfruitstore();
        InewJuicer newJuicer=new Adapter();
        System.out.println(newJuicer.newPort(mfs1.get(3),mfs1.get(4)));
//        MyFruit fru=(MyFruit)mfs2.Get(4) ;
//        fru.Display();
//        System.out.println("mfs1:"+mfs.toString());

    }

//    public static void main(String[] args){
//        MyFruit fru1=new Apple();
//        MyFruit fru2 = (Apple)fru1.clone();
//        fru1.Display();
//        fru2.Display();
//        System.out.println("fru1:"+fru1.hashCode());
//        System.out.println("fru2:"+fru2.hashCode());
//    }
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
