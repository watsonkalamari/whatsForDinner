package com.example.whatsfordinner.db.entity;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.whatsfordinner.R;

import java.util.List;

@Entity(tableName = "recipes")
public class Recipe {

    @PrimaryKey(autoGenerate = true)
    private Integer recipe_id;
    @ColumnInfo(name="recipe_name")
    private String name;
    private String recipe_description;
  /*  @ColumnInfo(name = "ingredient")
    @ColumnInfo(name="recipe_desc")
    private String description;

    @ColumnInfo(name = "ingredient")

    /*
    @Embedded
    private Ingredient ingredient;
    private List<String> ingredientList=null;

    private String direction;
    private List<String> instructionList;
*/
    private String recipe_image;
    /*private boolean isSaved;*/

    public Recipe(){
       /* isSaved=false;*/
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipe_description() {
        return recipe_description;
    }

    public void setRecipe_description(String recipe_description) {
        this.recipe_description = recipe_description;
    }

    public Integer getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(Integer recipe_id) {
        this.recipe_id = recipe_id;
    }

    public String getRecipe_image() {
        return recipe_image;
    }

    public void setRecipe_image(String recipe_image) {
        this.recipe_image = recipe_image;
    }




  /*  public Ingredient getIngredient() {

    public String getDescription(){return description;}
    public void setDescription(String description){
        this.description = description;
    }

  /*
    public Ingredient getIngredient() {

        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }*/

   /* public boolean isSaved() {
        return isSaved;
    }

    public void setSaved(boolean saved) {
        isSaved = saved;
    }

*/
}
