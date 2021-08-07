/*
 * *
 *  * @author : Ishara Dinusanka <isharapesonal@gmail.com>
 *  * @since : 08/07/2021
 *  *
 */

package lk;

public class Customer {
    private String name;
    private String address;
    private int telephone;
    private String dOb;

    public Customer(String name, String address, String telephone, String dOb) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.dOb = dOb;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getdOb() {
        return dOb;
    }

    public void setdOb(String dOb) {
        this.dOb = dOb;
    }
}
