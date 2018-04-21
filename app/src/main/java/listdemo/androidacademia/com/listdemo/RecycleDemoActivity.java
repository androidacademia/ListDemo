package listdemo.androidacademia.com.listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RecycleDemoActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private String[] proNameList = {"Mac","Dell","Lenevo","Mac","Dell","Lenevo","Mac","Dell","Lenevo"};
    private String[] proPriceList = {"80,000","56,000","64,000","80,000","56,000","64,000","80,000","56,000","64,000"};
    private Integer[] proImageList = {R.drawable.ic_action_mac,R.drawable.ic_action_window,R.drawable.ic_action_window,
            R.drawable.ic_action_mac,R.drawable.ic_action_window,R.drawable.ic_action_window,
            R.drawable.ic_action_mac,R.drawable.ic_action_window,R.drawable.ic_action_window};
    private RecyclerView.LayoutManager layoutManager;

    private MyRecycleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_demo);
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new MyRecycleAdapter(this,proNameList,proPriceList,proImageList);
        recyclerView.setAdapter(adapter);
    }
}
