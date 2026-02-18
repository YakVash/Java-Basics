import java.awt.*;
import java.awt.event.*;

public class CalculatorAWT extends Frame implements ActionListener {

    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button bAdd, bSub, bMul, bDiv;

    CalculatorAWT() {

        setLayout(null);

        l1 = new Label("Number 1:");
        l2 = new Label("Number 2:");
        l3 = new Label("Result:");

        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t3.setEditable(false);

        bAdd = new Button("Add");
        bSub = new Button("Sub");
        bMul = new Button("Mul");
        bDiv = new Button("Div");

        // Positions
        l1.setBounds(50, 50, 80, 25);
        t1.setBounds(150, 50, 120, 25);

        l2.setBounds(50, 100, 80, 25);
        t2.setBounds(150, 100, 120, 25);

        l3.setBounds(50, 150, 80, 25);
        t3.setBounds(150, 150, 120, 25);

        // Small rectangle buttons
        bAdd.setBounds(50, 210, 70, 30);
        bSub.setBounds(130, 210, 70, 30);
        bMul.setBounds(210, 210, 70, 30);
        bDiv.setBounds(290, 210, 70, 30);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(bAdd); add(bSub); add(bMul); add(bDiv);

        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);

        setTitle("AWT Calculator");
        setSize(420, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double r = 0;

            if (e.getSource() == bAdd) r = a + b;
            else if (e.getSource() == bSub) r = a - b;
            else if (e.getSource() == bMul) r = a * b;
            else if (e.getSource() == bDiv) r = a / b;

            t3.setText(String.valueOf(r));
        }
        catch (Exception ex) {
            t3.setText("Invalid!");
        }
    }

    public static void main(String[] args) {
        new CalculatorAWT();
        System.out.println("Name: B. Umadevi\nReg No.: 25SP2180005");
    }
}
