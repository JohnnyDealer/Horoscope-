package com.example.windowmain.semen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.windowmain.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Affairs extends AppCompatActivity {

    List<Item1> itemsList = new ArrayList<>();
    Drawable drawable = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affairs);
        setInitialData();
        RecyclerView recyclerView =  findViewById(R.id.recyclerView);
        LinkAdapter adapter = new LinkAdapter(this, itemsList);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData(){

        itemsList.add(new Item1 ("Aries", R.drawable.aries));
        itemsList.add(new Item1 ("Taurus", R.drawable.taurus));
        itemsList.add(new Item1 ("Gemini", R.drawable.gemini));
        itemsList.add(new Item1 ("Cancer", R.drawable.cancer));
        itemsList.add(new Item1 ("Leo", R.drawable.leo));
        itemsList.add(new Item1 ("Virgo", R.drawable.virgo));
        itemsList.add(new Item1 ("Libra", R.drawable.libra));
        itemsList.add(new Item1 ("Scorpio", R.drawable.scorpio));
        itemsList.add(new Item1 ("Sagittarius", R.drawable.sagitariuos));
        itemsList.add(new Item1 ("Capricorn", R.drawable.capricorn));
        itemsList.add(new Item1 ("Aquarius", R.drawable.aquarius));
        itemsList.add(new Item1 ("Pisces", R.drawable.pisces));
    }

    class LinkAdapter extends RecyclerView.Adapter<LinkAdapter.ViewHolder> {

        private LayoutInflater inflater;
        private List<Item1> itemsList;

        LinkAdapter(Context context, List<Item1> itemsList) {
            this.itemsList = itemsList;
            this.inflater = LayoutInflater.from(context);
        }

        @Override
        public LinkAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = inflater.inflate(R.layout.item_layout, parent, false);
            return new ViewHolder(view);
        }


        @Override
        public void onBindViewHolder(LinkAdapter.ViewHolder holder, int position) {
            final Item1 item = itemsList.get(position);
            holder.imageView.setImageResource(item.getImage());
            holder.textView.setText(item.getText());
            holder.textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String temp = item.getText();
                    int drawable = item.getImage();
                    Action(temp, drawable);
                }
            });
        }

        @Override
        public int getItemCount() {
            return itemsList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            final ImageView imageView;
            final TextView textView;

            ViewHolder(View view) {
                super(view);
                imageView = view.findViewById(R.id.image);
                textView = view.findViewById(R.id.text);
            }
        }

    }

    public void Action(String temp, int drawable){
        Intent intent = new Intent(".PageActivity");
        intent.putExtra("temp",temp);
        intent.putExtra("drawable",drawable);
        startActivity(intent);
    }

}