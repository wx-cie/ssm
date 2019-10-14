package bean;

import java.util.List;

public class Meeting {
    private String title;
    private List<Boss> bossList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Boss> getBossList() {
        return bossList;
    }

    public void setBossList(List<Boss> bossList) {
        this.bossList = bossList;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "title='" + title + '\'' +
                ", bossList=" + bossList +
                '}';
    }
}

