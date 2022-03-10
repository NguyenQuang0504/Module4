package demo.session_cookie.model;

public class Counter {
    private int count;

    public Counter(Integer count) {
        this.count = count;
    }

    public Counter() {
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    public Integer increment(){
        return count++;
    }
}
