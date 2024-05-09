package src;

import java.util.ArrayList;

public class Option {
    public String name;
    public Boolean HB;
    public Boolean HB2;
    public Boolean UA;
    public Option(String n){
        name = n;
        HB = false;
        HB2 = false;
        UA = false;
    }
    public Option(String n, Boolean u, Boolean h){
        HB = h;
        UA = u;
        HB2 = false;
        if (UA){
            n += "(UA)";
        }
        if (HB){
            n += "(Homebrew)";
        }
        name = n;
    }
    public Option(String n, Boolean all){
        HB = all;
        UA = all;
        HB2 = all;
        n += "[Warning: Homebrew]";
        name = n;
    }
    public ArrayList<Option> run(){
        ArrayList<Option> list = new ArrayList<Option>();
        return list;
    }
}
