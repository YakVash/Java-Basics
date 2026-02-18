import java.awt.*;
import java.awt.event.*;
public class CalculatorAWT extends Frame implements ActionListener {
    // Labels
    Label l1, l2, l3;
    // Text fields
    TextField t1, t2, t3;
    // Buttons
    Button bAdd, bSub, bMul, bDiv;
    // Constructor to build the GUI
    CalculatorAWT() {
        // Creating labels
        l1 = new Label("Number 1:");
        l2 = new Label("Number 2:");
        l3 = new Label("Result:");

        // Text boxes for input and output
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t3.setEditable(false);  // Result should not be changed manually
 // Buttons for operations
        bAdd = new Button("Add");
        bSub = new Button("Subtract");
        bMul = new Button("Multiply");
        bDiv = new Button("Divide");

        // No layout manager
        setLayout(null);

        // Setting positions
        l1.setBounds(50, 50, 80, 25);
        t1.setBounds(150, 50, 120, 25);

        l2.setBounds(50, 100, 80, 25);
        t2.setBounds(150, 100, 120, 25);

        l3.setBounds(50, 150, 80, 25);
        t3.setBounds(150, 150, 120, 25);

        bAdd.setBounds(40, 210, 80, 30);
        bSub.setBounds(130, 210, 80, 30);
        bMul.setBounds(220, 210, 80, 30);
        bDiv.setBounds(310, 210, 80, 30);

        // Adding components to frame
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(bAdd); add(bSub); add(bMul); add(bDiv);

        // Adding action listeners
        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
// Frame settings
        setTitle("AWT Calculator");
        setSize(450, 300);
        setVisible(true);
        // Close window on exit
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    // To handle button clicks
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double result = 0;
            // Checking which button was pressed
            if (e.getSource() == bAdd)
                result = a + b;
            else if (e.getSource() == bSub)
                result = a - b;
            else if (e.getSource() == bMul)
                result = a * b;
            else if (e.getSource() == bDiv)
                result = a / b;
            t3.setText(String.valueOf(result));
        }
        catch (Exception ex) {
            t3.setText("Invalid Input!");
        }
    }
  // Main method
    public static void main(String[] args) {
        new CalculatorAWT();
        System.out.println(“Name: B.Umadevi/nReg: 25SP2180005”);
    }
}