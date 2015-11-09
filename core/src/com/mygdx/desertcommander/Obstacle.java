package com.mygdx.desertcommander;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import com.badlogic.gdx.math.Rectangle;

/**
 * Created by jordan on 11/4/15.
 */
public class Obstacle {

    private Vector2 Position;
    private boolean isDeadly;
    private Rectangle hitBox;
    private Texture PTexture;
    private boolean isActive;

    public Obstacle(Vector2 position, boolean deadly, Texture texture){
        isActive = true;
        Position = position;
        isDeadly = deadly;
        PTexture = texture;
        hitBox = new Rectangle();
        setHitboxSize(PTexture.getWidth(), PTexture.getHeight(),0,0);
    }

    public boolean isCollided(Rectangle otherRect){

        if(hitBox.overlaps(otherRect)){
            return true;
        }
        else{
            return false;
        }
    }

    public void draw(SpriteBatch spriteBatch){
        spriteBatch.draw(PTexture, Position.x, Position.y);
    }
    public void setHitboxSize(float width, float height, float widthOffset, float heightOffset){
        hitBox.setWidth(width - widthOffset);
        hitBox.setHeight(height - heightOffset);
    }
    public boolean getActive(){
        return isActive;
    }
    public void setActive(boolean newActive){
        isActive = newActive;
    }

    public Vector2 getPosition(){
        return Position;
    }
    public void setPosition(Vector2 newPos){
        Position = newPos;
    }
    public boolean getisDeadly(){
        return isDeadly;
    }
    public Rectangle getHitBox(){
        return hitBox;
    }

}