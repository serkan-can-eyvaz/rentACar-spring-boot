package kodlama.io.rentacar.core.mappers;

import org.modelmapper.ModelMapper;

public interface ModelMappersService
{
    ModelMapper forResponse();
    ModelMapper forRequest();
}
