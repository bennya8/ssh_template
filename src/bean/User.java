package bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Benny on 27/6/15.
 */
public class User {

    private Integer id;

    private String username;

    private String password;

    // List属性
//    private List<String> addresses = new ArrayList<String>();

    // Array属性
//    private String[] addresses;

    // Set 属性（无序）
//    private Set<String> addresses = new HashSet<String>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

//    public List<String> getAddresses() {
//        return addresses;
//    }
//
//    public void setAddresses(List<String> addresses) {
//        this.addresses = addresses;
//    }
//

//    public String[] getAddresses() {
//        return addresses;
//    }

//    public void setAddresses(String[] addresses) {
//        this.addresses = addresses;
//    }

//    public Set<String> getAddresses() {
//        return addresses;
//    }

//    public void setAddresses(Set<String> addresses) {
//        this.addresses = addresses;
//    }
}
