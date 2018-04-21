package listdemo.androidacademia.com.listdemo.custom_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import listdemo.androidacademia.com.listdemo.R;

public class CustomListActivity extends AppCompatActivity {
    private ListView listView;

    private String[] proNameList = {"Mac","Dell","Lenevo","Mac","Dell","Lenevo","Mac","Dell","Lenevo"};
    private String[] proPriceList = {"80,000","56,000","64,000","80,000","56,000","64,000","80,000","56,000","64,000"};
    private Integer[] proImageList = {R.drawable.ic_action_mac,R.drawable.ic_action_window,R.drawable.ic_action_window,
            R.drawable.ic_action_mac,R.drawable.ic_action_window,R.drawable.ic_action_window,
            R.drawable.ic_action_mac,R.drawable.ic_action_window,R.drawable.ic_action_window};

    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        listView = findViewById(R.id.listViewCustom);
        adapter = new MyAdapter(this,proNameList,proPriceList,proImageList);
        listView.setAdapter(adapter);

    }
}
