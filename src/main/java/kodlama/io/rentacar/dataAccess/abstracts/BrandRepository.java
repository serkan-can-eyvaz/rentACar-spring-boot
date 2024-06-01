package kodlama.io.rentacar.dataAccess.abstracts;

import kodlama.io.rentacar.entities.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> getall();
}
