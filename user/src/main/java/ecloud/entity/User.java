package ecloud.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "OAUTHTYPE", length =20, unique = false)
    @NotNull
    @Size(min = 1, max = 20)
    private String oauthType;

    @Column(name = "OAUTHID", length =50, unique = false)
    @NotNull
    @Size(min = 1, max = 50)
    private String oauthId;

    @Column(name = "NAME", length =20, unique = false)
    @NotNull
    @Size(min = 1, max = 20)
    private String name;

    @Column(name = "ADDRESS", length =100, unique = false)
    @Size(min = 1, max = 100)
    @NotNull
    private String address;

    @Column(name = "MOBILE", length =100, unique = false)
    @Size(min = 1, max = 100)
    @NotNull
    private String Mobile;

    @Column(name = "AVATARPATH", length =100, unique = false)
    @Size(min = 1, max = 100)
    private String avatarPath;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOauthType() {
        return oauthType;
    }

    public void setOauthType(String oauthType) {
        this.oauthType = oauthType;
    }

    public String getOauthId() {
        return oauthId;
    }

    public void setOauthId(String oauthId) {
        this.oauthId = oauthId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }
}
