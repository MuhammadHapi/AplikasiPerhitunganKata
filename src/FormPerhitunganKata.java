import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.util.regex.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Hapi
 */
public class FormPerhitunganKata extends javax.swing.JFrame {

    /**
     * Creates new form FormPerhitunganKata
     */
    public FormPerhitunganKata() {
        initComponents();
        // menambahkan Document listener untuk update real-time
        textAreaKata.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) { updateHitung(); }
            public void insertUpdate(DocumentEvent e) { updateHitung(); }
            public void removeUpdate(DocumentEvent e) { updateHitung(); }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaKata = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        buttonHitung = new javax.swing.JButton();
        buttonSimpan = new javax.swing.JButton();
        buttonBersihkan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textCari = new javax.swing.JTextField();
        buttonCari = new javax.swing.JButton();
        labelHasilCari = new javax.swing.JLabel();
        labelJumlahKata = new javax.swing.JLabel();
        labelJumlahKalimat = new javax.swing.JLabel();
        labelJumlahKarakter = new javax.swing.JLabel();
        labelJumlahParagraf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        textAreaKata.setColumns(20);
        textAreaKata.setRows(5);
        jScrollPane1.setViewportView(textAreaKata);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("APLIKASI PERHITUNGAN KATA");

        buttonHitung.setText("HITUNG");
        buttonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHitungActionPerformed(evt);
            }
        });

        buttonSimpan.setText("SIMPAN");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonBersihkan.setText("BERSIHKAN");
        buttonBersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBersihkanActionPerformed(evt);
            }
        });

        jLabel2.setText("Cari :");

        textCari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textCariFocusGained(evt);
            }
        });

        buttonCari.setText("CARI");
        buttonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        labelHasilCari.setText("Hasil Pencarian :");

        labelJumlahKata.setText("Jumlah Kata :");

        labelJumlahKalimat.setText("Jumlah Kalimat :");

        labelJumlahKarakter.setText("Jumlah Karakter :");

        labelJumlahParagraf.setText("Jumlah Paragraf :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelJumlahKalimat)
                                    .addComponent(labelHasilCari)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelJumlahKata)
                                    .addComponent(labelJumlahKarakter)
                                    .addComponent(labelJumlahParagraf))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonHitung)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonBersihkan))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(textCari)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(buttonCari)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(buttonCari))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBersihkan)
                    .addComponent(buttonSimpan)
                    .addComponent(buttonHitung))
                .addGap(31, 31, 31)
                .addComponent(labelHasilCari)
                .addGap(18, 18, 18)
                .addComponent(labelJumlahKata)
                .addGap(18, 18, 18)
                .addComponent(labelJumlahKarakter)
                .addGap(18, 18, 18)
                .addComponent(labelJumlahKalimat)
                .addGap(18, 18, 18)
                .addComponent(labelJumlahParagraf)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHitungActionPerformed
        updateHitung();
    }//GEN-LAST:event_buttonHitungActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        simpanFile();
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        pencarianKata();
    }//GEN-LAST:event_buttonCariActionPerformed

    private void textCariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textCariFocusGained
        textCari.setText("");
    }//GEN-LAST:event_textCariFocusGained

    private void buttonBersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBersihkanActionPerformed
        // Mengembalikan teks area ke teks default
        textAreaKata.setText("");

        // Menghapus teks pencarian dan hasil pencarian
        textCari.setText("");
        labelHasilCari.setText("Hasil Pencarian :");

        // Reset statistik ke nilai default
        labelJumlahKata.setText("Jumlah Kata : 0");
        labelJumlahKalimat.setText("Jumlah Karakter : 0");
        labelJumlahKarakter.setText("Jumlah Kalimat : 0");
        labelJumlahParagraf.setText("Jumlah Paragraf : 0");

        // Fokus kembali ke JTextArea
        textAreaKata.requestFocus();
    }//GEN-LAST:event_buttonBersihkanActionPerformed

    private void updateHitung() {
        String teks = textAreaKata.getText().trim();  // Menambahkan trim() untuk menghapus spasi berlebih

        // Hitung jumlah kata
        String[] kata = teks.split("\\s+");
        int jumlahKata = kata.length;

        // Hitung jumlah karakter
        int jumlahKarakter = teks.length();

        // Hitung jumlah kalimat menggunakan pola tanda baca titik, tanda seru, dan tanda tanya
        Pattern pola = Pattern.compile("[.!?]+");
        Matcher pencocokan = pola.matcher(teks);
        int jumlahKalimat = 0;
        while (pencocokan.find()) {
            jumlahKalimat++;
        }

        // Hitung jumlah paragraf (menggunakan pemisah dua baris kosong)
        String[] paragraf = teks.split("\n\\s*\n");
        int jumlahParagraf = paragraf.length;

        // Perbarui label dengan hasil perhitungan
        labelJumlahKata.setText("Jumlah Kata : " + jumlahKata);
        labelJumlahKalimat.setText("Jumlah Karakter : " + jumlahKarakter);
        labelJumlahKarakter.setText("Jumlah Kalimat : " + jumlahKalimat);
        labelJumlahParagraf.setText("Jumlah Paragraf : " + jumlahParagraf);
    }
    
    private void simpanFile() {
        JFileChooser pemilihFile = new JFileChooser();
        // Menyimpan file ke direktori yang dipilih
        if (pemilihFile.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = pemilihFile.getSelectedFile();
                try (PrintWriter penulis = new PrintWriter(file)) {
                    penulis.println("=== Hasil Analisis Teks ===");
                    penulis.println("Teks:");
                    penulis.println(textAreaKata.getText());
                    penulis.println("\nStatistik:");
                    penulis.println(labelJumlahKata.getText());
                    penulis.println(labelJumlahKalimat.getText());
                    penulis.println(labelJumlahKarakter.getText());
                    penulis.println(labelJumlahParagraf.getText());
                }
                JOptionPane.showMessageDialog(this, "File berhasil disimpan!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan file. Pastikan file tidak sedang terbuka di program lain.", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void pencarianKata() {
        String kataDicari = textCari.getText().trim();  // Menggunakan trim untuk membersihkan spasi berlebih
        String teks = textAreaKata.getText().toLowerCase().trim();  // Menambahkan trim() untuk menghapus spasi di awal dan akhir teks

        if (kataDicari.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan kata yang ingin dicari!", "Error", JOptionPane.ERROR_MESSAGE);
            return;  // Menghentikan pencarian jika kata kosong
        }

        // Cari kata dengan menggunakan regex untuk batas kata
        Pattern pola = Pattern.compile("\\b" + Pattern.quote(kataDicari) + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher pencocokan = pola.matcher(teks);

        int jumlah = 0;
        while (pencocokan.find()) {
            jumlah++;
        }

        labelHasilCari.setText("Hasil Pencarian : " + jumlah);
    }
    
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
            java.util.logging.Logger.getLogger(FormPerhitunganKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPerhitunganKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPerhitunganKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPerhitunganKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPerhitunganKata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBersihkan;
    private javax.swing.JButton buttonCari;
    private javax.swing.JButton buttonHitung;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHasilCari;
    private javax.swing.JLabel labelJumlahKalimat;
    private javax.swing.JLabel labelJumlahKarakter;
    private javax.swing.JLabel labelJumlahKata;
    private javax.swing.JLabel labelJumlahParagraf;
    private javax.swing.JTextArea textAreaKata;
    private javax.swing.JTextField textCari;
    // End of variables declaration//GEN-END:variables
}
