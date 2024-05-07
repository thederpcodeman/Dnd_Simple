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
    public Option(String n, Boolean u, Boolean h){
        HB = h;
        UA = u;
        if (UA){
            n += "(UA)";
        }
        if (HB){
            n += "(Homebrew)";
        }
        name = n;
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        return list;
    }
}
