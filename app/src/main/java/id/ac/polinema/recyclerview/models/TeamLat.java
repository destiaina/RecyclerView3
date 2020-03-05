package id.ac.polinema.recyclerview.models;

import android.net.UrlQuerySanitizer;
import androidx.recyclerview.widget.RecyclerView;
public class TeamLat {
    private String logo;
    private String name;
    private String desc;

    public TeamLat() {
    }

    public TeamLat(String logo, String name, String desc) {
        this.logo = logo;
        this.name = name;
        this.desc = desc;
    }

    public String getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

