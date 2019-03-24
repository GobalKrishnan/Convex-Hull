# Convex-Hull
Quick Hull

<h2>Algorthim</h2>
    <div>
       1,Find Location of Point in 2d<br>
            <div>
                use 3 point as a,b,c with x,y<br>
                *****************************<br>
                difference between point a and b<br>
                =================================<br>
                dx=b.x-a.x<br>
                dy=b.y-a.y<br>
                @@@@@@@@@@@@@@<br>
                difference between point a and c for pivot<br>
                ==========================================
                sx=c.x-a.x;<br>
                sy=c.y-a.y;<br>
                @@@@@@@@@@@@@@<br>
                point value in int<br>
                ==================<br>
                p=(dx*sy)-(dy*sx)<br>
                condition,<br>
                    if p > 0 ,then output= 1;<br>
                    if p = 0 ,then output= 0;<br>
                    if p < 0 ,then output=-1;  <br>
           </div>
       2,Find Distance of point in 2d<br>
       3,Perform hullSet<br>
       4,Perform QuicKHull<br>
    </div>
         
