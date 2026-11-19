package access.ex;

public class MaxCounter {
    private int counter;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void setMax(int x) {
        max = x;
    }

    public void increment() {
        if (counter >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        counter++;
    }

    public void getCounter() {
        System.out.println(counter);
    }


}
