package ecloud.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "GOODS")
public class Good {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME", length =20, unique = false)
    @NotNull
    @Size(min = 1, max = 20)
    private String name;

    @Column(name = "PRICE", unique = false)
    @NotNull
    private Long price;

    @Column(name = "CATEGORY", length =10, unique = false)
    @Size(min = 1, max = 10)
    private String category;

    @Column(name = "IMAGEPATH", length =100, unique = false)
    @Size(min = 1, max = 100)
    private String imagePath;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
