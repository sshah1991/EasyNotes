package sumeet.easynote;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        GridView gridview = (GridView) findViewById(R.id.gridview);

        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                navigate(position);
        }
        });
    }

    public void navigate(int position){
        switch (position){
            case 0:
                Intent intentNote = new Intent(this, NotesListActivity.class);
                Log.e("HA : ","Notes Clicked");
                startActivity(intentNote);
                break;
            case 1:
                Intent intentMemo = new Intent(this, MainActivity.class);
                Log.e("HA : ","Memo Clicked");
                startActivity(intentMemo);
                break;
            case 2:
                Log.e("HA : ","shopping Clicked");
                break;
            case 3:
                Intent intentToDO = new Intent(this, ToDoActivity.class);
                Log.e("HA : ","Todo Clicked");
                startActivity(intentToDO);
                break;
        }
    }
}
