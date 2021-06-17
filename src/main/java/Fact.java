import com.fasterxml.jackson.annotation.JsonProperty;

public class Fact {
    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes;

    public Fact(@JsonProperty("id") String id,
                @JsonProperty("text") String text,
                @JsonProperty("type") String type,
                @JsonProperty("user") String user,
                @JsonProperty("upvotes") Integer upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Fact {\n" +
                "\t\"id\": \"" + id + "\",\n" +
                "\t\"text\": \"" + text + "\",\n" +
                "\t\"type\": \"" + type + "\",\n" +
                "\t\"user\": \"" + user + "\",\n" +
                "\t\"upvotes\": " + upvotes + '}';
    }
}
