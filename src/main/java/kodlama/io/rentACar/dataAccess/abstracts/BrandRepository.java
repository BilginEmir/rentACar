package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>  //BrandDAO OLARAK DA GÖREBİLİRİZ
{
	//BASİT BİR İnterFace'i implementE EdereK DB OpeRasyonlarını tamamLamış oluyorSunuZ	
}