package day9.test3;

public class JieDai {
    private Filter filter;

    public JieDai() {
    }

    public JieDai(Filter filter) {
        this.filter = filter;
    }

    public void jieDai(User user) {
        filter.filterUser(user);
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}
