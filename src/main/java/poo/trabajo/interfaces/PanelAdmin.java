package poo.trabajo.interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author josed y maria
 */
public class PanelAdmin extends javax.swing.JFrame {
    int xMouse,yMouse;
    /**
    * 
    * Página donde se muestrna todas las opciones que puede relazar el administrador
    */
    public PanelAdmin() {
        initComponents();
        jLabelLogo.setIcon(new ImageIcon("./src/main/java/poo/trabajo/imagenes/javacomp1.png"));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelNavegador = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelUsuarios = new javax.swing.JLabel();
        jLabeAñadirlProductos = new javax.swing.JLabel();
        jLabelModificarProducto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelFacturas = new javax.swing.JLabel();
        jPanelIheader = new javax.swing.JPanel();
        jPanelBoton = new javax.swing.JPanel();
        jLabelCerrar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(962, 581));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(844, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelNavegador.setBackground(new java.awt.Color(255, 0, 0));

        jLabelLogo.setText("jLabelLogo");

        jLabelUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelUsuarios.setText(" USUARIOS");
        jLabelUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUsuariosMouseClicked(evt);
            }
        });

        jLabeAñadirlProductos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabeAñadirlProductos.setText("   AÑADIR");
        jLabeAñadirlProductos.setToolTipText("");
        jLabeAñadirlProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabeAñadirlProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabeAñadirlProductosMouseClicked(evt);
            }
        });

        jLabelModificarProducto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelModificarProducto.setText(" MODIFICAR ");
        jLabelModificarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelModificarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelModificarProductoMouseClicked(evt);
            }
        });

        jLabelFacturas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelFacturas.setText("  FACTURAS");
        jLabelFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFacturasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelNavegadorLayout = new javax.swing.GroupLayout(jPanelNavegador);
        jPanelNavegador.setLayout(jPanelNavegadorLayout);
        jPanelNavegadorLayout.setHorizontalGroup(
            jPanelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(jLabelFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelNavegadorLayout.createSequentialGroup()
                .addGroup(jPanelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jLabelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabeAñadirlProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelModificarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelNavegadorLayout.setVerticalGroup(
            jPanelNavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNavegadorLayout.createSequentialGroup()
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabeAñadirlProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabelModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 123, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelNavegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 110, 550));

        jPanelIheader.setBackground(new java.awt.Color(51, 51, 255));
        jPanelIheader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelIheaderMouseDragged(evt);
            }
        });
        jPanelIheader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelIheaderMousePressed(evt);
            }
        });

        jLabelCerrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelCerrar.setText("X");
        jLabelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonLayout = new javax.swing.GroupLayout(jPanelBoton);
        jPanelBoton.setLayout(jPanelBotonLayout);
        jPanelBotonLayout.setHorizontalGroup(
            jPanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBotonLayout.setVerticalGroup(
            jPanelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelCerrar))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LOGOUT");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelIheaderLayout = new javax.swing.GroupLayout(jPanelIheader);
        jPanelIheader.setLayout(jPanelIheaderLayout);
        jPanelIheaderLayout.setHorizontalGroup(
            jPanelIheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIheaderLayout.createSequentialGroup()
                .addComponent(jPanelBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 739, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanelIheaderLayout.setVerticalGroup(
            jPanelIheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIheaderLayout.createSequentialGroup()
                .addGroup(jPanelIheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelIheader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 30));

        jPanelContenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 850, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelIheaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIheaderMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanelIheaderMousePressed

    private void jPanelIheaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelIheaderMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jPanelIheaderMouseDragged

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    
    private void jLabelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseEntered
        jPanelBoton.setBackground(Color.red);
        jLabelCerrar.setForeground(Color.white);
    }//GEN-LAST:event_jLabelCerrarMouseEntered

    private void jLabelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseExited
        jPanelBoton.setBackground(Color.white);
        jLabelCerrar.setForeground(Color.black);
    }//GEN-LAST:event_jLabelCerrarMouseExited
    /**
     * 
     * Boton para salir del usuario- 
     */
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         Login lg = new Login();
                 lg.setVisible(true);
                 this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked
    /**
     * 
     * Boton ir a la página para mostrar los usuario al adminstrador 
     */
    private void jLabelUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuariosMouseClicked
        MostrarUsuarios mu= new MostrarUsuarios();
        mu.setSize(850, 550);
        mu.setLocation(0, 0);
        
        jPanelContenido.removeAll();
        jPanelContenido.add(mu,BorderLayout.CENTER);
        jPanelContenido.revalidate();
        jPanelContenido.repaint();
        
    }//GEN-LAST:event_jLabelUsuariosMouseClicked
    /**
     * 
     * Boton para ir a la página de intrucción de productos. 
     */
    private void jLabeAñadirlProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeAñadirlProductosMouseClicked
        AñadirProductos ap= new AñadirProductos();
        ap.setSize(850, 550);
        ap.setLocation(0, 0);
        
        jPanelContenido.removeAll();
        jPanelContenido.add(ap,BorderLayout.CENTER);
        jPanelContenido.revalidate();
        jPanelContenido.repaint();
    }//GEN-LAST:event_jLabeAñadirlProductosMouseClicked
    /**
     * 
     * Boton para ir a la pagina para modificar los productos 
     */
    private void jLabelModificarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelModificarProductoMouseClicked
        // TODO add your handling code here:
        MostrarProductos mp= new MostrarProductos();
        mp.setSize(850, 550);
        mp.setLocation(0, 0);
        
        jPanelContenido.removeAll();
        jPanelContenido.add(mp,BorderLayout.CENTER);
        jPanelContenido.revalidate();
        jPanelContenido.repaint();
    }//GEN-LAST:event_jLabelModificarProductoMouseClicked
    /**
     * 
     * Boton para ir a la página de lista compras. 
     */
    private void jLabelFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFacturasMouseClicked
      VerCompras vp= new VerCompras();
        vp.setSize(850, 550);
        vp.setLocation(0, 0);
        
        jPanelContenido.removeAll();
        jPanelContenido.add(vp,BorderLayout.CENTER);
        jPanelContenido.revalidate();
        jPanelContenido.repaint();
    }//GEN-LAST:event_jLabelFacturasMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabeAñadirlProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelFacturas;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelModificarProducto;
    private javax.swing.JLabel jLabelUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBoton;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelIheader;
    private javax.swing.JPanel jPanelNavegador;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
