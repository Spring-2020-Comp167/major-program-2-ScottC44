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

            String line = sc.nextLine();
            if(line.isEmpty()) continue;

            String type = line;
            String ye = sc.nextLine().replace("Year: ","");
            String ma = sc.nextLine().replace("Make: ","");
            String mo = sc.nextLine().replace("Model: ","");
            String mi = sc.nextLine().replace("Mileage: ","");
            String mp = sc.nextLine().replace("Miles Per Gallon: ","");
            String co = sc.nextLine().replace("Color: ","");
            String se = sc.nextLine().replace("Seats: ","");
            String doo = sc.nextLine().replace("Doors: ","");
            String pr = sc.nextLine().replace("Price: ","");
            String vid = sc.nextLine().replace("VehicleID: ","");
            String eeee = sc.nextLine().replace("Engine specifications: ","");
            String[] en = eeee.split(", ");
            Engine e = new Engine();
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

            if(type.equals("Car")){

                Car c = new Car();
                c.setYear(Integer.parseInt(ye));
                c.setMake(ma);
                c.setModel(mo);
                c.setMileage(Integer.parseInt(mi));
                c.setMpg(Integer.parseInt(mp));
                c.setColor(co);
                c.setSeats(Integer.parseInt(se));
                c.setDoors(Integer.parseInt(doo));
                c.setPrice(Double.parseDouble(pr));
                c.setVehicleID(vid);

                String con = sc.nextLine().replace("Convertible: ","");
                c.setConvertible(Boolean.getBoolean(con));
                c.setEngine(e);
                vehicles.add(c);

            }

            if(type.equals("Truck")){
                Truck t = new Truck();

                t.setYear(Integer.parseInt(ye));
                t.setMake(ma);
                t.setModel(mo);
                t.setMileage(Integer.parseInt(mi));
                t.setMpg(Integer.parseInt(mp));
                t.setColor(co);
                t.setSeats(Integer.parseInt(se));
                t.setDoors(Integer.parseInt(doo));
                t.setPrice(Double.parseDouble(pr));
                t.setVehicleID(vid);

                String bs = sc.nextLine().replace("Bed Space: ","");
                t.setBedSpace(Double.parseDouble(bs));
                t.setEngine(e);
                vehicles.add(t);

            }

            if(type.equals("SUV")){
                SUV s = new SUV();

                s.setYear(Integer.parseInt(ye));
                s.setMake(ma);
                s.setModel(mo);
                s.setMileage(Integer.parseInt(mi));
                s.setMpg(Integer.parseInt(mp));
                s.setColor(co);
                s.setSeats(Integer.parseInt(se));
                s.setDoors(Integer.parseInt(doo));
                s.setPrice(Double.parseDouble(pr));
                s.setVehicleID(vid);


                String cs = sc.nextLine().replace("Cargo Space: ","");
                s.setCargoSpace(Double.parseDouble(cs));
                String rs = sc.nextLine().replace("Removable Seats: ","");
                s.setRemovableSeats(Boolean.getBoolean(rs));
                s.setEngine(e);
                vehicles.add(s);

            }

            if(type.equals("Van")){
                MiniVan mv = new MiniVan();

                mv.setYear(Integer.parseInt(ye));
                mv.setMake(ma);
                mv.setModel(mo);
                mv.setMileage(Integer.parseInt(mi));
                mv.setMpg(Integer.parseInt(mp));
                mv.setColor(co);
                mv.setSeats(Integer.parseInt(se));
                mv.setDoors(Integer.parseInt(doo));
                mv.setPrice(Double.parseDouble(pr));
                mv.setVehicleID(vid);

                String sd = sc.nextLine().replace("Sliding doors: ","");
                mv.setSlidingDoors(Boolean.getBoolean(sd));
                mv.setEngine(e);
                vehicles.add(mv);
            }
        }
    }
    public void saveVehicles(String fileName) throws IOException {
        FileWriter fw=new FileWriter(fileName);

        for(Vehicle v:vehicles) {
            String str="";
            str+=v.getMpg()+" "+v.getColor()+" "+v.getEngine().getTransmission()+" "+v.getEngine().getCylinders()+" "+v.getEngine().isFourWheelDrive()+" "+v.getEngine().isHybrid()+" "+v.getEngine().getHorsePower()+" "+v.getVehicleID()+" "+v.getSeats()+" "+v.getDoors()+" "+v.getMake()+" "+v.getModel()+" "+v.getMileage()+" "+v.getYear()+" "+v.getPrice();
            fw.write(str);
        }

        fw.close();

    }

    public static void main(String[] args) throws IOException {

        String fileName = "lot.txt";

        Lot d = new Lot();
        JFrame frame = new JFrame ("MyPanel");

        d.loadVehicle(fileName);

        //String z = vehicles.toString();
        List<Vehicle>l=d.getVehicles();
        String s="";
        for(Vehicle v:l) {
            s+="-> "+v.toString()+"\n";
        }
        System.out.println(vehicles.toString());


        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MyPanel());
        frame.pack();
        frame.setVisible (true);

        jcomp9.setText(s);

    }
}


