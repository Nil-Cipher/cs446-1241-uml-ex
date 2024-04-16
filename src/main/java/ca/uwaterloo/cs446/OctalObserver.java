package ca.uwaterloo.cs446;

public class OctalObserver extends Observer {
    private String octValue;
    private Subject subject;

    public OctalObserver(Subject sub) {
        this.subject = sub;
        sub.attach(this);
    }

    @Override
    public void update() {
        this.octValue = Integer.toOctalString(subject.getState());
    }

    @Override
    public String getValue() {
        return octValue;
    }

}
