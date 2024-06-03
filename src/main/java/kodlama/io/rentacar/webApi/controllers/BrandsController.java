package kodlama.io.rentacar.webApi.controllers;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.business.response.getAllBrandsResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {

    private BrandService brandService;


    //@Autowired yeni versiyonda springboot otomatik yapar
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }
    @GetMapping("/getAll")
    public List<getAllBrandsResponse> getAll()
    {
        return brandService.getALl();



    }
}
