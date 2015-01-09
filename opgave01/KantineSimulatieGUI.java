import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.*;

import java.util.ArrayList;

public class KantineSimulatieGUI extends JFrame {

    private JLabel lblArtikelNaam;
    private JTextField txtArtikelNaam;
    private JLabel lblArtikelPrijs;
    private JTextField txtArtikelPrijs;
    private JButton btnArtikelToevoegen;

    private JLabel lblAantalDagen;
    private JTextField txtAantalDagen;
    private JButton btnSimuleer;

    private ArrayList<String> artikelNamen;
    private ArrayList<Double> artikelPrijzen;

    public static void main(String[] args){
        KantineSimulatieGUI kantineSimGUI = new KantineSimulatieGUI();
    }

    public KantineSimulatieGUI(){
        artikelNamen = new ArrayList<String>();
        artikelPrijzen = new ArrayList<Double>();
        makeFrame();
    }

    private void makeFrame(){

        makeMenuBar();
        JPanel contentPane = (JPanel)this.getContentPane();
        contentPane.setBorder(new EmptyBorder(6,6,6,6));
        contentPane.setLayout(new BorderLayout());

        JPanel toevoegPanel = new JPanel();
        toevoegPanel.setLayout(new GridLayout(0, 5, 6, 6));

        lblArtikelNaam = new JLabel("Artikelnaam: ");
        toevoegPanel.add(lblArtikelNaam);

        txtArtikelNaam = new JTextField("");
        toevoegPanel.add(txtArtikelNaam);

        lblArtikelPrijs = new JLabel("Artikelprijs: ");
        toevoegPanel.add(lblArtikelPrijs);

        txtArtikelPrijs = new JTextField("");
        toevoegPanel.add(txtArtikelPrijs);

        btnArtikelToevoegen = new JButton("Toevoegen");
        btnArtikelToevoegen.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    btnArtikelToevoegen_click();
                }
            });
        toevoegPanel.add(btnArtikelToevoegen);

        contentPane.add(toevoegPanel, BorderLayout.NORTH);

        JPanel bottomToolbar = new JPanel();
        bottomToolbar.setLayout(new GridLayout(0,3,6,6));

        lblAantalDagen = new JLabel("Aantal dagen: ");
        bottomToolbar.add(lblAantalDagen);

        txtAantalDagen = new JTextField("");
        bottomToolbar.add(txtAantalDagen);

        btnSimuleer = new JButton("Start de Simulatie!! :)");
        btnSimuleer.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    btnSimuleer_click();
                }
            });
        bottomToolbar.add(btnSimuleer);

        contentPane.add(bottomToolbar, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    /**
     * Actie die wordt uitgevoerd als er op de btnArtikelToevoegen
     * wordt geklikt
     */
    private void btnArtikelToevoegen_click(){
        try{

            String artikelNaam = txtArtikelNaam.getText();
            double artikelPrijs = Double.parseDouble(txtArtikelPrijs.getText());

            if(artikelNaam.length() > 0  && artikelNaam != null 
            && artikelPrijs != 0)
            {
                artikelNamen.add(artikelNaam);
                artikelPrijzen.add(artikelPrijs);

                System.out.println(artikelNaam + " " + artikelPrijs);
            }
            else {
                System.out.println("Vul aub geldige waardes in");
            }

        }
        catch(NumberFormatException ex){
            System.out.println("Vul nou gewoon een double in man");
        }
        txtArtikelNaam.setText("");
        txtArtikelPrijs.setText("");
    }

    /**
     * Actie die wordt uitgevoerd als er op de btnSimuleer
     * wordt geklikt
     */
    private void btnSimuleer_click(){
        try{
            int aantalDagen = Integer.parseInt(txtAantalDagen.getText());

            if(artikelNamen.size() > 0 && artikelPrijzen.size() > 0){
                String[] namen = artikelNamen.toArray(new String[artikelNamen.size()]);
                Double[] tempPrijzen = artikelPrijzen.toArray(new Double[artikelPrijzen.size()]);
                double[] prijzen = new double[tempPrijzen.length];
                
                for(int i = 0; i < tempPrijzen.length; i++){
                    prijzen[i] = tempPrijzen[i];
                }
                
                KantineSimulatie kantineSimulatie = new KantineSimulatie(namen, prijzen);
                kantineSimulatie.simuleer(aantalDagen);
            } else {
                KantineSimulatie kantineSimulatie = new KantineSimulatie();
                kantineSimulatie.simuleer(aantalDagen);
            }
        }
        catch(NumberFormatException ex){
            System.out.println("Vul nou gewoon een integer in man.");
        }
    }

    private void makeMenuBar(){
        final int SHORTCUT_MASK = Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();

        JMenuBar menubar = new JMenuBar();
        this.setJMenuBar(menubar);
        JMenu fileMenu = new JMenu("File");

        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
        quitItem.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            });
        fileMenu.add(quitItem);
        menubar.add(fileMenu);
    }
}
