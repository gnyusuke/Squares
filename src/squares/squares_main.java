package squares;

public class squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x[] = {0.0,0.2,0.4,0.6,0.8,1.0,1.2};
		double y[] = {1.2,2.4,3.5,4.3,4.9,5.2,6.9};
		double theta[] = new double[2];
		
		squares_lib slib=new squares_lib(x,y);

		for(int i = 0; i < 100; i++){
            theta = slib.getDx();
            System.out.println(i+" : theta[0] = "+theta[0]);
            System.out.println(i+" : theta[1] = "+theta[1]);
            System.out.println(i+" : Objective function = "+slib.getObject());
        }
	
	}


}
