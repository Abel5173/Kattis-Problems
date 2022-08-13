import math


a,b,c=input().split(" ")
x=int(a)
y=int(b)
z=int(c)
print(math.gcd(math.gcd(x,y),z))
