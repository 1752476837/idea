package cn.itcast;

import javax.persistence.*;

/**
 * 1.实体类和表的映射关系
 * 2.实体类中属性和字段的映射关系
 *
 */

@Entity   //声明实体类
//@Table(name = "cst_customer")    //配置实体类和表的映射关系
public class Customer {

    @Id   //声明主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long custId;//客户的主键
    private String custName;//客户名称
    private String custLevel;//客户级别
    private String custSource;//客户来源
    private String custIndustry;//客户所属行业
    private String custPhone;//客户联系方式
    private String custAddress;//客户地址

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", custSource='" + custSource + '\'' +
                ", custIndustry='" + custIndustry + '\'' +
                ", custPhone='" + custPhone + '\'' +
                ", custAddress='" + custAddress + '\'' +
                '}';
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }
}
