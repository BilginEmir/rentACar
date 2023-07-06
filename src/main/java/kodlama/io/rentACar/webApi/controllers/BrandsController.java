package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Requests.CreateBrandRequest;
import Responses.GetAllBrandsResponce;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlama.io.rentACar.business.abstracts.BrandService;

@RestController //annoTation (BİLGİLENDİRME)
@RequestMapping("/api")      //iletiŞim("/api/brands") ADRESLEME

//BRANDMAN REPOSİTORY'Yİ KULLANDI, CONTROLLER'DA SERVİCE'İ KULLANACAK
public class BrandsController {

	private BrandService brandService;
	
	@Autowired //parametReye GiT BuraSını newLe demiŞ oluruZ
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	
	@GetMapping("/getall") // LocalHostun sonunDa EklenmeSi GerekeN BloK
	public List<GetAllBrandsResponce> getAll(){ //Brand'di
		return brandService.getAll();
	}
	@RequestBody
	@PostMapping("/add")
	public void add(CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}
}