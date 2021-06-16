/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author DAW-A
 */
public class Utilidades {
        public static ArrayList<String> Grados(){
        int gradoPr=0;
        ArrayList<String>listaGrados=new ArrayList<String>();
        for(int i=0;i<=18;i++){
          gradoPr=gradoPr+10;
          listaGrados.add(String.valueOf(gradoPr));
        }
        return listaGrados;
        
    }
        public static double gradosAradianes(int grado){
            double angulo=grado*Math.PI/180;
            return angulo;
        
        }
        
        public static ArrayList<Coordenada>getCoordenadas(double alcance, double velocidadIni, int angulo){
            double intervalo=alcance/10;
            ArrayList<Coordenada> listaCoordenadas= new ArrayList<Coordenada>();
            for(int i = 0; i<10; i++){
                double x = intervalo*i;
                double y= (x * Math.tan(Utilidades.gradosAradianes(angulo)))-(9.8*Math.pow(x,2))/((2*Math.pow(velocidadIni, 2))*Math.pow(Math.cos(Utilidades.gradosAradianes(angulo)), 2));
                Coordenada miCoordenada= new Coordenada(x,y);
                listaCoordenadas.add(miCoordenada);
                
            }
            return listaCoordenadas;
        }
            
            
            
        }
    

