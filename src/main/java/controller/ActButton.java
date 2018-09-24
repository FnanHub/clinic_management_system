package controller;

public class ActButton {
    private String action;

    public ActButton() {
    }

    public ActButton(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "ActButton{" +
                "action='" + action + '\'' +
                '}';
    }
}
