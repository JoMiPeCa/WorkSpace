package info.peluka.ircbot2.userinfo.military;

import net.sf.json.JSONObject;

/**
 *
 * @author Carlos Soza C <carlos.soza at profondos.com>
 */
public class Unit {

    private int id;
    private String name;
    private String createAt;
    private String avatar;
    private String role;

    public static Unit make(JSONObject joUnit) {
        return new Unit(joUnit.getInt("id"), joUnit.getString("name"), joUnit.getString("created_at"), joUnit.getString("avatar"), joUnit.getString("role"));
    }

    private Unit(int id, String name, String createAt, String avatar, String role) {
        this.id = id;
        this.name = name;
        this.createAt = createAt;
        this.avatar = avatar;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
