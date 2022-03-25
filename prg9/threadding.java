class threads implements Runnable{
    String name;
    int time,x;
    Thread t;
    threads(String i,int j,int k){
        name=i;
        time=j;
        x=k;
        t= new Thread(this,name);
        t.start();
    }    
    public void run(){
        try{
            for(int i=x;i>0;i--){
                System.out.println(name);
                t.sleep(time);
            }
        }
        catch(InterruptedException e){
            System.out.println(name + e);
        }
    }    
}
class threadding
{
	public static void main(String[] args) {
		new threads(" BMS COLLEGE OF ENGINEERING",10000,3);
		new threads(" CSE",2000,15);
	}
}