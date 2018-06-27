package ecloud.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "GROUPORDERS")
public class GroupOrder {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "GOODID", unique = false)
    @NotNull
    private Long goodId;

    @Column(name = "GOODNAME", length = 20 ,unique = false)
    @Size(min = 1,max = 20)
    @NotNull
    private String goodName;

    @Column(name = "COUNT", unique = false)
    @NotNull
    private Long count;

    @Column(name = "TOTALPRICE", unique = false)
    @NotNull
    private Long totalPrice;

    @Column(name = "USERID", unique = false)
    @NotNull
    private Long userId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

}