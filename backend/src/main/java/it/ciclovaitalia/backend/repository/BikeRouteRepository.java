package it.ciclovaitalia.backend.repository;
import it.ciclovaitalia.backend.model.BikeRoute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRouteRepository extends JpaRepository<BikeRoute,Long>{
}
