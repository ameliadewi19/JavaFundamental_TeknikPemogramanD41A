/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studkas3;

/**
 *
 * @author User
 */
public class Commision extends Hourly{
    private double totalSales;
    private double commisionRate;

    public Commision(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commisionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commisionRate = commisionRate;
        System.out.println("Comission : " + commisionRate);
    }
    
    public void addSales(double totalSales){
        this.totalSales = totalSales;
    } 

    @Override
    public double pay() {
        return (commisionRate * totalSales /100) + super.pay();
    }

    @Override
    public String toString() {
        return super.toString() + " Total sales : " + totalSales; 
    }
}
