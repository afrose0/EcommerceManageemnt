/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommercemanageemnt;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    Customer customer;
    Product product;

    public Main() {
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Welcome Screen
        JPanel welcomePanel = new JPanel();
        welcomePanel.setBackground(Color.decode("#87CEEB")); // Sky Blue
        welcomePanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER;

        JLabel titleLabel = new JLabel("<html><h1>E-Commerce Management System</h1></html>");
        JLabel teamLabel = new JLabel("<html><h3>Team Members:</h3></html>");
        JLabel member1 = new JLabel("<html><h4>Nowshin Yeasmin [ID-1024]</h4></html>");
        JLabel member2 = new JLabel("<html><h4>Jannatul Ferdous Borsha [ID-1033]</h4></html>");
        JLabel member3 = new JLabel("<html><h4>Tabanna Tabassum Isra [ID-1037]</h4></html>");
        JLabel member4 = new JLabel("<html><h4>Tashfia Akter [ID-1039]</h4></html>");
        JButton continueButton = new JButton("Continue");

        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        teamLabel.setHorizontalAlignment(SwingConstants.CENTER);
        member1.setHorizontalAlignment(SwingConstants.CENTER);
        member2.setHorizontalAlignment(SwingConstants.CENTER);
        member3.setHorizontalAlignment(SwingConstants.CENTER);
        member4.setHorizontalAlignment(SwingConstants.CENTER);

        gbc.gridx = 0;
        gbc.gridy = 0;
        welcomePanel.add(titleLabel, gbc);
        gbc.gridy = 1;
        welcomePanel.add(teamLabel, gbc);
        gbc.gridy = 2;
        welcomePanel.add(member1, gbc);
        gbc.gridy = 3;
        welcomePanel.add(member2, gbc);
        gbc.gridy = 4;
        welcomePanel.add(member3, gbc);
        gbc.gridy = 5;
        welcomePanel.add(member4, gbc);
        gbc.gridy = 6;
        welcomePanel.add(continueButton, gbc);
       
        add(welcomePanel);
        setVisible(true);

        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCustomerForm();
            }
        });
    }

    private void showCustomerForm() {
        JFrame customerFrame = new JFrame("Customer Information");
        customerFrame.setSize(600, 400);
        customerFrame.setLocationRelativeTo(null);
        customerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel customerPanel = new JPanel(new GridBagLayout());
        customerPanel.setBackground(Color.decode("#98FB98")); // Mint Green
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel idLabel = new JLabel("Customer ID:");
        JTextField idField = new JTextField(20);
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField(20);
        JButton nextButton = new JButton("Next");

        gbc.gridx = 0;
        gbc.gridy = 0;
        customerPanel.add(idLabel, gbc);
        gbc.gridx = 1;
        customerPanel.add(idField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        customerPanel.add(nameLabel, gbc);
        gbc.gridx = 1;
        customerPanel.add(nameField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        customerPanel.add(addressLabel, gbc);
        gbc.gridx = 1;
        customerPanel.add(addressField, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        customerPanel.add(nextButton, gbc);

        customerFrame.add(customerPanel);
        customerFrame.setVisible(true);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customer = new Customer(idField.getText(), nameField.getText(), addressField.getText());
                showProductForm();
                customerFrame.dispose();
            }
        });
    }

    private void showProductForm() {
        JFrame productFrame = new JFrame("Product Details");
        productFrame.setSize(600, 400);
        productFrame.setLocationRelativeTo(null);
        productFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel productPanel = new JPanel(new GridBagLayout());
        productPanel.setBackground(Color.decode("#87CEEB")); // Sky Blue
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel productIdLabel = new JLabel("Product ID:");
        JTextField productIdField = new JTextField(20);
        JLabel productNameLabel = new JLabel("Product Name:");
        JTextField productNameField = new JTextField(20);
        JLabel productPriceLabel = new JLabel("Price:");
        JTextField productPriceField = new JTextField(20);
        JLabel productQuantityLabel = new JLabel("Quantity:");
        JTextField productQuantityField = new JTextField(20);
        JButton submitButton = new JButton("Submit");

        gbc.gridx = 0;
        gbc.gridy = 0;
        productPanel.add(productIdLabel, gbc);
        gbc.gridx = 1;
        productPanel.add(productIdField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        productPanel.add(productNameLabel, gbc);
        gbc.gridx = 1;
        productPanel.add(productNameField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        productPanel.add(productPriceLabel, gbc);
        gbc.gridx = 1;
        productPanel.add(productPriceField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        productPanel.add(productQuantityLabel, gbc);
        gbc.gridx = 1;
        productPanel.add(productQuantityField, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        productPanel.add(submitButton, gbc);

        productFrame.add(productPanel);
        productFrame.setVisible(true);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product = new Product(productIdField.getText(), productNameField.getText(), Double.parseDouble(productPriceField.getText()), Integer.parseInt(productQuantityField.getText()));
                showOrderSummary();
                productFrame.dispose();
            }
        });
    }

    private void showOrderSummary() {
        JFrame summaryFrame = new JFrame("Order Summary");
        summaryFrame.setSize(600, 400);
        summaryFrame.setLocationRelativeTo(null);
        summaryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel summaryPanel = new JPanel(new GridBagLayout());
        summaryPanel.setBackground(Color.decode("#98FB98")); // Mint Green
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        Order order = new Order(customer, product);

        JLabel orderIdLabel = new JLabel("Order ID: " + order.orderId);
        JLabel customerIdLabel = new JLabel("Customer ID: " + order.customer.customerID);
        JLabel customerNameLabel = new JLabel("Customer Name: " + order.customer.name);
        JLabel customerAddressLabel = new JLabel("Customer Address: " + order.customer.address);
        JLabel productIdLabel = new JLabel("Product ID: " + order.product.productID);
        JLabel productNameLabel = new JLabel("Product Name: " + order.product.name);
        JLabel productPriceLabel = new JLabel("Product Price: $" + order.product.price);
        JLabel productQuantityLabel = new JLabel("Product Quantity: " + order.product.quantity);
        double totalPrice = order.product.price * order.product.quantity;
        JLabel totalPriceLabel = new JLabel("Total Price: $" + totalPrice);
        JButton closeButton = new JButton("Close");

        gbc.gridx = 0;
        gbc.gridy = 0;
        summaryPanel.add(orderIdLabel, gbc);
        gbc.gridy = 1;
        summaryPanel.add(customerIdLabel, gbc);
        gbc.gridy = 2;
        summaryPanel.add(customerNameLabel, gbc);
        gbc.gridy = 3;
        summaryPanel.add(customerAddressLabel, gbc);
        gbc.gridy = 4;
        summaryPanel.add(productIdLabel, gbc);
        gbc.gridy = 5;
        summaryPanel.add(productNameLabel, gbc);
        gbc.gridy = 6;
        summaryPanel.add(productPriceLabel, gbc);
        gbc.gridy = 7;
        summaryPanel.add(productQuantityLabel, gbc);
        gbc.gridy = 8;
        summaryPanel.add(totalPriceLabel, gbc);
        gbc.gridy = 9;
        summaryPanel.add(closeButton, gbc);

        summaryFrame.add(summaryPanel);
        summaryFrame.setVisible(true);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);  // Close the application
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
