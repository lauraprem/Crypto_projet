package Vue;

import Encryption.solution1.Alice;
import Encryption.solution1.Bob;
import Utils.BigIntegerUtils;
import Vue.Utils.ElementsVue;
import Vue.Utils.Questions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.util.ArrayList;

import static javax.swing.JOptionPane.showMessageDialog;

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
    private Bob bob;

    public AliceWindow(Bob bob) {
        this.bob = bob;
        initComponents();
    }

        /**
         * This method is called from within the constructor to initialize the form.
         */
        @SuppressWarnings("unchecked")
        private void initComponents() {

            // Obtenir la résolution de l'écran
            Toolkit kit = Toolkit.getDefaultToolkit();
            Dimension screenSize = kit.getScreenSize();
            int screenHeight = screenSize.height;
            int screenWidth = screenSize.width;

            // Centrer la fenêtre dans l'écran
            setSize(screenWidth / 2, screenHeight / 2);
            setLocation(screenWidth / 4, screenHeight / 8);

            String[] questions = Questions.getQuestions();

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
            jLabel1 = new JLabel(questions[0]);
            jLabel2 = new JLabel(questions[1]);
            jLabel4 = new JLabel(questions[2]);
            jLabel5 = new JLabel(questions[3]);
            jLabel6 = new JLabel(questions[4]);
            jLabel7 = new JLabel(questions[5]);
            jLabel8 = new JLabel(questions[6]);
            jLabel9 = new JLabel(questions[7]);
            jLabel10 = new JLabel(questions[8]);
            jLabel11 = new JLabel(questions[9]);
            jScrollPane11 = new JScrollPane();
            jTextArea11 = new JTextArea();
            jScrollPane10 = new JScrollPane();
            jTextArea10 = new JTextArea();
            jButton1 = new JButton();

            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            jLabelConsignes1.setText(ElementsVue.getConsignesAlice());
            jLabelConsignes1.setToolTipText("");
            jLabelConsignes1.setVerticalAlignment(SwingConstants.TOP);

            jLabel3.setText(ElementsVue.getAliceName());

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
            // Vérification que toutes les réponses ont été données
            if (!jTextArea2.getText().equals("") && !jTextArea3.getText().equals("")
                    && !jTextArea4.getText().equals("") && !jTextArea5.getText().equals("")
                    && !jTextArea6.getText().equals("") && !jTextArea7.getText().equals("")
                    && !jTextArea8.getText().equals("") && !jTextArea9.getText().equals("")
                    && !jTextArea10.getText().equals("") && !jTextArea11.getText().equals("")) {

                // Récupération des réponses de Alice
                ArrayList<BigInteger> aliceReponses = new ArrayList<BigInteger> ();
                aliceReponses.add(BigIntegerUtils.StringToBigInteger(jTextArea2.getText()));
                aliceReponses.add(BigIntegerUtils.StringToBigInteger(jTextArea3.getText()));
                aliceReponses.add(BigIntegerUtils.StringToBigInteger(jTextArea4.getText()));
                aliceReponses.add(BigIntegerUtils.StringToBigInteger(jTextArea5.getText()));
                aliceReponses.add(BigIntegerUtils.StringToBigInteger(jTextArea6.getText()));
                aliceReponses.add(BigIntegerUtils.StringToBigInteger(jTextArea7.getText()));
                aliceReponses.add(BigIntegerUtils.StringToBigInteger(jTextArea8.getText()));
                aliceReponses.add(BigIntegerUtils.StringToBigInteger(jTextArea9.getText()));
                aliceReponses.add(BigIntegerUtils.StringToBigInteger(jTextArea10.getText()));
                aliceReponses.add(BigIntegerUtils.StringToBigInteger(jTextArea11.getText()));

                Alice alice = new Alice(aliceReponses,bob.publicKey());

                //Bob donne l'encryption du numéro de question choisi
                alice.setQuestion(bob.getI());

                //Alice donne la liste des réponses masquées et encryptées
                bob.setReponsesEncryptees(alice.generateValeursMasquees());

                // Gestion des fenêtres
                BobResultWindow bobResultWindow = new BobResultWindow(bob);
                bobResultWindow.setVisible(true);
                this.dispose();

            } else {
                showMessageDialog(null, "Répondez à toutes les questions !",
                        "Attention : Réponses manquantes",
                        JOptionPane.WARNING_MESSAGE); //JOptionPane.ERROR_MESSAGE
            }
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
