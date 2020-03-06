package id.ac.polinema.recyclerview.models;

public class TeamItem {
    private String logo;
    private String name;

    public TeamItem() {
    }

    public TeamItem(String logo, String name) {
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
