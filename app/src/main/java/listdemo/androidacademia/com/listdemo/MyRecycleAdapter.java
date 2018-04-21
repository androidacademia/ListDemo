package listdemo.androidacademia.com.listdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by girishkumarshakya on 21/04/18.
 */

public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.MyViewHolder> {

    private Context context;
    private String[] proNameList;
    private String[] proPriceList;
    private Integer[] proImageList;
    private LayoutInflater inflater;

    public MyRecycleAdapter(Context context, String[] proNameList, String[] proPriceList, Integer[] proImageList) {
        this.context = context;
        this.proNameList = proNameList;
        this.proPriceList = proPriceList;
        this.proImageList = proImageList;
        inflater = LayoutInflater.from(context);
        Log.i("MyAdapter","MyAdapter()");
    }

    @Override
    public MyRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_list_item, null);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyRecycleAdapter.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(proImageList[position]);
        holder.textViewPN.setText(proNameList[position]);
        holder.textViewPP.setText(proPriceList[position]);
        holder.btnATC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, holder.textViewPN.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return proNameList.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textViewPN;
        TextView textViewPP;
        Button btnATC;
        public MyViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.imageViewProImage);
            textViewPN = view.findViewById(R.id.textViewProName);
            textViewPP = view.findViewById(R.id.textViewProPrice);
            btnATC =view.findViewById(R.id.buttonATC);
        }
    }
}
