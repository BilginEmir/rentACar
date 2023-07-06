package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import Requests.CreateBrandRequest;
import Responses.GetAllBrandsResponce;

public interface BrandService {
 //	List<Brand> getAll(); Brand'de verileRin tamaMı DB'den çekiliR. BunuN önüNe geçmeK içiN Request ResPonce yapılıR
	 	List<GetAllBrandsResponce> getAll();
    	void add(CreateBrandRequest createBrandRequest);
}