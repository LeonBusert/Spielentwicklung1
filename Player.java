/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoveTest;

import java.awt.Rectangle;


public class Player {
    private Rectangle bounding;
    private float f_posx;
    private float f_posy;
    private int worldsize_x;
    private int worldsize_y;
    
    public Player(int x, int y, int size, int worldsize_x, int worldsize_y) {
        bounding = new Rectangle(x, y, size, size);
        f_posx = x;
        f_posy = y;
        this .worldsize_x=worldsize_x;
        this .worldsize_y=worldsize_y;
    }
    
    public void update(float timeSinceLastFrame, boolean up, boolean down, boolean left, boolean right){
        if(up)f_posy-=300*timeSinceLastFrame;
            if(down)f_posy+=300*timeSinceLastFrame;
            if(right)f_posx+=300*timeSinceLastFrame;
            if(left)f_posx-=300*timeSinceLastFrame;
            
            if(f_posx<0)f_posx=0;
            if(f_posy<0)f_posy=0;
            if(f_posx>worldsize_x-bounding.width)f_posx=worldsize_x-bounding.width;
            if(f_posy>worldsize_y-bounding.height)f_posy=worldsize_y-bounding.height;
            
            bounding.x=(int)f_posx;
            bounding.y=(int)f_posy;
            
    }
    
    public Rectangle getBounding(){
        return bounding;
    }
    
}
