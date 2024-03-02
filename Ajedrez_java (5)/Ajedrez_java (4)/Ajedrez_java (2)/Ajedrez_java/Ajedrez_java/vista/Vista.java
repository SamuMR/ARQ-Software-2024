package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Vista extends JFrame {

    JPanel panel;
    ImageIcon iconoPeonN;
    ImageIcon iconoAlfilN;
    ImageIcon iconoTorreN;
    ImageIcon iconoDamaN;
    ImageIcon iconoReyN;
    ImageIcon iconoCaballoN;
    ImageIcon iconoPeon;
    ImageIcon iconoAlfil;
    ImageIcon iconoTorre;
    ImageIcon iconoDama;
    ImageIcon iconoRey;
    ImageIcon iconoCaballo;
    //ArrayList<JButton> botones;
    private JButton[] botones;

    public Vista(){
        super("Ajedrez");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        crearIcons();
        panel = new JPanel();
        panel.setLayout(new GridLayout(8, 8));
        crear_botones();
        //moverFicha("7", "12");
    }

    public void crear_botones(){

        boolean par = true;
        botones = new JButton[64];
        int contador = 0;
        //botones = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {

            for (int j = 1; j <= 8; j++) {

                JButton button = new JButton("Botón " + (i * j));
                button.setName("" + (contador));
                button.setText("");
                button.setPreferredSize(new Dimension(80, 80));
                botones[contador] = button;
                contador++;
                panel.add(button);

                if (par == true) {
                    if((i == 1) && (j == 1)){
                        button.setIcon(iconoTorreN);
                    }
                    if((i == 1)&&(j==7)){
                        button.setIcon(iconoCaballoN);
                    }
                    if((i == 1)&&(j==3)){
                        button.setIcon(iconoAlfilN);
                    }
                    if((i == 1)&&(j==5)){
                        button.setIcon(iconoDamaN);
                    }
                    if(i == 2){
                        button.setIcon(iconoPeonN);
                    }
                    if((i == 8)&&(j==8)){
                        button.setIcon(iconoTorre);
                    }
                    if((i == 8)&&(j==2)){
                        button.setIcon(iconoCaballo);
                    }
                    if((i == 8)&&(j==6)){
                        button.setIcon(iconoAlfil);
                    }
                    if((i == 8)&&(j==4)){
                        button.setIcon(iconoDama);
                    }
                    if(i == 7){
                        button.setIcon(iconoPeon);
                    }
                    //botones.add(button);
                    button.setBackground(Color.WHITE);
                    par = false;
                } else {

                    if(i == 7){
                        button.setIcon(iconoPeon);
                    }

                    if((i == 8)&&(j==5)){
                        button.setIcon(iconoRey);
                    }

                    if((i == 8)&&(j==3)){
                        button.setIcon(iconoAlfil);
                    }

                    if((i == 8)&&(j==7)){
                        button.setIcon(iconoCaballo);
                    }

                    if((i == 8)&&(j==1)){
                        button.setIcon(iconoTorre);
                    }
                    if((i == 1)&&(j==2)){
                        button.setIcon(iconoCaballoN);
                    }
                    if((i == 1) && (j == 8)){
                        button.setIcon(iconoTorreN);
                    }
                    if((i == 1)&&(j==6)){
                        button.setIcon(iconoAlfilN);
                    }
                    if((i == 1)&&(j==4)){
                        button.setIcon(iconoReyN);
                    }
                    if(i == 2){
                        button.setIcon(iconoPeonN);
                    }
                    //botones.add(button);
                    button.setBackground(Color.BLACK);
                    par = true;
                }
            }

            if(par == true){
                par = false;
            } 
            else{
                par = true;
            }
        }
        this.getContentPane().add(panel);
        this.pack();
        this.setVisible(true);
        }  
        public static boolean isNull(Object objeto) {
            return objeto == null;
        }
        public void crearIcons(){
            iconoPeonN = new ImageIcon("Ajedrez_java (4)\\Ajedrez_java (2)\\Ajedrez_java\\Ajedrez_java\\Imagenes\\Ficha PeonNegra.png");
            iconoAlfilN = new ImageIcon("Ajedrez_java (2)\\Ajedrez_java\\Ajedrez_java\\Imagenes\\AlfilNegro.png");
            iconoTorreN = new ImageIcon("Ajedrez_java (2)\\Ajedrez_java\\Ajedrez_java\\Imagenes\\TorreNegra.png");
            iconoDamaN = new ImageIcon("Ajedrez_java (2)\\Ajedrez_java\\Ajedrez_java\\Imagenes\\ReyNegro.png");
            iconoReyN = new ImageIcon("Ajedrez_java (2)\\Ajedrez_java\\Ajedrez_java\\Imagenes\\ReinaNegra.png");
            iconoCaballoN = new ImageIcon("Ajedrez_java (2)\\Ajedrez_java\\Ajedrez_java\\Imagenes\\CaballoNegro.png");
            iconoPeon = new ImageIcon("Ajedrez_java (2)\\Ajedrez_java\\Ajedrez_java\\Imagenes\\Ficha Peon.png");
            iconoAlfil = new ImageIcon("Ajedrez_java (2)\\Ajedrez_java\\Ajedrez_java\\Imagenes\\Alfil.png");
            iconoTorre = new ImageIcon("Ajedrez_java (2)\\Ajedrez_java\\Ajedrez_java\\Imagenes\\Torre.png");
            iconoDama = new ImageIcon("Ajedrez_java (2)\\Ajedrez_java\\Ajedrez_java\\Imagenes\\Reina.png");
            iconoRey = new ImageIcon("Ajedrez_java (2)\\Ajedrez_java\\Ajedrez_java\\Imagenes\\Rey.png");
            iconoCaballo = new ImageIcon("Ajedrez_java (2)\\Ajedrez_java\\Ajedrez_java\\Imagenes\\Caballo.png");
        }
        public void posicionarFichas(){
        }
        public void moverFicha(String casillaOrigen, String casillaDestino){

            ImageIcon icono = null;

            for (int i = 0; i < botones.length; i++) {
                if(botones[i].getName().equals(casillaOrigen)){
                    icono = (ImageIcon) botones[i].getIcon();
                    botones[i].setIcon(null);
                }
            }
            for (int i = 0; i < botones.length; i++) {
                if (botones[i].getName().equals(casillaDestino)){
                   botones[i].setIcon(icono);
                }
            }

        }

        public JButton[] getListaDeBotones() {
            return botones;
        }

    }


