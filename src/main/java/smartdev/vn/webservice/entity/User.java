package smartdev.vn.webservice.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app_user")
public class User {

    @Id
    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    @JsonIgnore
    private String password;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "enable")
    private boolean enable;

    @Column(name = "email")
    private String email;


    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
