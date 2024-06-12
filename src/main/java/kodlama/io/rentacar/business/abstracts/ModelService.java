package kodlama.io.rentacar.business.abstracts;

import kodlama.io.rentacar.business.request.CreateBrandRequest;
import kodlama.io.rentacar.business.request.CreateModelRequest;
import kodlama.io.rentacar.business.response.getAllBrandsResponse;
import kodlama.io.rentacar.business.response.getAllModelsResponse;

import java.util.List;

public interface ModelService {
    List<getAllModelsResponse> getALl();
    void  add(CreateModelRequest createModelRequestRequest);
}
