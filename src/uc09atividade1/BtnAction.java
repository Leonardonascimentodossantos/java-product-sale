package uc09atividade1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BtnAction implements ActionListener {
    private JTextField txtValue;
    
    public BtnAction (JTextField txtValue) {
        this.txtValue = txtValue;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double value;
        double total;
        try {
            value = Double.parseDouble(txtValue.getText());
            total = value;
            if (value < 0) {
                JOptionPane.showMessageDialog(null, "Insira um valor de produto positivo");
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
            return;
        }
        
        if (value >= 500) {
            JTextField txtDiscount = new JTextField(5);
            
            int option = JOptionPane.showConfirmDialog(
                    null,
                    txtDiscount,
                    "Informe o desconto da compra (%):",
                    JOptionPane.OK_CANCEL_OPTION
                );
            
            if (option == JOptionPane.OK_OPTION){
                try {
                    double discount = Double.parseDouble(txtDiscount.getText());
                    if (discount < 0 || discount > 100) {
                        JOptionPane.showMessageDialog(null, "Desconto Inválido!");
                        return;
                    }
                    total = value - (value*(discount/100.0));
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Digite apenas números!");
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Valor total = R$ " + String.format("%.2f", total));
        txtValue.setText("");
    }
}
