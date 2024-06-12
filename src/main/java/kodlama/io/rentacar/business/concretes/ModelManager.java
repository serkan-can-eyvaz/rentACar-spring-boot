package kodlama.io.rentacar.business.concretes;

import kodlama.io.rentacar.business.abstracts.ModelService;
import kodlama.io.rentacar.business.request.CreateModelRequest;
import kodlama.io.rentacar.business.response.getAllBrandsResponse;
import kodlama.io.rentacar.business.response.getAllModelsResponse;
import kodlama.io.rentacar.core.mappers.ModelMappersService;
import kodlama.io.rentacar.dataAccess.abstracts.ModelRepository;
import kodlama.io.rentacar.entities.Brand;
import kodlama.io.rentacar.entities.Model;

import java.util.List;
import java.util.stream.Collectors;

public class ModelManager implements ModelService {

    private final ModelRepository modelRepository;
    private ModelMappersService modelMappersService;

    public ModelManager(ModelRepository modelRepository, ModelMappersService modelMappersService) {
        this.modelRepository = modelRepository;
        this.modelMappersService = modelMappersService;
    }

    @Override
    public List<getAllModelsResponse> getALl() {
        List<Model> models = modelRepository.findAll();

        List<getAllModelsResponse> modelsResponses = models.stream().map(model ->
                        this.modelMappersService.forResponse().map(model,getAllModelsResponse.class))
                .collect(Collectors.toList());

        return  modelsResponses;
    }

    @Override
    public void add(CreateModelRequest createModelRequestRequest) {
        Model model = this.modelMappersService.forRequest().map(createModelRequestRequest,Model.class);
        modelRepository.save(model);
    }


}
