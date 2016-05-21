package com.gmail.rollerxander.first.PC;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Rollershop on 21.05.2016.
 */
public class AppForPC {
    public static void main(String[] args) throws IOException {
        PersonalComputer pc1 = new PersonalComputer("ForOffice", new Monitor("lg", 1200, 800), new Cpu("Intel", 4, 2.5), new Hdd("WD", 500), new Ram("Kingston", 4096));
        pc1.PcTotalInfo();
        // System.out.println(pc1.getMonitor().toString()+"\n"+ pc1.getCpu().toString()+"\n"+pc1.getHdd().toString()+"\n"+pc1.getRam().toString());

        System.out.println(pc1.toString());

        File pcFile = new File("pcFile.txt");
        if (pcFile.createNewFile()) {
            System.out.println("Новый файл создан");
        } else {
            System.out.println("Файл уже существует");
        }
        PrintWriter zapisVfile = new PrintWriter("pcFile.txt");
        zapisVfile.print(pc1.toString());
        zapisVfile.close();

        Scanner in = new Scanner(pcFile);
        String h = in.nextLine();
        System.out.println("Читаем из файла: " + h.toString());
        in.close();


    }
}
