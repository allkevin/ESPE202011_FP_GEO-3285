/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.concessionary.view;

import ec.edu.espe.concessionary.controller.CarController;
import ec.edu.espe.concessionary.model.Car;
import javax.swing.JOptionPane;
import utils.FileManager;

/**
 *
 * @author KEVIN
 */
public class FrmCar extends javax.swing.JFrame {

    /**
     * Creates new form Car
     */
    public FrmCar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtRingSize = new javax.swing.JTextField();
        txtPlateNumber = new javax.swing.JTextField();
        cmbNumberOfDoors = new javax.swing.JComboBox<>();
        cmbNumberOfPassengers = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtShowData = new javax.swing.JTextArea();
        btnShowData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kevin Andres Guairacaja");

        jLabel2.setText("CAR");

        jLabel3.setText("Brand:");

        jLabel4.setText("Ring Size:");

        jLabel5.setText("Number Of Doors:");

        jLabel6.setText("Number Of Passengers:");

        jLabel7.setText("Plate Number:");

        cmbNumberOfDoors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "5" }));

        cmbNumberOfPassengers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "5", "6", "7" }));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtShowData.setColumns(20);
        txtShowData.setRows(5);
        jScrollPane1.setViewportView(txtShowData);

        btnShowData.setText("Show Data");
        btnShowData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbNumberOfDoors, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRingSize, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbNumberOfPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSave)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(btnShowData))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRingSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbNumberOfDoors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbNumberOfPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPlateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnShowData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        Car car;
        String brand;
        int ringSize;
        int numberOfDoors;
        int numberOfPassengers;
        String plateNumber;
        CarController carController = new CarController();
        
        brand = txtBrand.getText();
        ringSize = Integer.parseInt(txtRingSize.getText());
        numberOfDoors = Integer.parseInt(cmbNumberOfDoors.getSelectedItem().toString());
        numberOfPassengers = Integer.parseInt(cmbNumberOfPassengers.getSelectedItem().toString());
        plateNumber = txtPlateNumber.getText();
        
        car = new Car(brand, ringSize, numberOfDoors, numberOfPassengers, plateNumber);
        carController.save(car);
        JOptionPane.showMessageDialog(rootPane, car.getName());
//        emptyFields();
//        btnShowDataActionPerformed(evt);       

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDataActionPerformed
        
//        String[] lines = new String[FileManager.countLines("cars")];
//        CarController chickenController = new CarController();
//        Car[] cars = new Car[FileManager.countLines("cars")];
//
//        CarController.read(lines, cars);
//
//        for (Car car : cars) {
//            txtShowData.setText(txtShowData.getText() + "\n" + car.getName());
//        }
//
//        CarController.populateCarsTable(tblCars, cars);
        CarController carController = new CarController();
        txtShowData.setText(carController.readTxt("D:\\Universidad\\4to Semestre\\Tareas\\Fundamentos de la Programacion\\Code\\Code 2\\ESPE202011_FP_GEO-3285\\workshops\\Unit 3\\WS27 ADT\\ConcessionarySystem\\Cars.csv"));
        
    }//GEN-LAST:event_btnShowDataActionPerformed

//    private void findCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findChickenActionPerformed
//
//        String[] lines = new String[FileManager.countLines("cars")];
//        CarController carController = new CarController();
//        Car[] cars = new Car[FileManager.countLines("cars")];
//        CarController.read(lines, cars);
//        int index = carController.find(cars, txtBrand.getText());
//        if (index == -1) {
//            JOptionPane.showMessageDialog(rootPane, "NOT FOUND", "NOT FOUND", JOptionPane.ERROR_MESSAGE);
//        } else {
//            tblCars.setRowSelectionInterval(index, index);
//        }
//
//    }//GEN-LAST:event_findChickenActionPerformed
//    
//    private void tblCarsMouseClicked(java.awt.event.MouseEvent evt) {                                         
//        int column = 0;
//        int row = tblCars.getSelectedRow();
//        String brand = tblCars.getModel().getValueAt(row, column).toString();
//        column=1;
//        String ringSize = tblCars.getModel().getValueAt(row, column).toString();
//        column=2;
//        String numberOfDoors = tblCars.getModel().getValueAt(row, column).toString();
//        column=3;
//        String numberOfPassengers = tblCars.getModel().getValueAt(row, column).toString();
//        column=4;
//        String plateNumber = tblCars.getModel().getValueAt(row, column).toString();
//        
//        txtBrand.setText(brand);
//        txtRingSize.setText(ringSize);
//        cmbNumberOfDoors.setSelectedItem(numberOfDoors);
//        cmbNumberOfPassengers.setSelectedItem(numberOfPassengers);
//        txtPlateNumber.setText(plateNumber);
//
//    }                                         
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCar().setVisible(true);
            }
        });
    }
    
//    private void emptyFields() {
//        txtBrand.setText("");
//        txtRingSize.setText("");
//        cmbNumberOfDoors.setSelectedItem("white");
//        cmbNumberOfPassengers.setSelectedItem("false");
//        txtPlateNumber.setText("");
//
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShowData;
    private javax.swing.JComboBox<String> cmbNumberOfDoors;
    private javax.swing.JComboBox<String> cmbNumberOfPassengers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtPlateNumber;
    private javax.swing.JTextField txtRingSize;
    private javax.swing.JTextArea txtShowData;
    // End of variables declaration//GEN-END:variables
}
