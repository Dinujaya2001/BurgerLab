
package burgerlab.model;

import burgerlab.util.OrderStatus;
import java.util.Date;

/**
 *
 * @author Dinujaya Tharaka
 */
public class Order {
    private String id;
    private String customerId;
    private Date oderDate;
    private OrderStatus orderStatus;

    public Order(String id, String customerId, Date oderDate, OrderStatus orderStatus) {
        this.id = id;
        this.customerId = customerId;
        this.oderDate = oderDate;
        this.orderStatus = orderStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getOderDate() {
        return oderDate;
    }

    public void setOderDate(Date oderDate) {
        this.oderDate = oderDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", customerId=" + customerId + ", oderDate=" + oderDate + ", orderStatus=" + orderStatus + '}';
    }
    
    
    
}
