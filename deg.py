from math import degrees, floor, radians, sin, cos


a, b = map(int, input().split())
e = round(sin(radians(b)))
f = round(cos(radians(b)))

c = a*e
if f != 0:
    print("safe")
else:
    c = abs(c)
    print("{:g}".format(c))
