package com.example.rodneytressler.week4assessment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.input_team)
    protected EditText teamInput;

    @BindView(R.id.input_number)
    protected EditText numberInput;

    @BindView(R.id.input_name)
    protected EditText nameInput;

    private List<Player> playerList;

    public static final String TAG = "PLAYER_LIST_TAG";

    @OnClick(R.id.button_add_player)
    protected void onAddPlayerButtonClicked() {
        if (nameInput.getText().toString().isEmpty() || numberInput.getText().toString().isEmpty() || teamInput.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please input all options.", Toast.LENGTH_LONG).show();
        } else {
            String name = nameInput.getText().toString();
            String number = numberInput.getText().toString();
            String team = teamInput.getText().toString();
            playerList(name, number, team);
            playerList = playerList.newInstance();
            Toast.makeText(this, "Game Added!", Toast.LENGTH_LONG).show();
        }
    }


    private void players(String playerName, String playerNumber, String playerTeam) {

    }

    @OnClick(R.id.button_view_players)
    protected void onViewPlayersButtonClicked() {
        if (playerList.isEmpty()) {
            Toast.makeText(this, "You must add a player first!", Toast.LENGTH_SHORT).show();
        } else {
            super.onCreate(savedInstance);
            parcelable
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        playerList = new ArrayList<>();
    }


    
}
