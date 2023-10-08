package bg.softuni.pathfinder.model.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    //username	Accepts values, which should be at least 2 characters
    //•	password - Accepts String values
    //o	Accepts values, which should be at least 2 characters
    //•	full name - Accepts String values
    //o	Accepts values, which should be at least 2 characters
    //•	email - Accepts String values
    //o	Accepts values, which contain the '@' symbol
    //•	role - Accepts Role Entity values
    //o	Each registered user should have a "User" role
    //•	level - Accepts a level of the user (BEGINNER, INTERMEDIATE, ADVANCED)
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(name = "full_name", nullable = false)
    private String fullName;
    @Column()
    private String email;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles")
    private Set<Role> roles;
    @Enumerated(EnumType.STRING)
    @Column
    private Level level;
    @Column
    private Integer age;

    public User() {
        this.roles = new HashSet<>();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> role) {
        this.roles = role;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
