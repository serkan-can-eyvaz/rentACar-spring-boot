package kodlama.io.rentacar.dataAccess.abstracts;

import kodlama.io.rentacar.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BrandRepository  extends JpaRepository <Brand,Integer> {
    boolean existsByName(String name);//spring jpa keywords deyalarına bakılabilir

}
