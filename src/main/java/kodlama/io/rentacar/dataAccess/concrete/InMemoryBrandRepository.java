package kodlama.io.rentacar.dataAccess.concrete;

import kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentacar.entities.Brand;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(1,"mercedes"));
        brands.add(new Brand(1,"audi"));
        brands.add(new Brand(1,"tofaş"));
        brands.add(new Brand(1,"ford"));
    }

    @Override
    public List<Brand> getall() {
        return brands;
    }

}
