package dispositivosip;

import java.util.Collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ernesto
 */
public interface INodoTrie {

    void buscarDispositivos(String subred, Collection<Dispositivo> dispositivos);
    void insertar(Dispositivo dispositivo);
    
}