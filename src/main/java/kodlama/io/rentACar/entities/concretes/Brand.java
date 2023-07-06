package kodlama.io.rentACar.entities.concretes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "brands") 
@Data /*GetterSetter*/ 
@AllArgsConstructor  /*ParametreliConstructor */
@NoArgsConstructor /*ParametresizConstructor*/ 
@Entity // Entity İFADESİ

public class Brand {
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*1 - 1  ARTIRMAK*/  @Id // PRIMARY KEY

	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;
}

/*
 * ReSources içeRisindeki appLication.propeRties içeRisine server.port = ... yazaRak yeniDen ServeR belirleyebiliRiz
 * 1- DataAccess( Repository yaDa DAO ), 
 * 2- BusinesS ( iŞ KurallaRı - ConcRete(BManageR) VE AbstraCt(BrandService -interface-), 
 * 3- UserInterface ( HB, N11, TrendYol, Console AraYüzü ) 
 * 4- FaRklı KoDlarla yazılaN (Java-IoS)
 * 
 * API : FaRklı sistemleRin birbiRleriyle iletiŞimini saĞlayan yapıLardır(JsoN FormaTı)
 * UygulamaLaRda XML, JsoN'la(formaT) iletiŞim sağlanıR. (ayNı koDlardaysa miNimum HttP'ile ) 
 * | BusinesS - UI araSı | CtrL + ShifT + O KullanılmayaN importlaRı kaldırıR 
 * JPADA CONCRETE YOK KENDİ OLUSTURUR OTOMATİK OLARAK ARKA
 * PLANDA LomBok KURULUYKEN @Data yazılıRsa Getter/Setter/toString/Constructor hepsİni OtoMatik getiRir
 * 
 * İŞ yapaN ClasslaR somuT oluŞturulamaz ( öNce SoyuT, sonRa SoMuT.. İnterFace - DAO DB )
 * 
 * DA BusinesS'ın içeRisinde KullanıldI ( ConstructuRla ) | BrandManager RepositoRy'yi KullaNdı |
 * BusinesS'ıda API çağıRır
 * ControlleR'da Service'si KullanıR ( BusineSs )
 * 
 * 1-EntitieS
 * 2-DataAccess RepositoRy (interFace) extends JpaRepository<Brand, IntegeR> | List<Brand> getAll(); |
 * *-DataAccess InMemory nonSql clasS
 * 3-BusinesS BrandService (interFace)  | List<Brand> getAll(); |
 * 4-BusinesS BrandManager implementS BrandService
 */