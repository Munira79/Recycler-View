package com.example.recyclerview;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecipeListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

        RecyclerView recipeRecyclerView = findViewById(R.id.recipeRecyclerView);
        recipeRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Sample recipe data
        ArrayList<Recipe> recipeList = new ArrayList<>();
        recipeList.add(new Recipe("Biriyani", "Cook rice and meat with spices, then layer and simmer.", R.drawable.img));
        recipeList.add(new Recipe("Pasta", "Boil pasta, toss with sauce, and serve", R.drawable.img_1));
        recipeList.add(new Recipe("Shawarma", "Marinate meat, grill, slice, and serve in pita with toppings.", R.drawable.img_2));
        recipeList.add(new Recipe("Biriyani", "Cook rice and meat with spices, then layer and simmer.", R.drawable.img));
        recipeList.add(new Recipe("Pasta", "Boil pasta, toss with sauce, and serve", R.drawable.img_1));
        recipeList.add(new Recipe("Shawarma", "Marinate meat, grill, slice, and serve in pita with toppings.", R.drawable.img_2));

        // Set adapter
        RecipeAdapter adapter = new RecipeAdapter(recipeList);
        recipeRecyclerView.setAdapter(adapter);
    }
}
