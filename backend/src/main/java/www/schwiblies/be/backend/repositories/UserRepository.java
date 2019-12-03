package www.schwiblies.be.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import www.schwiblies.be.backend.domain.Subscription;
import www.schwiblies.be.backend.domain.User;

public interface UserRepository extends JpaRepository<Long, User> {
}
