package kodlama.io.rentacar.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class getByIdResponse {
    private int id;
    private String name;

}
