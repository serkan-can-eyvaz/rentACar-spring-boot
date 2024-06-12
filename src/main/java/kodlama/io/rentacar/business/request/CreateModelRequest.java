package kodlama.io.rentacar.business.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CreateModelRequest {

    @NotNull
    @NotBlank
    @Size(min = 3, max = 50)
    private String name;

    @NotNull
    @NotBlank
    private int brandId;

}
