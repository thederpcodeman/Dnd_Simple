package src;

import java.util.ArrayList;

public class Option {
    public String name;
    public Boolean HB;
    public Boolean UA;
    public Option(String n){
        name = n;
        HB = false;
        UA = false;
    }
    public Option(String n, Boolean h, Boolean u){
        name = n;
        HB = h;
        UA = u;
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        return list;
    }
}
