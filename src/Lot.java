import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.*;

public class Lot {
    private String lotName;
    private ArrayList<Vehicle> vehicles;

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
        this.vehicles = vehicles;
    }
    public Lot() {
        vehicles=new ArrayList<>();
    }
    public void loadVehicle(String fileName) throws IOException {

    }
    public void saveVehicles(String fileName) throws IOException {

    }

    public static void main(String args[]) throws IOException {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MyPanel());
        frame.pack();
        frame.setVisible (true);
    }
}


