
package com.example.selection;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.selection.R;

import java.util.ArrayList;


public class MenuSavedCardFragment extends Fragment {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private ArrayList<Item> items = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MenuSavedCardFragment() {
        // Required empty public constructor
    }


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment menu_possess_card.
     */
    // TODO: Rename and change types and number of parameters
    public static MenuSavedCardFragment newInstance(String param1, String param2) {
        MenuSavedCardFragment fragment = new MenuSavedCardFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    private class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textview); // itemview.xml에 정의된 ID를 사용합니다.
            imageView = itemView.findViewById(R.id.imageview); // itemview.xml에 정의된 ID를 사용합니다.
        }
    }
    private class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
        Context context;
        ArrayList<Item> items;

        public MyAdapter(Context context, ArrayList<Item> items) {
            this.context = context;
            this.items = items;
        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(context).inflate(R.layout.itemview, parent, false);
            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            Item item = items.get(position);
            holder.textView.setText(item.getText());
            holder.imageView.setImageResource(item.getImg());
        }

        @Override
        public int getItemCount() {
            return items.size();
        }
    }
    class Item {
        private String text;
        private int img;

        public Item(String text, int img) {
            this.text = text;
            this.img = img;
        }

        public String getText() {
            return text;
        }

        public int getImg() {
            return img;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("YJH", "onCreateView");
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_menu_possess_card, container, false);
        View view = inflater.inflate(R.layout.fragment_menu_possess_card, container, false);
        items.add(new Item("A",R.drawable.kookmin16));
        items.add(new Item("B",R.drawable.kookmin6));
        items.add(new Item("C",R.drawable.kookmin42));
        items.add(new Item("D",R.drawable.shinhancard5));
        items.add(new Item("E",R.drawable.shinhancard22));
        recyclerView = view.findViewById(R.id.recyclerview); // fragment_menu_possess_card.xml에 정의된 RecyclerView ID를 사용합니다.
        adapter = new MyAdapter(requireContext(), items);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        return view;
    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
//        super.onViewCreated(view, savedInstanceState);
//        Intent intent = new Intent(getActivity(),MenuPossessCard.class);
//        //intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
//        startActivity(intent);
//    }
}