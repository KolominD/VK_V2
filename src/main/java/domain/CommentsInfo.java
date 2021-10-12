package domain;

public class CommentsInfo {

    private String text;
    private boolean reg;
    private int dataAndTime;
    private int OwnerId;

    public void setText(String text) {
        this.text = text;
    }


    public String getText() {
        return text;
    }

    public boolean getReg() {
        return reg;
    }

    public void setReg(boolean reg) {
        this.reg = reg;
    }

    public int getDataAndTime() {
        return dataAndTime;
    }

    public void setDataAndTime(int dataAndTime) {
        this.dataAndTime = dataAndTime;
    }

    public int getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(int ownerId) {
        OwnerId = ownerId;
    }
}
