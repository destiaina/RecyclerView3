package id.ac.polinema.recyclerview.models;

import android.net.UrlQuerySanitizer;

import androidx.recyclerview.widget.RecyclerView;

public class TeamLogo {
    private String logo;
    private String name;

    public TeamLogo() {
    }

    public TeamLogo(String logo, String name) {
        this.logo = logo;
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setName(String name) {
        this.name = name;
    }
}
