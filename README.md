# Convex-Hull
Quick Hull

<h2>Algorthim</h2>
    <div>
       1,Find Location of Point in 2d
            <div>
                use 3 point as a,b,c with x,y
                
                difference between point a and b
                =================================
                dx=b.x-a.x
                dy=b.y-a.y
                @@@@@@@@@@@@@@
                difference between point a and c for pivot
                ==========================================
                sx=c.x-a.x;
                sy=c.y-a.y;
                @@@@@@@@@@@@@@
                point value in int
                ==================
                p=(dx*sy)-(dy*sx)
                
                    if p > 0 ,then output= 1;
                    if p = 0 ,then output= 0;
                    if p < 0 ,then output=-1;  
            </div>
       2,Find Distance of point in 2d
       3,Perform hullSet
       4,Perform QuicKHull
    </div>
         
