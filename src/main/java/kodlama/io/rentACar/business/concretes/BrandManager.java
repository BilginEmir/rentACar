package kodlama.io.rentACar.business.concretes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Requests.CreateBrandRequest;
import Responses.GetAllBrandsResponce;
import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service //Bu ClaSs biR BusinesS NesnesidiR
public class BrandManager implements BrandService {
	
	private BrandRepository brandRepository ;
	
	@Autowired   //YazmaK gerekLi 
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<GetAllBrandsResponce> getAll() {
		
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponce> brandsResponces = new ArrayList<GetAllBrandsResponce>();
	
		for (Brand brand : brands ) 
		{
			GetAllBrandsResponce  responceItem = new GetAllBrandsResponce();
			responceItem.setId(brand.getId());
			responceItem.setName(brand.getName());
		
			brandsResponces.add(responceItem);
		}
		return brandsResponces;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) //VeriTabanı Brand'den alınıyoR
	{  
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		
		this.brandRepository.save(brand);	
	}

	//public List<Brand> getAll() {  InMemory ÇalıştıĞımız ZamaN ManaGer KısıMa getAll metHodu yazmıŞtık. JpaRepository kullandıĞımız ZamaN oraSını siLer üsT kısımLarı yazaRız
		/*İŞ KURALLARI
		 * 	return brandRepository.getAll();
		 * 	 */
		//	return brandRepository.findAll();
	}