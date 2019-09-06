package smartdev.vn.webservice.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import smartdev.vn.webservice.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUserName(String username);
}
