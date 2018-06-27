package ecloud.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "GROUPS")
public class Group {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TITLE", length =50, unique = false)
    @NotNull
    @Size(min = 1, max = 50)
    private String title;

    @Column(name = "GOODID", unique = false)
    @NotNull
    private Long goodId;

    @Column(name = "GOODNAME", length =20, unique = false)
    @NotNull
    @Size(min = 1, max = 20)
    private String goodName;

    @Column(name = "PRICE", unique = false)
    @NotNull
    private Long price;

    @Column(name = "GROUPPRICE", unique = false)
    @NotNull
    private Long groupPrice;

    @Column(name = "IMAGEPATH", length =100, unique = false)
    @Size(min = 1, max = 100)
    private String imagePath;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(Long groupPrice) {
        this.groupPrice = groupPrice;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
