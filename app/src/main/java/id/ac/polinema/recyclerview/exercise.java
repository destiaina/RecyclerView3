package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapters.ExerciseAdapter;
import id.ac.polinema.recyclerview.adapters.GridAdapter;
import id.ac.polinema.recyclerview.adapters.LogoAdapter;
import id.ac.polinema.recyclerview.adapters.ReversedLogoAdapter;
import id.ac.polinema.recyclerview.models.TeamLat;


public class exercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<TeamLat> teams = new ArrayList<>();
        teams.add(new TeamLat("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "RBC News", "A city Living Under the Shadow"));
        teams.add(new TeamLat("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "NY News", "One Problem for Democratic Leaders"));
        teams.add(new TeamLat("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "BBC World", "The Golden Secret to Better Breakfast"));
        teams.add(new TeamLat("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "NBC Nightly", "How to Plan Your First Ski Vacation"));
        teams.add(new TeamLat("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "RBC News", "How Social Isolation Is Killing Us"));
        teams.add(new TeamLat("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "BBC World", "Use Labels to Sort Messages in Facebook"));

        ExerciseAdapter adapter = new ExerciseAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        teamsView.setLayoutManager(layoutManager);
    }
}
