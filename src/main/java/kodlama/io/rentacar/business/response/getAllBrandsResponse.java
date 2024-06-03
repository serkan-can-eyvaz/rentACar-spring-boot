package kodlama.io.rentacar.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class getAllBrandsResponse {
    private int id;
    private String name;
}
