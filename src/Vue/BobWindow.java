package Vue;

import Utils.BigIntegerUtils;
import Vue.Utils.ElementsVue;
import Vue.Utils.Questions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Coco on 06/02/2016.
 */

public class BobWindow extends JFrame {

    // Variables declaration
    private JToggleButton buttonOkBob;
    private JComboBox<String> jComboBoxQuest;
    private JLabel jLabelBobName;
    private JLabel jLabelConsignes;
    private JPanel jPanelBob;

    public BobWindow() {
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
        setLocation(screenWidth / 4, screenHeight / 4);

        jPanelBob = new JPanel();
        jComboBoxQuest = new JComboBox<>();
        jLabelConsignes = new JLabel();
        buttonOkBob = new JToggleButton();
        jLabelBobName = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jComboBoxQuest.setModel(new DefaultComboBoxModel<>(Questions.getQuestions()));
        jLabelConsignes.setText(ElementsVue.getConsignesBobNum());
        jLabelConsignes.setToolTipText("");
        jLabelConsignes.setVerticalAlignment(SwingConstants.TOP);

        buttonOkBob.setText(ElementsVue.getOk());
        buttonOkBob.setActionCommand("Onclick");
        buttonOkBob.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonOkBobActionPerformed(evt);
            }
        });

        jLabelBobName.setText(ElementsVue.getBobName());

        GroupLayout jPanelBobLayout = new GroupLayout(jPanelBob);
        jPanelBob.setLayout(jPanelBobLayout);
        jPanelBobLayout.setHorizontalGroup(
                jPanelBobLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelConsignes, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanelBobLayout.createSequentialGroup()
                                .addContainerGap(165, Short.MAX_VALUE)
                                .addComponent(jComboBoxQuest, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159))
                        .addGroup(jPanelBobLayout.createSequentialGroup()
                                .addGroup(jPanelBobLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelBobLayout.createSequentialGroup()
                                                .addGap(252, 252, 252)
                                                .addComponent(jLabelBobName))
                                        .addGroup(jPanelBobLayout.createSequentialGroup()
                                                .addGap(231, 231, 231)
                                                .addComponent(buttonOkBob)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBobLayout.setVerticalGroup(
                jPanelBobLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelBobLayout.createSequentialGroup()
                                .addComponent(jLabelBobName)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(jLabelConsignes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxQuest, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonOkBob)
                                .addGap(11, 11, 11)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addContainerGap())
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

    private void buttonOkBobActionPerformed(ActionEvent evt) {
        String idQuestion = jComboBoxQuest.getSelectedIndex()+"";
        // TODO encryption idQuestion
        BigInteger encryptNumQuest = BigIntegerUtils.StringToBigInteger(idQuestion);

        // Gestion des fenêtres
        AliceWindow aliceWindow = new AliceWindow(encryptNumQuest);
        this.setVisible(false);
        aliceWindow.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BobWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(BobWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(BobWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(BobWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BobWindow().setVisible(true);
            }
        });
    }
}
