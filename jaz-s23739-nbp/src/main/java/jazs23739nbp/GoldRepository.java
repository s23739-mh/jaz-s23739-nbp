package jazs23739nbp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoldRepository extends JpaRepository<Gold, Integer> {
Gold save(Gold gold);
}
