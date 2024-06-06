package kodlama.io.rentacar.business.abstracts;

import kodlama.io.rentacar.business.request.CreateBrandRequest;
import kodlama.io.rentacar.business.response.getAllBrandsResponse;
import kodlama.io.rentacar.entities.Brand;

import java.util.List;

public interface BrandService
{
    List <getAllBrandsResponse> getALl();
    void  add(CreateBrandRequest createBrandRequest);
}
