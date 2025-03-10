package prototypemode;

import java.util.Hashtable;

public class MyFruitStore {
    private static Hashtable fruittable=new Hashtable<Integer,MyFruit>();//货架
    public void Add(Integer key,MyFruit fruit){
        fruittable.put(key,fruit);

    }
    public MyFruit Get(Integer key){
        MyFruit fruit= (MyFruit) fruittable.get(key);
        return (MyFruit)fruit.clone();
    }
}
