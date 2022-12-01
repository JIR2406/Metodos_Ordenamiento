/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packColas;

/**
 *
 * @author SP-DR
 */
public class ColaCir
{

    protected int fin, frente;
    protected Object c[];

    public ColaCir(int t)
    {
        c = new Object[t];
        frente = fin = -1;
    }

    public boolean empty()
    {
        if (frente == -1 && fin == -1)
        {
            return true;
        }
        return false;
    }

    public void insert(Object x)
    {
        if (empty())
        {
            frente = fin = 0;
        } else if (fin == c.length - 1)
        {
            fin = 0;
        } else
        {
            fin++;
        }

        c[fin] = x;
    }

    public Object remove()
    {
        Object x = c[frente];
        if (frente == fin){
            frente = fin = -1;
        } else if (frente == c.length - 1)
        {
            frente = 0;
        }else frente++;

        return x;
    }
    public boolean full(){
        if (frente==0 && fin==frente-1)
        {
            return true;
        }else if(frente==0&& fin ==c.length-1)
            return true;
        return false;
    }
    
    
}
