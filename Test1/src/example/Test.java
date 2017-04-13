package example;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		t.test1();
	}
	
	private void test1(){
		ok:
			while(true){
				for(int i=0;i<10;i++){
					System.out.println(i);
					if(i==5){
						break ok;
					}
					
				}
			}
	}
}
