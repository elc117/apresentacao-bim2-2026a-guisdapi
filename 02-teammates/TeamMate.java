public class TeamMate {
    private String userId;
    private String name;
    private boolean online;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public TeamMate() {
        this.userId = "default";
        this.name = "default";
        this.online = false;
    }

    public TeamMate(String userId, String name, boolean online) {
        this.userId = userId;
        this.name = name;
        this.online = online;
    }

    public TeamMate(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.online = false;
    }
}