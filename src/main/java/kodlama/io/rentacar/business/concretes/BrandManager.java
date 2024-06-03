package kodlama.io.rentacar.business.concretes;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.business.response.getAllBrandsResponse;
import kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentacar.entities.Brand;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<getAllBrandsResponse> getALl() {
        List<Brand> brands = brandRepository.findAll();
        List<getAllBrandsResponse> brandsResponses = new ArrayList<>();

        for (Brand brand : brands) {
            getAllBrandsResponse responseItem = new getAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
        }
        return  brandsResponses;
    }
}
