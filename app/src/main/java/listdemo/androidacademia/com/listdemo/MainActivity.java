package listdemo.androidacademia.com.listdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] daysList = {"Monday","Tuesday","Wednesday","Thrusday",
                            "Friday","Saturday","Sunday"};
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this,R.layout.list_item,daysList);
        listView.setAdapter(adapter);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int postion, long l) {
                    String day=adapterView.getItemAtPosition(postion).toString();
                    //TextView textView = (TextView) view;
                    //String day = textView.getText().toString();
                Toast.makeText(MainActivity.this, day, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
