package ci.luckyman.ecommerce.dommain.Repository;

import ci.luckyman.ecommerce.dommain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findFirstByEmail(String email);
}
