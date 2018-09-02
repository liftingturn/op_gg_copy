package ja;

public class Summoner {
	String name;
	String apikey = "123";
	public Summoner() { 	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void GetAPIData() {
		APIdata data = APIMng.Instance().AccessAPI(apikey, ReqValues);
		this.name = data.name;
	}
}
