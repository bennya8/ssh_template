package action.api;

import bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import helper.Database;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.*;

/**
 * Created by Benny on 27/6/15.
 */
public class UserAction extends BaseAction {

    private String username;
    private Integer offset = 0;
    private Integer limit = 10;

    public String register() {

        return SUCCESS;
    }

    public String login() {


        return SUCCESS;
    }

    public String getList() {

        Session session = Database.getSession();
        session.beginTransaction();

        Criteria criteria = session.createCriteria(User.class);
        if (username != null && !username.trim().isEmpty()) {
            criteria.add(Restrictions.like("username", username + "%"));
        }

        List result = criteria.setFirstResult(getOffset()).setMaxResults(getLimit()).list();

        toApi(0, "", result);

        session.getTransaction().commit();
        session.close();

        return SUCCESS;
    }

    /**
     * Getter Setter
     */

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
