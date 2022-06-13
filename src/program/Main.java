package program;/*
    Miro Project
    Created by: Abdullah Elsharkawi
 */

import excel.Excel;
import power_point.Power_Point;
import word.Word;

public class Main {

    static void start(Micro mm)
    {
        mm.start();
    }

    static void exit(Micro mm)
    {
        mm.exit();
    }

    public static void main(String[] args)
    {
        Word w = null;
        w = new word.v2010();
        w.show_mod();
        start(w);
        exit(w);
        w= new word.v2022();
        w.show_mod();
        start(w);
        exit(w);
        System.out.println("--------------------");
        Power_Point p=null;
        p = new power_point.v2010();
        p.show_point();
        start(p);
        exit(p);
        p = new power_point.v2022();
        p.show_point();
        start(p);
        exit(p);
        System.out.println("--------------------");
        Excel e=null;
        e = new excel.v2010();
        e.calc();
        start(e);
        exit(e);
        e = new excel.v2022();
        e.calc();
        start(e);
        exit(e);
        
        
        

    }
}
