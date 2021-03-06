package com.example.whatsfordinner.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.example.whatsfordinner.R;
import com.example.whatsfordinner.db.entity.Ingredient;
import com.example.whatsfordinner.db.entity.ShoppingList;

public class ShoppingListAdapter extends RecyclerView.Adapter {

    private List<Ingredient> mItems = new ArrayList<>();
    private final LayoutInflater inflater;
    private Context mContext;


    public void updateItems(List<Ingredient> ingredients) {
        this.mItems = ingredients;
        notifyDataSetChanged();
    }

    public ShoppingListAdapter(Context context){
        mContext=context;
        inflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.shopping_list_page_single_line, parent, false);
        return new IngredientViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Ingredient ingredient = mItems.get(position);
        IngredientViewHolder vh = (IngredientViewHolder) holder;
        //TODO::make a query that gets the ingredients that are in the person's shopping cart
        vh.ingredient.setText(ingredient.getIngredient_name());
    }

    public void setShoppingList(List<Ingredient>shoppingList){
        mItems=shoppingList;
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        return this.mItems.size();
    }

    public class IngredientViewHolder extends RecyclerView.ViewHolder {

        public ConstraintLayout containerLyt;
        public TextView ingredient;
        public CheckBox yesOrNo;

        public IngredientViewHolder(View v) {
            super(v);
            containerLyt = v.findViewById(R.id.container);
            ingredient = v.findViewById(R.id.ingredient);
            yesOrNo = v.findViewById(R.id.ingredient_cbx);
        }
    }
}