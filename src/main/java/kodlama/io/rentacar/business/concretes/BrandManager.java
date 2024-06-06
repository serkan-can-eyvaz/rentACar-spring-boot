package kodlama.io.rentacar.business.concretes;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.business.request.CreateBrandRequest;
import kodlama.io.rentacar.business.response.getAllBrandsResponse;
import kodlama.io.rentacar.core.mappers.ModelMappersService;
import kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentacar.entities.Brand;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    private ModelMappersService   modelMappersService;

    @Autowired
    public BrandManager(ModelMappersService modelMappersService) {
        this.modelMappersService = modelMappersService;
    }


    @Override
    public List<getAllBrandsResponse> getALl() {
        List<Brand> brands = brandRepository.findAll();
       // List<getAllBrandsResponse> brandsResponses = new ArrayList<>();

        //Mapping
       // for (Brand brand : brands) {
       //     getAllBrandsResponse responseItem = new getAllBrandsResponse();
       //     responseItem.setId(brand.getId());
       //     responseItem.setName(brand.getName());
       //     brandsResponses.add(responseItem);
       // }

        List<getAllBrandsResponse> brandsResponses = brands.stream().map(brand ->
                this.modelMappersService.forResponse().map(brand,getAllBrandsResponse.class))
                .collect(Collectors.toList());

        return  brandsResponses;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
       // Brand brand = new Brand();
      //  brand.setName(createBrandRequest.getName());
          Brand brand = this.modelMappersService.forRequest().map(createBrandRequest,Brand.class);
          this.brandRepository.save(brand);
    }
}
