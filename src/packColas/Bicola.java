/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packColas;

/**
 *
 * @author SP-DR
 */
public class Bicola extends ColaCir
{

    public Bicola(int t)
    {
        super(t);
    }

    public Object BicolaER()//Eliminar pero Fin
    {

        Object x = c[fin];
        if (fin == frente)
        {
            fin = frente = -1;
        } else if (fin== 0)
        {
           fin = c.length-1;
            
        }  else
        {
            fin--;
            
        }

        return x;
    }

}
