
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jarumaruk
 */
public class Nodo {

    private arbolbinario root;

    public void Llenar_arbol(String Primer_arbol) {
        //Cambios
        String animal;
        arbolbinario arbol;
        root = new arbolbinario(Primer_arbol);
        do {
            Seguirjugando();
            arbol = root;
            while (arbol.izq != null) {
                if (Caracterisitica(arbol.toString())) {
                    arbol = arbol.izq;
                } else {
                    arbol = arbol.der;
                }
            }
            animal = arbol.toString();
            if (Adivinar(animal)) {
                JOptionPane.showMessageDialog(null,"Adivine");
                continue;
            }
            String nuevo = JOptionPane.showInputDialog("Qué animal era ?");
            String info = JOptionPane.showInputDialog("Qué diferencia a un " + animal + " de un " + nuevo + "? "); 
            arbol.info = info;
            if (Diferencia(animal)) {
                arbol.izq = new arbolbinario(animal);
                arbol.der = new arbolbinario(nuevo);
            } else {
                arbol.der = new arbolbinario(animal);
                arbol.izq = new arbolbinario(nuevo);
            }
        } while (0 == 0);
    }

    public boolean Seguirjugando() {
        String res = JOptionPane.showInputDialog("Estas pensando en un animal ?");
        if (!"s".equals(res.toLowerCase())) {
            res = JOptionPane.showInputDialog("Quieres salir del juego?");
            if (res.equals("si")) {
                System.exit(0);
            }
        }
        return true;
    }

    public boolean Caracterisitica(String caracteristica) {
        String res = JOptionPane.showInputDialog(caracteristica + "?");
        return "s".equals(res.toLowerCase());
    }

    public boolean Adivinar(String Animal) {
        String res = JOptionPane.showInputDialog("Es un " + Animal + " ?");
        return "s".equals(res.toLowerCase());
    }

    public boolean Diferencia(String Animal) {
        String res = JOptionPane.showInputDialog("Si el animal fuera un " + Animal + " cual seria la respuesta? ");
        return "s".equals(res.toLowerCase());
    }
}
