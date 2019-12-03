package www.schwiblies.be.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import www.schwiblies.be.backend.domain.Subscription;

public interface SubscriptionRepository extends JpaRepository<Long, Subscription> {
}
