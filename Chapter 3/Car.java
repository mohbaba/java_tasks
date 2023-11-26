public class Car{

	private String modelType;
	private double price;
	private String year;

	Car(String modelType,double price,String year){
		this.modelType = modelType;
		this.price = price;
		this.year = year;
	};



	public void setModelType(String modelType){
		this.modelType = modelType;
	}

	public String getModelType(){
		return modelType;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setYear(String year){
		this.year = year;
	}

	public String getYear(){
		return year;
	}











}