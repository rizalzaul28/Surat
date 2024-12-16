/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import View.MenuBagian;
import View.MenuDashboard;
import View.MenuKategori;
import View.MenuSuratKeluar;
import View.MenuSuratMasuk;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author rizan
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_Navbar = new javax.swing.JPanel();
        pn_Sidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pn_Menu = new javax.swing.JPanel();
        pn_Content = new javax.swing.JPanel();
        pn_Dasar = new javax.swing.JPanel();
        pn_Utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_Navbar.setBackground(new java.awt.Color(204, 0, 204));

        javax.swing.GroupLayout pn_NavbarLayout = new javax.swing.GroupLayout(pn_Navbar);
        pn_Navbar.setLayout(pn_NavbarLayout);
        pn_NavbarLayout.setHorizontalGroup(
            pn_NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        pn_NavbarLayout.setVerticalGroup(
            pn_NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(pn_Navbar, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setBorder(null);

        pn_Menu.setBackground(new java.awt.Color(51, 51, 255));
        pn_Menu.setLayout(new javax.swing.BoxLayout(pn_Menu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pn_Menu);

        javax.swing.GroupLayout pn_SidebarLayout = new javax.swing.GroupLayout(pn_Sidebar);
        pn_Sidebar.setLayout(pn_SidebarLayout);
        pn_SidebarLayout.setHorizontalGroup(
            pn_SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        pn_SidebarLayout.setVerticalGroup(
            pn_SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );

        getContentPane().add(pn_Sidebar, java.awt.BorderLayout.LINE_START);

        pn_Content.setLayout(new java.awt.BorderLayout());

        pn_Dasar.setBackground(new java.awt.Color(0, 0, 0));

        pn_Utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_Utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_DasarLayout = new javax.swing.GroupLayout(pn_Dasar);
        pn_Dasar.setLayout(pn_DasarLayout);
        pn_DasarLayout.setHorizontalGroup(
            pn_DasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_DasarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_Utama, javax.swing.GroupLayout.DEFAULT_SIZE, 1104, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_DasarLayout.setVerticalGroup(
            pn_DasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_DasarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_Utama, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
        );

        pn_Content.add(pn_Dasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(pn_Content, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pn_Utama.add(new MenuDashboard());
        pn_Utama.repaint();
        pn_Utama.revalidate();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_Content;
    private javax.swing.JPanel pn_Dasar;
    private javax.swing.JPanel pn_Menu;
    private javax.swing.JPanel pn_Navbar;
    private javax.swing.JPanel pn_Sidebar;
    private javax.swing.JPanel pn_Utama;
    // End of variables declaration//GEN-END:variables

    private void execute() {

        //Icon Menu Utama
        ImageIcon iconDashboard = new ImageIcon(getClass().getResource("/Images/iconDashboard.png"));
        ImageIcon iconKategori = new ImageIcon(getClass().getResource("/Images/iconKategori.png"));
        ImageIcon iconBagian = new ImageIcon(getClass().getResource("/Images/iconBagian.png"));
        ImageIcon iconSurat = new ImageIcon(getClass().getResource("/Images/iconSurat.png"));
        ImageIcon iconLogout = new ImageIcon(getClass().getResource("/Images/iconLogout.png"));

        //Icon Sub Menu
        ImageIcon iconsubSuratMasuk = new ImageIcon(getClass().getResource("/Images/iconSuratMasuk.png"));
        ImageIcon iconsubSuratKeluar = new ImageIcon(getClass().getResource("/Images/iconSuratKeluar.png"));

        //Mengeksekusi Sub Menu
        MenuItem menuSubSuratMasuk = new MenuItem(null, true, iconsubSuratMasuk, "Surat Masuk", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_Utama.removeAll();
                pn_Utama.add(new MenuSuratMasuk());
                pn_Utama.repaint();
                pn_Utama.revalidate();
            }
        });

        MenuItem menuSubSuratKeluar = new MenuItem(null, true, iconsubSuratKeluar, "Surat Keluar", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    pn_Utama.removeAll();
                    pn_Utama.add(new MenuSuratKeluar());
                    pn_Utama.repaint();
                    pn_Utama.revalidate();
                } catch (SQLException ex) {
                    Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        //Mengeksekusi Menu Utama
        MenuItem menuDashboard = new MenuItem(iconDashboard, false, null, "Dashboard", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_Utama.removeAll();
                pn_Utama.add(new MenuDashboard());
                pn_Utama.repaint();
                pn_Utama.revalidate();
            }
        });

        MenuItem menuKategori = new MenuItem(iconKategori, false, null, "Kategori", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    pn_Utama.removeAll();
                    pn_Utama.add(new MenuKategori());
                    pn_Utama.repaint();
                    pn_Utama.revalidate();
                } catch (SQLException ex) {
                    Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        MenuItem menuBagian = new MenuItem(iconBagian, false, null, "Bagian", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    pn_Utama.removeAll();
                    pn_Utama.add(new MenuBagian());
                    pn_Utama.repaint();
                    pn_Utama.revalidate();
                } catch (SQLException ex) {
                    Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        MenuItem menuSurat = new MenuItem(iconSurat, false, null, "Persuratan", null, menuSubSuratMasuk, menuSubSuratKeluar);

        MenuItem menuLogout = new MenuItem(iconLogout, false, null, "Logout", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        addMenu(menuDashboard, menuKategori, menuBagian, menuSurat, menuLogout);

    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            pn_Menu.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        pn_Menu.revalidate();
    }

}
