/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameweek4;

/**
 *
 * @author ryan
 */
public class Uno extends Card{
    
    public Uno(UnoSuit suit,UnoValue v)
    {
        super(suit,v);
    }
    @Override
    public UnoSuit getUnoSuit()
    {return super.getUnoSuit();}
    @Override
    public UnoValue getUnoValue()
    {return super.getUnoValue();}
    
}
