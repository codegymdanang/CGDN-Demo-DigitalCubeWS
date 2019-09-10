package smartdev.vn.webservice.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import smartdev.vn.webservice.entity.Role;
import smartdev.vn.webservice.entity.User;
import smartdev.vn.webservice.entity.UserRole;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class RoleRepository {

    @Autowired
    private EntityManager entityManager;

    public List<String> getRoleNames(String userName) {
        String sql = "Select ur.role.roleName from " + UserRole.class.getName() + " ur " //
                + " where ur.user.userName = :userName ";

        Query query = this.entityManager.createQuery(sql, String.class);
        query.setParameter("userName", userName);
        return query.getResultList();
    }

}
