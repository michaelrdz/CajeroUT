/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Usuario
 */
public class ServEvaluacion extends javax.swing.JFrame {

    /**
     * Creates new form ServEvaluacion
     */
    public ServEvaluacion() {
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

        radiogroupAtencion = new javax.swing.ButtonGroup();
        radiogroupServicio = new javax.swing.ButtonGroup();
        cb_servicio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jpanel_opciones = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rdBtn_AtMalo = new javax.swing.JRadioButton();
        rdBtn_AtRegular = new javax.swing.JRadioButton();
        rdBtn_AtBueno = new javax.swing.JRadioButton();
        rdBtn_AtExcelente = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rdBtn_ServMalo = new javax.swing.JRadioButton();
        rdBtn_ServReglar = new javax.swing.JRadioButton();
        rdBtn_ServBueno = new javax.swing.JRadioButton();
        rdBtn_ServExcelente = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        cb_usaria = new javax.swing.JComboBox<>();
        btn_enviarEvaluacion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_servCaja = new javax.swing.JMenu();
        jMenuItem_servCaja = new javax.swing.JMenuItem();
        jMenuItem_servCreditoUT = new javax.swing.JMenuItem();
        jMenuItem_servLoboletos = new javax.swing.JMenuItem();
        jMenuItem_servEvaluacion = new javax.swing.JMenuItem();
        jMenuItem_servBuzon = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_consCalificaciones = new javax.swing.JMenuItem();
        jMenuItem_consHorario = new javax.swing.JMenuItem();
        jMenuItem_consEdoCuenta = new javax.swing.JMenuItem();
        jMenuItem_ConsMapa = new javax.swing.JMenuItem();
        jMenuItem_calendario = new javax.swing.JMenuItem();
        jMenu_tramites = new javax.swing.JMenu();
        jMenuItem_becas = new javax.swing.JMenuItem();
        jMenuItem_constancias = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_correo = new javax.swing.JMenuItem();
        jMenuItem_navega = new javax.swing.JMenuItem();
        jMenuItem_soporte = new javax.swing.JMenuItem();
        jMenu_cerrarSesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cb_servicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cafetería", "Transporte", "Servicios médicos", "Cajas", "CajerosUT" }));

        jLabel1.setText("Servicios de la UT:");

        jpanel_opciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("¿Cómo Evaluaría la atención de este servicio?");

        radiogroupAtencion.add(rdBtn_AtMalo);
        rdBtn_AtMalo.setText("Malo");

        radiogroupAtencion.add(rdBtn_AtRegular);
        rdBtn_AtRegular.setText("Regular");

        radiogroupAtencion.add(rdBtn_AtBueno);
        rdBtn_AtBueno.setText("Bueno");

        radiogroupAtencion.add(rdBtn_AtExcelente);
        rdBtn_AtExcelente.setText("Excelente");

        jLabel3.setText("¿Cómo evalua el servicio brindado?");

        radiogroupServicio.add(rdBtn_ServMalo);
        rdBtn_ServMalo.setText("Malo");

        radiogroupServicio.add(rdBtn_ServReglar);
        rdBtn_ServReglar.setText("Regular");

        radiogroupServicio.add(rdBtn_ServBueno);
        rdBtn_ServBueno.setText("Bueno");

        radiogroupServicio.add(rdBtn_ServExcelente);
        rdBtn_ServExcelente.setText("Excelente");

        jLabel4.setText("¿Usted volvería a hacer uso de este servicio?");

        cb_usaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No", "Solo por necesidad" }));

        javax.swing.GroupLayout jpanel_opcionesLayout = new javax.swing.GroupLayout(jpanel_opciones);
        jpanel_opciones.setLayout(jpanel_opcionesLayout);
        jpanel_opcionesLayout.setHorizontalGroup(
            jpanel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_opcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpanel_opcionesLayout.createSequentialGroup()
                            .addComponent(rdBtn_ServMalo)
                            .addGap(10, 10, 10)
                            .addComponent(rdBtn_ServReglar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rdBtn_ServBueno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rdBtn_ServExcelente))
                        .addGroup(jpanel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanel_opcionesLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(rdBtn_AtMalo)
                                .addGap(10, 10, 10)
                                .addComponent(rdBtn_AtRegular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdBtn_AtBueno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdBtn_AtExcelente))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(jpanel_opcionesLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cb_usaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jpanel_opcionesLayout.setVerticalGroup(
            jpanel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_opcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdBtn_AtMalo)
                    .addComponent(rdBtn_AtRegular)
                    .addComponent(rdBtn_AtBueno)
                    .addComponent(rdBtn_AtExcelente))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jpanel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdBtn_ServMalo)
                    .addComponent(rdBtn_ServReglar)
                    .addComponent(rdBtn_ServBueno)
                    .addComponent(rdBtn_ServExcelente))
                .addGap(18, 18, 18)
                .addGroup(jpanel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_usaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btn_enviarEvaluacion.setText("Enviar");

        jMenuBar1.setBackground(new java.awt.Color(6, 12, 60));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu_servCaja.setForeground(new java.awt.Color(255, 255, 255));
        jMenu_servCaja.setText("Servicios");

        jMenuItem_servCaja.setText("Caja");
        jMenu_servCaja.add(jMenuItem_servCaja);

        jMenuItem_servCreditoUT.setText("CreditoUT");
        jMenu_servCaja.add(jMenuItem_servCreditoUT);

        jMenuItem_servLoboletos.setText("Loboletos");
        jMenu_servCaja.add(jMenuItem_servLoboletos);

        jMenuItem_servEvaluacion.setText("Evaluación de servicios");
        jMenu_servCaja.add(jMenuItem_servEvaluacion);

        jMenuItem_servBuzon.setText("Buzón de quejas y sugerencias");
        jMenu_servCaja.add(jMenuItem_servBuzon);

        jMenuBar1.add(jMenu_servCaja);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Consultas");

        jMenuItem_consCalificaciones.setText("Calificaciones");
        jMenu2.add(jMenuItem_consCalificaciones);

        jMenuItem_consHorario.setText("Horario");
        jMenu2.add(jMenuItem_consHorario);

        jMenuItem_consEdoCuenta.setText("Estado de cuenta");
        jMenu2.add(jMenuItem_consEdoCuenta);

        jMenuItem_ConsMapa.setText("Mapa Universidad");
        jMenu2.add(jMenuItem_ConsMapa);

        jMenuItem_calendario.setText("Calendario");
        jMenu2.add(jMenuItem_calendario);

        jMenuBar1.add(jMenu2);

        jMenu_tramites.setForeground(new java.awt.Color(255, 255, 255));
        jMenu_tramites.setText("Trámites");

        jMenuItem_becas.setText("Becas");
        jMenu_tramites.add(jMenuItem_becas);

        jMenuItem_constancias.setText("Constancias");
        jMenu_tramites.add(jMenuItem_constancias);

        jMenuBar1.add(jMenu_tramites);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("LobosConect");

        jMenuItem_correo.setText("Correo");
        jMenu4.add(jMenuItem_correo);

        jMenuItem_navega.setText("Navegar");
        jMenu4.add(jMenuItem_navega);

        jMenuItem_soporte.setText("Soporte");
        jMenu4.add(jMenuItem_soporte);

        jMenuBar1.add(jMenu4);

        jMenu_cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jMenu_cerrarSesion.setText("Cerrar sesión");
        jMenuBar1.add(jMenu_cerrarSesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanel_opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_enviarEvaluacion)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpanel_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_enviarEvaluacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ServEvaluacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServEvaluacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServEvaluacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServEvaluacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServEvaluacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_enviarEvaluacion;
    public javax.swing.JComboBox<String> cb_servicio;
    public javax.swing.JComboBox<String> cb_usaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuItem_ConsMapa;
    public javax.swing.JMenuItem jMenuItem_becas;
    public javax.swing.JMenuItem jMenuItem_calendario;
    public javax.swing.JMenuItem jMenuItem_consCalificaciones;
    public javax.swing.JMenuItem jMenuItem_consEdoCuenta;
    public javax.swing.JMenuItem jMenuItem_consHorario;
    public javax.swing.JMenuItem jMenuItem_constancias;
    public javax.swing.JMenuItem jMenuItem_correo;
    public javax.swing.JMenuItem jMenuItem_navega;
    public javax.swing.JMenuItem jMenuItem_servBuzon;
    public javax.swing.JMenuItem jMenuItem_servCaja;
    public javax.swing.JMenuItem jMenuItem_servCreditoUT;
    public javax.swing.JMenuItem jMenuItem_servEvaluacion;
    public javax.swing.JMenuItem jMenuItem_servLoboletos;
    public javax.swing.JMenuItem jMenuItem_soporte;
    public javax.swing.JMenu jMenu_cerrarSesion;
    private javax.swing.JMenu jMenu_servCaja;
    public javax.swing.JMenu jMenu_tramites;
    public javax.swing.JPanel jpanel_opciones;
    private javax.swing.ButtonGroup radiogroupAtencion;
    private javax.swing.ButtonGroup radiogroupServicio;
    public javax.swing.JRadioButton rdBtn_AtBueno;
    public javax.swing.JRadioButton rdBtn_AtExcelente;
    public javax.swing.JRadioButton rdBtn_AtMalo;
    public javax.swing.JRadioButton rdBtn_AtRegular;
    public javax.swing.JRadioButton rdBtn_ServBueno;
    public javax.swing.JRadioButton rdBtn_ServExcelente;
    public javax.swing.JRadioButton rdBtn_ServMalo;
    public javax.swing.JRadioButton rdBtn_ServReglar;
    // End of variables declaration//GEN-END:variables
}
