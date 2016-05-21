package com.gmail.rollerxander.first.PC;

/**
 * Created by Rollershop on 21.05.2016.
 */
public class AppForPC {
    public static void main(String[] args) {
        PersonalComputer pc1 = new PersonalComputer("ForOffice",new Monitor("lg", 1200, 800), new Cpu("Intel", 4, 2.5), new Hdd("WD", 500), new Ram("Kingston", 4096));
        //pc1.PcTotalInfo();
       // System.out.println(pc1.getMonitor().toString()+"\n"+ pc1.getCpu().toString()+"\n"+pc1.getHdd().toString()+"\n"+pc1.getRam().toString());
        System.out.println(pc1.toString());
    }
}
