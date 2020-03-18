package android.example.com.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);

    }
    public void clickButton3A (View view){
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);

    }
    public void clickButton2A (View view){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);

    }
    public void clickButton1A (View view){
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);

    }
    public void clickButton3B (View view){
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);

    }
    public void clickButton2B (View view){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);

    }
    public void clickButton1B (View view){
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);

    }
    public void clickButton0 (View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
//    public void clickButton (View view){
//        switch (point){
//            case 1:
//                score = score + 1;
//                displayForTeamA(score);
//                break;
//            case 2:
//                score = score + 2;
//                displayForTeamA(score);
//                break;
//            case 3:
//                score = score + 3;
//                displayForTeamA(score);
//                break;
//            case 4:
//                score = 0;
//                displayForTeamA(score);
//                break;
//        }
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        int id = item.getItemId();
//        if (id == R.id.action_settings){
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
