package Collections;

import java.util.HashMap;
import java.util.Map;

public class Greek {
    String name;
    int id;
    Greek(String name,int id){
        this.name=name;
        this.id=id;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return  true;
        }
        if(obj==null ||obj.getClass() != this.getClass()){
            return false;
        }
        Greek greek=(Greek)  obj;
        return (greek.name.equals(this.name) && greek.id==this.id);
    }
    @Override
    public int hashCode(){
        return this.id;
    }

}
class GFG
{
    public static void main (String[] args)
    {
        Greek g1 = new Greek("aditya", 1);
        Greek g2 = new Greek("aditya", 1);

        Map<Greek, String> map = new HashMap<Greek, String>();
        map.put(g1, "CSE");
        map.put(g2, "IT");

        for(Greek greek : map.keySet())
        {
            System.out.println(map.get(greek).toString());
        }
    }
}
