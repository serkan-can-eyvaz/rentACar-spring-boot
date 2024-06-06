package kodlama.io.rentacar.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//DTO request ve response bu katman altındada yapılandırılabilir.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {
    private String name;

}
