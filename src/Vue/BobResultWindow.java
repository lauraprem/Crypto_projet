package Vue;

import Encryption.Bob;
import Utils.BigIntegerUtils;

import javax.swing.*;
import javax.swing.text.Element;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Coco on 06/02/2016.
 */

public class BobResultWindow extends JFrame {

    // Variables declaration
    private JLabel jLabelRecept;
    private JLabel jLabelConsignes;
    private JLabel jLabelBobName;
    private JPanel jPanelBob;
    private JToggleButton jToggleButton1;
    private Bob bob;

    public BobResultWindow(Bob bob) {
        ArrayList<BigInteger> reponsesAlice =  bob.setReponsesDecryptees();
        System.out.println(bob.setReponsesDecryptees());
        String  tmp = "";
        for(int i=0; i < reponsesAlice.size();i++){
            tmp = tmp +" "+ BigIntegerUtils.parseToString(reponsesAlice.get(i));
        }

        initComponents();

        jLabelRecept.setText(BigIntegerUtils.parseToString(bob.setReponsesDecryptees().get(Integer.parseInt(BigIntegerUtils.parseToString(bob.getQuestion()))-1)));
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
        setLocation(screenWidth / 4, screenHeight / 4);

        jPanelBob = new JPanel();
        jLabelRecept = new JLabel();
        jLabelConsignes = new JLabel("Voici la réponse :");
        jLabelBobName = new JLabel("Bob");
        jToggleButton1 = new JToggleButton("Quitter");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabelRecept.setVerticalAlignment(SwingConstants.TOP);
        jLabelRecept.setVerticalTextPosition(SwingConstants.BOTTOM);

        jToggleButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        GroupLayout jPanelBobLayout = new GroupLayout(jPanelBob);
        jPanelBob.setLayout(jPanelBobLayout);
        jPanelBobLayout.setHorizontalGroup(
                jPanelBobLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelBobLayout.createSequentialGroup()
                                .addGroup(jPanelBobLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelBobLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabelRecept, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanelBobLayout.createSequentialGroup()
                                                .addGroup(jPanelBobLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanelBobLayout.createSequentialGroup()
                                                                .addGap(252, 252, 252)
                                                                .addComponent(jLabelBobName))
                                                        .addGroup(jPanelBobLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabelConsignes)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanelBobLayout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(jToggleButton1)
                                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanelBobLayout.setVerticalGroup(
                jPanelBobLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelBobLayout.createSequentialGroup()
                                .addComponent(jLabelBobName)
                                .addGap(22, 22, 22)
                                .addComponent(jLabelConsignes)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelRecept, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton1)
                                .addContainerGap(48, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelBob, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelBob, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jToggleButton1ActionPerformed(ActionEvent evt) {

        // Ferme la fenêtre
        this.dispose();
    }
}
