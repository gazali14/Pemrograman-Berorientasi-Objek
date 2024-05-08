package prapertemuan9;

/**
 *
 * @author Gazali
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MahasiswaView {
    private Validasi presenter = new Validasi();
    private JFrame frame;
    private JButton resetBtn;
    private JButton simpanBtn;
    private JTextField nimField;
    private JTextField namaDepanField;
    private JTextField namaBelakangField;
    private JTextField umurField;
    private JComboBox provinsiBox;
    private JLabel label;
    
    public MahasiswaView(){
        createUI();
    }
    
    private void createUI() {
        frame = new JFrame("Student Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = frame.getContentPane();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;

        label = new JLabel("Nim: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.ipadx = 100;
        pane.add(label, c);

        nimField = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        c.ipadx =20;
        c.insets = new Insets(0, 80, 0, 0);
        pane.add(nimField, c);

        label = new JLabel("Nama: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.ipadx = 100;
        c.insets = new Insets(0, 0, 0, 0);
        pane.add(label, c);

        namaDepanField = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        pane.add(namaDepanField, c);
        
        namaBelakangField = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2;
        c.gridy = 1;
        c.ipadx = 100;
        pane.add(namaBelakangField, c);
        
        label = new JLabel("Umur:");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        c.ipadx = 100;
        pane.add(label, c);
        
        umurField = new JTextField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        c.ipadx = 1;
        c.insets = new Insets(0,160,0,0);
        pane.add(umurField, c);
        
        label = new JLabel("Asal:");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        c.ipadx = 100;
        c.insets = new Insets(0,0,0,0);
        pane.add(label, c);
        
        String[] pilihan = {"","Jakarta", 
                            "Bogor", 
                            "Depok", 
                            "Tangerang", 
                            "Bekasi"
                            };
        provinsiBox = new JComboBox(pilihan);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 3;
        c.insets = new Insets(0,20,0,0);
        pane.add(provinsiBox,c);
        
        //Craete a new panel for the buttons
        JPanel buttonPanel = new JPanel(new GridLayout(1,2,0,0));
        
        resetBtn = new JButton("Reset");
        buttonPanel.add(resetBtn);
        
        simpanBtn = new JButton("Simpan");
        buttonPanel.add(simpanBtn);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        c.insets = new Insets(20,5,5,5);
        pane.add(buttonPanel,c);
        
        pane.add(new JPanel(),c);
        
        frame.pack();
        frame.setVisible(true);
        
        resetBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                nimField.setText("");
                namaDepanField.setText("");
                namaBelakangField.setText("");
                umurField.setText("");
                provinsiBox.setSelectedIndex(0);
            }
        });
        
        simpanBtn.addActionListener(new ActionListener()
        {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               JOptionPane.showMessageDialog(frame,
                       presenter.simpan(nimField.getText(),namaDepanField.getText(),
                                        namaBelakangField.getText(),umurField.getText(),
                                        (String) provinsiBox.getSelectedItem()));
           }
        });
    }
}
