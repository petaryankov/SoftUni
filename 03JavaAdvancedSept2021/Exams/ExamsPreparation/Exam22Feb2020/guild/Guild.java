package ExamsPreparation.Exam22Feb2020.guild;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Guild {
    private Map<String, Player> roster;
    private String name;
    private int capacity;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new LinkedHashMap<>();
    }

    public void addPlayer(Player player) {
        if (this.capacity > this.roster.size()) {
            this.roster.put(player.getName(), player);
        }
    }

    public boolean removePlayer(String name) {
        return this.roster.remove(name) != null;
    }

    public void promotePlayer(String name) {
        this.roster.get(name).setRank("Member");
    }

    public void demotePlayer(String name) {
        this.roster.get(name).setRank("Trial");
    }

    public int count() {
        return this.roster.size();
    }

    public Player[] kickPlayersByClass(String clazz) {
        List<Player> removed = new ArrayList<>();
        for (String player : roster.keySet()) {
            if (roster.get(player).getClazz().equals(clazz)) {
                removed.add(roster.get(player));
            }
        }
        removed.forEach(e -> this.roster.remove(e.getName()));
        Player[] players = new Player[removed.size()];
        for (int index = 0; index < players.length; index++) {
            players[index] = removed.get(index);
        }
        return players;
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append("Players in the guild: ").append(this.name).append(":\n");
        for (Player value : roster.values()) {
            sb.append(value).append("\n");
        }
        return sb.toString().trim();
    }
}
