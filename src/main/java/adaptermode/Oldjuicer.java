package adaptermode;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import prototypemode.MyFruit;
public class Oldjuicer {
    public String onePort(MyFruit fruit){
        String str=fruit.getClass()+"果汁。";
        return str;
    }

}
