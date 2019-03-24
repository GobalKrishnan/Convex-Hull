# Convex-Hull
Quick Hull

<h2>Algorthim</h2>
    <div>
       1,Find Location of Point in 2d<br>
            <ol>
                use 3 point as a,b,c with x,y<br>
                *****************************<br>
                difference between point a and b<br>
                =================================<br>
                <ol>
                    dx=b.x-a.x<br>
                    dy=b.y-a.y<br>
                </ol>
                difference between point a and c for pivot<br>
                ==========================================<br>
                <ol>
                    sx=c.x-a.x;<br>
                    sy=c.y-a.y;<br>
                </ol>
                point value in int<br>
                ==================<br>
                <ol>
                    p=(dx*sy)-(dy*sx)<br>
                         condition,<br>
                         <ol>
                            if p > 0 ,then output= 1;<br>
                            if p = 0 ,then output= 0;<br>
                            if p < 0 ,then output=-1;  <br>
                          </ol>
                </ol>
           </ol>
       2,Find Distance of point in 2d<br>
       3,Perform hullSet<br>
       4,Perform QuicKHull<br>
    </div>
         
