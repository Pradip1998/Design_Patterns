interface A_inter{
	public String get();
	public void set(String s);
}
class A implements A_inter{
	String x;
	public void set(String x){
	this.x = x;
	}
	public String get(){
	return x;
	}
}

interface B_inter{
	public int get();
	public void set(int s);
}
class B implements B_inter{
	int x;
	public void set(int x){
	this.x = x;
	}
	public int get(){
	return x;
	}
}

class A_adapter implements B_inter{
	A a;
	int y;
	public A_adapter(A a){
		this.a = a; 
	}
	public int get(){
		y = Integer.parseInt(a.x);
		return y;
	}
	public void set(int x){
		
	}
}

class AB{
	public static void main(String [] arg){
		B b = new B();
		A a = new A();
		b.set(33);
		a.set("99");
		B_inter adapt = new A_adapter(a);
		System.out.println(""+(adapt.get()+99));
	}
}