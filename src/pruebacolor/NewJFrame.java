package pruebacolor;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public final class NewJFrame extends javax.swing.JFrame {

    int rojo = 128, verde = 128, azul = 128;
    int red = 128, green = 128, blue = 128;

    public NewJFrame() {
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));
        Generar();
        secundario();
        ocuG();
    }

    public String Hex = "";
    public String Hexa = "";

    public void cl() {
        Hex = Integer.toHexString(rojo) + Integer.toHexString(verde) + Integer.toHexString(azul);
        th.setText(Hex.toUpperCase());
        tr1.setText("" + rojo);
        tg1.setText("" + verde);
        tb1.setText("" + azul);
        tr.setText("" + rojo);
        tg.setText("" + verde);
        tb.setText("" + azul);
    }

    public void clr() {
        Hexa = Integer.toHexString(red) + Integer.toHexString(green) + Integer.toHexString(blue);
        th.setText(Hexa.toUpperCase());
        tr1.setText("" + red);
        tg1.setText("" + green);
        tb1.setText("" + blue);
        tr.setText("" + red);
        tg.setText("" + green);
        tb.setText("" + blue);
    }

    public void Generar() {
        Color color = new Color(rojo, verde, azul);
        pColor.setBackground(color);
        pColor.setColorPrimario(color);
        cl();
    }

    public void secundario() {
        Color color = new Color(red, green, blue);
        pColor.setBackground(color);
        pColor.setColorSecundario(color);
        clr();
    }

    public void Convert() {
        String w = "#" + th.getText();
        int r = Integer.valueOf(w.substring(1, 3), 16);
        jSliderR.setValue(r);
        int g = Integer.valueOf(w.substring(3, 5), 16);
        jSliderG.setValue(g);
        int b = Integer.valueOf(w.substring(5, 7), 16);
        jSliderB.setValue(b);
        //System.out.println(r + "," + g + "," + b);
    }

    public void mosG() {
        bCP.setVisible(true);
        bCS.setVisible(true);
        uno.setVisible(true);
        dos.setVisible(false);
        tres.setVisible(false);
        p1.setVisible(true);
        p2.setVisible(false);
    }

    public void ocuG() {
        bCP.setVisible(false);
        bCS.setVisible(false);
        uno.setVisible(false);
        dos.setVisible(true);
        tres.setVisible(false);
        p1.setVisible(true);
        p2.setVisible(false);
    }

    int xx, xy;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRound3 = new LIB.JPanelRound();
        jPanelRound1 = new LIB.JPanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tr = new javax.swing.JTextField();
        tg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tb = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        p1 = new javax.swing.JPanel();
        jSliderB = new pruebacolor.JsliderCustom();
        jSliderG = new pruebacolor.JsliderCustom();
        jSliderR = new pruebacolor.JsliderCustom();
        p2 = new javax.swing.JPanel();
        jSliderR1 = new pruebacolor.JsliderCustom();
        jSliderG1 = new pruebacolor.JsliderCustom();
        jSliderB1 = new pruebacolor.JsliderCustom();
        pColor = new LIB.JPanelRound();
        bCP = new javax.swing.JButton();
        bCS = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanelRound4 = new LIB.JPanelRound();
        tb1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        th = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tr1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tg1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dos = new javax.swing.JLabel();
        uno = new javax.swing.JLabel();
        tres = new javax.swing.JLabel();
        jPanelRound2 = new LIB.JPanelRound();
        jLabel9 = new javax.swing.JLabel();
        sEstado = new pruebacolor.Switch();
        estado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRound3.setBackground(new java.awt.Color(23, 29, 42));
        jPanelRound3.setOpaque(true);
        jPanelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRound1.setBackground(new java.awt.Color(45, 53, 72));
        jPanelRound1.setArch(15);
        jPanelRound1.setArcw(15);
        jPanelRound1.setOpaque(true);
        jPanelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("B");
        jPanelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 95, 10, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("G");
        jPanelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 65, 10, -1));

        tr.setBackground(new java.awt.Color(45, 53, 72));
        tr.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        tr.setForeground(new java.awt.Color(255, 255, 255));
        tr.setText("000");
        tr.setBorder(null);
        jPanelRound1.add(tr, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 35, 20, -1));

        tg.setBackground(new java.awt.Color(45, 53, 72));
        tg.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        tg.setForeground(new java.awt.Color(255, 255, 255));
        tg.setText("000");
        tg.setBorder(null);
        jPanelRound1.add(tg, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 65, 20, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("R");
        jPanelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 35, 10, -1));

        tb.setBackground(new java.awt.Color(45, 53, 72));
        tb.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        tb.setForeground(new java.awt.Color(255, 255, 255));
        tb.setText("000");
        tb.setBorder(null);
        jPanelRound1.add(tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 95, 20, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Rango");
        jPanelRound1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        p1.setBackground(new java.awt.Color(45, 53, 72));
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSliderB.setBackground(new java.awt.Color(204, 204, 204));
        jSliderB.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jSliderB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderBStateChanged(evt);
            }
        });
        p1.add(jSliderB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 180, -1));

        jSliderG.setBackground(new java.awt.Color(204, 204, 204));
        jSliderG.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jSliderG.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderGStateChanged(evt);
            }
        });
        p1.add(jSliderG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 180, -1));

        jSliderR.setBackground(new java.awt.Color(204, 204, 204));
        jSliderR.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jSliderR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderRStateChanged(evt);
            }
        });
        p1.add(jSliderR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 180, -1));

        jLayeredPane1.add(p1);
        p1.setBounds(0, 0, 180, 90);

        p2.setBackground(new java.awt.Color(45, 53, 72));
        p2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSliderR1.setBackground(new java.awt.Color(204, 204, 204));
        jSliderR1.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jSliderR1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderR1StateChanged(evt);
            }
        });
        p2.add(jSliderR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 180, -1));

        jSliderG1.setBackground(new java.awt.Color(204, 204, 204));
        jSliderG1.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jSliderG1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderG1StateChanged(evt);
            }
        });
        p2.add(jSliderG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 180, -1));

        jSliderB1.setBackground(new java.awt.Color(204, 204, 204));
        jSliderB1.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jSliderB1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderB1StateChanged(evt);
            }
        });
        p2.add(jSliderB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 180, -1));

        jLayeredPane1.add(p2);
        p2.setBounds(0, 0, 180, 90);

        jPanelRound1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 180, 90));

        jPanelRound3.add(jPanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 310, 130));

        pColor.setBackground(new java.awt.Color(45, 53, 72));
        pColor.setForeground(new java.awt.Color(255, 255, 255));
        pColor.setArch(15);
        pColor.setArcw(15);
        pColor.setOpaque(true);
        pColor.setLayout(new java.awt.GridLayout(2, 1));

        bCP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cs.png"))); // NOI18N
        bCP.setToolTipText("");
        bCP.setBorder(null);
        bCP.setBorderPainted(false);
        bCP.setContentAreaFilled(false);
        bCP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCP.setFocusPainted(false);
        bCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCPActionPerformed(evt);
            }
        });
        pColor.add(bCP);

        bCS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cr.png"))); // NOI18N
        bCS.setToolTipText("");
        bCS.setBorder(null);
        bCS.setBorderPainted(false);
        bCS.setContentAreaFilled(false);
        bCS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCS.setFocusPainted(false);
        bCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCSActionPerformed(evt);
            }
        });
        pColor.add(bCS);

        jPanelRound3.add(pColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 150, 235));

        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanelRound3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 20));

        jPanelRound4.setBackground(new java.awt.Color(45, 53, 72));
        jPanelRound4.setArch(15);
        jPanelRound4.setArcw(15);
        jPanelRound4.setOpaque(true);
        jPanelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb1.setBackground(new java.awt.Color(45, 53, 72));
        tb1.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        tb1.setForeground(new java.awt.Color(255, 255, 255));
        tb1.setText("000");
        tb1.setBorder(null);
        jPanelRound4.add(tb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 20, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(");
        jPanelRound4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HEX");
        jPanelRound4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 30, -1));

        th.setBackground(new java.awt.Color(45, 53, 72));
        th.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        th.setForeground(new java.awt.Color(255, 255, 255));
        th.setBorder(null);
        th.setCaretColor(new java.awt.Color(22, 134, 232));
        th.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                thKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                thKeyTyped(evt);
            }
        });
        jPanelRound4.add(th, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 30, 45, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RGB");
        jPanelRound4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(",");
        jPanelRound4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 5, -1));

        tr1.setBackground(new java.awt.Color(45, 53, 72));
        tr1.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        tr1.setForeground(new java.awt.Color(255, 255, 255));
        tr1.setText("000");
        tr1.setBorder(null);
        jPanelRound4.add(tr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 20, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(",");
        jPanelRound4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 10, -1, -1));

        tg1.setBackground(new java.awt.Color(45, 53, 72));
        tg1.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        tg1.setForeground(new java.awt.Color(255, 255, 255));
        tg1.setText("000");
        tg1.setBorder(null);
        jPanelRound4.add(tg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 10, 20, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(")");
        jPanelRound4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 10, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Valores");
        jPanelRound4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("#");
        jPanelRound4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 30, 10, -1));

        jPanelRound3.add(jPanelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 310, 55));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("COLORS - RGB / HEX");
        jPanelRound3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("x");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanelRound3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 7, 15, 15));

        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fl.png"))); // NOI18N
        jPanelRound3.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 140, -1, -1));

        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fl.png"))); // NOI18N
        jPanelRound3.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 50, -1, -1));

        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fl.png"))); // NOI18N
        jPanelRound3.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 230, -1, -1));

        jPanelRound2.setBackground(new java.awt.Color(45, 53, 72));
        jPanelRound2.setArch(15);
        jPanelRound2.setArcw(15);
        jPanelRound2.setOpaque(true);
        jPanelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Gradient:");
        jPanelRound2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        sEstado.setOnOff(false);
        sEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sEstadoMouseClicked(evt);
            }
        });
        jPanelRound2.add(sEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 2, 40, 27));

        estado.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        estado.setForeground(new java.awt.Color(255, 255, 255));
        estado.setText("Desactivado");
        jPanelRound2.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 10, 80, 10));

        jPanelRound3.add(jPanelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 310, 30));

        getContentPane().add(jPanelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 275));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jSliderRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderRStateChanged
        rojo = jSliderR.getValue();
        tr.setText("" + rojo);
        Generar();
    }//GEN-LAST:event_jSliderRStateChanged

    private void jSliderGStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderGStateChanged
        verde = jSliderG.getValue();
        tg.setText("" + verde);
        Generar();
    }//GEN-LAST:event_jSliderGStateChanged

    private void jSliderBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderBStateChanged
        azul = jSliderB.getValue();
        tb.setText("" + azul);
        Generar();
    }//GEN-LAST:event_jSliderBStateChanged

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void thKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_thKeyPressed
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                Convert();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_thKeyPressed

    private void thKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_thKeyTyped
        int key = evt.getKeyChar();

        if (th.getText().length() >= 6) {
            evt.consume();
        }
        boolean numeros = key >= 48 && key <= 57; // Codigo ASCII de numeros
        boolean mayusculas = key >= 65 && key <= 70; //Codigo ASCII de A hasta F
        boolean minusculas = key >= 97 && key <= 102; //Codigo ASCII de a hasta f
        if (!numeros && !minusculas && !mayusculas) {
            evt.consume();
        }
    }//GEN-LAST:event_thKeyTyped

    private void bCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCPActionPerformed
        uno.setVisible(true);
        tres.setVisible(false);
        p1.setVisible(true);
        p2.setVisible(false);
        Generar();
    }//GEN-LAST:event_bCPActionPerformed

    private void bCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCSActionPerformed
        uno.setVisible(false);
        tres.setVisible(true);
        p1.setVisible(false);
        p2.setVisible(true);
        secundario();
    }//GEN-LAST:event_bCSActionPerformed

    private void sEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sEstadoMouseClicked
        this.estado.setText((this.sEstado.isOnOff()) ? "Activado" : "Desactivado");
        this.pColor.setOpaque((this.sEstado.isOnOff()) ? false : true);
        boolean onOff = this.sEstado.isOnOff();
        if (onOff) {
            mosG();
            Generar();
        } else {
            ocuG();
            Generar();
        }
    }//GEN-LAST:event_sEstadoMouseClicked

    private void jSliderR1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderR1StateChanged
        red = jSliderR1.getValue();
        tr.setText("" + red);
        secundario();
    }//GEN-LAST:event_jSliderR1StateChanged

    private void jSliderG1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderG1StateChanged
        green = jSliderG1.getValue();
        tr.setText("" + green);
        secundario();
    }//GEN-LAST:event_jSliderG1StateChanged

    private void jSliderB1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderB1StateChanged
        blue = jSliderB1.getValue();
        tr.setText("" + blue);
        secundario();
    }//GEN-LAST:event_jSliderB1StateChanged

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
 /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         */
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCP;
    private javax.swing.JButton bCS;
    private javax.swing.JLabel dos;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private LIB.JPanelRound jPanelRound1;
    private LIB.JPanelRound jPanelRound2;
    private LIB.JPanelRound jPanelRound3;
    private LIB.JPanelRound jPanelRound4;
    private pruebacolor.JsliderCustom jSliderB;
    private pruebacolor.JsliderCustom jSliderB1;
    private pruebacolor.JsliderCustom jSliderG;
    private pruebacolor.JsliderCustom jSliderG1;
    private pruebacolor.JsliderCustom jSliderR;
    private pruebacolor.JsliderCustom jSliderR1;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private LIB.JPanelRound pColor;
    private pruebacolor.Switch sEstado;
    private javax.swing.JTextField tb;
    private javax.swing.JTextField tb1;
    private javax.swing.JTextField tg;
    private javax.swing.JTextField tg1;
    private javax.swing.JTextField th;
    private javax.swing.JTextField tr;
    private javax.swing.JTextField tr1;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel uno;
    // End of variables declaration//GEN-END:variables
}
