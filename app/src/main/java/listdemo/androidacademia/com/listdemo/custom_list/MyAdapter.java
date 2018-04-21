package listdemo.androidacademia.com.listdemo.custom_list;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import listdemo.androidacademia.com.listdemo.R;

/**
 * Created by girishkumarshakya on 21/04/18.
 */

public class MyAdapter extends BaseAdapter {
    private  Context context;
    private String[] proNameList;
    private String[] proPriceList;
    private Integer[] proImageList;
    private LayoutInflater inflater;

    public MyAdapter(Context context, String[] proNameList, String[] proPriceList, Integer[] proImageList) {
        this.context = context;
        this.proNameList = proNameList;
        this.proPriceList = proPriceList;
        this.proImageList = proImageList;
        inflater = LayoutInflater.from(context);
        Log.i("MyAdapter","MyAdapter()");
    }

    @Override
    public int getCount() {
        Log.i("MyAdapter","getCount()");
        return proNameList.length;
    }

    @Override
    public Object getItem(int i) {
        Log.i("MyAdapter","getItem ("+i+")");
        return proNameList[i];
    }

    @Override
    public long getItemId(int i) {
        Log.i("MyAdapter","getItemId("+i+")");
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Log.i("MyAdapter","getView() "+position);

        if(view ==null) {
            view = inflater.inflate(R.layout.custom_list_item, null);
        }

        ImageView imageView = view.findViewById(R.id.imageViewProImage);
        final TextView textViewPN = view.findViewById(R.id.textViewProName);
        TextView textViewPP = view.findViewById(R.id.textViewProPrice);
        Button btnATC =view.findViewById(R.id.buttonATC);
        imageView.setImageResource(proImageList[position]);
        textViewPN.setText(proNameList[position]);
        textViewPP.setText(proPriceList[position]);

        btnATC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, textViewPN.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

























