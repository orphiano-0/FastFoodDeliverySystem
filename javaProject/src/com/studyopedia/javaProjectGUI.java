package com.studyopedia;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class javaProjectGUI extends JFrame implements ActionListener{

	private final Container container;
	private final JLabel contact, menu, name, phone, address, waysOfPaying, listOfFoods, listOfDrinks;
	private final JComboBox payment;
    private final JTextField customerName, customerAddress, customerNumber;
    private final JCheckBox burger, pizza, hotdogs, chips, coke, sprite, royal, pepsi;
    private final JButton buyNow;
	
        
    public javaProjectGUI() {
    	
    	setTitle("Fast-food Delivery System");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        container = getContentPane();
        container.setLayout(null);
        
        contact = new JLabel("Contact Information");
        contact.setFont(new Font("Arial", Font.PLAIN, 30));
        contact.setSize(300, 30);
        contact.setLocation(50, 25);
        container.add(contact);
        
        menu = new JLabel("Menu");
        menu.setFont(new Font("Arial", Font.PLAIN, 30));
        menu.setSize(300, 30);
        menu.setLocation(500, 40);
        container.add(menu);
        
        name = new JLabel("Enter your full name");
        name.setFont(new Font("Arial", Font.ITALIC, 15));
        name.setSize(200, 20);
        name.setLocation(100, 80);
        container.add(name);
        
        customerName = new JTextField();
        customerName.setFont(new Font("Arial", Font.PLAIN, 15));
        customerName.setSize(250, 30);
        customerName.setLocation(100, 105);
        container.add(customerName);
		
        address = new JLabel("Enter your address");
        address.setFont(new Font("Arial", Font.ITALIC, 15));
        address.setSize(200, 20);
        address.setLocation(100, 150);
        container.add(address);
        
        customerAddress = new JTextField();
        customerAddress.setFont(new Font("Arial", Font.PLAIN, 15));
        customerAddress.setSize(250, 30);
        customerAddress.setLocation(100, 175);
        container.add(customerAddress);
        
        phone = new JLabel("Enter your phone number");
        phone.setFont(new Font("Arial", Font.ITALIC, 15));
        phone.setSize(300, 20);
        phone.setLocation(100, 220);
        container.add(phone);
        
        customerNumber = new JTextField();
        customerNumber.setFont(new Font("Arial", Font.PLAIN, 15));
        customerNumber.setSize(250, 30);
        customerNumber.setLocation(100, 245);
        container.add(customerNumber);
        
        waysOfPaying = new JLabel("Choose way of payment");
        waysOfPaying.setFont(new Font("Arial", Font.ITALIC, 15));
        waysOfPaying.setSize(200, 20);
        waysOfPaying.setLocation(100, 320);
        container.add(waysOfPaying);
        
        String waysS[] = {"Cash on delivery", "Others..."};
        payment = new JComboBox(waysS);
        payment.setSize(200, 20);
        payment.setLocation(100, 350);
        add(payment);
        
        listOfFoods = new JLabel("Select a dish!");
        listOfFoods.setFont(new Font("Arial", Font.PLAIN, 18));
        listOfFoods.setSize(300,20);
        listOfFoods.setLocation(500,100);
        container.add(listOfFoods);
		
        burger = new JCheckBox("Burger = Php 55");
        burger.setFont(new Font("Arial", Font.PLAIN, 15));
        burger.setSelected(false);
        burger.setSize(300, 20);
        burger.setLocation(500, 130);
        container.add(burger);
        
        pizza = new JCheckBox("Pizza = Php 75");
        pizza.setFont(new Font("Arial", Font.PLAIN, 15));
        pizza.setSelected(false);
        pizza.setSize(300, 20);
        pizza.setLocation(500, 150);
        container.add(pizza);
        
        hotdogs = new JCheckBox("Hotdogs = Php 90");
        hotdogs.setFont(new Font("Arial", Font.PLAIN, 15));
        hotdogs.setSelected(false);
        hotdogs.setSize(300, 20);
        hotdogs.setLocation(500, 170);
        container.add(hotdogs);
        
        chips = new JCheckBox("Chips = Php 80");
        chips.setFont(new Font("Arial", Font.PLAIN, 15));
        chips.setSelected(false);
        chips.setSize(300, 20);
        chips.setLocation(500, 190);
        container.add(chips);
       
        listOfDrinks = new JLabel("Select a drink!");
        listOfDrinks.setFont(new Font("Arial", Font.PLAIN, 18));
        listOfDrinks.setSize(300,20);
        listOfDrinks.setLocation(500,270);
        container.add(listOfDrinks);
        
        coke = new JCheckBox("Coke = Php 50");
        coke.setFont(new Font("Arial", Font.PLAIN, 15));
        coke.setSelected(false);
        coke.setSize(300, 20);
        coke.setLocation(500, 300);
        container.add(coke);
        
        sprite = new JCheckBox("Sprite = Php 50");
        sprite.setFont(new Font("Arial", Font.PLAIN, 15));
        sprite.setSelected(false);
        sprite.setSize(300, 20);
        sprite.setLocation(500, 320);
        container.add(sprite);
        
        royal = new JCheckBox("Royal = Php 50");
        royal.setFont(new Font("Arial", Font.PLAIN, 15));
        royal.setSelected(false);
        royal.setSize(300, 20);
        royal.setLocation(500, 340);
        container.add(royal);
        
        pepsi = new JCheckBox("Pepsi = Php 40");
        pepsi.setFont(new Font("Arial", Font.PLAIN, 15));
        pepsi.setSelected(false);
        pepsi.setSize(300, 20);
        pepsi.setLocation(500, 360);
        container.add(pepsi);
        
        buyNow = new JButton("Click to pay!");
        buyNow.setFont(new Font("Arial", Font.PLAIN, 20));
        buyNow.setSize(200, 30);
        buyNow.setLocation(320, 465);
        container.add(buyNow);
        
        buyNow.addActionListener(this);
    
        this.add(customerName);
        this.add(customerAddress);
        this.add(customerNumber);
        this.add(burger);
        this.add(pizza);
        this.add(hotdogs);
        this.add(chips);
        this.add(coke);
        this.add(sprite);
        this.add(royal);
        this.add(pepsi);
        this.add(buyNow);
        
        
    }
		
  public static void main(String[] args) {
	  
	  javaProjectGUI window = new javaProjectGUI();
      window.setVisible(true);   
    }

@Override
	public void actionPerformed(ActionEvent e) {
		
		float amount = 0;
	    String msg = "";
	    String name = customerName.getText();
	    String address = customerAddress.getText();
	    String number = customerNumber.getText();
	    
	    if (burger.isSelected()) {
	  	  amount += 55;
	  	  msg = "Burger = Php 55\n";
	    }
	    if (pizza.isSelected()) {
	  	  amount += 75;
	  	  msg += "Pizza = Php 75\n";
	    }
	    if (hotdogs.isSelected()) {
	  	  amount += 90;
	  	  msg += "Hotdog = Php 90\n";
	    }
	    if (chips.isSelected()) {
	  	  amount += 80;
	  	  msg += "Chips = Php 80\n";
	    }
	    if (coke.isSelected()) {
	  	  amount += 50;
	  	  msg += "Coke = Php 50\n";
	    }
	    if (sprite.isSelected()) {
	  	  amount += 50;
	  	  msg += "Sprite = Php 50\n";
	    }
	    if (royal.isSelected()) {
	  	  amount += 50;
	  	  msg += "Royal = Php 50\n";
	    }
	    if (pepsi.isSelected()) {
	  	  amount += 40;
	  	  msg += "Pepsi = Php 40\n";
	    }
	    
	    
	    msg += "\n----------TOTAL PRICE----------\n";
	    JOptionPane.showMessageDialog(this, "Name: " + name + "\nAddress: " + address + "\nNumber: " + number + "\n\nCUSTOMER'S ORDERS: \n\n" + msg + "Total amount: Php " + amount + "\n-----------------------------------------" + "\nThank you for ordering!" + "\nCome again!" , "Receipt", JOptionPane.PLAIN_MESSAGE);
		
	}
}