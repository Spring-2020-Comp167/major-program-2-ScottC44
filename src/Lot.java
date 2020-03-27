import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.*;

public class Lot extends MyPanel{
    private String lotName;
    private static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    public String getLotName() {
        return lotName;
    }
    public void setLotName(String lotName) {
        this.lotName = lotName;
    }
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
    public void setVehicles(ArrayList<Vehicle> vehicles) {
        Lot.vehicles = vehicles;
    }
    public Lot() {
        vehicles=new ArrayList<>();
    }

    public void loadVehicle(String fileName) throws IOException {
        Scanner sc = new Scanner(new File("lot.txt"));

        while(sc.hasNextLine()){

            if(sc.nextLine().equals("Car")){
                Car c = new Car();
                String[] ye = sc.nextLine().split(": ");
                c.setYear(Integer.parseInt(ye[1]));
                String[] ma = sc.nextLine().split(": ");
                c.setMake(ma[1]);
                String[] mo = sc.nextLine().split(": ");
                c.setModel(mo[1]);
                String[] mi = sc.nextLine().split(": ");
                c.setMileage(Integer.parseInt(mi[1]));
                String[] mp = sc.nextLine().split(": ");
                c.setMpg(Integer.parseInt(mp[1]));
                String[] co = sc.nextLine().split(": ");
                c.setColor(co[1]);
                String[] se = sc.nextLine().split(": ");
                c.setSeats(Integer.parseInt(se[1]));
                String[] doo = sc.nextLine().split(": ");
                c.setDoors(Integer.parseInt(doo[1]));
                String[] pr = sc.nextLine().split(": ");
                c.setPrice(Double.parseDouble(pr[1]));
                String[] vid = sc.nextLine().split(": ");
                c.setVehicleID(vid[1]);
                Engine e = new Engine();
                String eeee = sc.nextLine().replace("Engine specifications: ","");
                String[] en = eeee.split(", ");
                e.setTransmission(en[0]);

                if(en[1].equals("2WD")){
                    e.setFourWheelDrive(false);
                }else{
                    e.setFourWheelDrive(true);
                }
                String cyl = en[2].replace(" cylinders","");
                e.setCylinders(Integer.parseInt(cyl));
                e.setHybrid(Boolean.getBoolean(en[3]));
                String[] hp = en[4].split(" ");
                e.setHorsePower(Double.parseDouble(hp[0]));
                String[] con = sc.nextLine().split(": ");
                c.setConvertible(Boolean.getBoolean(con[1]));
                c.setEngine(e);
                vehicles.add(c);
                continue;
            }

            if(sc.nextLine().equals("Truck")){
                Truck t = new Truck();
                String[] ye = sc.nextLine().split(": ");
                t.setYear(Integer.parseInt(ye[1]));
                String[] ma = sc.nextLine().split(": ");
                t.setMake(ma[1]);
                String[] mo = sc.nextLine().split(": ");
                t.setModel(mo[1]);
                String[] mi = sc.nextLine().split(": ");
                t.setMileage(Integer.parseInt(mi[1]));
                String[] mp = sc.nextLine().split(": ");
                t.setMpg(Integer.parseInt(mp[1]));
                String[] co = sc.nextLine().split(": ");
                t.setColor(co[1]);
                String[] se = sc.nextLine().split(": ");
                t.setSeats(Integer.parseInt(se[1]));
                String[] doo = sc.nextLine().split(": ");
                t.setDoors(Integer.parseInt(doo[1]));
                String[] pr = sc.nextLine().split(": ");
                t.setPrice(Double.parseDouble(pr[1]));
                String[] vid = sc.nextLine().split(": ");
                t.setVehicleID(vid[1]);
                Engine e = new Engine();
                String eeee = sc.nextLine().replace("Engine specifications: ","");
                String[] en = eeee.split(", ");
                e.setTransmission(en[0]);

                if(en[1].equals("2WD")){
                    e.setFourWheelDrive(false);
                }else{
                    e.setFourWheelDrive(true);
                }
                String cyl = en[2].replace(" cylinders","");
                e.setCylinders(Integer.parseInt(cyl));
                e.setHybrid(Boolean.getBoolean(en[3]));
                String[] hp = en[4].split(" ");
                e.setHorsePower(Double.parseDouble(hp[0]));
                String[] bs = sc.nextLine().split(": ");
                t.setBedSpace(Double.parseDouble(bs[1]));
                t.setEngine(e);
                vehicles.add(t);
                continue;
            }

            if(sc.nextLine().equals("SUV")){
                SUV s = new SUV();
                String[] ye = sc.nextLine().split(": ");
                s.setYear(Integer.parseInt(ye[1]));
                String[] ma = sc.nextLine().split(": ");
                s.setMake(ma[1]);
                String[] mo = sc.nextLine().split(": ");
                s.setModel(mo[1]);
                String[] mi = sc.nextLine().split(": ");
                s.setMileage(Integer.parseInt(mi[1]));
                String[] mp = sc.nextLine().split(": ");
                s.setMpg(Integer.parseInt(mp[1]));
                String[] co = sc.nextLine().split(": ");
                s.setColor(co[1]);
                String[] se = sc.nextLine().split(": ");
                s.setSeats(Integer.parseInt(se[1]));
                String[] doo = sc.nextLine().split(": ");
                s.setDoors(Integer.parseInt(doo[1]));
                String[] pr = sc.nextLine().split(": ");
                s.setPrice(Double.parseDouble(pr[1]));
                String[] vid = sc.nextLine().split(": ");
                s.setVehicleID(vid[1]);
                Engine e = new Engine();
                String eeee = sc.nextLine().replace("Engine specifications: ","");
                String[] en = eeee.split(", ");
                e.setTransmission(en[0]);

                if(en[1].equals("2WD")){
                    e.setFourWheelDrive(false);
                }else{
                    e.setFourWheelDrive(true);
                }
                String cyl = en[2].replace(" cylinders","");
                e.setCylinders(Integer.parseInt(cyl));
                e.setHybrid(Boolean.getBoolean(en[3]));
                String[] hp = en[4].split(" ");
                e.setHorsePower(Double.parseDouble(hp[0]));
                String[] cs = sc.nextLine().split(": ");
                s.setCargoSpace(Double.parseDouble(cs[1]));
                String[] rs = sc.nextLine().split(": ");
                s.setRemovableSeats(Boolean.getBoolean(rs[1]));
                s.setEngine(e);
                vehicles.add(s);
                continue;
            }

            if(sc.nextLine().equals("Van")){
                MiniVan mv = new MiniVan();
                String[] ye = sc.nextLine().split(": ");
                mv.setYear(Integer.parseInt(ye[1]));
                String[] ma = sc.nextLine().split(": ");
                mv.setMake(ma[1]);
                String[] mo = sc.nextLine().split(": ");
                mv.setModel(mo[1]);
                String[] mi = sc.nextLine().split(": ");
                mv.setMileage(Integer.parseInt(mi[1]));
                String[] mp = sc.nextLine().split(": ");
                mv.setMpg(Integer.parseInt(mp[1]));
                String[] co = sc.nextLine().split(": ");
                mv.setColor(co[1]);
                String[] se = sc.nextLine().split(": ");
                mv.setSeats(Integer.parseInt(se[1]));
                String[] doo = sc.nextLine().split(": ");
                mv.setDoors(Integer.parseInt(doo[1]));
                String[] pr = sc.nextLine().split(": ");
                mv.setPrice(Double.parseDouble(pr[1]));
                String[] vid = sc.nextLine().split(": ");
                mv.setVehicleID(vid[1]);
                Engine e = new Engine();
                String eeee = sc.nextLine().replace("Engine specifications: ","");
                String[] en = eeee.split(", ");
                e.setTransmission(en[0]);

                if(en[1].equals("2WD")){
                    e.setFourWheelDrive(false);
                }else{
                    e.setFourWheelDrive(true);
                }
                String cyl = en[2].replace(" cylinders","");
                e.setCylinders(Integer.parseInt(cyl));
                e.setHybrid(Boolean.getBoolean(en[3]));
                String[] hp = en[4].split(" ");
                e.setHorsePower(Double.parseDouble(hp[0]));
                String[] sd = sc.nextLine().split(": ");
                mv.setSlidingDoors(Boolean.getBoolean(sd[1]));
                mv.setEngine(e);
                vehicles.add(mv);
                continue;
            }
        }
    }
    public void saveVehicles(String fileName) throws IOException {

    }

    public static void main(String[] args) throws IOException {

        String fileName = "lot.txt";

        Lot d=new Lot();
        JFrame frame = new JFrame ("MyPanel");

        d.loadVehicle(fileName);

        //String z = vehicles.toString();
        List<Vehicle>l=d.getVehicles();
        String s="";
        for(Vehicle v:l) {
            s+="-> "+v.toString()+"\n";
        }


        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MyPanel());
        frame.pack();
        frame.setVisible (true);

        jcomp9.setText(s);

    }
}


