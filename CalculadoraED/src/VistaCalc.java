/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alonsozama
 * Una vista de una calculadora con operadores basicos
 */
public class VistaCalc extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public VistaCalc() {
        initComponents();
    }
    StringBuilder sb = new StringBuilder();
    private StringBuilder ultNum = new StringBuilder();
    boolean num=true;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        division = new javax.swing.JButton();
        numCuatro = new javax.swing.JButton();
        delAll = new javax.swing.JButton();
        potencia = new javax.swing.JButton();
        numTres = new javax.swing.JButton();
        parDer = new javax.swing.JButton();
        numDos = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        parIzq = new javax.swing.JButton();
        numUno = new javax.swing.JButton();
        numCero = new javax.swing.JButton();
        numNueve = new javax.swing.JButton();
        numOcho = new javax.swing.JButton();
        cambioSIg = new javax.swing.JButton();
        numSiete = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        numSeis = new javax.swing.JButton();
        numCinco = new javax.swing.JButton();
        res = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pantalla = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setForeground(java.awt.Color.white);

        division.setText("÷");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        numCuatro.setText("4");
        numCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numCuatroActionPerformed(evt);
            }
        });

        delAll.setBackground(new java.awt.Color(0, 102, 255));
        delAll.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delAll.setText("AC");
        delAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delAllActionPerformed(evt);
            }
        });

        potencia.setText("^");
        potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaActionPerformed(evt);
            }
        });

        numTres.setText("3");
        numTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTresActionPerformed(evt);
            }
        });

        parDer.setText(")");
        parDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parDerActionPerformed(evt);
            }
        });

        numDos.setText("2");
        numDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numDosActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 102, 255));
        delete.setText("⌫");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        parIzq.setText("(");
        parIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parIzqActionPerformed(evt);
            }
        });

        numUno.setText("1");
        numUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numUnoActionPerformed(evt);
            }
        });

        numCero.setText("0");
        numCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numCeroActionPerformed(evt);
            }
        });

        numNueve.setText("9");
        numNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numNueveActionPerformed(evt);
            }
        });

        numOcho.setText("8");
        numOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOchoActionPerformed(evt);
            }
        });

        cambioSIg.setText("+/-");
        cambioSIg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioSIgActionPerformed(evt);
            }
        });

        numSiete.setText("7");
        numSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSieteActionPerformed(evt);
            }
        });

        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        multi.setText("x");
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });

        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        numSeis.setText("6");
        numSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSeisActionPerformed(evt);
            }
        });

        numCinco.setText("5");
        numCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numCincoActionPerformed(evt);
            }
        });
        numCinco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numCincoKeyPressed(evt);
            }
        });

        res.setText("=");
        res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resActionPerformed(evt);
            }
        });

        pantalla.setColumns(20);
        pantalla.setRows(5);
        pantalla.setText("Bienvenido a la calculadora Casi-O\nPresione AC para comenzar :)");
        jScrollPane1.setViewportView(pantalla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numUno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numDos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numTres, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cambioSIg, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numCero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(parIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(parDer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(delAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(multi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resta)
                    .addComponent(suma)
                    .addComponent(parIzq)
                    .addComponent(parDer)
                    .addComponent(delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multi)
                    .addComponent(division)
                    .addComponent(numSiete)
                    .addComponent(numOcho)
                    .addComponent(numNueve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(potencia)
                    .addComponent(decimal)
                    .addComponent(numCuatro)
                    .addComponent(numCinco)
                    .addComponent(numSeis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cambioSIg)
                    .addComponent(numDos)
                    .addComponent(numTres)
                    .addComponent(numUno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(res)
                    .addComponent(numCero))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        sb.append("/");
        num=false;
        ultNum.delete(0, 1000);
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_divisionActionPerformed

    private void numCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCuatroActionPerformed
        sb.append("4");
        ultNum.append("4");
        num=true;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_numCuatroActionPerformed

    private void delAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delAllActionPerformed
        sb.delete(0, sb.length());
        ultNum.delete(0, 1000);
        num=false;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_delAllActionPerformed

    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaActionPerformed
        sb.append("^");
        ultNum.delete(0, 1000);
        num=false;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_potenciaActionPerformed

    private void numTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTresActionPerformed
        sb.append("3");
        ultNum.append("3");
        num=true;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_numTresActionPerformed

    private void parDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parDerActionPerformed
        sb.append(")");
        ultNum.delete(0, 1000);
        num=false;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_parDerActionPerformed

    private void numDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDosActionPerformed
        sb.append("2");
        ultNum.append("2");
        num=true;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_numDosActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(!sb.isEmpty()){
            sb.deleteCharAt(sb.length() - 1);
            char c = evt.toString().charAt(0);
            System.out.println(c);
            if(num){
                ultNum.deleteCharAt(ultNum.length()-1);
            }
            pantalla.setText(sb.toString());
        }   
    }//GEN-LAST:event_deleteActionPerformed

    private void parIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parIzqActionPerformed
        sb.append("(");
        ultNum.delete(0, 1000);
        num=false;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_parIzqActionPerformed

    private void numUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numUnoActionPerformed
        sb.append("1");
        ultNum.append("1");
        num=true;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_numUnoActionPerformed

    private void numCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCeroActionPerformed
        sb.append("0");
        ultNum.append("0");
        num=true;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_numCeroActionPerformed

    private void numNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numNueveActionPerformed
        sb.append("9");
        ultNum.append("9");
        num=true;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_numNueveActionPerformed

    private void numOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOchoActionPerformed
        sb.append("8");
        ultNum.append("8");
        num=true;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_numOchoActionPerformed

    private void cambioSIgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioSIgActionPerformed
        PilaA<Character> aux = new PilaA<Character>();
        String num = ultNum.toString();
        
        sb.delete(sb.length()-ultNum.length(), sb.length());
        for(int i=num.length()-1; i>=0;i--){
            aux.push(num.charAt(i)); 
        }
        aux.push('-');
        aux.push('(');
        ultNum.delete(0, 1000);
        while(!aux.isEmpty()){
           ultNum.append(aux.pop());
        }
        sb.append(ultNum.toString());
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_cambioSIgActionPerformed

    private void numSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSieteActionPerformed
        sb.append("7");
        ultNum.append("7");
        num=true;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_numSieteActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        sb.append("+");
        ultNum.delete(0, 1000);
        num=false;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_sumaActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        sb.append("-");
        ultNum.delete(0, 1000);
        num=false;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_restaActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed
        sb.append("*");
        ultNum.delete(0, 1000);
        num=false;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_multiActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        sb.append(".");
        ultNum.append(".");
        num=true;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_decimalActionPerformed

    private void numSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSeisActionPerformed
        sb.append("6");
        ultNum.append("6");
        num=true;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_numSeisActionPerformed

    private void numCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCincoActionPerformed
        sb.append("5");
        ultNum.append("5");
        num=true;
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_numCincoActionPerformed

    private void numCincoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numCincoKeyPressed
        // TODO add your handling code here:
        //ESTO QUE ES??
    }//GEN-LAST:event_numCincoKeyPressed

    private void resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resActionPerformed
        String input = sb.toString();
        
        sb.delete(0, 1000);
        ultNum.delete(0, 1000);
        if(PruebasValidas.operadoresJuntos(input)){
            sb.append(Calcular.calcular(Calcular.pasarALista(input)));
            ultNum.append(sb.toString());
        }
        else{
            sb.append("Error");
        }
        //pantalla.setText(Calcular.calcular(Calcular.pasarALista(input))+"");
        if(sb.toString().equals("Infinity")){
            sb.delete(0, 1000);
            sb.append("Error");
        }
        pantalla.setText(sb.toString());
    }//GEN-LAST:event_resActionPerformed

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
            java.util.logging.Logger.getLogger(VistaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambioSIg;
    private javax.swing.JButton decimal;
    private javax.swing.JButton delAll;
    private javax.swing.JButton delete;
    private javax.swing.JButton division;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton multi;
    private javax.swing.JButton numCero;
    private javax.swing.JButton numCinco;
    private javax.swing.JButton numCuatro;
    private javax.swing.JButton numDos;
    private javax.swing.JButton numNueve;
    private javax.swing.JButton numOcho;
    private javax.swing.JButton numSeis;
    private javax.swing.JButton numSiete;
    private javax.swing.JButton numTres;
    private javax.swing.JButton numUno;
    private javax.swing.JTextArea pantalla;
    private javax.swing.JButton parDer;
    private javax.swing.JButton parIzq;
    private javax.swing.JButton potencia;
    private javax.swing.JButton res;
    private javax.swing.JButton resta;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
