import java.awt.Point;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class QuickHull{
	
	public int pointLocation(Point A,Point B,Point P) {
		int pl=(B.x-A.x)*(P.y-A.y)-(B.y-A.y)*(P.x-A.x);
		if(pl>0)
			return 1;
		else if(pl==0)
			return 0;
		else
			return -1;
		
	}
	
	public int distance(Point A,Point B,Point C) {
		int num=(B.x-A.x)*(A.y-C.y)-(B.y-A.y)*(A.x-C.x);
		if(num<0) {
			num=-num;
		}
		return num;
	}
	
	public void hullset(Point A,Point B,ArrayList<Point> set,ArrayList<Point> hull) {
	   int insert=hull.indexOf(B);
	   
	   if(set.size()==0) {
		   return;
	   }
	   if(set.size()==1) {
		   Point p=set.get(0);
		   set.remove(p);
		   hull.add(insert,p);
	       return;
	   }
	   
	   int dist=Integer.MIN_VALUE;
	   int furtherPoint=-1;
	   
	   for(int i=0;i<set.size();i++) {
		   Point p=set.get(i);
		   int distance=distance(A, B, p);
		   
		   if(distance>dist) {
			   dist=distance;
			   furtherPoint=i;
		   }
	   }
	   Point p=set.get(furtherPoint);
	   set.remove(furtherPoint);
	   hull.add(insert,p);
	   
	   ArrayList<Point> leftsideAp=new ArrayList<>();
	   
	   for(int i=0;i<set.size();i++) {
		   Point m=set.get(i);
		   if(pointLocation(A, p, m)==1) {
			   leftsideAp.add(m);
		   }
	   }
	   
	   
	   ArrayList<Point> rightsidepB=new ArrayList<>();
	   
	   for(int i=0;i<set.size();i++) {
		   Point m=set.get(i);
		   if(pointLocation(p, B, m)==1) {
			   rightsidepB.add(m);
		   }
	   }
	   
	   hullset(A, p, leftsideAp, hull);
	   hullset(p, B, rightsidepB, hull);
	   
	   
	}
	
	public ArrayList<Point> quickhull(ArrayList<Point> p){
		
		
		ArrayList<Point> convexHull=new ArrayList<>();
	    if(p.size()<3)
	    	return (ArrayList<Point>) p.clone();
		  
		int minPoint=-1,maxPoint=-1;
	       int minX=Integer.MAX_VALUE;
	       int maxX=Integer.MIN_VALUE;
	       
	       for(int i=0;i<p.size();i++) {
	    	   if(p.get(i).x<minX) {
	    		   minX=p.get(i).x;
	    		   minPoint=i;
	    	   }
	    	   if(p.get(i).x>maxX) {
	    		   maxX=p.get(i).x;
	    		   maxPoint=i;
	    	   }
	       }
		
	       Point A=p.get(minPoint);
	       Point B=p.get(maxPoint);
	       
	      
	       
	       convexHull.add(A);
	       convexHull.add(B);
	       
	       
	       p.remove(A);
	       p.remove(B);
	       
	       ArrayList<Point> leftside=new ArrayList<>();
	       ArrayList<Point> rightside=new ArrayList<>();
	       
	       for(int i=0;i<p.size();i++) {
	    	   Point P=p.get(i);
	    	   if(pointLocation(A, B, P)==-1) {
	    		   leftside.add(P);
	    	   }
	    	   if(pointLocation(A,B,P)==1) {
	    		   rightside.add(P);
	    	   }
	       }
	     
	     hullset(A, B, rightside, convexHull);
	     hullset(B, A, leftside, convexHull);
	      
		return convexHull;
	}
	
	public QuickHull() {
		ArrayList<Point> p=new ArrayList<>();
		p.add(new Point(1,0));
		p.add(new Point(0,0));
		p.add(new Point(1,1));
		
	
		p.add(new Point(0,1));
	
		ArrayList<Point> s=quickhull(p);
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i).x+":"+s.get(i).y);
		}
		
	}
	public static void main(String[] args) {
		new QuickHull();
	}
}