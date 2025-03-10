package adaptermode;
import prototypemode.MyFruit;
public class Adapter extends  Oldjuicer implements InewJuicer{
    public String newPort(MyFruit fruit1,MyFruit fruit2){
        String str=onePort(fruit1);
        str+=onePort(fruit2);
        return null;
    }
}
