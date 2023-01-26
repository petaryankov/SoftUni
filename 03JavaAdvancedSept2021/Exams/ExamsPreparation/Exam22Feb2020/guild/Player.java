package ExamsPreparation.Exam22Feb2020.guild;

public class Player {
    //•	name: String
    //•	clazz: String
    //•	rank: String – "Trial" by default
    //•	description: String – "n/a" by default
    private String name;
    private String clazz;
    private String rank;
    private String description;

    public Player(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
        this.rank = "Trial";
        this.description = "n/a";
    }

    public String getName() {
        return name;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getClazz() {
        return clazz;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player ").append(this.name).append(": ")
                .append(this.clazz).append("\n")
                .append("Rank: ").append(this.rank).append("\n")
                .append("Description: ").append(this.description);
        return sb.toString();
    }
}
