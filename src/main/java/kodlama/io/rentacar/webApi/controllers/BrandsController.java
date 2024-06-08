package kodlama.io.rentacar.webApi.controllers;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.business.request.CreateBrandRequest;
import kodlama.io.rentacar.business.request.UpdateRequest;
import kodlama.io.rentacar.business.response.getAllBrandsResponse;
import kodlama.io.rentacar.business.response.getByIdResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {

    private BrandService brandService;

    //@Autowired  springboot yeni versiyonda otomatik yapar
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping()
    public List<getAllBrandsResponse> getAll()
    {
        return brandService.getALl();
    }

    @GetMapping("/{id}")//path id değerini alrı
    public getByIdResponse getById(@PathVariable int id)
    {
        return brandService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public  void add (CreateBrandRequest createBrandRequest)
    {
        this.brandService.add(createBrandRequest);
    }

   @PutMapping
    public void update(@RequestBody UpdateRequest updateRequest)
   {
       this.brandService.update(updateRequest);
   }

   @DeleteMapping("/{id}")
    public  void delete (@PathVariable int id)
   {
       this.brandService.delete(id);
   }
}
