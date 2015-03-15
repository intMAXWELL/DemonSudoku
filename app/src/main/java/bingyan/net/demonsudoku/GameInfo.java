package bingyan.net.demonsudoku;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

//游戏帮助
public class GameInfo extends ActionBarActivity {
    private TextView textView;
    private android.support.v7.app.ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_info);
        actionBar = getSupportActionBar();
        actionBar.hide();

        textView = (TextView) findViewById(R.id.GameInfo);
        textView.setText("  数独是一个好玩的数字迷题游戏，游戏被分为九宫格，" +
                "你需要根据已经给出的数字将空白的格子填入数字。" +
                "填入的数字横排竖排都不能重复，每个宫格里也不能重复。"+"\n");
    }


}
