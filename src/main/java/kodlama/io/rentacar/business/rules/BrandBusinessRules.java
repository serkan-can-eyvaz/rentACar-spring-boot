package kodlama.io.rentacar.business.rules;

import kodlama.io.rentacar.core.excepiton.BusinessExcepiton;
import kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentacar.entities.Brand;

public class BrandBusinessRules {
    private final BrandRepository brandRepository;

    public BrandBusinessRules(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public void checkIfBrandNameExists(String name) {
        if(this.brandRepository.existsByName(name))
        {
            throw new BusinessExcepiton("Brand already existss");//Java exception types
        }
    }
}
