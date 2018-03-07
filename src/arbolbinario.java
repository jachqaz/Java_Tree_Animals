

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jarumaruk
 */
public class arbolbinario {

    public arbolbinario izq;
    public arbolbinario der;
    public String info;

    public arbolbinario(arbolbinario izquierda, arbolbinario derecha, String cargar) {
        this.izq = izquierda;
        this.der = derecha;
        this.info = cargar;
    }

    public arbolbinario(String cargar) {
        this.izq = null;
        this.der = null;
        this.info = cargar;
    }

    @Override
    public String toString() {
        return info;
    }
}
