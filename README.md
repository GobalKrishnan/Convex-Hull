# Convex-Hull
Quick Hull

<h2>Algorthim</h2>
    <div>
       1,Find Location of Point in 2d
             
             initialize: 3 point A,B,P each point have x and y
                        
             pointLocation=(B.x-A.x)*(P.y-A.x)-(B.y-A.y)*(P.x-A.x)
             
             if pointLocation >0 ,then pointLocation=1;
             if pointLocation ==0,then pointLocation=0;
             else 
                then pointLocation=-1;

    
   </div>
   <div>
     2,Find Distance between Point in 2d
            
             initialize: 3 point A,B,C each point have x and y
             
             distance=(B.x-A.x)*(A.y-C.y)-(B.y-A.y)*(A.x-C.x);
             
             if distance < 0 ,then distance=-distance;
             
   </div>
