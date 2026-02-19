package uc09atividade1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UC09Atividade1 {
    public static void main(String[] args) {
        
        //Janela
        JFrame main = new JFrame();
        main.setTitle("Venda");
        main.setSize(280, 150);
        main.setLayout(new FlowLayout());
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Label
        JLabel lbTitle = new JLabel();
        lbTitle.setText("Informe o valor do produto a ser vendido.");
        main.add(lbTitle);
        
        JLabel lbValue = new JLabel();
        lbValue.setText("Valor:");
        main.add(lbValue);
        
        //Campo de texto
        JTextField txtValue = new JTextField(10);
        main.add(txtValue);
        
        //Botão
        JButton btnConfirmar = new JButton();
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new BtnAction(txtValue));
        main.add(btnConfirmar);        
        
        main.setVisible(true);
    }
}
