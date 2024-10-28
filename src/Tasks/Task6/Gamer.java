package Tasks.Task6;

public class Gamer {
    private String nickname;
    private boolean isActive;

    public Gamer() {
        nickname = "";
    }

    public Gamer(String nickname)
    {
        this.nickname = nickname;
    }

    public Gamer(String nickname, boolean isActive)
    {
        this.nickname = nickname;
        this.isActive = isActive;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean getActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
