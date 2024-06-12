package kodlama.io.rentacar.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class getAllModelsResponse {
    private int id;
    private String name;
    private String brandname;

}
