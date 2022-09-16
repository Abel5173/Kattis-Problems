from math import sqrt


x1, y1, x2, y2 = map(float, input().split())
l = abs(x1)+abs(x2)
d = (x2 - x1)**2 + (y2-y1)**2
area = l*sqrt(abs(d-(l**2)))
print('{:.3f}'.format(area))
