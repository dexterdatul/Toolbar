package dexterdatul.com.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.item1) {
            Toast.makeText(getApplicationContext(), "item 1 was clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item2) {
            Toast.makeText(getApplicationContext(), "item 2 was clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item3) {
            Toast.makeText(getApplicationContext(), "item 3 was clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.search) {
            Toast.makeText(getApplicationContext(), "search icon was clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.cart) {
            Toast.makeText(getApplicationContext(), "cart icon was clicked", Toast.LENGTH_SHORT).show();
        } else if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
