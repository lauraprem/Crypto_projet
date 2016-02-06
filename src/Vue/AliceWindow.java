package Vue;

import javax.swing.*;
import java.math.BigInteger;

/**
 * Created by Coco on 06/02/2016.
 */

public class AliceWindow extends JFrame {

    // Variables declaration
   /* private JButton jButton1;
    private JLabel jLabelAliceName;
    private JLabel[] jLabelRepons;
    private JLabel jLabelConsignes;
    private JPanel jPanelAlice;
    private JScrollPane[] jScrollPanes;
    private JTextArea[] jTextAreaRepons;*/

    // Variables declaration
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabelConsignes1;
    private JPanel jPanelAlice;
    private JScrollPane jScrollPane10;
    private JScrollPane jScrollPane11;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
    private JScrollPane jScrollPane6;
    private JScrollPane jScrollPane7;
    private JScrollPane jScrollPane8;
    private JScrollPane jScrollPane9;
    private JTextArea jTextArea10;
    private JTextArea jTextArea11;
    private JTextArea jTextArea2;
    private JTextArea jTextArea3;
    private JTextArea jTextArea4;
    private JTextArea jTextArea5;
    private JTextArea jTextArea6;
    private JTextArea jTextArea7;
    private JTextArea jTextArea8;
    private JTextArea jTextArea9;

    public AliceWindow(BigInteger encryptNumQuest) {
        initComponents();
    }

        /**
         * This method is called from within the constructor to initialize the form.
         */
        @SuppressWarnings("unchecked")
        private void initComponents() {

            jPanelAlice = new JPanel();
            jLabelConsignes1 = new JLabel();
            jLabel3 = new JLabel();
            jScrollPane2 = new JScrollPane();
            jTextArea2 = new JTextArea();
            jScrollPane3 = new JScrollPane();
            jTextArea3 = new JTextArea();
            jScrollPane4 = new JScrollPane();
            jTextArea4 = new JTextArea();
            jScrollPane5 = new JScrollPane();
            jTextArea5 = new JTextArea();
            jScrollPane6 = new JScrollPane();
            jTextArea6 = new JTextArea();
            jScrollPane7 = new JScrollPane();
            jTextArea7 = new JTextArea();
            jScrollPane8 = new JScrollPane();
            jTextArea8 = new JTextArea();
            jScrollPane9 = new JScrollPane();
            jTextArea9 = new JTextArea();
            jLabel1 = new JLabel();
            jLabel2 = new JLabel();
            jLabel4 = new JLabel();
            jLabel5 = new JLabel();
            jLabel6 = new JLabel();
            jLabel7 = new JLabel();
            jLabel8 = new JLabel();
            jLabel9 = new JLabel();
            jLabel10 = new JLabel();
            jLabel11 = new JLabel();
            jScrollPane11 = new JScrollPane();
            jTextArea11 = new JTextArea();
            jScrollPane10 = new JScrollPane();
            jTextArea10 = new JTextArea();
            jButton1 = new JButton();

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            jLabelConsignes1.setText("Ecrivez les réponses aux questions.");
            jLabelConsignes1.setToolTipText("");
            jLabelConsignes1.setVerticalAlignment(SwingConstants.TOP);

            jLabel3.setText("Alice");

            jTextArea2.setColumns(20);
            jTextArea2.setRows(5);
            jScrollPane2.setViewportView(jTextArea2);

            jTextArea3.setColumns(20);
            jTextArea3.setRows(5);
            jScrollPane3.setViewportView(jTextArea3);

            jTextArea4.setColumns(20);
            jTextArea4.setRows(5);
            jScrollPane4.setViewportView(jTextArea4);

            jTextArea5.setColumns(20);
            jTextArea5.setRows(5);
            jScrollPane5.setViewportView(jTextArea5);

            jTextArea6.setColumns(20);
            jTextArea6.setRows(5);
            jScrollPane6.setViewportView(jTextArea6);

            jTextArea7.setColumns(20);
            jTextArea7.setRows(5);
            jScrollPane7.setViewportView(jTextArea7);

            jTextArea8.setColumns(20);
            jTextArea8.setRows(5);
            jScrollPane8.setViewportView(jTextArea8);

            jTextArea9.setColumns(20);
            jTextArea9.setRows(5);
            jScrollPane9.setViewportView(jTextArea9);

            jLabel1.setText("jLabel1");

            jLabel2.setText("jLabel2");

            jLabel4.setText("jLabel4");

            jLabel5.setText("jLabel5");

            jLabel6.setText("jLabel6");

            jLabel7.setText("jLabel7");

            jLabel8.setText("jLabel8");

            jLabel9.setText("jLabel9");

            jLabel10.setText("jLabel10");

            jLabel11.setText("jLabel11");

            jTextArea11.setColumns(20);
            jTextArea11.setRows(5);
            jScrollPane11.setViewportView(jTextArea11);

            jTextArea10.setColumns(20);
            jTextArea10.setRows(5);
            jScrollPane10.setViewportView(jTextArea10);

            GroupLayout jPanelAliceLayout = new GroupLayout(jPanelAlice);
            jPanelAlice.setLayout(jPanelAliceLayout);
            jPanelAliceLayout.setHorizontalGroup(
                    jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.TRAILING, jPanelAliceLayout.createSequentialGroup()
                                    .addComponent(jLabelConsignes1, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3)
                                    .addGap(248, 248, 248))
                            .addGroup(jPanelAliceLayout.createSequentialGroup()
                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                                    .addComponent(jScrollPane4))
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane5, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                            .addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                            .addGroup(jPanelAliceLayout.createSequentialGroup()
                                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel7)
                                                            .addComponent(jLabel5)
                                                            .addComponent(jLabel2))
                                                    .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanelAliceLayout.createSequentialGroup()
                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jScrollPane7)
                                                    .addComponent(jScrollPane8, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))
                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelAliceLayout.createSequentialGroup()
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                            .addComponent(jScrollPane6)
                                                            .addComponent(jScrollPane9)
                                                            .addGroup(jPanelAliceLayout.createSequentialGroup()
                                                                    .addComponent(jLabel9)
                                                                    .addGap(0, 0, Short.MAX_VALUE))))
                                            .addGroup(jPanelAliceLayout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(jLabel11)
                                                    .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanelAliceLayout.createSequentialGroup()
                                    .addComponent(jScrollPane11, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane10))
            );
            jPanelAliceLayout.setVerticalGroup(
                    jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAliceLayout.createSequentialGroup()
                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanelAliceLayout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jLabelConsignes1)))
                                    .addGap(19, 19, 19)
                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                            .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                    .addGap(4, 4, 4)
                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelAliceLayout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addComponent(jLabel6))
                                            .addGroup(jPanelAliceLayout.createSequentialGroup()
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel7)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane7, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jScrollPane6, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane8, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jScrollPane9, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane11, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jScrollPane10, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap())
            );

            jButton1.setText("OK");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            GroupLayout layout = new GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelAlice, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(228, 228, 228)
                                    .addComponent(jButton1)
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanelAlice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1)
                                    .addContainerGap())
            );

            pack();
        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            BobResultWindow bobResultWindow = new BobResultWindow();
            bobResultWindow.setVisible(true);
            this.dispose();
        }
    }





    /**
     * This method is called from within the constructor to initialize the form.
     */
   /* @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanelAlice = new JPanel();

        jLabelConsignes = new JLabel();
        jLabelConsignes.setText(ElementsVue.getConsignesAlice());
        jLabelConsignes.setToolTipText("");
        jLabelConsignes.setVerticalAlignment(SwingConstants.TOP);

        jLabelAliceName = new JLabel();
        jLabelAliceName.setText(ElementsVue.getAliceName());

        String[] listQuestion = Questions.getQuestions();
        jTextAreaRepons = new JTextArea[listQuestion.length];
        jScrollPanes = new JScrollPane[listQuestion.length];
        jLabelRepons = new JLabel[listQuestion.length];
        for (int i=0;i<listQuestion.length;i++){
            jTextAreaRepons[i] = new JTextArea();
            jScrollPanes[i] = new JScrollPane();
            jLabelRepons[i] = new JLabel(listQuestion[i]);

            jTextAreaRepons[i].setColumns(20);
            jTextAreaRepons[i].setRows(5);
            jScrollPanes[i].setViewportView(jTextAreaRepons[i]);
        }

        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GroupLayout jPanelAliceLayout = new GroupLayout(jPanelAlice);
        jPanelAlice.setLayout(jPanelAliceLayout);
        jPanelAliceLayout.setHorizontalGroup(
                jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanelAliceLayout.createSequentialGroup()
                                .addComponent(jLabelConsignes, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelAliceName)
                                .addGap(248, 248, 248)));

        listQuestion = Questions.getQuestions();
        for (int i=0;i<listQuestion.length;i=i+2) {
            jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPanes[i], GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jScrollPanes[i + 1])
                    .addComponent(jLabelRepons[i])
                    .addComponent(jLabelRepons[i + 1]);
        }

        jPanelAliceLayout.setVerticalGroup(
                jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelAliceLayout.createSequentialGroup()
                                .addGroup(jPanelAliceLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelAliceName)
                                        .addGroup(jPanelAliceLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabelConsignes)))
                                .addGap(19, 19, 19)));

        jButton1.setText("OK");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelAlice, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(jButton1)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelAlice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addContainerGap())
        );

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        BobResultWindow bobResultWindow = new BobResultWindow();
        bobResultWindow.setVisible(true);
        this.dispose();
    }
}*/
