import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetBDD {

	@Test
	public void test_numberOFCircuitsFor2017_season() {

		given().
		when().
			get("http://ergast.com/api/f1/2010/circuits.json").
		then().assertThat().statusCode(200).and().
				body("MRData.CircuitTable.Circuits.circuitId", hasSize(19));
	}

}
