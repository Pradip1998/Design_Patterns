interface readings{
	public void setTitle(String title);
	public void showTitle();
}

class book implements readings{
	String title;
	public void setTitle(String title){
		this.title = title;
	}
	public void showTitle(){
		System.out.println("Title of book: "+title);
	}
}
class article implements readings{
	String title;
	public void setTitle(String title){
		this.title = title;
	}
	public void showTitle(){
		System.out.println("Title of Article: "+title);
	}
}

class readingFactory{
	public readings getReadings(String type){
		if(type.equals("book"))
			return new book();
		else if(type.equals("article"))
			return new article();
		
		return null;
	}
}

class Reading_demo{
	public static void main(String[] args){
		readingFactory fact = new readingFactory();
		readings r = fact.getReadings("book");
		r.setTitle("Design Patterns");
		r.showTitle();
		r = fact.getReadings("article");
		r.setTitle("k-means vs k-mediods");
		r.showTitle();
	}
}